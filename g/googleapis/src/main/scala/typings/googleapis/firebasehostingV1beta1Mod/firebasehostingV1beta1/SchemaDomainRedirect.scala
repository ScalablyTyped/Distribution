package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the behavior of a domain-level redirect. Domain redirects preserve
  * the path of the redirect but replace the requested domain with the one
  * specified in the redirect configuration.
  */
@js.native
trait SchemaDomainRedirect extends js.Object {
  /**
    * Required. The domain name to redirect to.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * Required. The redirect status code.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDomainRedirect {
  @scala.inline
  def apply(domainName: String = null, `type`: String = null): SchemaDomainRedirect = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomainRedirect]
  }
}

