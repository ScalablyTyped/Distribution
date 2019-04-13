package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleObject extends TitleOptions {
  /**
    * Update method that points back to Chart.setTitle.
    * @since 5.0.0
    */
  def update(options: TitleOptions): scala.Unit
}

object TitleObject {
  @scala.inline
  def apply(
    update: TitleOptions => scala.Unit,
    align: java.lang.String = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    margin: scala.Int | scala.Double = null,
    style: js.Object = null,
    text: java.lang.String = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): TitleObject = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleObject]
  }
}

