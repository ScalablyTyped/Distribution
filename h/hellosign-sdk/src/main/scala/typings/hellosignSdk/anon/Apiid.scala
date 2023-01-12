package typings.hellosignSdk.anon

import typings.hellosignSdk.hellosignSdkStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apiid extends StObject {
  
  var api_id: String
  
  var editor: String
  
  var name: String
  
  var required: Boolean
  
  var `type`: text
  
  var value: String
}
object Apiid {
  
  inline def apply(api_id: String, editor: String, name: String, required: Boolean, value: String): Apiid = {
    val __obj = js.Dynamic.literal(api_id = api_id.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[Apiid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apiid] (val x: Self) extends AnyVal {
    
    inline def setApi_id(value: String): Self = StObject.set(x, "api_id", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
