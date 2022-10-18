package typings.hyperformula.typingsCellMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellType extends StObject
@JSImport("hyperformula/typings/Cell", "CellType")
@js.native
object CellType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CellType & String] = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with CellType
  /* "ARRAY" */ val ARRAY: typings.hyperformula.typingsCellMod.CellType.ARRAY & String = js.native
  
  @js.native
  sealed trait ARRAYFORMULA
    extends StObject
       with CellType
  /* "ARRAYFORMULA" */ val ARRAYFORMULA: typings.hyperformula.typingsCellMod.CellType.ARRAYFORMULA & String = js.native
  
  @js.native
  sealed trait EMPTY
    extends StObject
       with CellType
  /* "EMPTY" */ val EMPTY: typings.hyperformula.typingsCellMod.CellType.EMPTY & String = js.native
  
  @js.native
  sealed trait FORMULA
    extends StObject
       with CellType
  /* "FORMULA" */ val FORMULA: typings.hyperformula.typingsCellMod.CellType.FORMULA & String = js.native
  
  @js.native
  sealed trait VALUE
    extends StObject
       with CellType
  /* "VALUE" */ val VALUE: typings.hyperformula.typingsCellMod.CellType.VALUE & String = js.native
}
