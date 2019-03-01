package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListMessagesCommands extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var canceledit: js.UndefOr[java.lang.String] = js.undefined
  var create: js.UndefOr[java.lang.String] = js.undefined
  var createchild: js.UndefOr[java.lang.String] = js.undefined
  var destroy: js.UndefOr[java.lang.String] = js.undefined
  var edit: js.UndefOr[java.lang.String] = js.undefined
  var excel: js.UndefOr[java.lang.String] = js.undefined
  var pdf: js.UndefOr[java.lang.String] = js.undefined
  var save: js.UndefOr[java.lang.String] = js.undefined
  var update: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListMessagesCommands {
  @scala.inline
  def apply(
    cancel: java.lang.String = null,
    canceledit: java.lang.String = null,
    create: java.lang.String = null,
    createchild: java.lang.String = null,
    destroy: java.lang.String = null,
    edit: java.lang.String = null,
    excel: java.lang.String = null,
    pdf: java.lang.String = null,
    save: java.lang.String = null,
    update: java.lang.String = null
  ): TreeListMessagesCommands = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (canceledit != null) __obj.updateDynamic("canceledit")(canceledit)
    if (create != null) __obj.updateDynamic("create")(create)
    if (createchild != null) __obj.updateDynamic("createchild")(createchild)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (excel != null) __obj.updateDynamic("excel")(excel)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (save != null) __obj.updateDynamic("save")(save)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[TreeListMessagesCommands]
  }
}

