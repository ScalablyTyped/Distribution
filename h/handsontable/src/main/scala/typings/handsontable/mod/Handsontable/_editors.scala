package typings.handsontable.mod.Handsontable

import typings.handsontable.handsontableStrings._empty
import typings.handsontable.handsontableStrings.`bottom-left-corner`
import typings.handsontable.handsontableStrings.`top-left-corner`
import typings.handsontable.handsontableStrings.bottom
import typings.handsontable.handsontableStrings.left
import typings.handsontable.handsontableStrings.top
import typings.pikaday.mod.PikadayOptions
import typings.std.CSSStyleDeclaration
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTableCellElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The "_editor" namespace is named to avoid circular reference conflict with "Handsontable.editors" namespace.
  * The other namespaces (renderers, validators, etc) don't need this because they don't expose values (classes), just types (interfaces).
  * Note that TS will think it can use the values defined here, ex `new Handsontable._editors.Base()` compiles, but this is wrong.
  * TODO: This would be better solved by moving all types outside the exported namespaces. (Separate type definition from type publication.)
  */
object _editors {
  
  @js.native
  trait Autocomplete
    extends typings.handsontable.mod.Handsontable._editors.Handsontable {
    
    def allowKeyEventPropagation(): Boolean = js.native
    def allowKeyEventPropagation(keyCode: Double): Boolean = js.native
    
    def flipDropdown(): Unit = js.native
    def flipDropdown(dropdownHeight: Double): Unit = js.native
    
    def flipDropdownIfNeeded(): Unit = js.native
    
    def getDropdownHeight(): Double = js.native
    
    def highlightBestMatchingChoice(): Unit = js.native
    def highlightBestMatchingChoice(index: Double): Unit = js.native
    
    def limitDropdownIfNeeded(): Unit = js.native
    def limitDropdownIfNeeded(spaceAvailable: js.UndefOr[scala.Nothing], dropdownHeight: Double): Unit = js.native
    def limitDropdownIfNeeded(spaceAvailable: Double): Unit = js.native
    def limitDropdownIfNeeded(spaceAvailable: Double, dropdownHeight: Double): Unit = js.native
    
    def queryChoices(): Unit = js.native
    def queryChoices(query: String): Unit = js.native
    
    def setDropdownHeight(): Unit = js.native
    def setDropdownHeight(height: Double): Unit = js.native
    
    def sortByRelevance(): js.Array[_] = js.native
    def sortByRelevance(value: js.UndefOr[scala.Nothing], choices: js.UndefOr[scala.Nothing], caseSensitive: Boolean): js.Array[_] = js.native
    def sortByRelevance(value: js.UndefOr[scala.Nothing], choices: js.Array[CellValue]): js.Array[_] = js.native
    def sortByRelevance(value: js.UndefOr[scala.Nothing], choices: js.Array[CellValue], caseSensitive: Boolean): js.Array[_] = js.native
    def sortByRelevance(value: CellValue): js.Array[_] = js.native
    def sortByRelevance(value: CellValue, choices: js.UndefOr[scala.Nothing], caseSensitive: Boolean): js.Array[_] = js.native
    def sortByRelevance(value: CellValue, choices: js.Array[CellValue]): js.Array[_] = js.native
    def sortByRelevance(value: CellValue, choices: js.Array[CellValue], caseSensitive: Boolean): js.Array[_] = js.native
    
    def unflipDropdown(): Unit = js.native
    
    def updateChoicesList(): Unit = js.native
    def updateChoicesList(choices: js.Array[CellValue]): Unit = js.native
    
    def updateDropdownHeight(): Unit = js.native
  }
  
  @js.native
  trait Base extends StObject {
    
    var TD: HTMLTableCellElement = js.native
    
    def beginEditing(): Unit = js.native
    def beginEditing(initialValue: js.UndefOr[scala.Nothing], event: Event): Unit = js.native
    def beginEditing(initialValue: js.Any): Unit = js.native
    def beginEditing(initialValue: js.Any, event: Event): Unit = js.native
    
    def cancelChanges(): Unit = js.native
    
    var cellProperties: CellProperties = js.native
    
    def checkEditorSection(): `top-left-corner` | top | `bottom-left-corner` | bottom | left | _empty = js.native
    
    def close(): Unit = js.native
    
    var col: Double = js.native
    
    def discardEditor(): Unit = js.native
    def discardEditor(validationResult: Boolean): Unit = js.native
    
    def enableFullEditMode(): Unit = js.native
    
    def extend[T /* <: Base */](): T = js.native
    
    def finishEditing(): Unit = js.native
    def finishEditing(
      restoreOriginalValue: js.UndefOr[scala.Nothing],
      ctrlDown: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def finishEditing(restoreOriginalValue: js.UndefOr[scala.Nothing], ctrlDown: Boolean): Unit = js.native
    def finishEditing(restoreOriginalValue: js.UndefOr[scala.Nothing], ctrlDown: Boolean, callback: js.Function0[Unit]): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean, ctrlDown: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean): Unit = js.native
    def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean, callback: js.Function0[Unit]): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getEditedCell(): HTMLTableCellElement | Null = js.native
    
    def getEditedCellsZIndex(): String = js.native
    
    def getValue(): js.Any = js.native
    
    var hot: typings.handsontable.mod._Handsontable.Core = js.native
    
    def init(): Unit = js.native
    
    var instance: typings.handsontable.mod._Handsontable.Core = js.native
    
    def isInFullEditMode(): Boolean = js.native
    
    def isOpened(): Boolean = js.native
    
    def isWaiting(): Boolean = js.native
    
    def open(): Unit = js.native
    def open(event: Event): Unit = js.native
    
    var originalValue: js.Any = js.native
    
    def prepare(
      row: Double,
      col: Double,
      prop: String,
      TD: HTMLTableCellElement,
      originalValue: js.Any,
      cellProperties: CellProperties
    ): Unit = js.native
    def prepare(
      row: Double,
      col: Double,
      prop: Double,
      TD: HTMLTableCellElement,
      originalValue: js.Any,
      cellProperties: CellProperties
    ): Unit = js.native
    
    var prop: String | Double = js.native
    
    var row: Double = js.native
    
    def saveValue(): Unit = js.native
    def saveValue(`val`: js.UndefOr[scala.Nothing], ctrlDown: Boolean): Unit = js.native
    def saveValue(`val`: js.Any): Unit = js.native
    def saveValue(`val`: js.Any, ctrlDown: Boolean): Unit = js.native
    
    def setValue(): Unit = js.native
    def setValue(newValue: js.Any): Unit = js.native
    
    var state: EditorState = js.native
  }
  
  @js.native
  trait Checkbox extends Base
  
  @js.native
  trait Date extends Text {
    
    def destroyElements(): Unit = js.native
    
    def getDatePickerConfig(): PikadayOptions = js.native
    
    def hideDatepicker(): Unit = js.native
    
    def showDatepicker(): Unit = js.native
    def showDatepicker(event: Event): Unit = js.native
  }
  
  type Dropdown = Autocomplete
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.STATE_VIRGIN
    - typings.handsontable.handsontableStrings.STATE_EDITING
    - typings.handsontable.handsontableStrings.STATE_WAITING
    - typings.handsontable.handsontableStrings.STATE_FINISHED
  */
  trait EditorState extends StObject
  object EditorState {
    
    @scala.inline
    def STATE_EDITING: typings.handsontable.handsontableStrings.STATE_EDITING = "STATE_EDITING".asInstanceOf[typings.handsontable.handsontableStrings.STATE_EDITING]
    
    @scala.inline
    def STATE_FINISHED: typings.handsontable.handsontableStrings.STATE_FINISHED = "STATE_FINISHED".asInstanceOf[typings.handsontable.handsontableStrings.STATE_FINISHED]
    
    @scala.inline
    def STATE_VIRGIN: typings.handsontable.handsontableStrings.STATE_VIRGIN = "STATE_VIRGIN".asInstanceOf[typings.handsontable.handsontableStrings.STATE_VIRGIN]
    
    @scala.inline
    def STATE_WAITING: typings.handsontable.handsontableStrings.STATE_WAITING = "STATE_WAITING".asInstanceOf[typings.handsontable.handsontableStrings.STATE_WAITING]
  }
  
  @js.native
  trait Handsontable extends Text {
    
    def assignHooks(): Unit = js.native
  }
  
  @js.native
  trait Mobile extends Base {
    
    def hideCellPointer(): Unit = js.native
    
    def onBeforeKeyDown(): Unit = js.native
    def onBeforeKeyDown(event: KeyboardEvent): Unit = js.native
    
    def prepareAndSave(): Unit = js.native
    
    def scrollToView(): Unit = js.native
    
    def updateEditorData(): Unit = js.native
    
    def updateEditorPosition(): Unit = js.native
    def updateEditorPosition(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
    def updateEditorPosition(x: Double): Unit = js.native
    def updateEditorPosition(x: Double, y: Double): Unit = js.native
    
    def valueChanged(): Boolean = js.native
  }
  
  type Numeric = Text
  
  type Password = Text
  
  @js.native
  trait Select extends Base {
    
    def prepareOptions(): Unit = js.native
    def prepareOptions(optionsToPrepare: js.Array[CellValue]): Unit = js.native
    def prepareOptions(optionsToPrepare: RowObject): Unit = js.native
    
    def refreshDimensions(): Unit = js.native
    
    def refreshValue(): Unit = js.native
    
    def registerHooks(): Unit = js.native
  }
  
  @js.native
  trait Text extends Base {
    
    var TEXTAREA: HTMLInputElement = js.native
    
    var TEXTAREA_PARENT: HTMLElement = js.native
    
    def bindEvents(): Unit = js.native
    
    def createElements(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def hideEditableElement(): Unit = js.native
    
    def refreshDimensions(): Unit = js.native
    def refreshDimensions(force: Boolean): Unit = js.native
    
    def refreshValue(): Unit = js.native
    
    def showEditableElement(): Unit = js.native
    
    var textareaStyle: CSSStyleDeclaration = js.native
  }
}
