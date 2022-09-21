package typings.hellosignSdk.anon

import typings.hellosignSdk.hellosignSdkStrings.checkbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editor extends StObject {
  
  var api_id: String
  
  var editor: String
  
  var name: String
  
  var required: Boolean
  
  var `type`: checkbox
  
  var value: Boolean
}
object Editor {
  
  inline def apply(api_id: String, editor: String, name: String, required: Boolean, value: Boolean): Editor = {
    val __obj = js.Dynamic.literal(api_id = api_id.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("checkbox")
    __obj.asInstanceOf[Editor]
  }
  
  extension [Self <: Editor](x: Self) {
    
    inline def setApi_id(value: String): Self = StObject.set(x, "api_id", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
