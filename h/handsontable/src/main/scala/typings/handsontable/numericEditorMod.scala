package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericEditorMod {
  
  @JSImport("handsontable/editors/numericEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: numeric = js.native
  
  @JSImport("handsontable/editors/numericEditor", "NumericEditor")
  @js.native
  open class NumericEditor protected ()
    extends typings.handsontable.numericEditorNumericEditorMod.NumericEditor {
    def this(instance: default) = this()
  }
}
