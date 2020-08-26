package typings.markitup.MarkItUp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Function to be called after any markup insertion.
    */
  var afterInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Function to be called before any markup insertion.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Note that most of the settings below are used by the engine for all insertion calls ($.markItUp( {} ), onEnter, onShiftEnter, onCtrlEnter, onTab) except exclusive button properties marked by
    */
  var markupSet: js.UndefOr[js.Array[MarkupSet]] = js.native
  /**
    * Apply a specific className to the wrapping Div. Useful to prevent CSS conflicts between instances.
    */
  var nameSpace: js.UndefOr[String] = js.native
  /**
    * Define what to do when Ctrl+Enter keys are pressed.
    */
  var onCtrlEnter: js.UndefOr[MarkupSet] = js.native
  /**
    * Define what to do when Enter key is pressed.
    */
  var onEnter: js.UndefOr[MarkupSet] = js.native
  /**
    * Define what to do when Shift+Enter keys are pressed.
    */
  var onShiftEnter: js.UndefOr[MarkupSet] = js.native
  /**
    * Define what to do when Tab key is pressed. Warning, this key is also used to jump at the end of a new inserted markup.
    */
  var onTab: js.UndefOr[MarkupSet] = js.native
  /**
    * AutoRefresh the preview iFrame or window when the editor is used.
    */
  var previewAutoRefresh: js.UndefOr[Boolean] = js.native
  /**
    * Display the preview in a popup window with comma-separated list of specs. If empty or false, the preview will be displayed in the built-in iFrame preview.
    */
  var previewInWindow: js.UndefOr[String] = js.native
  /**
    * Parse the content with the javascript parser of your choice before passing it to the preview.
    *
    * default: false
    */
  var previewParser: js.UndefOr[Boolean] = js.native
  /**
    * You can set the path of your own parser to preview markup languages other than html. If this property is set, the built-in preview will be overridden by your own preview script.
    * Use ~/ for markItUp! root.
    */
  var previewParserPath: js.UndefOr[String] = js.native
  /**
    * Name of the var posted with the editor content to the parser defined above.
    *
    * default: 'data'
    */
  var previewParserVar: js.UndefOr[String] = js.native
  /**
    * Position of the Built-in preview before or after the main textarea.
    * 'before'|'after'
    *
    * default: 'after'
    */
  var previewPosition: js.UndefOr[String] = js.native
  /**
    * Path to the Html preview template.
    * Use ~/ for markItUp! root.
    *
    * default: '~/templates/preview.html'
    */
  var previewTemplatePath: js.UndefOr[String] = js.native
  /**
    * Enable/Disable the handle to resize the editor.
    */
  var resizeHandle: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterInsert(value: /* h */ MarkupSet => String): Self = this.set("afterInsert", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterInsert: Self = this.set("afterInsert", js.undefined)
    @scala.inline
    def setBeforeInsert(value: /* h */ MarkupSet => String): Self = this.set("beforeInsert", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeInsert: Self = this.set("beforeInsert", js.undefined)
    @scala.inline
    def setMarkupSetVarargs(value: MarkupSet*): Self = this.set("markupSet", js.Array(value :_*))
    @scala.inline
    def setMarkupSet(value: js.Array[MarkupSet]): Self = this.set("markupSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkupSet: Self = this.set("markupSet", js.undefined)
    @scala.inline
    def setNameSpace(value: String): Self = this.set("nameSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameSpace: Self = this.set("nameSpace", js.undefined)
    @scala.inline
    def setOnCtrlEnter(value: MarkupSet): Self = this.set("onCtrlEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCtrlEnter: Self = this.set("onCtrlEnter", js.undefined)
    @scala.inline
    def setOnEnter(value: MarkupSet): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnShiftEnter(value: MarkupSet): Self = this.set("onShiftEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShiftEnter: Self = this.set("onShiftEnter", js.undefined)
    @scala.inline
    def setOnTab(value: MarkupSet): Self = this.set("onTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTab: Self = this.set("onTab", js.undefined)
    @scala.inline
    def setPreviewAutoRefresh(value: Boolean): Self = this.set("previewAutoRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewAutoRefresh: Self = this.set("previewAutoRefresh", js.undefined)
    @scala.inline
    def setPreviewInWindow(value: String): Self = this.set("previewInWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewInWindow: Self = this.set("previewInWindow", js.undefined)
    @scala.inline
    def setPreviewParser(value: Boolean): Self = this.set("previewParser", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewParser: Self = this.set("previewParser", js.undefined)
    @scala.inline
    def setPreviewParserPath(value: String): Self = this.set("previewParserPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewParserPath: Self = this.set("previewParserPath", js.undefined)
    @scala.inline
    def setPreviewParserVar(value: String): Self = this.set("previewParserVar", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewParserVar: Self = this.set("previewParserVar", js.undefined)
    @scala.inline
    def setPreviewPosition(value: String): Self = this.set("previewPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewPosition: Self = this.set("previewPosition", js.undefined)
    @scala.inline
    def setPreviewTemplatePath(value: String): Self = this.set("previewTemplatePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewTemplatePath: Self = this.set("previewTemplatePath", js.undefined)
    @scala.inline
    def setResizeHandle(value: Boolean): Self = this.set("resizeHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandle: Self = this.set("resizeHandle", js.undefined)
  }
  
}

