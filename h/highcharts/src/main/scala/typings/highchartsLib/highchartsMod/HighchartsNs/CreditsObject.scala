package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditsObject extends CreditsOptions {
  def update(options: CreditsOptions): scala.Unit
}

object CreditsObject {
  @scala.inline
  def apply(
    update: CreditsOptions => scala.Unit,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    position: Position = null,
    style: js.Object = null,
    text: java.lang.String = null
  ): CreditsObject = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CreditsObject]
  }
}

