package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringHparamSearchSpace extends StObject {
  
  /** Canididates for the string or enum parameter in lower case. */
  var candidates: js.UndefOr[js.Array[String]] = js.undefined
}
object StringHparamSearchSpace {
  
  inline def apply(): StringHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringHparamSearchSpace]
  }
  
  extension [Self <: StringHparamSearchSpace](x: Self) {
    
    inline def setCandidates(value: js.Array[String]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: String*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
