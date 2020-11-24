package typings.layuiSrc.layui

import typings.layuiSrc.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditOption extends js.Object {
  
  var height: js.UndefOr[Double | String] = js.native
  
  var hideTool: js.UndefOr[js.Array[String]] = js.native
  
  var tool: js.UndefOr[js.Array[String]] = js.native
  
  var uploadImage: js.UndefOr[Type] = js.native
}
object EditOption {
  
  @scala.inline
  def apply(): EditOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOption]
  }
  
  @scala.inline
  implicit class EditOptionOps[Self <: EditOption] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHideToolVarargs(value: String*): Self = this.set("hideTool", js.Array(value :_*))
    
    @scala.inline
    def setHideTool(value: js.Array[String]): Self = this.set("hideTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTool: Self = this.set("hideTool", js.undefined)
    
    @scala.inline
    def setToolVarargs(value: String*): Self = this.set("tool", js.Array(value :_*))
    
    @scala.inline
    def setTool(value: js.Array[String]): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTool: Self = this.set("tool", js.undefined)
    
    @scala.inline
    def setUploadImage(value: Type): Self = this.set("uploadImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadImage: Self = this.set("uploadImage", js.undefined)
  }
}
