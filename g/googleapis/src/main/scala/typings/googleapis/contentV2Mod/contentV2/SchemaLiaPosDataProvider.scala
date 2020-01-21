package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaPosDataProvider extends js.Object {
  /**
    * The ID of the POS data provider.
    */
  var posDataProviderId: js.UndefOr[String] = js.native
  /**
    * The account ID by which this merchant is known to the POS data provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.native
}

object SchemaLiaPosDataProvider {
  @scala.inline
  def apply(posDataProviderId: String = null, posExternalAccountId: String = null): SchemaLiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    if (posDataProviderId != null) __obj.updateDynamic("posDataProviderId")(posDataProviderId.asInstanceOf[js.Any])
    if (posExternalAccountId != null) __obj.updateDynamic("posExternalAccountId")(posExternalAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiaPosDataProvider]
  }
}

