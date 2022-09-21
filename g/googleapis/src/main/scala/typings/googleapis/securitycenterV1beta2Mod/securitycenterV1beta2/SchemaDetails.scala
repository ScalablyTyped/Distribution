package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetails extends StObject {
  
  /**
    * The time the subscription has or will end.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time the subscription has or will start.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of subscription
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDetails {
  
  inline def apply(): SchemaDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetails]
  }
  
  extension [Self <: SchemaDetails](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
