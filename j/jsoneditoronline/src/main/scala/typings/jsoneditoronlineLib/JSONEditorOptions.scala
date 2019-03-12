package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorOptions extends js.Object {
  var change: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var history: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply(
    change: () => scala.Unit = null,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    name: java.lang.String = null,
    search: js.UndefOr[scala.Boolean] = js.undefined
  ): JSONEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction0(change))
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[JSONEditorOptions]
  }
}

