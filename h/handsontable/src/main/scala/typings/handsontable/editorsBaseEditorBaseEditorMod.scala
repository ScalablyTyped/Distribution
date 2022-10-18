package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings._empty
import typings.handsontable.handsontableStrings.`bottom-left-corner`
import typings.handsontable.handsontableStrings.`top-left-corner`
import typings.handsontable.handsontableStrings.base
import typings.handsontable.handsontableStrings.bottom
import typings.handsontable.handsontableStrings.left
import typings.handsontable.handsontableStrings.top
import typings.handsontable.settingsMod.CellProperties
import typings.std.Event
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsBaseEditorBaseEditorMod {
  
  /* note: abstract class */ @JSImport("handsontable/editors/baseEditor/baseEditor", "BaseEditor")
  @js.native
  open class BaseEditor protected () extends StObject {
    def this(instance: default) = this()
    
    var TD: HTMLTableCellElement = js.native
    
    def beginEditing(): Unit = js.native
    def beginEditing(initialValue: Any): Unit = js.native
    def beginEditing(initialValue: Any, event: Event): Unit = js.native
    def beginEditing(initialValue: Unit, event: Event): Unit = js.native
    
    def cancelChanges(): Unit = js.native
    
    var cellProperties: CellProperties = js.native
    
    def checkEditorSection(): `top-left-corner` | top | `bottom-left-corner` | bottom | left | _empty = js.native
    
    def close(): Unit = js.native
    
    var col: Double = js.native
    
    def discardEditor(): Unit = js.native
    def discardEditor(validationResult: Boolean): Unit = js.native
    
    def enableFullEditMode(): Unit = js.native
    
    def extend(): BaseEditor = js.native
    
    def finishEditing(): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean, callback: js.Function0[Unit]): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Unit, callback: js.Function0[Unit]): Unit = js.native
    def finishEditing(restoreOriginalValue: Unit, ctrlDown: Boolean): Unit = js.native
    def finishEditing(restoreOriginalValue: Unit, ctrlDown: Boolean, callback: js.Function0[Unit]): Unit = js.native
    def finishEditing(restoreOriginalValue: Unit, ctrlDown: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getEditedCell(): HTMLTableCellElement | Null = js.native
    
    def getEditedCellsZIndex(): String = js.native
    
    def getValue(): Any = js.native
    
    var hot: default = js.native
    
    def init(): Unit = js.native
    
    var instance: default = js.native
    
    def isInFullEditMode(): Boolean = js.native
    
    def isOpened(): Boolean = js.native
    
    def isWaiting(): Boolean = js.native
    
    def open(): Unit = js.native
    def open(event: Event): Unit = js.native
    
    var originalValue: Any = js.native
    
    def prepare(
      row: Double,
      col: Double,
      prop: String,
      TD: HTMLTableCellElement,
      originalValue: Any,
      cellProperties: CellProperties
    ): Unit = js.native
    def prepare(
      row: Double,
      col: Double,
      prop: Double,
      TD: HTMLTableCellElement,
      originalValue: Any,
      cellProperties: CellProperties
    ): Unit = js.native
    
    var prop: Double | String = js.native
    
    var row: Double = js.native
    
    def saveValue(): Unit = js.native
    def saveValue(value: Any): Unit = js.native
    def saveValue(value: Any, ctrlDown: Boolean): Unit = js.native
    def saveValue(value: Unit, ctrlDown: Boolean): Unit = js.native
    
    def setValue(): Unit = js.native
    def setValue(newValue: Any): Unit = js.native
    
    var state: String = js.native
  }
  
  /* Inlined std.Readonly<{  VIRGIN :string,   EDITING :string,   WAITING :string,   FINISHED :string}> */
  object EDITOR_STATE {
    
    @JSImport("handsontable/editors/baseEditor/baseEditor", "EDITOR_STATE.EDITING")
    @js.native
    val EDITING: String = js.native
    
    @JSImport("handsontable/editors/baseEditor/baseEditor", "EDITOR_STATE.FINISHED")
    @js.native
    val FINISHED: String = js.native
    
    @JSImport("handsontable/editors/baseEditor/baseEditor", "EDITOR_STATE.VIRGIN")
    @js.native
    val VIRGIN: String = js.native
    
    @JSImport("handsontable/editors/baseEditor/baseEditor", "EDITOR_STATE.WAITING")
    @js.native
    val WAITING: String = js.native
  }
  
  @JSImport("handsontable/editors/baseEditor/baseEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: base = js.native
}
