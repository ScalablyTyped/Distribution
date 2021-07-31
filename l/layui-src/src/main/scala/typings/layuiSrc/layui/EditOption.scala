package typings.layuiSrc.layui

import typings.layuiSrc.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditOption extends StObject {
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var hideTool: js.UndefOr[js.Array[String]] = js.undefined
  
  var tool: js.UndefOr[js.Array[String]] = js.undefined
  
  var uploadImage: js.UndefOr[Type] = js.undefined
}
object EditOption {
  
  @scala.inline
  def apply(): EditOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOption]
  }
  
  @scala.inline
  implicit class EditOptionMutableBuilder[Self <: EditOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHideTool(value: js.Array[String]): Self = StObject.set(x, "hideTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideToolUndefined: Self = StObject.set(x, "hideTool", js.undefined)
    
    @scala.inline
    def setHideToolVarargs(value: String*): Self = StObject.set(x, "hideTool", js.Array(value :_*))
    
    @scala.inline
    def setTool(value: js.Array[String]): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
    
    @scala.inline
    def setToolVarargs(value: String*): Self = StObject.set(x, "tool", js.Array(value :_*))
    
    @scala.inline
    def setUploadImage(value: Type): Self = StObject.set(x, "uploadImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadImageUndefined: Self = StObject.set(x, "uploadImage", js.undefined)
  }
}
