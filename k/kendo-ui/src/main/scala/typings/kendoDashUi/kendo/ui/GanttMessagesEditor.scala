package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMessagesEditor extends js.Object {
  var assignButton: js.UndefOr[String] = js.undefined
  var editorTitle: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var percentComplete: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[String] = js.undefined
  var resourcesEditorTitle: js.UndefOr[String] = js.undefined
  var resourcesHeader: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var unitsHeader: js.UndefOr[String] = js.undefined
}

object GanttMessagesEditor {
  @scala.inline
  def apply(
    assignButton: String = null,
    editorTitle: String = null,
    end: String = null,
    percentComplete: String = null,
    resources: String = null,
    resourcesEditorTitle: String = null,
    resourcesHeader: String = null,
    start: String = null,
    title: String = null,
    unitsHeader: String = null
  ): GanttMessagesEditor = {
    val __obj = js.Dynamic.literal()
    if (assignButton != null) __obj.updateDynamic("assignButton")(assignButton.asInstanceOf[js.Any])
    if (editorTitle != null) __obj.updateDynamic("editorTitle")(editorTitle.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (resourcesEditorTitle != null) __obj.updateDynamic("resourcesEditorTitle")(resourcesEditorTitle.asInstanceOf[js.Any])
    if (resourcesHeader != null) __obj.updateDynamic("resourcesHeader")(resourcesHeader.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unitsHeader != null) __obj.updateDynamic("unitsHeader")(unitsHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMessagesEditor]
  }
}

