package typings
package markdownDashItLib.libMod.MarkdownItNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var close: scala.Boolean
  var end: scala.Double
  var jump: scala.Double
  var length: scala.Double
  var level: scala.Double
  var marker: scala.Double
  var open: scala.Boolean
  var token: scala.Double
}

object Delimiter {
  @scala.inline
  def apply(
    close: scala.Boolean,
    end: scala.Double,
    jump: scala.Double,
    length: scala.Double,
    level: scala.Double,
    marker: scala.Double,
    open: scala.Boolean,
    token: scala.Double
  ): Delimiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("jump")(jump)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("marker")(marker)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Delimiter]
  }
}

