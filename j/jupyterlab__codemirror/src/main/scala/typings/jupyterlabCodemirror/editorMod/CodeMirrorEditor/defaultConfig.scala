package typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor

import typings.codemirror.mod.StyleActiveLine
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.modeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default configuration options for an editor.
  */
@JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig")
@js.native
object defaultConfig extends js.Object {
  var autoClosingBrackets: Boolean = js.native
  var codeFolding: Boolean = js.native
  var coverGutterNextToScrollbar: Boolean = js.native
  var dragDrop: Boolean = js.native
  var electricChars: Boolean = js.native
  var extraKeys: js.Any = js.native
  var fixedGutter: Boolean = js.native
  var foldGutter: Boolean = js.native
  var fontFamily: String = js.native
  var fontSize: Double = js.native
  var gutters: js.Array[String] = js.native
  var insertSpaces: Boolean = js.native
  var keyMap: String = js.native
  var lineHeight: Double = js.native
  var lineNumbers: Boolean = js.native
  var lineSeparator: String = js.native
  var lineWiseCopyCut: Boolean = js.native
  var lineWrap: off | on | wordWrapColumn | bounded = js.native
  var matchBrackets: Boolean = js.native
  var mode: String | IMode = js.native
  var readOnly: Boolean = js.native
  var rulers: js.Array[Double] = js.native
  var scrollPastEnd: Boolean = js.native
  var scrollbarStyle: String = js.native
  var selectionPointer: Boolean | String = js.native
  var showCursorWhenSelecting: Boolean = js.native
  var smartIndent: Boolean = js.native
  var styleActiveLine: Boolean | StyleActiveLine = js.native
  var styleSelectedText: Boolean = js.native
  var tabSize: Double = js.native
  var theme: String = js.native
  var wordWrapColumn: Double = js.native
}

