package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntCandidates extends StObject {
  
  /** Candidates for the int parameter in increasing order. */
  var candidates: js.UndefOr[js.Array[String]] = js.undefined
}
object IntCandidates {
  
  inline def apply(): IntCandidates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntCandidates]
  }
  
  extension [Self <: IntCandidates](x: Self) {
    
    inline def setCandidates(value: js.Array[String]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: String*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
