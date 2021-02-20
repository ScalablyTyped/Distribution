package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBucketByTimePeriod extends StObject {
  
  /**
    * org.joda.timezone.DateTimeZone
    */
  var timeZoneId: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object SchemaBucketByTimePeriod {
  
  @scala.inline
  def apply(): SchemaBucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketByTimePeriod]
  }
  
  @scala.inline
  implicit class SchemaBucketByTimePeriodMutableBuilder[Self <: SchemaBucketByTimePeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneIdUndefined: Self = StObject.set(x, "timeZoneId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
