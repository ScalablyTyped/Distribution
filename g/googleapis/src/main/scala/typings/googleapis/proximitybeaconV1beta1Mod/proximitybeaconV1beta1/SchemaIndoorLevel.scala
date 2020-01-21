package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indoor level, a human-readable string as returned by Google Maps APIs,
  * useful to indicate which floor of a building a beacon is located on.
  */
@js.native
trait SchemaIndoorLevel extends js.Object {
  /**
    * The name of this level.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaIndoorLevel {
  @scala.inline
  def apply(name: String = null): SchemaIndoorLevel = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIndoorLevel]
  }
}

