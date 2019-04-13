package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditsOptions extends js.Object {
  /**
    * Whether to show the credits text.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The URL for the credits label.
    * @default 'http://www.highcharts.com'
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Position configuration for the credits label. Supported properties are align, verticalAlign, x and y.
    */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * CSS styles for the credits label.
    */
  var style: js.UndefOr[js.Object] = js.undefined
  /**
    * The text for the credits label.
    * @default 'Highcharts.com'
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CreditsOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    position: Position = null,
    style: js.Object = null,
    text: java.lang.String = null
  ): CreditsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CreditsOptions]
  }
}

