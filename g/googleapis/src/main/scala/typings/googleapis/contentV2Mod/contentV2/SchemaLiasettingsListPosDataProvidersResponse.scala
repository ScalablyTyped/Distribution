package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiasettingsListPosDataProvidersResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsListPosDataProvidersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of POS data providers for each eligible country
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProviders]] = js.native
}

object SchemaLiasettingsListPosDataProvidersResponse {
  @scala.inline
  def apply(kind: String = null, posDataProviders: js.Array[SchemaPosDataProviders] = null): SchemaLiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiasettingsListPosDataProvidersResponse]
  }
}

