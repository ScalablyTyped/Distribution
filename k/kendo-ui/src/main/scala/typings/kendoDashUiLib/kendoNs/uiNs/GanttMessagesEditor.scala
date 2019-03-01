package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMessagesEditor extends js.Object {
  var assignButton: js.UndefOr[java.lang.String] = js.undefined
  var editorTitle: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var percentComplete: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[java.lang.String] = js.undefined
  var resourcesEditorTitle: js.UndefOr[java.lang.String] = js.undefined
  var resourcesHeader: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var unitsHeader: js.UndefOr[java.lang.String] = js.undefined
}

object GanttMessagesEditor {
  @scala.inline
  def apply(
    assignButton: java.lang.String = null,
    editorTitle: java.lang.String = null,
    end: java.lang.String = null,
    percentComplete: java.lang.String = null,
    resources: java.lang.String = null,
    resourcesEditorTitle: java.lang.String = null,
    resourcesHeader: java.lang.String = null,
    start: java.lang.String = null,
    title: java.lang.String = null,
    unitsHeader: java.lang.String = null
  ): GanttMessagesEditor = {
    val __obj = js.Dynamic.literal()
    if (assignButton != null) __obj.updateDynamic("assignButton")(assignButton)
    if (editorTitle != null) __obj.updateDynamic("editorTitle")(editorTitle)
    if (end != null) __obj.updateDynamic("end")(end)
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (resourcesEditorTitle != null) __obj.updateDynamic("resourcesEditorTitle")(resourcesEditorTitle)
    if (resourcesHeader != null) __obj.updateDynamic("resourcesHeader")(resourcesHeader)
    if (start != null) __obj.updateDynamic("start")(start)
    if (title != null) __obj.updateDynamic("title")(title)
    if (unitsHeader != null) __obj.updateDynamic("unitsHeader")(unitsHeader)
    __obj.asInstanceOf[GanttMessagesEditor]
  }
}

