package typings.markitup.MarkItUpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Function to be called after any markup insertion.
    */
  var afterInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.undefined
  /**
    * Function to be called before any markup insertion.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.undefined
  /**
    * Note that most of the settings below are used by the engine for all insertion calls ($.markItUp( {} ), onEnter, onShiftEnter, onCtrlEnter, onTab) except exclusive button properties marked by
    */
  var markupSet: js.UndefOr[js.Array[MarkupSet]] = js.undefined
  /**
    * Apply a specific className to the wrapping Div. Useful to prevent CSS conflicts between instances.
    */
  var nameSpace: js.UndefOr[String] = js.undefined
  /**
    * Define what to do when Ctrl+Enter keys are pressed.
    */
  var onCtrlEnter: js.UndefOr[MarkupSet] = js.undefined
  /**
    * Define what to do when Enter key is pressed.
    */
  var onEnter: js.UndefOr[MarkupSet] = js.undefined
  /**
    * Define what to do when Shift+Enter keys are pressed.
    */
  var onShiftEnter: js.UndefOr[MarkupSet] = js.undefined
  /**
    * Define what to do when Tab key is pressed. Warning, this key is also used to jump at the end of a new inserted markup.
    */
  var onTab: js.UndefOr[MarkupSet] = js.undefined
  /**
    * AutoRefresh the preview iFrame or window when the editor is used.
    */
  var previewAutoRefresh: js.UndefOr[Boolean] = js.undefined
  /**
    * Display the preview in a popup window with comma-separated list of specs. If empty or false, the preview will be displayed in the built-in iFrame preview.
    */
  var previewInWindow: js.UndefOr[String] = js.undefined
  /**
    * Parse the content with the javascript parser of your choice before passing it to the preview.
    *
    * default: false
    */
  var previewParser: js.UndefOr[Boolean] = js.undefined
  /**
    * You can set the path of your own parser to preview markup languages other than html. If this property is set, the built-in preview will be overridden by your own preview script.
    * Use ~/ for markItUp! root.
    */
  var previewParserPath: js.UndefOr[String] = js.undefined
  /**
    * Name of the var posted with the editor content to the parser defined above.
    *
    * default: 'data'
    */
  var previewParserVar: js.UndefOr[String] = js.undefined
  /**
    * Position of the Built-in preview before or after the main textarea.
    * 'before'|'after'
    *
    * default: 'after'
    */
  var previewPosition: js.UndefOr[String] = js.undefined
  /**
    * Path to the Html preview template.
    * Use ~/ for markItUp! root.
    *
    * default: '~/templates/preview.html'
    */
  var previewTemplatePath: js.UndefOr[String] = js.undefined
  /**
    * Enable/Disable the handle to resize the editor.
    */
  var resizeHandle: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterInsert: /* h */ MarkupSet => String = null,
    beforeInsert: /* h */ MarkupSet => String = null,
    markupSet: js.Array[MarkupSet] = null,
    nameSpace: String = null,
    onCtrlEnter: MarkupSet = null,
    onEnter: MarkupSet = null,
    onShiftEnter: MarkupSet = null,
    onTab: MarkupSet = null,
    previewAutoRefresh: js.UndefOr[Boolean] = js.undefined,
    previewInWindow: String = null,
    previewParser: js.UndefOr[Boolean] = js.undefined,
    previewParserPath: String = null,
    previewParserVar: String = null,
    previewPosition: String = null,
    previewTemplatePath: String = null,
    resizeHandle: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterInsert != null) __obj.updateDynamic("afterInsert")(js.Any.fromFunction1(afterInsert))
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction1(beforeInsert))
    if (markupSet != null) __obj.updateDynamic("markupSet")(markupSet)
    if (nameSpace != null) __obj.updateDynamic("nameSpace")(nameSpace)
    if (onCtrlEnter != null) __obj.updateDynamic("onCtrlEnter")(onCtrlEnter)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onShiftEnter != null) __obj.updateDynamic("onShiftEnter")(onShiftEnter)
    if (onTab != null) __obj.updateDynamic("onTab")(onTab)
    if (!js.isUndefined(previewAutoRefresh)) __obj.updateDynamic("previewAutoRefresh")(previewAutoRefresh)
    if (previewInWindow != null) __obj.updateDynamic("previewInWindow")(previewInWindow)
    if (!js.isUndefined(previewParser)) __obj.updateDynamic("previewParser")(previewParser)
    if (previewParserPath != null) __obj.updateDynamic("previewParserPath")(previewParserPath)
    if (previewParserVar != null) __obj.updateDynamic("previewParserVar")(previewParserVar)
    if (previewPosition != null) __obj.updateDynamic("previewPosition")(previewPosition)
    if (previewTemplatePath != null) __obj.updateDynamic("previewTemplatePath")(previewTemplatePath)
    if (!js.isUndefined(resizeHandle)) __obj.updateDynamic("resizeHandle")(resizeHandle)
    __obj.asInstanceOf[Options]
  }
}

