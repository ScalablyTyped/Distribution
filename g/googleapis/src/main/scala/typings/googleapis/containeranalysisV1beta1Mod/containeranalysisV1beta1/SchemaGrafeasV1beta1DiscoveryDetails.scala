package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a discovery occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1DiscoveryDetails extends js.Object {
  /**
    * Required. Analysis status for the discovered resource.
    */
  var discovered: js.UndefOr[SchemaDiscovered] = js.native
}

object SchemaGrafeasV1beta1DiscoveryDetails {
  @scala.inline
  def apply(discovered: SchemaDiscovered = null): SchemaGrafeasV1beta1DiscoveryDetails = {
    val __obj = js.Dynamic.literal()
    if (discovered != null) __obj.updateDynamic("discovered")(discovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGrafeasV1beta1DiscoveryDetails]
  }
}

