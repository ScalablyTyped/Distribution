package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StragglerSummary extends StObject {
  
  /** Aggregated counts of straggler causes, keyed by the string representation of the StragglerCause enum. */
  var stragglerCauseCount: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The total count of stragglers. */
  var totalStragglerCount: js.UndefOr[String] = js.undefined
}
object StragglerSummary {
  
  inline def apply(): StragglerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StragglerSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StragglerSummary] (val x: Self) extends AnyVal {
    
    inline def setStragglerCauseCount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "stragglerCauseCount", value.asInstanceOf[js.Any])
    
    inline def setStragglerCauseCountUndefined: Self = StObject.set(x, "stragglerCauseCount", js.undefined)
    
    inline def setTotalStragglerCount(value: String): Self = StObject.set(x, "totalStragglerCount", value.asInstanceOf[js.Any])
    
    inline def setTotalStragglerCountUndefined: Self = StObject.set(x, "totalStragglerCount", js.undefined)
  }
}
