package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  var history: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply(
    change: () => Unit = null,
    history: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    name: String = null,
    search: js.UndefOr[Boolean] = js.undefined
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

