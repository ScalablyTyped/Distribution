package typings.loopback.anon

import typings.loopback.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessType extends StObject {
  
  var accessType: String = js.native
  
  var id: js.Any = js.native
  
  var model: String | Model = js.native
  
  var principals: js.Array[_] = js.native
  
  var property: String = js.native
}
object AccessType {
  
  @scala.inline
  def apply(accessType: String, id: js.Any, model: String | Model, principals: js.Array[_], property: String): AccessType = {
    val __obj = js.Dynamic.literal(accessType = accessType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessType]
  }
  
  @scala.inline
  implicit class AccessTypeMutableBuilder[Self <: AccessType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String | Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipals(value: js.Array[_]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsVarargs(value: js.Any*): Self = StObject.set(x, "principals", js.Array(value :_*))
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
