package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceType extends StObject {
  
  /**
    * Output only. The human-readable display name for the service type.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A stable ID (provided by Google) for this service type.
    */
  var serviceTypeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceType {
  
  inline def apply(): SchemaServiceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceType]
  }
  
  extension [Self <: SchemaServiceType](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setServiceTypeId(value: String): Self = StObject.set(x, "serviceTypeId", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeIdNull: Self = StObject.set(x, "serviceTypeId", null)
    
    inline def setServiceTypeIdUndefined: Self = StObject.set(x, "serviceTypeId", js.undefined)
  }
}
