package typings.jqueryui.JQueryUINs

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsActivationUIParams extends js.Object {
  var newPanel: JQuery
  var newTab: JQuery
  var oldPanel: JQuery
  var oldTab: JQuery
}

object TabsActivationUIParams {
  @scala.inline
  def apply(newPanel: JQuery, newTab: JQuery, oldPanel: JQuery, oldTab: JQuery): TabsActivationUIParams = {
    val __obj = js.Dynamic.literal(newPanel = newPanel, newTab = newTab, oldPanel = oldPanel, oldTab = oldTab)
  
    __obj.asInstanceOf[TabsActivationUIParams]
  }
}

