package typings
package jqueryDashAwesomeDashCursorLib.JQueryAwesomeCursorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var cssClass: java.lang.String | cssHandler
  var family: java.lang.String
}

object Font {
  @scala.inline
  def apply(cssClass: java.lang.String | cssHandler, family: java.lang.String): Font = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    __obj.updateDynamic("family")(family)
    __obj.asInstanceOf[Font]
  }
}

