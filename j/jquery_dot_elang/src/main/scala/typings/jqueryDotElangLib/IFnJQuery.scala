package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFnJQuery extends js.Object {
  def fnPlugin(
    context: jqueryLib.JQuery[stdLib.HTMLElement],
    options: js.Any,
    command: java.lang.String,
    pluginName: java.lang.String,
    pluginDataAttribute: java.lang.String
  ): jqueryLib.JQuery[stdLib.HTMLElement]
}

object IFnJQuery {
  @scala.inline
  def apply(
    fnPlugin: js.Function5[
      jqueryLib.JQuery[stdLib.HTMLElement], 
      js.Any, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      jqueryLib.JQuery[stdLib.HTMLElement]
    ]
  ): IFnJQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fnPlugin")(fnPlugin)
    __obj.asInstanceOf[IFnJQuery]
  }
}

