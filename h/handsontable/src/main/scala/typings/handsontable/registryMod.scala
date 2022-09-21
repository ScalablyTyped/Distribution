package typings.handsontable

import typings.handsontable.cellTypesBaseMod.CellTypeObject
import typings.handsontable.handsontableStrings.autocomplete
import typings.handsontable.handsontableStrings.checkbox
import typings.handsontable.handsontableStrings.date
import typings.handsontable.handsontableStrings.dropdown
import typings.handsontable.handsontableStrings.numeric
import typings.handsontable.handsontableStrings.password
import typings.handsontable.handsontableStrings.text
import typings.handsontable.handsontableStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("handsontable/cellTypes/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCellType(name: String): CellTypeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[CellTypeObject]
  
  inline def getCellType_autocomplete(name: autocomplete): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_checkbox(name: checkbox): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_date(name: date): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_dropdown(name: dropdown): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_handsontable(name: typings.handsontable.handsontableStrings.handsontable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_numeric(name: numeric): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_password(name: password): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_text(name: text): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCellType_time(name: time): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getRegisteredCellTypeNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredCellTypeNames")().asInstanceOf[js.Array[String]]
  
  inline def getRegisteredCellTypes(): js.Array[CellTypeObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredCellTypes")().asInstanceOf[js.Array[CellTypeObject]]
  
  inline def hasCellType(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCellType")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerCellType(name: String, `type`: CellTypeObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCellType")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerCellType(`type`: CellTypeObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCellType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
