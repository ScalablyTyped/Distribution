package typings.hyperformula.cellMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorType extends StObject
@JSImport("hyperformula/typings/Cell", "ErrorType")
@js.native
object ErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorType & String] = js.native
  
  /** Cyclic dependency. */
  @js.native
  sealed trait CYCLE
    extends StObject
       with ErrorType
  /* "CYCLE" */ val CYCLE: typings.hyperformula.cellMod.ErrorType.CYCLE & String = js.native
  
  /** Division by zero. */
  @js.native
  sealed trait DIV_BY_ZERO
    extends StObject
       with ErrorType
  /* "DIV_BY_ZERO" */ val DIV_BY_ZERO: typings.hyperformula.cellMod.ErrorType.DIV_BY_ZERO & String = js.native
  
  /** Generic error */
  @js.native
  sealed trait ERROR
    extends StObject
       with ErrorType
  /* "ERROR" */ val ERROR: typings.hyperformula.cellMod.ErrorType.ERROR & String = js.native
  
  /** Invalid/missing licence error. */
  @js.native
  sealed trait LIC
    extends StObject
       with ErrorType
  /* "LIC" */ val LIC: typings.hyperformula.cellMod.ErrorType.LIC & String = js.native
  
  @js.native
  sealed trait NA
    extends StObject
       with ErrorType
  /* "NA" */ val NA: typings.hyperformula.cellMod.ErrorType.NA & String = js.native
  
  /** Unknown function name. */
  @js.native
  sealed trait NAME
    extends StObject
       with ErrorType
  /* "NAME" */ val NAME: typings.hyperformula.cellMod.ErrorType.NAME & String = js.native
  
  @js.native
  sealed trait NUM
    extends StObject
       with ErrorType
  /* "NUM" */ val NUM: typings.hyperformula.cellMod.ErrorType.NUM & String = js.native
  
  /** Wrong address reference. */
  @js.native
  sealed trait REF
    extends StObject
       with ErrorType
  /* "REF" */ val REF: typings.hyperformula.cellMod.ErrorType.REF & String = js.native
  
  /** Array spill error. */
  @js.native
  sealed trait SPILL
    extends StObject
       with ErrorType
  /* "SPILL" */ val SPILL: typings.hyperformula.cellMod.ErrorType.SPILL & String = js.native
  
  @js.native
  sealed trait VALUE
    extends StObject
       with ErrorType
  /* "VALUE" */ val VALUE: typings.hyperformula.cellMod.ErrorType.VALUE & String = js.native
}
