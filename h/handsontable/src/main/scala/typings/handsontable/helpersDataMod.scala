package typings.handsontable

import typings.handsontable.commonMod.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersDataMod {
  
  @JSImport("handsontable/helpers/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cellMethodLookupFactory(methodName: String): js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cellMethodLookupFactory")(methodName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]]]
  inline def cellMethodLookupFactory(methodName: String, allowUndefined: Boolean): js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cellMethodLookupFactory")(methodName.asInstanceOf[js.Any], allowUndefined.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]]]
  
  inline def countFirstRowKeys(data: js.Array[CellValue]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countFirstRowKeys")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def createEmptySpreadsheetData(rows: Double, columns: Double): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmptySpreadsheetData")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def createSpreadsheetData(): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")().asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetData(rows: Double): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetData(rows: Double, columns: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetData(rows: Unit, columns: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def createSpreadsheetObjectData(): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")().asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetObjectData(rows: Double): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetObjectData(rows: Double, colCount: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")(rows.asInstanceOf[js.Any], colCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetObjectData(rows: Unit, colCount: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")(rows.asInstanceOf[js.Any], colCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def dataRowToChangesArray(dataRow: js.Array[CellValue]): js.Array[CellValue | Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any]).asInstanceOf[js.Array[CellValue | Double | String]]
  inline def dataRowToChangesArray(dataRow: js.Array[CellValue], rowOffset: Double): js.Array[CellValue | Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any], rowOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellValue | Double | String]]
  inline def dataRowToChangesArray(dataRow: js.Object): js.Array[CellValue | Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any]).asInstanceOf[js.Array[CellValue | Double | String]]
  inline def dataRowToChangesArray(dataRow: js.Object, rowOffset: Double): js.Array[CellValue | Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any], rowOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellValue | Double | String]]
  
  inline def isArrayOfArrays(data: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArrayOfObjects(data: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfObjects")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def spreadsheetColumnIndex(label: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("spreadsheetColumnIndex")(label.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def spreadsheetColumnLabel(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spreadsheetColumnLabel")(index.asInstanceOf[js.Any]).asInstanceOf[String]
}
