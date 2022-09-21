package typings.hyperformula.cellMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellValueNoNumber
  extends StObject
     with CellValueDetailedType
     with CellValueType
@JSImport("hyperformula/typings/Cell", "CellValueNoNumber")
@js.native
object CellValueNoNumber extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CellValueNoNumber & String] = js.native
  
  @js.native
  sealed trait BOOLEAN
    extends StObject
       with CellValueNoNumber
  /* "BOOLEAN" */ val BOOLEAN: typings.hyperformula.cellMod.CellValueNoNumber.BOOLEAN & String = js.native
  
  @js.native
  sealed trait EMPTY
    extends StObject
       with CellValueNoNumber
  /* "EMPTY" */ val EMPTY: typings.hyperformula.cellMod.CellValueNoNumber.EMPTY & String = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with CellValueNoNumber
  /* "ERROR" */ val ERROR: typings.hyperformula.cellMod.CellValueNoNumber.ERROR & String = js.native
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with CellValueNoNumber
  /* "NUMBER" */ val NUMBER: typings.hyperformula.cellMod.CellValueNoNumber.NUMBER & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with CellValueNoNumber
  /* "STRING" */ val STRING: typings.hyperformula.cellMod.CellValueNoNumber.STRING & String = js.native
}
