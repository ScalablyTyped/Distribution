package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path-matching rule for a URL. If matched, will use the specified
  * BackendService to handle the traffic arriving at this URL.
  */
@js.native
trait SchemaPathRule extends js.Object {
  /**
    * The list of path patterns to match. Each must start with / and the only
    * place a * is allowed is at the end following a /. The string fed to the
    * path matcher does not include any text after the first ? or #, and those
    * chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The full or partial URL of the backend service resource to which traffic
    * is directed if this rule is matched. If routeAction is additionally
    * specified, advanced routing actions like URL Rewrites, etc. take effect
    * prior to sending the request to the backend. However, if service is
    * specified, routeAction cannot contain any weightedBackendService s.
    * Conversely, if routeAction specifies any  weightedBackendServices,
    * service must not be specified. Only one of urlRedirect, service or
    * routeAction.weightedBackendService must be set.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaPathRule {
  @scala.inline
  def apply(paths: js.Array[String] = null, service: String = null): SchemaPathRule = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPathRule]
  }
}

