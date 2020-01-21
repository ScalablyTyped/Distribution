package typings.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A certificate managed by App Engine.
  */
@js.native
trait SchemaManagedCertificate extends js.Object {
  /**
    * Time at which the certificate was last renewed. The renewal process is
    * fully managed. Certificate renewal will automatically occur before the
    * certificate expires. Renewal errors can be tracked via
    * ManagementStatus.@OutputOnly
    */
  var lastRenewalTime: js.UndefOr[String] = js.native
  /**
    * Status of certificate management. Refers to the most recent certificate
    * acquisition or renewal attempt.@OutputOnly
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaManagedCertificate {
  @scala.inline
  def apply(lastRenewalTime: String = null, status: String = null): SchemaManagedCertificate = {
    val __obj = js.Dynamic.literal()
    if (lastRenewalTime != null) __obj.updateDynamic("lastRenewalTime")(lastRenewalTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedCertificate]
  }
}

