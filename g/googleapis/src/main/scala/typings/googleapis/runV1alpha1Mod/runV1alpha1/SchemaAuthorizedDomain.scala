package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A domain that a user has been authorized to administer. To authorize use of
  * a domain, verify ownership via [Webmaster
  * Central](https://www.google.com/webmasters/verification/home).
  */
@js.native
trait SchemaAuthorizedDomain extends js.Object {
  /**
    * Relative name of the domain authorized for use. Example: `example.com`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Read only. Full path to the `AuthorizedDomain` resource in the API.
    * Example: `apps/myapp/authorizedDomains/example.com`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAuthorizedDomain {
  @scala.inline
  def apply(id: String = null, name: String = null): SchemaAuthorizedDomain = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthorizedDomain]
  }
}

