package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the metagame config resource
  */
@js.native
trait SchemaMetagameConfig extends js.Object {
  /**
    * Current version of the metagame configuration data. When this data is
    * updated, the version number will be increased by one.
    */
  var currentVersion: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#metagameConfig.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of player levels.
    */
  var playerLevels: js.UndefOr[js.Array[SchemaPlayerLevel]] = js.native
}

object SchemaMetagameConfig {
  @scala.inline
  def apply(
    currentVersion: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    playerLevels: js.Array[SchemaPlayerLevel] = null
  ): SchemaMetagameConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentVersion)) __obj.updateDynamic("currentVersion")(currentVersion.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (playerLevels != null) __obj.updateDynamic("playerLevels")(playerLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetagameConfig]
  }
}

