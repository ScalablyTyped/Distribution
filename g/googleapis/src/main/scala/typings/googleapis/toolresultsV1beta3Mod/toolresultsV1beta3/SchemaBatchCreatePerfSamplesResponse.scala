package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreatePerfSamplesResponse extends StObject {
  
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.undefined
}
object SchemaBatchCreatePerfSamplesResponse {
  
  inline def apply(): SchemaBatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesResponse]
  }
  
  extension [Self <: SchemaBatchCreatePerfSamplesResponse](x: Self) {
    
    inline def setPerfSamples(value: js.Array[SchemaPerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    inline def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    inline def setPerfSamplesVarargs(value: SchemaPerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
