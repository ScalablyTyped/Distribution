package typings.hyperformula.cellMod

import typings.hyperformula.addressMod.AddressWithSheet
import typings.hyperformula.cellMod.ErrorType.LIC
import typings.hyperformula.cellMod.^
import typings.hyperformula.interpreterValueMod.InterpreterValue
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.vertexMod.CellVertex
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CellValueTypeOrd(arg: CellValueType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CellValueTypeOrd")(arg.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def absoluteSheetReference(address: AddressWithSheet, baseAddress: SimpleCellAddress_): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteSheetReference")(address.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def addressKey(address: SimpleCellAddress_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addressKey")(address.asInstanceOf[js.Any]).asInstanceOf[String]

inline def equalSimpleCellAddress(left: SimpleCellAddress_, right: SimpleCellAddress_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalSimpleCellAddress")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def getCellType(vertex: Maybe[CellVertex], address: SimpleCellAddress_): CellType = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellType")(vertex.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[CellType]

inline def getCellValueDetailedType(cellValue: InterpreterValue): CellValueDetailedType = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellValueDetailedType")(cellValue.asInstanceOf[js.Any]).asInstanceOf[CellValueDetailedType]

inline def getCellValueFormat(cellValue: InterpreterValue): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellValueFormat")(cellValue.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

inline def getCellValueType(cellValue: InterpreterValue): CellValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellValueType")(cellValue.asInstanceOf[js.Any]).asInstanceOf[CellValueType]

inline def invalidSimpleCellAddress(address: SimpleCellAddress_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidSimpleCellAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def invalidSimpleColumnAddress(address: SimpleColumnAddress_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidSimpleColumnAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def invalidSimpleRowAddress(address: SimpleRowAddress_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidSimpleRowAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSimpleCellAddress(obj: Any): /* is hyperformula.hyperformula/typings/Cell.SimpleCellAddress */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleCellAddress")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is hyperformula.hyperformula/typings/Cell.SimpleCellAddress */ Boolean]

inline def movedSimpleCellAddress(address: SimpleCellAddress_, toSheet: Double, toRight: Double, toBottom: Double): SimpleCellAddress_ = (^.asInstanceOf[js.Dynamic].applyDynamic("movedSimpleCellAddress")(address.asInstanceOf[js.Any], toSheet.asInstanceOf[js.Any], toRight.asInstanceOf[js.Any], toBottom.asInstanceOf[js.Any])).asInstanceOf[SimpleCellAddress_]

inline def simpleCellAddress(sheet: Double, col: Double, row: Double): SimpleCellAddress_ = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellAddress")(sheet.asInstanceOf[js.Any], col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[SimpleCellAddress_]

inline def simpleColumnAddress(sheet: Double, col: Double): SimpleColumnAddress_ = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleColumnAddress")(sheet.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[SimpleColumnAddress_]

inline def simpleRowAddress(sheet: Double, row: Double): SimpleRowAddress_ = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleRowAddress")(sheet.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[SimpleRowAddress_]

type TranslatableErrorType = Exclude[ErrorType, LIC]
