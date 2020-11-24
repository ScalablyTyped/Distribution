package typings.ignoreWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkerOptions extends js.Object {
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var ignoreFiles: js.UndefOr[js.Array[String]] = js.native
  
  var includeEmpty: js.UndefOr[Boolean] = js.native
  
  var parent: js.UndefOr[Walker | WalkerSync | Null] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object WalkerOptions {
  
  @scala.inline
  def apply(): WalkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkerOptions]
  }
  
  @scala.inline
  implicit class WalkerOptionsOps[Self <: WalkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setIgnoreFilesVarargs(value: String*): Self = this.set("ignoreFiles", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreFiles(value: js.Array[String]): Self = this.set("ignoreFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFiles: Self = this.set("ignoreFiles", js.undefined)
    
    @scala.inline
    def setIncludeEmpty(value: Boolean): Self = this.set("includeEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmpty: Self = this.set("includeEmpty", js.undefined)
    
    @scala.inline
    def setParent(value: Walker | WalkerSync): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
