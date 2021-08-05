package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request must provide up to a maximum of 5000 samples to be created; a
  * larger sample size will cause an INVALID_ARGUMENT error
  */
trait SchemaBatchCreatePerfSamplesRequest extends StObject {
  
  /**
    * The set of PerfSamples to create should not include existing timestamps
    */
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.undefined
}
object SchemaBatchCreatePerfSamplesRequest {
  
  inline def apply(): SchemaBatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesRequest]
  }
  
  extension [Self <: SchemaBatchCreatePerfSamplesRequest](x: Self) {
    
    inline def setPerfSamples(value: js.Array[SchemaPerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    inline def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    inline def setPerfSamplesVarargs(value: SchemaPerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
