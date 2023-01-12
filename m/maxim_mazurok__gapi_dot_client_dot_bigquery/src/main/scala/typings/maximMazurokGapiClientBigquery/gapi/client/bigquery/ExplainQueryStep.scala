package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainQueryStep extends StObject {
  
  /** Machine-readable operation type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Human-readable stage descriptions. */
  var substeps: js.UndefOr[js.Array[String]] = js.undefined
}
object ExplainQueryStep {
  
  inline def apply(): ExplainQueryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainQueryStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplainQueryStep] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSubsteps(value: js.Array[String]): Self = StObject.set(x, "substeps", value.asInstanceOf[js.Any])
    
    inline def setSubstepsUndefined: Self = StObject.set(x, "substeps", js.undefined)
    
    inline def setSubstepsVarargs(value: String*): Self = StObject.set(x, "substeps", js.Array(value*))
  }
}
