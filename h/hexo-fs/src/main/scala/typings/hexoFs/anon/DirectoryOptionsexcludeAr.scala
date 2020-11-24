package typings.hexoFs.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hexo-fs.hexo-fs.DirectoryOptions & {  exclude :std.Array<string> | undefined} */
@js.native
trait DirectoryOptionsexcludeAr extends js.Object {
  
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  var ignoreHidden: js.UndefOr[Boolean] = js.native
  
  var ignorePattern: js.UndefOr[RegExp] = js.native
}
object DirectoryOptionsexcludeAr {
  
  @scala.inline
  def apply(): DirectoryOptionsexcludeAr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryOptionsexcludeAr]
  }
  
  @scala.inline
  implicit class DirectoryOptionsexcludeArOps[Self <: DirectoryOptionsexcludeAr] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIgnoreHidden(value: Boolean): Self = this.set("ignoreHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHidden: Self = this.set("ignoreHidden", js.undefined)
    
    @scala.inline
    def setIgnorePattern(value: RegExp): Self = this.set("ignorePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePattern: Self = this.set("ignorePattern", js.undefined)
  }
}
