package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsCreateOrLoadUIParams extends js.Object {
  var panel: JQuery
  var tab: JQuery
}

object TabsCreateOrLoadUIParams {
  @scala.inline
  def apply(panel: JQuery, tab: JQuery): TabsCreateOrLoadUIParams = {
    val __obj = js.Dynamic.literal(panel = panel, tab = tab)
  
    __obj.asInstanceOf[TabsCreateOrLoadUIParams]
  }
}

