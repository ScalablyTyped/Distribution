package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interprets a result so that humans and machines can act on it.
  */
trait SchemaOutcome extends StObject {
  
  /**
    * More information about a FAILURE outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not FAILURE.  Optional
    */
  var failureDetail: js.UndefOr[SchemaFailureDetail] = js.undefined
  
  /**
    * More information about an INCONCLUSIVE outcome.  Returns INVALID_ARGUMENT
    * if this field is set but the summary is not INCONCLUSIVE.  Optional
    */
  var inconclusiveDetail: js.UndefOr[SchemaInconclusiveDetail] = js.undefined
  
  /**
    * More information about a SKIPPED outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not SKIPPED.  Optional
    */
  var skippedDetail: js.UndefOr[SchemaSkippedDetail] = js.undefined
  
  /**
    * More information about a SUCCESS outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not SUCCESS.  Optional
    */
  var successDetail: js.UndefOr[SchemaSuccessDetail] = js.undefined
  
  /**
    * The simplest way to interpret a result.  Required
    */
  var summary: js.UndefOr[String] = js.undefined
}
object SchemaOutcome {
  
  inline def apply(): SchemaOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutcome]
  }
  
  extension [Self <: SchemaOutcome](x: Self) {
    
    inline def setFailureDetail(value: SchemaFailureDetail): Self = StObject.set(x, "failureDetail", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailUndefined: Self = StObject.set(x, "failureDetail", js.undefined)
    
    inline def setInconclusiveDetail(value: SchemaInconclusiveDetail): Self = StObject.set(x, "inconclusiveDetail", value.asInstanceOf[js.Any])
    
    inline def setInconclusiveDetailUndefined: Self = StObject.set(x, "inconclusiveDetail", js.undefined)
    
    inline def setSkippedDetail(value: SchemaSkippedDetail): Self = StObject.set(x, "skippedDetail", value.asInstanceOf[js.Any])
    
    inline def setSkippedDetailUndefined: Self = StObject.set(x, "skippedDetail", js.undefined)
    
    inline def setSuccessDetail(value: SchemaSuccessDetail): Self = StObject.set(x, "successDetail", value.asInstanceOf[js.Any])
    
    inline def setSuccessDetailUndefined: Self = StObject.set(x, "successDetail", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
