package typings
package highchartsLib.highchartsMod

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
  def apply(onclick: () => scala.Unit, text: java.lang.String): MenuItem = {
    val __obj = js.Dynamic.literal(onclick = js.Any.fromFunction0(onclick), text = text)
  
    __obj.asInstanceOf[MenuItem]
  }
}

