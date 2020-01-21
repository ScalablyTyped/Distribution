package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPosDataProviders extends js.Object {
  /**
    * Country code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * A list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProvidersPosDataProvider]] = js.native
}

object SchemaPosDataProviders {
  @scala.inline
  def apply(country: String = null, posDataProviders: js.Array[SchemaPosDataProvidersPosDataProvider] = null): SchemaPosDataProviders = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPosDataProviders]
  }
}

