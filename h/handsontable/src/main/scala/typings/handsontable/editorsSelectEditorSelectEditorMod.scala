package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.commonMod.RowObject
import typings.handsontable.coreMod.default
import typings.handsontable.editorsBaseEditorMod.BaseEditor
import typings.handsontable.handsontableStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsSelectEditorSelectEditorMod {
  
  @JSImport("handsontable/editors/selectEditor/selectEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: select = js.native
  
  @JSImport("handsontable/editors/selectEditor/selectEditor", "SelectEditor")
  @js.native
  open class SelectEditor protected () extends BaseEditor {
    def this(instance: default) = this()
    
    def prepareOptions(): Unit = js.native
    def prepareOptions(optionsToPrepare: js.Array[CellValue]): Unit = js.native
    def prepareOptions(optionsToPrepare: RowObject): Unit = js.native
    
    def refreshDimensions(): Unit = js.native
    
    def refreshValue(): Unit = js.native
  }
}
