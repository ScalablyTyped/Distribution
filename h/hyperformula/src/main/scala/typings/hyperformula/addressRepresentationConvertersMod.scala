package typings.hyperformula

import typings.hyperformula.absoluteCellRangeMod.SimpleCellRange_
import typings.hyperformula.cellAddressMod.CellAddress
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.columnAddressMod.ColumnAddress
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.rowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressRepresentationConvertersMod {
  
  @JSImport("hyperformula/typings/parser/addressRepresentationConverters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cellAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, baseAddress: SimpleCellAddress_): Maybe[CellAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("cellAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[CellAddress]]
  
  inline def columnAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, baseAddress: SimpleCellAddress_): Maybe[ColumnAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("columnAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[ColumnAddress]]
  
  inline def columnIndexToLabel(column: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("columnIndexToLabel")(column.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rowAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, baseAddress: SimpleCellAddress_): Maybe[RowAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("rowAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[RowAddress]]
  
  inline def sheetIndexToString(sheetId: Double, sheetMappingFn: SheetIndexMappingFn): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sheetIndexToString")(sheetId.asInstanceOf[js.Any], sheetMappingFn.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
  
  inline def simpleCellAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, sheetContext: Double): Maybe[SimpleCellAddress_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], sheetContext.asInstanceOf[js.Any])).asInstanceOf[Maybe[SimpleCellAddress_]]
  
  inline def simpleCellAddressToString(sheetIndexMapping: SheetIndexMappingFn, address: SimpleCellAddress_, sheetIndex: Double): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellAddressToString")(sheetIndexMapping.asInstanceOf[js.Any], address.asInstanceOf[js.Any], sheetIndex.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
  
  inline def simpleCellRangeFromString(sheetMapping: SheetMappingFn, stringAddress: String, sheetContext: Double): Maybe[SimpleCellRange_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellRangeFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], sheetContext.asInstanceOf[js.Any])).asInstanceOf[Maybe[SimpleCellRange_]]
  
  inline def simpleCellRangeToString(sheetIndexMapping: SheetIndexMappingFn, address: SimpleCellRange_, sheetIndex: Double): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellRangeToString")(sheetIndexMapping.asInstanceOf[js.Any], address.asInstanceOf[js.Any], sheetIndex.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
  
  type SheetIndexMappingFn = js.Function1[/* sheetIndex */ Double, Maybe[String]]
  
  type SheetMappingFn = js.Function1[/* sheetName */ String, Maybe[Double]]
}
