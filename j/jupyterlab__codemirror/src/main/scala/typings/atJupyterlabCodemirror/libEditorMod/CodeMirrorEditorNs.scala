package typings.atJupyterlabCodemirror.libEditorMod

import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditorNs.IConfig
import typings.atJupyterlabCodemirror.libModeMod.ModeNs.IMode
import typings.codemirror.codemirrorMod.Editor
import typings.codemirror.codemirrorMod.StyleActiveLine
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor")
@js.native
object CodeMirrorEditorNs extends js.Object {
  /**
    * The configuration options for a codemirror editor.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait IConfig extends js.Object {
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
    var styleActiveLine: Boolean | StyleActiveLine
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
  
  /**
    * The options used to initialize a code mirror editor.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait IOptions extends js.Object {
    /**
      * The configuration options for the editor.
      */
    var config: js.UndefOr[Partial[IConfig]] = js.undefined
  }
  
  /**
    * The default configuration options for an editor.
    */
  var defaultConfig: IConfig = js.native
  /**
    * Add a command to CodeMirror.
    *
    * @param name - The name of the command to add.
    *
    * @param command - The command function.
    */
  def addCommand(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = js.native
}

