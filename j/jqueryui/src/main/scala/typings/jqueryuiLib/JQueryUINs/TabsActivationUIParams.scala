package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsActivationUIParams extends js.Object {
  var newPanel: jqueryuiLib.JQuery
  var newTab: jqueryuiLib.JQuery
  var oldPanel: jqueryuiLib.JQuery
  var oldTab: jqueryuiLib.JQuery
}

object TabsActivationUIParams {
  @scala.inline
  def apply(
    newPanel: jqueryuiLib.JQuery,
    newTab: jqueryuiLib.JQuery,
    oldPanel: jqueryuiLib.JQuery,
    oldTab: jqueryuiLib.JQuery
  ): TabsActivationUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newPanel")(newPanel)
    __obj.updateDynamic("newTab")(newTab)
    __obj.updateDynamic("oldPanel")(oldPanel)
    __obj.updateDynamic("oldTab")(oldTab)
    __obj.asInstanceOf[TabsActivationUIParams]
  }
}

