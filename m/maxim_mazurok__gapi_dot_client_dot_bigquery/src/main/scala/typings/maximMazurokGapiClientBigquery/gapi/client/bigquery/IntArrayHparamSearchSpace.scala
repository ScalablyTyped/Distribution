package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntArrayHparamSearchSpace extends StObject {
  
  /** Candidates for the int array parameter. */
  var candidates: js.UndefOr[js.Array[IntArray]] = js.undefined
}
object IntArrayHparamSearchSpace {
  
  inline def apply(): IntArrayHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntArrayHparamSearchSpace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntArrayHparamSearchSpace] (val x: Self) extends AnyVal {
    
    inline def setCandidates(value: js.Array[IntArray]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: IntArray*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
