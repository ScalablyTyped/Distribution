package typings.jspreadsheetCe.mod

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSpreadsheet extends StObject {
  
  def apply(element: HTMLDivElement): JSpreadsheetElement = js.native
  def apply(element: HTMLDivElement, options: Options): JSpreadsheetElement = js.native
  
  //
  // Other helpers
  // ----------------------------------------------------------------------
  var build: Any = js.native
  
  // tslint:disable-next-line ban-types
  var contextMenuControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var copyControls: js.Function = js.native
  
  def createTabs(element: HTMLDivElement, result: js.Array[Any]): Unit = js.native
  
  var current: Any = js.native
  
  // tslint:disable-next-line ban-types
  var cutControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var destroy: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var doubleClickControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var doubleDigitFormat: js.Function = js.native
  
  def fromSpreadsheet(result: js.Array[Any]): Unit = js.native
  
  // tslint:disable-next-line ban-types
  var getColumnName: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var getColumnNameFromId: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var getElement: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var getIdFromColumnName: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var injectArray: js.Function = js.native
  
  var isMouseAction: Boolean = js.native
  
  // tslint:disable-next-line ban-types
  var keyDownControls: js.Function = js.native
  
  var methods: js.Object = js.native
  
  // tslint:disable-next-line ban-types
  var mouseDownControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var mouseMoveControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var mouseOverControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var mouseUpControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var pasteControls: js.Function = js.native
  
  def tabs(element: HTMLDivElement): js.Array[Double] = js.native
  def tabs(element: HTMLDivElement, options: js.Array[TabOptions]): js.Array[Double] = js.native
  
  var timeControl: Any = js.native
  
  var timeControlLoading: Any = js.native
  
  // tslint:disable-next-line ban-types
  var touchEndControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var touchStartControls: js.Function = js.native
  
  // tslint:disable-next-line ban-types
  var validLetter: js.Function = js.native
}
