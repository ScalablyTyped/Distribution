package typings.knockoutMapping.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copy extends js.Object {
  
  var copy: js.UndefOr[js.Array[String]] = js.native
  
  var ignore: js.UndefOr[js.Array[String]] = js.native
  
  var include: js.UndefOr[js.Array[String]] = js.native
  
  var parentName: js.UndefOr[String] = js.native
  
  var visitedObjects: js.UndefOr[js.Any] = js.native
}
object Copy {
  
  @scala.inline
  def apply(): Copy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit class CopyOps[Self <: Copy] (val x: Self) extends AnyVal {
    
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
    def setCopyVarargs(value: String*): Self = this.set("copy", js.Array(value :_*))
    
    @scala.inline
    def setCopy(value: js.Array[String]): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setParentName(value: String): Self = this.set("parentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentName: Self = this.set("parentName", js.undefined)
    
    @scala.inline
    def setVisitedObjects(value: js.Any): Self = this.set("visitedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitedObjects: Self = this.set("visitedObjects", js.undefined)
  }
}
