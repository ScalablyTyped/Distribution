package typings.hyperformula.typingsParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RangeSheetReferenceType extends StObject
@JSImport("hyperformula/typings/parser/Ast", "RangeSheetReferenceType")
@js.native
object RangeSheetReferenceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeSheetReferenceType & Double] = js.native
  
  @js.native
  sealed trait BOTH_ABSOLUTE
    extends StObject
       with RangeSheetReferenceType
  /* 2 */ val BOTH_ABSOLUTE: typings.hyperformula.typingsParserAstMod.RangeSheetReferenceType.BOTH_ABSOLUTE & Double = js.native
  
  @js.native
  sealed trait RELATIVE
    extends StObject
       with RangeSheetReferenceType
  /* 0 */ val RELATIVE: typings.hyperformula.typingsParserAstMod.RangeSheetReferenceType.RELATIVE & Double = js.native
  
  @js.native
  sealed trait START_ABSOLUTE
    extends StObject
       with RangeSheetReferenceType
  /* 1 */ val START_ABSOLUTE: typings.hyperformula.typingsParserAstMod.RangeSheetReferenceType.START_ABSOLUTE & Double = js.native
}
