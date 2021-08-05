package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpFaultDelay extends StObject {
  
  /** Specifies the value of the fixed delay interval. */
  var fixedDelay: js.UndefOr[Duration] = js.undefined
  
  /**
    * The percentage of traffic (connections/operations/requests) on which delay will be introduced as part of fault injection.
    * The value must be between 0.0 and 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.undefined
}
object HttpFaultDelay {
  
  inline def apply(): HttpFaultDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpFaultDelay]
  }
  
  extension [Self <: HttpFaultDelay](x: Self) {
    
    inline def setFixedDelay(value: Duration): Self = StObject.set(x, "fixedDelay", value.asInstanceOf[js.Any])
    
    inline def setFixedDelayUndefined: Self = StObject.set(x, "fixedDelay", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
