package typings.markitup

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkItUp {
  
  trait MarkupSet extends StObject {
    
    /**
      * Function to be called just after a markup insertion. If a global afterInsert callback is already defined this function is fired before.
      */
    var afterInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.undefined
    
    /**
      * Function to be called after a multiline markup insertion.
      */
    var afterMultiInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.undefined
    
    /**
      * Returns true if the Alt key is pressed when the callback is fired.
      */
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to be called just before a markup insertion. If a global beforeInsert callback is already defined this function is fired just after.
      */
    var beforeInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.undefined
    
    /**
      * Function to be called before a multiline markup insertion.
      */
    var beforeMultiInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.undefined
    
    /**
      * Returns the position of the selection.
      */
    var caretPosition: js.UndefOr[Double] = js.undefined
    
    /**
      * Classname to be applied to this very button.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Text to be added after a whole block. Accepts functions.
      */
    var closeBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
    
    /**
      * Markup to be added after selection. Accepts functions.
      */
    var closeWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
    
    /**
      * Returns true if the Control key is pressed when the callback is fired.
      */
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Open a dropdown menu with another button set.
      */
    var dropMenu: js.UndefOr[js.Array[MarkupSet]] = js.undefined
    
    /**
      * Keep (true) or not (false) the default behaviour of the key.
      */
    var keepDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shortcut key to be applied to the button. Ctrl+key trigger the action of a button.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * If a multi-line edition is trigged (Ctrl + Shift + click). This property return the number of the line being processed.
      */
    var line: js.UndefOr[Double] = js.undefined
    
    /**
      * Set whether the tags has to be inserted at each line or on the whole selected block.
      */
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Button name
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Text to be added before a whole block. Accepts functions.
      */
    var openBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
    
    /**
      * Markup to be added before selection. Accepts functions.
      */
    var openWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
    
    /**
      * Placeholder text to be inserted if no text is selected by the user.
      */
    var placeHolder: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
    
    /**
      * Text to be added in place of the cursor or selection. Accepts functions.
      */
    var replaceWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
    
    /**
      * Returns the position of the scrollbar.
      */
    var scrollPosition: js.UndefOr[Double] = js.undefined
    
    /**
      * Returns the selection.
      */
    var selection: js.UndefOr[String] = js.undefined
    
    /** Not documented on the markitup site, but present in the tests */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Returns true if the Shift key is pressed when the callback is fired.
      */
    var shiftKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns the textarea object.
      */
    var textarea: js.UndefOr[HTMLElement] = js.undefined
  }
  object MarkupSet {
    
    @scala.inline
    def apply(): MarkupSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkupSet]
    }
    
    @scala.inline
    implicit class MarkupSetMutableBuilder[Self <: MarkupSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInsert(value: MarkupSet => String): Self = StObject.set(x, "afterInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterInsertUndefined: Self = StObject.set(x, "afterInsert", js.undefined)
      
      @scala.inline
      def setAfterMultiInsert(value: MarkupSet => String): Self = StObject.set(x, "afterMultiInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterMultiInsertUndefined: Self = StObject.set(x, "afterMultiInsert", js.undefined)
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      @scala.inline
      def setBeforeInsert(value: MarkupSet => String): Self = StObject.set(x, "beforeInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeInsertUndefined: Self = StObject.set(x, "beforeInsert", js.undefined)
      
      @scala.inline
      def setBeforeMultiInsert(value: MarkupSet => String): Self = StObject.set(x, "beforeMultiInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeMultiInsertUndefined: Self = StObject.set(x, "beforeMultiInsert", js.undefined)
      
      @scala.inline
      def setCaretPosition(value: Double): Self = StObject.set(x, "caretPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaretPositionUndefined: Self = StObject.set(x, "caretPosition", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseBlockWith(value: String | (js.Function1[MarkupSet, String])): Self = StObject.set(x, "closeBlockWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseBlockWithFunction1(value: MarkupSet => String): Self = StObject.set(x, "closeBlockWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseBlockWithUndefined: Self = StObject.set(x, "closeBlockWith", js.undefined)
      
      @scala.inline
      def setCloseWith(value: String | (js.Function1[MarkupSet, String])): Self = StObject.set(x, "closeWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWithFunction1(value: MarkupSet => String): Self = StObject.set(x, "closeWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseWithUndefined: Self = StObject.set(x, "closeWith", js.undefined)
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      @scala.inline
      def setDropMenu(value: js.Array[MarkupSet]): Self = StObject.set(x, "dropMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropMenuUndefined: Self = StObject.set(x, "dropMenu", js.undefined)
      
      @scala.inline
      def setDropMenuVarargs(value: MarkupSet*): Self = StObject.set(x, "dropMenu", js.Array(value :_*))
      
      @scala.inline
      def setKeepDefault(value: Boolean): Self = StObject.set(x, "keepDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepDefaultUndefined: Self = StObject.set(x, "keepDefault", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpenBlockWith(value: String | (js.Function1[MarkupSet, String])): Self = StObject.set(x, "openBlockWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenBlockWithFunction1(value: MarkupSet => String): Self = StObject.set(x, "openBlockWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenBlockWithUndefined: Self = StObject.set(x, "openBlockWith", js.undefined)
      
      @scala.inline
      def setOpenWith(value: String | (js.Function1[MarkupSet, String])): Self = StObject.set(x, "openWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWithFunction1(value: MarkupSet => String): Self = StObject.set(x, "openWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenWithUndefined: Self = StObject.set(x, "openWith", js.undefined)
      
      @scala.inline
      def setPlaceHolder(value: String | (js.Function1[MarkupSet, String])): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceHolderFunction1(value: MarkupSet => String): Self = StObject.set(x, "placeHolder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
      
      @scala.inline
      def setReplaceWith(value: String | (js.Function1[MarkupSet, String])): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceWithFunction1(value: MarkupSet => String): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
      
      @scala.inline
      def setScrollPosition(value: Double): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
      
      @scala.inline
      def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      @scala.inline
      def setTextarea(value: HTMLElement): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
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
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInsert(value: /* h */ MarkupSet => String): Self = StObject.set(x, "afterInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterInsertUndefined: Self = StObject.set(x, "afterInsert", js.undefined)
      
      @scala.inline
      def setBeforeInsert(value: /* h */ MarkupSet => String): Self = StObject.set(x, "beforeInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeInsertUndefined: Self = StObject.set(x, "beforeInsert", js.undefined)
      
      @scala.inline
      def setMarkupSet(value: js.Array[MarkupSet]): Self = StObject.set(x, "markupSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupSetUndefined: Self = StObject.set(x, "markupSet", js.undefined)
      
      @scala.inline
      def setMarkupSetVarargs(value: MarkupSet*): Self = StObject.set(x, "markupSet", js.Array(value :_*))
      
      @scala.inline
      def setNameSpace(value: String): Self = StObject.set(x, "nameSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameSpaceUndefined: Self = StObject.set(x, "nameSpace", js.undefined)
      
      @scala.inline
      def setOnCtrlEnter(value: MarkupSet): Self = StObject.set(x, "onCtrlEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCtrlEnterUndefined: Self = StObject.set(x, "onCtrlEnter", js.undefined)
      
      @scala.inline
      def setOnEnter(value: MarkupSet): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnShiftEnter(value: MarkupSet): Self = StObject.set(x, "onShiftEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnShiftEnterUndefined: Self = StObject.set(x, "onShiftEnter", js.undefined)
      
      @scala.inline
      def setOnTab(value: MarkupSet): Self = StObject.set(x, "onTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      @scala.inline
      def setPreviewAutoRefresh(value: Boolean): Self = StObject.set(x, "previewAutoRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewAutoRefreshUndefined: Self = StObject.set(x, "previewAutoRefresh", js.undefined)
      
      @scala.inline
      def setPreviewInWindow(value: String): Self = StObject.set(x, "previewInWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewInWindowUndefined: Self = StObject.set(x, "previewInWindow", js.undefined)
      
      @scala.inline
      def setPreviewParser(value: Boolean): Self = StObject.set(x, "previewParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewParserPath(value: String): Self = StObject.set(x, "previewParserPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewParserPathUndefined: Self = StObject.set(x, "previewParserPath", js.undefined)
      
      @scala.inline
      def setPreviewParserUndefined: Self = StObject.set(x, "previewParser", js.undefined)
      
      @scala.inline
      def setPreviewParserVar(value: String): Self = StObject.set(x, "previewParserVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewParserVarUndefined: Self = StObject.set(x, "previewParserVar", js.undefined)
      
      @scala.inline
      def setPreviewPosition(value: String): Self = StObject.set(x, "previewPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewPositionUndefined: Self = StObject.set(x, "previewPosition", js.undefined)
      
      @scala.inline
      def setPreviewTemplatePath(value: String): Self = StObject.set(x, "previewTemplatePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewTemplatePathUndefined: Self = StObject.set(x, "previewTemplatePath", js.undefined)
      
      @scala.inline
      def setResizeHandle(value: Boolean): Self = StObject.set(x, "resizeHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleUndefined: Self = StObject.set(x, "resizeHandle", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    def apply(): JQuery = js.native
    def apply(settings: Options): JQuery = js.native
  }
}
