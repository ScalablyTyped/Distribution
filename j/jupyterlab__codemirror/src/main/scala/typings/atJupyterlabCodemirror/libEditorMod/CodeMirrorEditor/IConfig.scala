package typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor

import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.bounded
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.off
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.on
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.wordWrapColumn
import typings.atJupyterlabCodemirror.libModeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration options for a codemirror editor.
  */
trait IConfig
  extends typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig {
  /**
    * When fixedGutter is on, and there is a horizontal scrollbar, by default
    * the gutter will be visible to the left of this scrollbar. If this
    * option is set to true, it will be covered by an element with class
    * CodeMirror-gutter-filler.
    */
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether drag-and-drop is enabled.
    */
  var dragDrop: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures whether the editor should re-indent the current line when a
    * character is typed that might change its proper indentation
    * (only works if the mode supports indentation).
    */
  var electricChars: js.UndefOr[Boolean] = js.undefined
  /**
    * Can be used to specify extra keybindings for the editor, alongside the
    * ones defined by keyMap. Should be either null, or a valid keymap value.
    */
  var extraKeys: js.UndefOr[js.Any] = js.undefined
  /**
    * Determines whether the gutter scrolls along with the content
    * horizontally (false)
    * or whether it stays fixed during horizontal scrolling (true,
    * the default).
    */
  var fixedGutter: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the folding gutter should be drawn
    */
  var foldGutter: js.UndefOr[Boolean] = js.undefined
  /**
    * Can be used to add extra gutters (beyond or instead of the line number
    * gutter).
    * Should be an array of CSS class names, each of which defines a width
    * (and optionally a background),
    * and which will be used to draw the background of the gutters.
    * May include the CodeMirror-linenumbers class, in order to explicitly
    * set the position of the line number gutter
    * (it will default to be to the right of all other gutters).
    * These class names are the keys passed to setGutterMarker.
    */
  var gutters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Configures the keymap to use. The default is "default", which is the
    * only keymap defined in codemirror.js itself.
    * Extra keymaps are found in the CodeMirror keymap directory.
    */
  var keyMap: js.UndefOr[String] = js.undefined
  /**
    * Explicitly set the line separator for the editor.
    * By default (value null), the document will be split on CRLFs as well as
    * lone CRs and LFs, and a single LF will be used as line separator in all
    * output (such as getValue). When a specific string is given, lines will
    * only be split on that string, and output will, by default, use that
    * same separator.
    */
  var lineSeparator: js.UndefOr[String | Null] = js.undefined
  /**
    * When enabled, which is the default, doing copy or cut when there is no
    * selection will copy or cut the whole lines that have cursors on them.
    */
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined
  /**
    * The mode to use.
    */
  var mode: js.UndefOr[String | IMode] = js.undefined
  /**
    * Whether to scroll past the end of the buffer.
    */
  var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * Chooses a scrollbar implementation. The default is "native", showing
    * native scrollbars. The core library also provides the "null" style,
    * which completely hides the scrollbars. Addons can implement additional
    * scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[String] = js.undefined
  /**
    * Defines the mouse cursor appearance when hovering over the selection.
    * It can be set to a string, like "pointer", or to true,
    * in which case the "default" (arrow) cursor will be used.
    */
  var selectionPointer: Boolean | String
  /**
    * Whether the cursor should be drawn when a selection is active.
    */
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use the context-sensitive indentation that the mode provides
    * (or just indent the same as the line before).
    */
  var smartIndent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to give the wrapper of the line that contains the cursor the class
    * CodeMirror-activeline, adds a background with the class
    * CodeMirror-activeline-background, and adds the class
    * CodeMirror-activeline-gutter to the line's gutter space is enabled.
    */
  var styleActiveLine: Boolean | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeMirror.StyleActiveLine */ js.Any)
  /**
    * Whether to causes the selected text to be marked with the CSS class
    * CodeMirror-selectedtext. Useful to change the colour of the selection
    * (in addition to the background).
    */
  var styleSelectedText: Boolean
  /**
    * The theme to style the editor with.
    * You must make sure the CSS file defining the corresponding
    * .cm-s-[name] styles is loaded.
    */
  var theme: js.UndefOr[String] = js.undefined
}

object IConfig {
  @scala.inline
  def apply(
    autoClosingBrackets: Boolean,
    codeFolding: Boolean,
    insertSpaces: Boolean,
    lineNumbers: Boolean,
    lineWrap: off | on | wordWrapColumn | bounded,
    matchBrackets: Boolean,
    readOnly: Boolean,
    rulers: js.Array[Double],
    selectionPointer: Boolean | String,
    styleActiveLine: Boolean | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeMirror.StyleActiveLine */ js.Any),
    styleSelectedText: Boolean,
    tabSize: Double,
    wordWrapColumn: Double,
    coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined,
    dragDrop: js.UndefOr[Boolean] = js.undefined,
    electricChars: js.UndefOr[Boolean] = js.undefined,
    extraKeys: js.Any = null,
    fixedGutter: js.UndefOr[Boolean] = js.undefined,
    foldGutter: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    gutters: js.Array[String] = null,
    keyMap: String = null,
    lineHeight: Int | Double = null,
    lineSeparator: String = null,
    lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined,
    mode: String | IMode = null,
    scrollPastEnd: js.UndefOr[Boolean] = js.undefined,
    scrollbarStyle: String = null,
    showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined,
    smartIndent: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): IConfig = {
    val __obj = js.Dynamic.literal(autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], codeFolding = codeFolding.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], selectionPointer = selectionPointer.asInstanceOf[js.Any], styleActiveLine = styleActiveLine.asInstanceOf[js.Any], styleSelectedText = styleSelectedText.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(coverGutterNextToScrollbar)) __obj.updateDynamic("coverGutterNextToScrollbar")(coverGutterNextToScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDrop)) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(electricChars)) __obj.updateDynamic("electricChars")(electricChars.asInstanceOf[js.Any])
    if (extraKeys != null) __obj.updateDynamic("extraKeys")(extraKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedGutter)) __obj.updateDynamic("fixedGutter")(fixedGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(foldGutter)) __obj.updateDynamic("foldGutter")(foldGutter.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineSeparator != null) __obj.updateDynamic("lineSeparator")(lineSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWiseCopyCut)) __obj.updateDynamic("lineWiseCopyCut")(lineWiseCopyCut.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPastEnd)) __obj.updateDynamic("scrollPastEnd")(scrollPastEnd.asInstanceOf[js.Any])
    if (scrollbarStyle != null) __obj.updateDynamic("scrollbarStyle")(scrollbarStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCursorWhenSelecting)) __obj.updateDynamic("showCursorWhenSelecting")(showCursorWhenSelecting.asInstanceOf[js.Any])
    if (!js.isUndefined(smartIndent)) __obj.updateDynamic("smartIndent")(smartIndent.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

