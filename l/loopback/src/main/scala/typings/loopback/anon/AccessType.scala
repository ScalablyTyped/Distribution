package typings.loopback.anon

import typings.loopback.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessType extends StObject {
  
  var accessType: String
  
  var id: Any
  
  var model: String | Model
  
  var principals: js.Array[Any]
  
  var property: String
}
object AccessType {
  
  inline def apply(accessType: String, id: Any, model: String | Model, principals: js.Array[Any], property: String): AccessType = {
    val __obj = js.Dynamic.literal(accessType = accessType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessType] (val x: Self) extends AnyVal {
    
    inline def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String | Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPrincipals(value: js.Array[Any]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsVarargs(value: Any*): Self = StObject.set(x, "principals", js.Array(value*))
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
