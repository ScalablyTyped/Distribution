package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interprets a result so that humans and machines can act on it.
  */
@js.native
trait SchemaOutcome extends js.Object {
  
  /**
    * More information about a FAILURE outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not FAILURE.  Optional
    */
  var failureDetail: js.UndefOr[SchemaFailureDetail] = js.native
  
  /**
    * More information about an INCONCLUSIVE outcome.  Returns INVALID_ARGUMENT
    * if this field is set but the summary is not INCONCLUSIVE.  Optional
    */
  var inconclusiveDetail: js.UndefOr[SchemaInconclusiveDetail] = js.native
  
  /**
    * More information about a SKIPPED outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not SKIPPED.  Optional
    */
  var skippedDetail: js.UndefOr[SchemaSkippedDetail] = js.native
  
  /**
    * More information about a SUCCESS outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not SUCCESS.  Optional
    */
  var successDetail: js.UndefOr[SchemaSuccessDetail] = js.native
  
  /**
    * The simplest way to interpret a result.  Required
    */
  var summary: js.UndefOr[String] = js.native
}
object SchemaOutcome {
  
  @scala.inline
  def apply(): SchemaOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutcome]
  }
  
  @scala.inline
  implicit class SchemaOutcomeOps[Self <: SchemaOutcome] (val x: Self) extends AnyVal {
    
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
    def setFailureDetail(value: SchemaFailureDetail): Self = this.set("failureDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureDetail: Self = this.set("failureDetail", js.undefined)
    
    @scala.inline
    def setInconclusiveDetail(value: SchemaInconclusiveDetail): Self = this.set("inconclusiveDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInconclusiveDetail: Self = this.set("inconclusiveDetail", js.undefined)
    
    @scala.inline
    def setSkippedDetail(value: SchemaSkippedDetail): Self = this.set("skippedDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippedDetail: Self = this.set("skippedDetail", js.undefined)
    
    @scala.inline
    def setSuccessDetail(value: SchemaSuccessDetail): Self = this.set("successDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessDetail: Self = this.set("successDetail", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
