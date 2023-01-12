package typings.hellosignSdk.anon

import typings.hellosignSdk.mod.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var api_id: String
  
  var name: String
  
  var required: Boolean
  
  var signature_id: String
  
  var `type`: Field
  
  var value: String
}
object Name {
  
  inline def apply(
    api_id: String,
    name: String,
    required: Boolean,
    signature_id: String,
    `type`: Field,
    value: String
  ): Name = {
    val __obj = js.Dynamic.literal(api_id = api_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setApi_id(value: String): Self = StObject.set(x, "api_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSignature_id(value: String): Self = StObject.set(x, "signature_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: Field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
