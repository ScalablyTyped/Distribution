package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntHparamSearchSpace extends StObject {
  
  /** Candidates of the int hyperparameter. */
  var candidates: js.UndefOr[IntCandidates] = js.undefined
  
  /** Range of the int hyperparameter. */
  var range: js.UndefOr[IntRange] = js.undefined
}
object IntHparamSearchSpace {
  
  inline def apply(): IntHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntHparamSearchSpace]
  }
  
  extension [Self <: IntHparamSearchSpace](x: Self) {
    
    inline def setCandidates(value: IntCandidates): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setRange(value: IntRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
