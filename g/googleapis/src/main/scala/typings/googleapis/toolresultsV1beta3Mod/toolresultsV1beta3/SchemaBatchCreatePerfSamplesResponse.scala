package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBatchCreatePerfSamplesResponse extends StObject {
  
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}
object SchemaBatchCreatePerfSamplesResponse {
  
  @scala.inline
  def apply(): SchemaBatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchCreatePerfSamplesResponseMutableBuilder[Self <: SchemaBatchCreatePerfSamplesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerfSamples(value: js.Array[SchemaPerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    @scala.inline
    def setPerfSamplesVarargs(value: SchemaPerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
