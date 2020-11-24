package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request must provide up to a maximum of 5000 samples to be created; a
  * larger sample size will cause an INVALID_ARGUMENT error
  */
@js.native
trait SchemaBatchCreatePerfSamplesRequest extends js.Object {
  
  /**
    * The set of PerfSamples to create should not include existing timestamps
    */
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}
object SchemaBatchCreatePerfSamplesRequest {
  
  @scala.inline
  def apply(): SchemaBatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchCreatePerfSamplesRequestOps[Self <: SchemaBatchCreatePerfSamplesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPerfSamplesVarargs(value: SchemaPerfSample*): Self = this.set("perfSamples", js.Array(value :_*))
    
    @scala.inline
    def setPerfSamples(value: js.Array[SchemaPerfSample]): Self = this.set("perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfSamples: Self = this.set("perfSamples", js.undefined)
  }
}
