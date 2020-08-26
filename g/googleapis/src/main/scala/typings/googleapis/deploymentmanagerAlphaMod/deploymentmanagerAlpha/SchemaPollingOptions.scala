package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPollingOptions extends js.Object {
  /**
    * An array of diagnostics to be collected by Deployment Manager, these
    * diagnostics will be displayed to the user.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostic]] = js.native
  /**
    * JsonPath expression that determines if the request failed.
    */
  var failCondition: js.UndefOr[String] = js.native
  /**
    * JsonPath expression that determines if the request is completed.
    */
  var finishCondition: js.UndefOr[String] = js.native
  /**
    * JsonPath expression that evaluates to string, it indicates where to poll.
    */
  var pollingLink: js.UndefOr[String] = js.native
  /**
    * JsonPath expression, after polling is completed, indicates where to fetch
    * the resource.
    */
  var targetLink: js.UndefOr[String] = js.native
}

object SchemaPollingOptions {
  @scala.inline
  def apply(): SchemaPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollingOptions]
  }
  @scala.inline
  implicit class SchemaPollingOptionsOps[Self <: SchemaPollingOptions] (val x: Self) extends AnyVal {
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
    def setDiagnosticsVarargs(value: SchemaDiagnostic*): Self = this.set("diagnostics", js.Array(value :_*))
    @scala.inline
    def setDiagnostics(value: js.Array[SchemaDiagnostic]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    @scala.inline
    def setFailCondition(value: String): Self = this.set("failCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailCondition: Self = this.set("failCondition", js.undefined)
    @scala.inline
    def setFinishCondition(value: String): Self = this.set("finishCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishCondition: Self = this.set("finishCondition", js.undefined)
    @scala.inline
    def setPollingLink(value: String): Self = this.set("pollingLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingLink: Self = this.set("pollingLink", js.undefined)
    @scala.inline
    def setTargetLink(value: String): Self = this.set("targetLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetLink: Self = this.set("targetLink", js.undefined)
  }
  
}

