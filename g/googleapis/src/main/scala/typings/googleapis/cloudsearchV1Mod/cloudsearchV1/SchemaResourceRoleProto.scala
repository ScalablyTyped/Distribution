package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceRoleProto extends StObject {
  
  var applicationId: js.UndefOr[String | Null] = js.undefined
  
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  var objectPart: js.UndefOr[String | Null] = js.undefined
  
  var roleId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaResourceRoleProto {
  
  inline def apply(): SchemaResourceRoleProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRoleProto]
  }
  
  extension [Self <: SchemaResourceRoleProto](x: Self) {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdNull: Self = StObject.set(x, "applicationId", null)
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setObjectPart(value: String): Self = StObject.set(x, "objectPart", value.asInstanceOf[js.Any])
    
    inline def setObjectPartNull: Self = StObject.set(x, "objectPart", null)
    
    inline def setObjectPartUndefined: Self = StObject.set(x, "objectPart", js.undefined)
    
    inline def setRoleId(value: Double): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdNull: Self = StObject.set(x, "roleId", null)
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
  }
}
