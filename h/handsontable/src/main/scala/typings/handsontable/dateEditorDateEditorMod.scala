package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.date
import typings.handsontable.textEditorMod.TextEditor
import typings.pikaday.mod.PikadayOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateEditorDateEditorMod {
  
  @JSImport("handsontable/editors/dateEditor/dateEditor", "DateEditor")
  @js.native
  open class DateEditor protected () extends TextEditor {
    def this(instance: default) = this()
    
    var defaultDateFormat: String = js.native
    
    def destroyElements(): Unit = js.native
    
    def getDatePickerConfig(): PikadayOptions = js.native
    
    def hideDatepicker(): Unit = js.native
    
    var isCellEdited: Boolean = js.native
    
    var parentDestroyed: Boolean = js.native
    
    def showDatepicker(): Unit = js.native
    def showDatepicker(event: Event): Unit = js.native
  }
  
  @JSImport("handsontable/editors/dateEditor/dateEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: date = js.native
}
