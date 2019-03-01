package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesImageConfig extends js.Object {
  var density: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var name: java.lang.String
  var orientation: js.UndefOr[ionicLib.ionicLibStrings.landscape | ionicLib.ionicLibStrings.portrait] = js.undefined
  var width: scala.Double
}

object ResourcesImageConfig {
  @scala.inline
  def apply(
    height: scala.Double,
    name: java.lang.String,
    width: scala.Double,
    density: java.lang.String = null,
    orientation: ionicLib.ionicLibStrings.landscape | ionicLib.ionicLibStrings.portrait = null
  ): ResourcesImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("width")(width)
    if (density != null) __obj.updateDynamic("density")(density)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesImageConfig]
  }
}

