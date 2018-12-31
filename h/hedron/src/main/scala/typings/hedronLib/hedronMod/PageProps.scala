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

