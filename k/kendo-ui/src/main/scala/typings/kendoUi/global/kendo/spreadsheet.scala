package typings.kendoUi.global.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spreadsheet {
  
  @JSGlobal("kendo.spreadsheet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.spreadsheet.CustomFilter")
  @js.native
  open class CustomFilter ()
    extends StObject
       with typings.kendoUi.kendo.spreadsheet.CustomFilter
  
  @JSGlobal("kendo.spreadsheet.DynamicFilter")
  @js.native
  open class DynamicFilter ()
    extends StObject
       with typings.kendoUi.kendo.spreadsheet.DynamicFilter
  
  @JSGlobal("kendo.spreadsheet.Range")
  @js.native
  open class Range ()
    extends StObject
       with typings.kendoUi.kendo.spreadsheet.Range
  
  @JSGlobal("kendo.spreadsheet.Sheet")
  @js.native
  open class Sheet ()
    extends StObject
       with typings.kendoUi.kendo.spreadsheet.Sheet
  
  @JSGlobal("kendo.spreadsheet.TopFilter")
  @js.native
  open class TopFilter ()
    extends StObject
       with typings.kendoUi.kendo.spreadsheet.TopFilter
  
  @JSGlobal("kendo.spreadsheet.ValueFilter")
  @js.native
  open class ValueFilter ()
    extends StObject
       with typings.kendoUi.kendo.spreadsheet.ValueFilter
  
  inline def defineFunction(name: String, handler: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineFunction")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Any]
}
