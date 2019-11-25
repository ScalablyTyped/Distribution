package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListMessagesCommands extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var canceledit: js.UndefOr[String] = js.undefined
  var create: js.UndefOr[String] = js.undefined
  var createchild: js.UndefOr[String] = js.undefined
  var destroy: js.UndefOr[String] = js.undefined
  var edit: js.UndefOr[String] = js.undefined
  var excel: js.UndefOr[String] = js.undefined
  var pdf: js.UndefOr[String] = js.undefined
  var save: js.UndefOr[String] = js.undefined
  var update: js.UndefOr[String] = js.undefined
}

object TreeListMessagesCommands {
  @scala.inline
  def apply(
    cancel: String = null,
    canceledit: String = null,
    create: String = null,
    createchild: String = null,
    destroy: String = null,
    edit: String = null,
    excel: String = null,
    pdf: String = null,
    save: String = null,
    update: String = null
  ): TreeListMessagesCommands = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (canceledit != null) __obj.updateDynamic("canceledit")(canceledit.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (createchild != null) __obj.updateDynamic("createchild")(createchild.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListMessagesCommands]
  }
}

