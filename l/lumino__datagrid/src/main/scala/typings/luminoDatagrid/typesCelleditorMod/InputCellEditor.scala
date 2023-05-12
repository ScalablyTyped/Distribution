package typings.luminoDatagrid.typesCelleditorMod

import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@lumino/datagrid/types/celleditor", "InputCellEditor")
@js.native
/**
  * Construct a new cell editor.
  */
open class InputCellEditor () extends CellEditor {
  
  /* private */ var _onBlur: Any = js.native
  
  /* private */ var _onInput: Any = js.native
  
  /* private */ var _onKeyDown: Any = js.native
  
  /* private */ var _unbindEvents: Any = js.native
  
  /* protected */ def bindEvents(): Unit = js.native
  
  /* protected */ def createWidget(): Unit = js.native
  
  /* protected */ def deserialize(value: Any): Any = js.native
  
  /**
    * Handle the DOM events for the editor.
    *
    * @param event - The DOM event sent to the editor.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /* protected */ var input: HTMLInputElement = js.native
  
  /* protected */ var inputType: String = js.native
}
