package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Configuration List Response
  */
@js.native
trait SchemaFloodlightConfigurationsListResponse extends js.Object {
  /**
    * Floodlight configuration collection.
    */
  var floodlightConfigurations: js.UndefOr[js.Array[SchemaFloodlightConfiguration]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightConfigurationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFloodlightConfigurationsListResponse {
  @scala.inline
  def apply(floodlightConfigurations: js.Array[SchemaFloodlightConfiguration] = null, kind: String = null): SchemaFloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightConfigurations != null) __obj.updateDynamic("floodlightConfigurations")(floodlightConfigurations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFloodlightConfigurationsListResponse]
  }
}

