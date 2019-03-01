package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  /**
    * String to show in the menu item.
    */
  var text: java.lang.String
  /**
    * Callback function to run on click.
    */
  def onclick(): scala.Unit
}

object MenuItem {
  @scala.inline
  def apply(onclick: js.Function0[scala.Unit], text: java.lang.String): MenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onclick")(onclick)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MenuItem]
  }
}

