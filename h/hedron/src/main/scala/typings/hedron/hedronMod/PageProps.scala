package typings.hedron.hedronMod

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
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Enabling fluid mode disables the fixed width of the Page
    */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /**
    * You can specify component to use specific tag
    * @default 'div'
    */
  var tagName: js.UndefOr[String] = js.undefined
  /**
    * If not using fluid, set a custom width for the page.
    */
  var width: js.UndefOr[String] = js.undefined
}

object PageProps {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    tagName: String = null,
    width: String = null
  ): PageProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageProps]
  }
}

