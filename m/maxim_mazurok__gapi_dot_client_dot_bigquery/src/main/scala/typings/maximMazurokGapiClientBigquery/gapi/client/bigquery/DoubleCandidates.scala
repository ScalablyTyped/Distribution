package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleCandidates extends StObject {
  
  /** Candidates for the double parameter in increasing order. */
  var candidates: js.UndefOr[js.Array[Double]] = js.undefined
}
object DoubleCandidates {
  
  inline def apply(): DoubleCandidates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleCandidates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleCandidates] (val x: Self) extends AnyVal {
    
    inline def setCandidates(value: js.Array[Double]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: Double*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
