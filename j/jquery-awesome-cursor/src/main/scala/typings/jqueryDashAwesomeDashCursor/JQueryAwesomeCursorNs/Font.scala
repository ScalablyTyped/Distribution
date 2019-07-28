package typings.jqueryDashAwesomeDashCursor.JQueryAwesomeCursorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var cssClass: String | cssHandler
  var family: String
}

object Font {
  @scala.inline
  def apply(cssClass: String | cssHandler, family: String): Font = {
    val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], family = family)
  
    __obj.asInstanceOf[Font]
  }
}

