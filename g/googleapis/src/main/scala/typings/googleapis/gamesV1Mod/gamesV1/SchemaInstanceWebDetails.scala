package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Web details resource.
  */
@js.native
trait SchemaInstanceWebDetails extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceWebDetails.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Launch URL for the game.
    */
  var launchUrl: js.UndefOr[String] = js.native
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean] = js.native
}

object SchemaInstanceWebDetails {
  @scala.inline
  def apply(kind: String = null, launchUrl: String = null, preferred: js.UndefOr[Boolean] = js.undefined): SchemaInstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (launchUrl != null) __obj.updateDynamic("launchUrl")(launchUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceWebDetails]
  }
}

