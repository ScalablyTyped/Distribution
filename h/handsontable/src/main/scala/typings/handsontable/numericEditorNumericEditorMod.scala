package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.numeric
import typings.handsontable.textEditorMod.TextEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericEditorNumericEditorMod {
  
  @JSImport("handsontable/editors/numericEditor/numericEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: numeric = js.native
  
  @JSImport("handsontable/editors/numericEditor/numericEditor", "NumericEditor")
  @js.native
  open class NumericEditor protected () extends TextEditor {
    def this(instance: default) = this()
  }
}
