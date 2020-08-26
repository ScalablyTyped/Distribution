package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A backend rule provides configuration for an individual API element.
  */
@js.native
trait SchemaBackendRule extends js.Object {
  /**
    * The address of the API backend.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The number of seconds to wait for a response from a request.  The default
    * deadline for gRPC is infinite (no deadline) and HTTP requests is 5
    * seconds.
    */
  var deadline: js.UndefOr[Double] = js.native
  /**
    * The JWT audience is used when generating a JWT id token for the backend.
    */
  var jwtAudience: js.UndefOr[String] = js.native
  /**
    * Minimum deadline in seconds needed for this method. Calls having deadline
    * value lower than this will be rejected.
    */
  var minDeadline: js.UndefOr[Double] = js.native
  /**
    * The number of seconds to wait for the completion of a long running
    * operation. The default is no deadline.
    */
  var operationDeadline: js.UndefOr[Double] = js.native
  var pathTranslation: js.UndefOr[String] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaBackendRule {
  @scala.inline
  def apply(): SchemaBackendRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendRule]
  }
  @scala.inline
  implicit class SchemaBackendRuleOps[Self <: SchemaBackendRule] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setDeadline(value: Double): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    @scala.inline
    def setJwtAudience(value: String): Self = this.set("jwtAudience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJwtAudience: Self = this.set("jwtAudience", js.undefined)
    @scala.inline
    def setMinDeadline(value: Double): Self = this.set("minDeadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDeadline: Self = this.set("minDeadline", js.undefined)
    @scala.inline
    def setOperationDeadline(value: Double): Self = this.set("operationDeadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationDeadline: Self = this.set("operationDeadline", js.undefined)
    @scala.inline
    def setPathTranslation(value: String): Self = this.set("pathTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathTranslation: Self = this.set("pathTranslation", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

