package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.landscape
import typings.ionic.ionicStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesImageConfig extends js.Object {
  var density: js.UndefOr[String] = js.undefined
  var height: Double
  var name: String
  var orientation: js.UndefOr[landscape | portrait] = js.undefined
  var width: Double
}

object ResourcesImageConfig {
  @scala.inline
  def apply(
    height: Double,
    name: String,
    width: Double,
    density: String = null,
    orientation: landscape | portrait = null
  ): ResourcesImageConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesImageConfig]
  }
}

