package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBucketByTimePeriod extends StObject {
  
  /**
    * org.joda.timezone.DateTimeZone
    */
  var timeZoneId: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBucketByTimePeriod {
  
  inline def apply(): SchemaBucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketByTimePeriod]
  }
  
  extension [Self <: SchemaBucketByTimePeriod](x: Self) {
    
    inline def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneIdNull: Self = StObject.set(x, "timeZoneId", null)
    
    inline def setTimeZoneIdUndefined: Self = StObject.set(x, "timeZoneId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
