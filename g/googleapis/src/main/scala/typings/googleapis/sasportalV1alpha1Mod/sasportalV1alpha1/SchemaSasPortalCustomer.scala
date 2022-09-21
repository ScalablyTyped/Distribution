package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalCustomer extends StObject {
  
  /**
    * Required. Name of the organization that the customer entity represents.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the customer.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User IDs used by the devices belonging to this customer.
    */
  var sasUserIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSasPortalCustomer {
  
  inline def apply(): SchemaSasPortalCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalCustomer]
  }
  
  extension [Self <: SchemaSasPortalCustomer](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSasUserIds(value: js.Array[String]): Self = StObject.set(x, "sasUserIds", value.asInstanceOf[js.Any])
    
    inline def setSasUserIdsNull: Self = StObject.set(x, "sasUserIds", null)
    
    inline def setSasUserIdsUndefined: Self = StObject.set(x, "sasUserIds", js.undefined)
    
    inline def setSasUserIdsVarargs(value: String*): Self = StObject.set(x, "sasUserIds", js.Array(value*))
  }
}
