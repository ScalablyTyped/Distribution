package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsEnableXpnResourceRequest extends js.Object {
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.native
}

object SchemaProjectsEnableXpnResourceRequest {
  @scala.inline
  def apply(xpnResource: SchemaXpnResourceId = null): SchemaProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    if (xpnResource != null) __obj.updateDynamic("xpnResource")(xpnResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectsEnableXpnResourceRequest]
  }
}

