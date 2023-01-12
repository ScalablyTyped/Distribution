package typings.jupyterlabCodemirror

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.codemirror.mod.EditorView
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.Facet
import typings.codemirrorState.mod.RangeSet
import typings.codemirrorState.mod.SelectionRange
import typings.codemirrorState.mod.StateEffect
import typings.codemirrorState.mod.StateEffectType
import typings.codemirrorView.anon.Dark
import typings.codemirrorView.anon.PartialRect
import typings.codemirrorView.anon.X
import typings.codemirrorView.mod.AttrSource
import typings.codemirrorView.mod.DOMEventHandlers
import typings.codemirrorView.mod.DecorationSet
import typings.codemirrorView.mod.MakeSelectionStyle
import typings.codemirrorView.mod.ViewUpdate
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.libModeMod.Mode.IMode
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.styleMod.mod.StyleModule
import typings.styleMod.mod.StyleSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bias extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
  }
  object Bias {
    
    inline def apply(): Bias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bias]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bias] (val x: Self) extends AnyVal {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Position */ Any
    
    var to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Position */ Any
  }
  object From {
    
    inline def apply(
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Position */ Any,
      to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Position */ Any
    ): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Position */ Any
      ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Position */ Any
      ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
  trait PartialIConfig extends StObject {
    
    var autoClosingBrackets: js.UndefOr[Boolean] = js.undefined
    
    var codeFolding: js.UndefOr[Boolean] = js.undefined
    
    var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var cursorBlinkRate: js.UndefOr[Double] = js.undefined
    
    var dragDrop: js.UndefOr[Boolean] = js.undefined
    
    var electricChars: js.UndefOr[Boolean] = js.undefined
    
    var extraKeys: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.KeyMap */ Any) | Null
      ] = js.undefined
    
    var fixedGutter: js.UndefOr[Boolean] = js.undefined
    
    var foldGutter: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String | Null] = js.undefined
    
    var fontSize: js.UndefOr[Double | Null] = js.undefined
    
    var gutters: js.UndefOr[js.Array[String]] = js.undefined
    
    var handlePaste: js.UndefOr[Boolean] = js.undefined
    
    var insertSpaces: js.UndefOr[Boolean] = js.undefined
    
    var keyMap: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[Double | Null] = js.undefined
    
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var lineSeparator: js.UndefOr[String | Null] = js.undefined
    
    var lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined
    
    var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.undefined
    
    var matchBrackets: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String | IMode] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rulers: js.UndefOr[js.Array[Double]] = js.undefined
    
    var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
    
    var scrollbarStyle: js.UndefOr[String] = js.undefined
    
    var selectionPointer: js.UndefOr[Boolean | String] = js.undefined
    
    var showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined
    
    var showTrailingSpace: js.UndefOr[Boolean] = js.undefined
    
    var smartIndent: js.UndefOr[Boolean] = js.undefined
    
    var styleActiveLine: js.UndefOr[
        Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.StyleActiveLine */ Any)
      ] = js.undefined
    
    var styleSelectedText: js.UndefOr[Boolean] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var wordWrapColumn: js.UndefOr[Double] = js.undefined
  }
  object PartialIConfig {
    
    inline def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIConfig] (val x: Self) extends AnyVal {
      
      inline def setAutoClosingBrackets(value: Boolean): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      inline def setAutoClosingBracketsUndefined: Self = StObject.set(x, "autoClosingBrackets", js.undefined)
      
      inline def setCodeFolding(value: Boolean): Self = StObject.set(x, "codeFolding", value.asInstanceOf[js.Any])
      
      inline def setCodeFoldingUndefined: Self = StObject.set(x, "codeFolding", js.undefined)
      
      inline def setCoverGutterNextToScrollbar(value: Boolean): Self = StObject.set(x, "coverGutterNextToScrollbar", value.asInstanceOf[js.Any])
      
      inline def setCoverGutterNextToScrollbarUndefined: Self = StObject.set(x, "coverGutterNextToScrollbar", js.undefined)
      
      inline def setCursorBlinkRate(value: Double): Self = StObject.set(x, "cursorBlinkRate", value.asInstanceOf[js.Any])
      
      inline def setCursorBlinkRateUndefined: Self = StObject.set(x, "cursorBlinkRate", js.undefined)
      
      inline def setDragDrop(value: Boolean): Self = StObject.set(x, "dragDrop", value.asInstanceOf[js.Any])
      
      inline def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
      
      inline def setElectricChars(value: Boolean): Self = StObject.set(x, "electricChars", value.asInstanceOf[js.Any])
      
      inline def setElectricCharsUndefined: Self = StObject.set(x, "electricChars", js.undefined)
      
      inline def setExtraKeys(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.KeyMap */ Any
      ): Self = StObject.set(x, "extraKeys", value.asInstanceOf[js.Any])
      
      inline def setExtraKeysNull: Self = StObject.set(x, "extraKeys", null)
      
      inline def setExtraKeysUndefined: Self = StObject.set(x, "extraKeys", js.undefined)
      
      inline def setFixedGutter(value: Boolean): Self = StObject.set(x, "fixedGutter", value.asInstanceOf[js.Any])
      
      inline def setFixedGutterUndefined: Self = StObject.set(x, "fixedGutter", js.undefined)
      
      inline def setFoldGutter(value: Boolean): Self = StObject.set(x, "foldGutter", value.asInstanceOf[js.Any])
      
      inline def setFoldGutterUndefined: Self = StObject.set(x, "foldGutter", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setGutters(value: js.Array[String]): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
      
      inline def setGuttersVarargs(value: String*): Self = StObject.set(x, "gutters", js.Array(value*))
      
      inline def setHandlePaste(value: Boolean): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      inline def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      inline def setKeyMap(value: String): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
      
      inline def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      inline def setLineSeparatorNull: Self = StObject.set(x, "lineSeparator", null)
      
      inline def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      inline def setLineWiseCopyCut(value: Boolean): Self = StObject.set(x, "lineWiseCopyCut", value.asInstanceOf[js.Any])
      
      inline def setLineWiseCopyCutUndefined: Self = StObject.set(x, "lineWiseCopyCut", js.undefined)
      
      inline def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setMatchBrackets(value: Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      inline def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
      
      inline def setMode(value: String | IMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRulers(value: js.Array[Double]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      inline def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
      
      inline def setRulersVarargs(value: Double*): Self = StObject.set(x, "rulers", js.Array(value*))
      
      inline def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
      
      inline def setScrollbarStyle(value: String): Self = StObject.set(x, "scrollbarStyle", value.asInstanceOf[js.Any])
      
      inline def setScrollbarStyleUndefined: Self = StObject.set(x, "scrollbarStyle", js.undefined)
      
      inline def setSelectionPointer(value: Boolean | String): Self = StObject.set(x, "selectionPointer", value.asInstanceOf[js.Any])
      
      inline def setSelectionPointerUndefined: Self = StObject.set(x, "selectionPointer", js.undefined)
      
      inline def setShowCursorWhenSelecting(value: Boolean): Self = StObject.set(x, "showCursorWhenSelecting", value.asInstanceOf[js.Any])
      
      inline def setShowCursorWhenSelectingUndefined: Self = StObject.set(x, "showCursorWhenSelecting", js.undefined)
      
      inline def setShowTrailingSpace(value: Boolean): Self = StObject.set(x, "showTrailingSpace", value.asInstanceOf[js.Any])
      
      inline def setShowTrailingSpaceUndefined: Self = StObject.set(x, "showTrailingSpace", js.undefined)
      
      inline def setSmartIndent(value: Boolean): Self = StObject.set(x, "smartIndent", value.asInstanceOf[js.Any])
      
      inline def setSmartIndentUndefined: Self = StObject.set(x, "smartIndent", js.undefined)
      
      inline def setStyleActiveLine(
        value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.StyleActiveLine */ Any)
      ): Self = StObject.set(x, "styleActiveLine", value.asInstanceOf[js.Any])
      
      inline def setStyleActiveLineUndefined: Self = StObject.set(x, "styleActiveLine", js.undefined)
      
      inline def setStyleSelectedText(value: Boolean): Self = StObject.set(x, "styleSelectedText", value.asInstanceOf[js.Any])
      
      inline def setStyleSelectedTextUndefined: Self = StObject.set(x, "styleSelectedText", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      inline def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    }
  }
  
  trait TypeofCodeMirror extends StObject {
    
    /**
    An editor view represents the editor's user interface. It holds
    the editable DOM surface, and possibly other elements such as the
    line number gutter. It handles events and dispatches state
    transactions for editing actions.
    */
    var EditorView: Instantiable0[typings.codemirror.mod.EditorView]
    
    /**
    This is an extension value that just pulls together a number of
    extensions that you might want in a basic editor. It is meant as a
    convenient helper to quickly set up CodeMirror without installing
    and importing a lot of separate packages.
    Specifically, it includes...
      - [the default command bindings](https://codemirror.net/6/docs/ref/#commands.defaultKeymap)
      - [line numbers](https://codemirror.net/6/docs/ref/#view.lineNumbers)
      - [special character highlighting](https://codemirror.net/6/docs/ref/#view.highlightSpecialChars)
      - [the undo history](https://codemirror.net/6/docs/ref/#commands.history)
      - [a fold gutter](https://codemirror.net/6/docs/ref/#language.foldGutter)
      - [custom selection drawing](https://codemirror.net/6/docs/ref/#view.drawSelection)
      - [drop cursor](https://codemirror.net/6/docs/ref/#view.dropCursor)
      - [multiple selections](https://codemirror.net/6/docs/ref/#state.EditorState^allowMultipleSelections)
      - [reindentation on input](https://codemirror.net/6/docs/ref/#language.indentOnInput)
      - [the default highlight style](https://codemirror.net/6/docs/ref/#language.defaultHighlightStyle) (as fallback)
      - [bracket matching](https://codemirror.net/6/docs/ref/#language.bracketMatching)
      - [bracket closing](https://codemirror.net/6/docs/ref/#autocomplete.closeBrackets)
      - [autocompletion](https://codemirror.net/6/docs/ref/#autocomplete.autocompletion)
      - [rectangular selection](https://codemirror.net/6/docs/ref/#view.rectangularSelection) and [crosshair cursor](https://codemirror.net/6/docs/ref/#view.crosshairCursor)
      - [active line highlighting](https://codemirror.net/6/docs/ref/#view.highlightActiveLine)
      - [active line gutter highlighting](https://codemirror.net/6/docs/ref/#view.highlightActiveLineGutter)
      - [selection match highlighting](https://codemirror.net/6/docs/ref/#search.highlightSelectionMatches)
      - [search](https://codemirror.net/6/docs/ref/#search.searchKeymap)
      - [linting](https://codemirror.net/6/docs/ref/#lint.lintKeymap)
    (You'll probably want to add some language package to your setup
    too.)
    This extension does not allow customization. The idea is that,
    once you decide you want to configure your editor more precisely,
    you take this package's source (which is just a bunch of imports
    and an array literal), copy it into your own code, and adjust it
    as desired.
    */
    val basicSetup: Extension
    
    /**
    A minimal set of extensions to create a functional editor. Only
    includes [the default keymap](https://codemirror.net/6/docs/ref/#commands.defaultKeymap), [undo
    history](https://codemirror.net/6/docs/ref/#commands.history), [special character
    highlighting](https://codemirror.net/6/docs/ref/#view.highlightSpecialChars), [custom selection
    drawing](https://codemirror.net/6/docs/ref/#view.drawSelection), and [default highlight
    style](https://codemirror.net/6/docs/ref/#language.defaultHighlightStyle).
    */
    val minimalSetup: Extension
  }
  object TypeofCodeMirror {
    
    inline def apply(EditorView: Instantiable0[EditorView], basicSetup: Extension, minimalSetup: Extension): TypeofCodeMirror = {
      val __obj = js.Dynamic.literal(EditorView = EditorView.asInstanceOf[js.Any], basicSetup = basicSetup.asInstanceOf[js.Any], minimalSetup = minimalSetup.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCodeMirror]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofCodeMirror] (val x: Self) extends AnyVal {
      
      inline def setBasicSetup(value: Extension): Self = StObject.set(x, "basicSetup", value.asInstanceOf[js.Any])
      
      inline def setBasicSetupVarargs(value: Any*): Self = StObject.set(x, "basicSetup", js.Array(value*))
      
      inline def setEditorView(value: Instantiable0[EditorView]): Self = StObject.set(x, "EditorView", value.asInstanceOf[js.Any])
      
      inline def setMinimalSetup(value: Extension): Self = StObject.set(x, "minimalSetup", value.asInstanceOf[js.Any])
      
      inline def setMinimalSetupVarargs(value: Any*): Self = StObject.set(x, "minimalSetup", js.Array(value*))
    }
  }
  
  @js.native
  trait TypeofEditorView extends StObject {
    
    /**
      State effect used to include screen reader announcements in a
      transaction. These will be added to the DOM in a visually hidden
      element with `aria-live="polite"` set, and should be used to
      describe effects that are visually obvious but may not be
      noticed by screen reader users (such as moving to the next
      search match).
      */
    /* static member */
    var announce: StateEffectType[String] = js.native
    
    /**
      Used to provide ranges that should be treated as atoms as far as
      cursor motion is concerned. This causes methods like
      [`moveByChar`](https://codemirror.net/6/docs/ref/#view.EditorView.moveByChar) and
      [`moveVertically`](https://codemirror.net/6/docs/ref/#view.EditorView.moveVertically) (and the
      commands built on top of them) to skip across such regions when
      a selection endpoint would enter them. This does _not_ prevent
      direct programmatic [selection
      updates](https://codemirror.net/6/docs/ref/#state.TransactionSpec.selection) from moving into such
      regions.
      */
    /* static member */
    var atomicRanges: Facet[
        js.Function1[/* view */ typings.codemirrorView.mod.EditorView, RangeSet[Any]], 
        js.Array[js.Function1[/* view */ typings.codemirrorView.mod.EditorView, RangeSet[Any]]]
      ] = js.native
    
    /**
      Create an extension that adds styles to the base theme. Like
      with [`theme`](https://codemirror.net/6/docs/ref/#view.EditorView^theme), use `&` to indicate the
      place of the editor wrapper element when directly targeting
      that. You can also use `&dark` or `&light` instead to only
      target editors with a dark or light theme.
      */
    /* static member */
    def baseTheme(spec: StringDictionary[StyleSpec]): Extension = js.native
    
    /**
      Facet used to configure whether a given selecting click adds a
      new range to the existing selection or replaces it entirely. The
      default behavior is to check `event.metaKey` on macOS, and
      `event.ctrlKey` elsewhere.
      */
    /* static member */
    var clickAddsSelectionRange: Facet[
        js.Function1[/* event */ MouseEvent, Boolean], 
        js.Array[js.Function1[/* event */ MouseEvent, Boolean]]
      ] = js.native
    
    /**
      Facet that provides additional DOM attributes for the editor's
      editable DOM element.
      */
    /* static member */
    var contentAttributes: Facet[AttrSource, js.Array[AttrSource]] = js.native
    
    /**
      This facet records whether a dark theme is active. The extension
      returned by [`theme`](https://codemirror.net/6/docs/ref/#view.EditorView^theme) automatically
      includes an instance of this when the `dark` option is set to
      true.
      */
    /* static member */
    var darkTheme: Facet[Boolean, Boolean] = js.native
    
    /**
      A facet that determines which [decorations](https://codemirror.net/6/docs/ref/#view.Decoration)
      are shown in the view. Decorations can be provided in two
      ways—directly, or via a function that takes an editor view.
      
      Only decoration sets provided directly are allowed to influence
      the editor's vertical layout structure. The ones provided as
      functions are called _after_ the new viewport has been computed,
      and thus **must not** introduce block widgets or replacing
      decorations that cover line breaks.
      
      If you want decorated ranges to behave like atomic units for
      cursor motion and deletion purposes, also provide the range set
      containing the decorations to
      [`EditorView.atomicRanges`](https://codemirror.net/6/docs/ref/#view.EditorView^atomicRanges).
      */
    /* static member */
    var decorations: Facet[
        DecorationSet | (js.Function1[/* view */ typings.codemirrorView.mod.EditorView, DecorationSet]), 
        js.Array[
          DecorationSet | (js.Function1[/* view */ typings.codemirrorView.mod.EditorView, DecorationSet])
        ]
      ] = js.native
    
    /**
      Returns an extension that can be used to add DOM event handlers.
      The value should be an object mapping event names to handler
      functions. For any given event, such functions are ordered by
      extension precedence, and the first handler to return true will
      be assumed to have handled that event, and no other handlers or
      built-in behavior will be activated for it. These are registered
      on the [content element](https://codemirror.net/6/docs/ref/#view.EditorView.contentDOM), except
      for `scroll` handlers, which will be called any time the
      editor's [scroll element](https://codemirror.net/6/docs/ref/#view.EditorView.scrollDOM) or one of
      its parent nodes is scrolled.
      */
    /* static member */
    def domEventHandlers(handlers: DOMEventHandlers[Any]): Extension = js.native
    
    /**
      Facet used to configure whether a given selection drag event
      should move or copy the selection. The given predicate will be
      called with the `mousedown` event, and can return `true` when
      the drag should move the content.
      */
    /* static member */
    var dragMovesSelection: Facet[
        js.Function1[/* event */ MouseEvent, Boolean], 
        js.Array[js.Function1[/* event */ MouseEvent, Boolean]]
      ] = js.native
    
    /**
      Facet that controls whether the editor content DOM is editable.
      When its highest-precedence value is `false`, the element will
      not have its `contenteditable` attribute set. (Note that this
      doesn't affect API calls that change the editor content, even
      when those are bound to keys or buttons. See the
      [`readOnly`](https://codemirror.net/6/docs/ref/#state.EditorState.readOnly) facet for that.)
      */
    /* static member */
    var editable: Facet[Boolean, Boolean] = js.native
    
    /**
      Facet that provides DOM attributes for the editor's outer
      element.
      */
    /* static member */
    var editorAttributes: Facet[AttrSource, js.Array[AttrSource]] = js.native
    
    /**
      Allows you to provide a function that should be called when the
      library catches an exception from an extension (mostly from view
      plugins, but may be used by other extensions to route exceptions
      from user-code-provided callbacks). This is mostly useful for
      debugging and logging. See [`logException`](https://codemirror.net/6/docs/ref/#view.logException).
      */
    /* static member */
    var exceptionSink: Facet[
        js.Function1[/* exception */ Any, Unit], 
        js.Array[js.Function1[/* exception */ Any, Unit]]
      ] = js.native
    
    /**
      Retrieve an editor view instance from the view's DOM
      representation.
      */
    /* static member */
    def findFromDOM(dom: HTMLElement): typings.codemirrorView.mod.EditorView | Null = js.native
    
    /**
      An input handler can override the way changes to the editable
      DOM content are handled. Handlers are passed the document
      positions between which the change was found, and the new
      content. When one returns true, no further input handlers are
      called and the default behavior is prevented.
      */
    /* static member */
    var inputHandler: Facet[
        js.Function4[
          /* view */ typings.codemirrorView.mod.EditorView, 
          /* from */ Double, 
          /* to */ Double, 
          /* text */ String, 
          Boolean
        ], 
        js.Array[
          js.Function4[
            /* view */ typings.codemirrorView.mod.EditorView, 
            /* from */ Double, 
            /* to */ Double, 
            /* text */ String, 
            Boolean
          ]
        ]
      ] = js.native
    
    /**
      An extension that enables line wrapping in the editor (by
      setting CSS `white-space` to `pre-wrap` in the content).
      */
    /* static member */
    var lineWrapping: Extension = js.native
    
    /**
      Allows you to influence the way mouse selection happens. The
      functions in this facet will be called for a `mousedown` event
      on the editor, and can return an object that overrides the way a
      selection is computed from that mouse click or drag.
      */
    /* static member */
    var mouseSelectionStyle: Facet[MakeSelectionStyle, js.Array[MakeSelectionStyle]] = js.native
    
    /**
      By default, the editor assumes all its content has the same
      [text direction](https://codemirror.net/6/docs/ref/#view.Direction). Configure this with a `true`
      value to make it read the text direction of every (rendered)
      line separately.
      */
    /* static member */
    var perLineTextDirection: Facet[Boolean, Boolean] = js.native
    
    /**
      Returns an effect that can be
      [added](https://codemirror.net/6/docs/ref/#state.TransactionSpec.effects) to a transaction to
      cause it to scroll the given position or range into view.
      */
    /* static member */
    def scrollIntoView(pos: Double): StateEffect[Any] = js.native
    def scrollIntoView(pos: Double, options: X): StateEffect[Any] = js.native
    def scrollIntoView(pos: SelectionRange): StateEffect[Any] = js.native
    def scrollIntoView(pos: SelectionRange, options: X): StateEffect[Any] = js.native
    
    /**
      Facet that allows extensions to provide additional scroll
      margins (space around the sides of the scrolling element that
      should be considered invisible). This can be useful when the
      plugin introduces elements that cover part of that element (for
      example a horizontally fixed gutter).
      */
    /* static member */
    var scrollMargins: Facet[
        js.Function1[/* view */ typings.codemirrorView.mod.EditorView, PartialRect | Null], 
        js.Array[
          js.Function1[/* view */ typings.codemirrorView.mod.EditorView, PartialRect | Null]
        ]
      ] = js.native
    
    /**
      Facet to add a [style
      module](https://github.com/marijnh/style-mod#documentation) to
      an editor view. The view will ensure that the module is
      mounted in its [document
      root](https://codemirror.net/6/docs/ref/#view.EditorView.constructor^config.root).
      */
    /* static member */
    var styleModule: Facet[StyleModule, js.Array[StyleModule]] = js.native
    
    /**
      Create a theme extension. The first argument can be a
      [`style-mod`](https://github.com/marijnh/style-mod#documentation)
      style spec providing the styles for the theme. These will be
      prefixed with a generated class for the style.
      
      Because the selectors will be prefixed with a scope class, rule
      that directly match the editor's [wrapper
      element](https://codemirror.net/6/docs/ref/#view.EditorView.dom)—to which the scope class will be
      added—need to be explicitly differentiated by adding an `&` to
      the selector for that element—for example
      `&.cm-focused`.
      
      When `dark` is set to true, the theme will be marked as dark,
      which will cause the `&dark` rules from [base
      themes](https://codemirror.net/6/docs/ref/#view.EditorView^baseTheme) to be used (as opposed to
      `&light` when a light theme is active).
      */
    /* static member */
    def theme(spec: StringDictionary[StyleSpec]): Extension = js.native
    def theme(spec: StringDictionary[StyleSpec], options: Dark): Extension = js.native
    
    /**
      A facet that can be used to register a function to be called
      every time the view updates.
      */
    /* static member */
    var updateListener: Facet[
        js.Function1[/* update */ ViewUpdate, Unit], 
        js.Array[js.Function1[/* update */ ViewUpdate, Unit]]
      ] = js.native
  }
}
