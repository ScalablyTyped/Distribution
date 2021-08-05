package typings.loopback.anon

import typings.loopback.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessType extends StObject {
  
  var accessType: String
  
  var id: js.Any
  
  var model: String | Model
  
  var principals: js.Array[js.Any]
  
  var property: String
}
object AccessType {
  
  inline def apply(
    accessType: String,
    id: js.Any,
    model: String | Model,
    principals: js.Array[js.Any],
    property: String
  ): AccessType = {
    val __obj = js.Dynamic.literal(accessType = accessType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessType]
  }
  
  extension [Self <: AccessType](x: Self) {
    
    inline def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String | Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPrincipals(value: js.Array[js.Any]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsVarargs(value: js.Any*): Self = StObject.set(x, "principals", js.Array(value :_*))
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
