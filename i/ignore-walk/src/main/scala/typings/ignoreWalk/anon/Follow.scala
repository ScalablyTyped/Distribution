package typings.ignoreWalk.anon

import typings.ignoreWalk.mod.Walker
import typings.ignoreWalk.mod.WalkerSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Follow extends js.Object {
  
  var follow: Boolean = js.native
  
  var ignoreFiles: js.Array[String] = js.native
  
  var includeEmpty: Boolean = js.native
  
  var parent: Walker | WalkerSync = js.native
  
  var path: String = js.native
}
object Follow {
  
  @scala.inline
  def apply(
    follow: Boolean,
    ignoreFiles: js.Array[String],
    includeEmpty: Boolean,
    parent: Walker | WalkerSync,
    path: String
  ): Follow = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], includeEmpty = includeEmpty.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Follow]
  }
  
  @scala.inline
  implicit class FollowOps[Self <: Follow] (val x: Self) extends AnyVal {
    
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
    def setIgnoreFilesVarargs(value: String*): Self = this.set("ignoreFiles", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreFiles(value: js.Array[String]): Self = this.set("ignoreFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmpty(value: Boolean): Self = this.set("includeEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Walker | WalkerSync): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
