package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleHparamSearchSpace extends StObject {
  
  /** Candidates of the double hyperparameter. */
  var candidates: js.UndefOr[DoubleCandidates] = js.undefined
  
  /** Range of the double hyperparameter. */
  var range: js.UndefOr[DoubleRange] = js.undefined
}
object DoubleHparamSearchSpace {
  
  inline def apply(): DoubleHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleHparamSearchSpace]
  }
  
  extension [Self <: DoubleHparamSearchSpace](x: Self) {
    
    inline def setCandidates(value: DoubleCandidates): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setRange(value: DoubleRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
