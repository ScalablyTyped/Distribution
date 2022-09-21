package typings.hyperformula.mod

import typings.hyperformula.cellMod.CellValueJustNumber.NUMBER
import typings.hyperformula.cellMod.CellValueNoNumber.BOOLEAN
import typings.hyperformula.cellMod.CellValueNoNumber.EMPTY
import typings.hyperformula.cellMod.CellValueNoNumber.ERROR
import typings.hyperformula.cellMod.CellValueNoNumber.STRING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CellValueType {
  
  @JSImport("hyperformula", "CellValueType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula", "CellValueType.BOOLEAN")
  @js.native
  def BOOLEAN: typings.hyperformula.cellMod.CellValueNoNumber.BOOLEAN = js.native
  inline def BOOLEAN_=(x: BOOLEAN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula", "CellValueType.EMPTY")
  @js.native
  def EMPTY: typings.hyperformula.cellMod.CellValueNoNumber.EMPTY = js.native
  inline def EMPTY_=(x: EMPTY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula", "CellValueType.ERROR")
  @js.native
  def ERROR: typings.hyperformula.cellMod.CellValueNoNumber.ERROR = js.native
  inline def ERROR_=(x: ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula", "CellValueType.NUMBER")
  @js.native
  def NUMBER: typings.hyperformula.cellMod.CellValueJustNumber.NUMBER = js.native
  inline def NUMBER_=(x: NUMBER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula", "CellValueType.STRING")
  @js.native
  def STRING: typings.hyperformula.cellMod.CellValueNoNumber.STRING = js.native
  inline def STRING_=(x: STRING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
}
