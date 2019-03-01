package typings
package jqueryDotToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var tools: jqueryDotToolsLib.JQueryToolsNs.ToolsStatic
}

object JQueryStatic {
  @scala.inline
  def apply(tools: jqueryDotToolsLib.JQueryToolsNs.ToolsStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[JQueryStatic]
  }
}

