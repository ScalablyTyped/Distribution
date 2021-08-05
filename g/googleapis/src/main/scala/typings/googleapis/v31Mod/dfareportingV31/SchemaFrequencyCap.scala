package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Frequency Cap.
  */
trait SchemaFrequencyCap extends StObject {
  
  /**
    * Duration of time, in seconds, for this frequency cap. The maximum
    * duration is 90 days. Acceptable values are 1 to 7776000, inclusive.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * Number of times an individual user can be served the ad within the
    * specified duration. Acceptable values are 1 to 15, inclusive.
    */
  var impressions: js.UndefOr[String] = js.undefined
}
object SchemaFrequencyCap {
  
  inline def apply(): SchemaFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFrequencyCap]
  }
  
  extension [Self <: SchemaFrequencyCap](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setImpressions(value: String): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    inline def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
  }
}
