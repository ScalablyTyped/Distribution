package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRoleProto extends StObject {
  
  var applicationId: js.UndefOr[String] = js.undefined
  
  var objectId: js.UndefOr[String] = js.undefined
  
  var objectPart: js.UndefOr[String] = js.undefined
  
  var roleId: js.UndefOr[Double] = js.undefined
}
object ResourceRoleProto {
  
  inline def apply(): ResourceRoleProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRoleProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceRoleProto] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setObjectPart(value: String): Self = StObject.set(x, "objectPart", value.asInstanceOf[js.Any])
    
    inline def setObjectPartUndefined: Self = StObject.set(x, "objectPart", js.undefined)
    
    inline def setRoleId(value: Double): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
  }
}
