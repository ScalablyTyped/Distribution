package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrequencyCap extends StObject {
  
  /** Duration of time, in seconds, for this frequency cap. The maximum duration is 90 days. Acceptable values are 1 to 7776000, inclusive. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Number of times an individual user can be served the ad within the specified duration. Acceptable values are 1 to 15, inclusive. */
  var impressions: js.UndefOr[String] = js.undefined
}
object FrequencyCap {
  
  inline def apply(): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrequencyCap]
  }
  
  extension [Self <: FrequencyCap](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setImpressions(value: String): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    inline def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
  }
}
