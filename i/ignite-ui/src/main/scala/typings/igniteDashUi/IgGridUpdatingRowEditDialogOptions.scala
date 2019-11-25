package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridUpdatingRowEditDialogOptions
  extends /**
	 * Option for IgGridUpdatingRowEditDialogOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the animation duration for the opening and closing operations.
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Controls the containment of the dialog's drag operation.
  	 *
  	 *
  	 * Valid values:
  	 * "owner" The row edit dialog will be draggable only in the grid area.
  	 * "window" The row edit dialog will be draggable in the whole window area.
  	 */
  var containment: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a template to be rendered against the currently edited record (or up-to-date key-value pairs in the case of not yet created records). It may contain an element decorated with the 'data-render-tmpl' attribute to specify where the control should render the editors template specified in the [editorsTemplate](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplate) option. For custom dialogs, the elements can be decorated with 'data-editor-for-<columnKey>' attributes where columnKey is the key of the column that editor or input will be used to edit. If both dialogTemplate and [dialogTemplateSelector](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplateSelector) are specified, dialogTemplateSelector will be used.The default template is '<table><colgroup><col></col><col></col></colgroup><tbody data-render-tmpl></tbody></table>'.
  	 *
  	 */
  var dialogTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a selector to a template rendered against the currently edited record (or up-to-date key-value pairs in the case of not yet created records). It may contain an element decorated with the 'data-render-tmpl' attribute to specify where the control should render the editors template specified in the [editorsTemplate](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplate) option. For custom dialogs, the elements can be decorated with 'data-editor-for-<columnKey>' attributes where columnKey is the key of the column that editor or input will be used to edit. If both [dialogTemplate](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplate) and dialogTemplateSelector are specified, dialogTemplateSelector will be used.The default template is '<table><colgroup><col></col><col></col></colgroup><tbody data-render-tmpl></tbody></table>'.
  	 *
  	 */
  var dialogTemplateSelector: js.UndefOr[String] = js.undefined
  /**
  	 * Controls the width of the column containing the editors in the default row edit dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width of the column in pixels (100px) or percents (20%).
  	 * "number" The width of the column as a number (100) in pixels.
  	 * "null" The width of the column will be left empty for the browser to size automatically.
  	 */
  var editorsColumnWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Specifies a template to be executed for each column in the grid's column collection (or just the read-write columns if [showReadonlyEditors](ui.iggridupdating#options:rowEditDialogOptions.showReadonlyEditors) is false). Decorate the element to be used as an editor with 'data-editor-for-${key}'. The ${key} template tag should be replaced with the chosen templating engine's syntax for rendering values. If any editors for columns are specified in the dialog markup they will be exluded from the data the template will be rendered for. This property is ignored if [dialogTemplate](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplate) does not include an element with the 'data-render-tmpl' attribute. If both editorsTemplate and [editorsTemplateSelector](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplateSelector) are specified, editorsTemplateSelector will be used.
  	 * The default template is '<tr><td>${headerText}</td><td><input data-editor-for-${key} /></td></tr>'
  	 *
  	 */
  var editorsTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a selector to a template to be executed for each column in the grid's column collection (or just the read-write columns if [showReadonlyEditors](ui.iggridupdating#options:rowEditDialogOptions.showReadonlyEditors) is false). Decorate the element to be used as an editor with 'data-editor-for-${key}'. The ${key} template tag should be replaced with the chosen templating engine's syntax for rendering values. If any editors for columns are specified in the dialog markup they will be exluded from the data the template will be rendered for. This property is ignored if [dialogTemplate](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplate) does not include an element with the 'data-render-tmpl' attribute. If both [editorsTemplate](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplate) and editorsTemplateSelector are specified, editorsTemplateSelector will be used.
  	 * The default template is '<tr><td>${headerText}</td><td><input data-editor-for-${key} /></td></tr>'
  	 *
  	 */
  var editorsTemplateSelector: js.UndefOr[String] = js.undefined
  /**
  	 * Controls the default row edit dialog height.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window height in pixels (350px).
  	 * "number" The dialog window height as a number (350).
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Controls the width of the column containing the column names in the default row edit dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width of the column in pixels (100px) or percents (20%).
  	 * "number" The width of the column as a number (100) in pixels.
  	 * "null" The width of the column will be left empty for the browser to size automatically.
  	 */
  var namesColumnWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Controls the visibility of the done and cancel buttons for the dialog.
  	 * If disabled the end-user will be able to stop editing only with the Enter and Esc keys.
  	 *
  	 */
  var showDoneCancelButtons: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Controls if editors should be rendered for hidden columns.
  	 *
  	 */
  var showEditorsForHiddenColumns: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Controls if editors should be rendered for read-only columns. If rendered, these editors will be disabled.
  	 *
  	 */
  var showReadonlyEditors: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Controls the default row edit dialog width.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window width in pixels (400px).
  	 * "number" The dialog window width as a number (400).
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgGridUpdatingRowEditDialogOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridUpdatingRowEditDialogOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    containment: String = null,
    dialogTemplate: String = null,
    dialogTemplateSelector: String = null,
    editorsColumnWidth: String | Double = null,
    editorsTemplate: String = null,
    editorsTemplateSelector: String = null,
    height: String | Double = null,
    namesColumnWidth: String | Double = null,
    showDoneCancelButtons: js.UndefOr[Boolean] = js.undefined,
    showEditorsForHiddenColumns: js.UndefOr[Boolean] = js.undefined,
    showReadonlyEditors: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null
  ): IgGridUpdatingRowEditDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (dialogTemplate != null) __obj.updateDynamic("dialogTemplate")(dialogTemplate.asInstanceOf[js.Any])
    if (dialogTemplateSelector != null) __obj.updateDynamic("dialogTemplateSelector")(dialogTemplateSelector.asInstanceOf[js.Any])
    if (editorsColumnWidth != null) __obj.updateDynamic("editorsColumnWidth")(editorsColumnWidth.asInstanceOf[js.Any])
    if (editorsTemplate != null) __obj.updateDynamic("editorsTemplate")(editorsTemplate.asInstanceOf[js.Any])
    if (editorsTemplateSelector != null) __obj.updateDynamic("editorsTemplateSelector")(editorsTemplateSelector.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (namesColumnWidth != null) __obj.updateDynamic("namesColumnWidth")(namesColumnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(showDoneCancelButtons)) __obj.updateDynamic("showDoneCancelButtons")(showDoneCancelButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showEditorsForHiddenColumns)) __obj.updateDynamic("showEditorsForHiddenColumns")(showEditorsForHiddenColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(showReadonlyEditors)) __obj.updateDynamic("showReadonlyEditors")(showReadonlyEditors.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridUpdatingRowEditDialogOptions]
  }
}

