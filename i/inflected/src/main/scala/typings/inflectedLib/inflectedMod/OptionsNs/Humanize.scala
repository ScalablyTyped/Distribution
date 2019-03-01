package typings
package inflectedLib.inflectedMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Humanize extends js.Object {
  var capitalize: scala.Boolean
}

object Humanize {
  @scala.inline
  def apply(capitalize: scala.Boolean): Humanize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capitalize")(capitalize)
    __obj.asInstanceOf[Humanize]
  }
}

