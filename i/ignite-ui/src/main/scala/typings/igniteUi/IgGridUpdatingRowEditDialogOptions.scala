package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridUpdatingRowEditDialogOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  
  inline def apply(): IgGridUpdatingRowEditDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridUpdatingRowEditDialogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgGridUpdatingRowEditDialogOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setContainment(value: String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    inline def setDialogTemplate(value: String): Self = StObject.set(x, "dialogTemplate", value.asInstanceOf[js.Any])
    
    inline def setDialogTemplateSelector(value: String): Self = StObject.set(x, "dialogTemplateSelector", value.asInstanceOf[js.Any])
    
    inline def setDialogTemplateSelectorUndefined: Self = StObject.set(x, "dialogTemplateSelector", js.undefined)
    
    inline def setDialogTemplateUndefined: Self = StObject.set(x, "dialogTemplate", js.undefined)
    
    inline def setEditorsColumnWidth(value: String | Double): Self = StObject.set(x, "editorsColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setEditorsColumnWidthUndefined: Self = StObject.set(x, "editorsColumnWidth", js.undefined)
    
    inline def setEditorsTemplate(value: String): Self = StObject.set(x, "editorsTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditorsTemplateSelector(value: String): Self = StObject.set(x, "editorsTemplateSelector", value.asInstanceOf[js.Any])
    
    inline def setEditorsTemplateSelectorUndefined: Self = StObject.set(x, "editorsTemplateSelector", js.undefined)
    
    inline def setEditorsTemplateUndefined: Self = StObject.set(x, "editorsTemplate", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setNamesColumnWidth(value: String | Double): Self = StObject.set(x, "namesColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setNamesColumnWidthUndefined: Self = StObject.set(x, "namesColumnWidth", js.undefined)
    
    inline def setShowDoneCancelButtons(value: Boolean): Self = StObject.set(x, "showDoneCancelButtons", value.asInstanceOf[js.Any])
    
    inline def setShowDoneCancelButtonsUndefined: Self = StObject.set(x, "showDoneCancelButtons", js.undefined)
    
    inline def setShowEditorsForHiddenColumns(value: Boolean): Self = StObject.set(x, "showEditorsForHiddenColumns", value.asInstanceOf[js.Any])
    
    inline def setShowEditorsForHiddenColumnsUndefined: Self = StObject.set(x, "showEditorsForHiddenColumns", js.undefined)
    
    inline def setShowReadonlyEditors(value: Boolean): Self = StObject.set(x, "showReadonlyEditors", value.asInstanceOf[js.Any])
    
    inline def setShowReadonlyEditorsUndefined: Self = StObject.set(x, "showReadonlyEditors", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
