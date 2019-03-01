package typings
package hedronLib.hedronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProps extends js.Object {
  /**
    * Draws all child columns with "bounding boxes" for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enabling fluid mode disables the fixed width of the Page
    */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You can specify component to use specific tag
    * @default 'div'
    */
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If not using fluid, set a custom width for the page.
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object PageProps {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    tagName: java.lang.String = null,
    width: java.lang.String = null
  ): PageProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PageProps]
  }
}

