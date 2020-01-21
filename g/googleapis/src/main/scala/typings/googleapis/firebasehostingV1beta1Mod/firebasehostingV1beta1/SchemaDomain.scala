package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The intended behavior and status information of a domain.
  */
@js.native
trait SchemaDomain extends js.Object {
  /**
    * Required. The domain name of the association.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * If set, the domain should redirect with the provided parameters.
    */
  var domainRedirect: js.UndefOr[SchemaDomainRedirect] = js.native
  /**
    * Output only. Information about the provisioning of certificates and the
    * health of the DNS resolution for the domain.
    */
  var provisioning: js.UndefOr[SchemaDomainProvisioning] = js.native
  /**
    * Required. The site name of the association.
    */
  var site: js.UndefOr[String] = js.native
  /**
    * Output only. Additional status of the domain association.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the domain was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaDomain {
  @scala.inline
  def apply(
    domainName: String = null,
    domainRedirect: SchemaDomainRedirect = null,
    provisioning: SchemaDomainProvisioning = null,
    site: String = null,
    status: String = null,
    updateTime: String = null
  ): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainRedirect != null) __obj.updateDynamic("domainRedirect")(domainRedirect.asInstanceOf[js.Any])
    if (provisioning != null) __obj.updateDynamic("provisioning")(provisioning.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomain]
  }
}

