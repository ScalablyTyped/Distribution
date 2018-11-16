package typings
package markitupLib.MarkItUpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Function to be called after any markup insertion.
           */
  var afterInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, java.lang.String]] = js.undefined
  /**
           * Function to be called before any markup insertion.
           */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, java.lang.String]] = js.undefined
  /**
           * Note that most of the settings below are used by the engine for all insertion calls ($.markItUp( {} ), onEnter, onShiftEnter, onCtrlEnter, onTab) except exclusive button properties marked by
           */
  var markupSet: js.UndefOr[js.Array[MarkupSet]] = js.undefined
  /**
           * Apply a specific className to the wrapping Div. Useful to prevent CSS conflicts between instances.
           */
  var nameSpace: js.UndefOr[java.lang.String] = js.undefined
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
  var previewAutoRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Display the preview in a popup window with comma-separated list of specs. If empty or false, the preview will be displayed in the built-in iFrame preview.
           */
  var previewInWindow: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Parse the content with the javascript parser of your choice before passing it to the preview.
           *
           * default: false
           */
  var previewParser: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * You can set the path of your own parser to preview markup languages other than html. If this property is set, the built-in preview will be overridden by your own preview script.
           * Use ~/ for markItUp! root.
           */
  var previewParserPath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of the var posted with the editor content to the parser defined above.
           *
           * default: 'data'
           */
  var previewParserVar: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Position of the Built-in preview before or after the main textarea.
           * 'before'|'after'
           *
           * default: 'after'
           */
  var previewPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Path to the Html preview template.
           * Use ~/ for markItUp! root.
           *
           * default: '~/templates/preview.html'
           */
  var previewTemplatePath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Enable/Disable the handle to resize the editor.
           */
  var resizeHandle: js.UndefOr[scala.Boolean] = js.undefined
}

