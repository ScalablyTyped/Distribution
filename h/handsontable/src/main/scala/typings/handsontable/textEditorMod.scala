package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textEditorMod {
  
  @JSImport("handsontable/editors/textEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: text = js.native
  
  @JSImport("handsontable/editors/textEditor", "TextEditor")
  @js.native
  open class TextEditor protected ()
    extends typings.handsontable.textEditorTextEditorMod.TextEditor {
    def this(instance: default) = this()
  }
}
