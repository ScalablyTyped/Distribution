package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridMessagesCommands extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var canceledit: js.UndefOr[String] = js.undefined
  var create: js.UndefOr[String] = js.undefined
  var destroy: js.UndefOr[String] = js.undefined
  var edit: js.UndefOr[String] = js.undefined
  var excel: js.UndefOr[String] = js.undefined
  var save: js.UndefOr[String] = js.undefined
  var update: js.UndefOr[String] = js.undefined
}

object GridMessagesCommands {
  @scala.inline
  def apply(
    cancel: String = null,
    canceledit: String = null,
    create: String = null,
    destroy: String = null,
    edit: String = null,
    excel: String = null,
    save: String = null,
    update: String = null
  ): GridMessagesCommands = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (canceledit != null) __obj.updateDynamic("canceledit")(canceledit)
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (excel != null) __obj.updateDynamic("excel")(excel)
    if (save != null) __obj.updateDynamic("save")(save)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[GridMessagesCommands]
  }
}

