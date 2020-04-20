package typings.jqueryTools

import typings.jqueryTools.JQueryTools.ToolsStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var tools: ToolsStatic
}

object JQueryStatic {
  @scala.inline
  def apply(tools: ToolsStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tools = tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

