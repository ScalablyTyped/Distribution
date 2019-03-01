package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowContent extends js.Object {
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object WindowContent {
  @scala.inline
  def apply(template: java.lang.String = null): WindowContent = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[WindowContent]
  }
}

