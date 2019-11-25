package typings.jqueryui.JQueryUI

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
    val __obj = js.Dynamic.literal(newPanel = newPanel.asInstanceOf[js.Any], newTab = newTab.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any], oldTab = oldTab.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabsActivationUIParams]
  }
}

