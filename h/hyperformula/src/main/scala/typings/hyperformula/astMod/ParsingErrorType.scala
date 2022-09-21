package typings.hyperformula.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParsingErrorType extends StObject
@JSImport("hyperformula/typings/parser/Ast", "ParsingErrorType")
@js.native
object ParsingErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParsingErrorType & String] = js.native
  
  @js.native
  sealed trait LexingError
    extends StObject
       with ParsingErrorType
  /* "LexingError" */ val LexingError: typings.hyperformula.astMod.ParsingErrorType.LexingError & String = js.native
  
  @js.native
  sealed trait ParserError
    extends StObject
       with ParsingErrorType
  /* "ParsingError" */ val ParserError: typings.hyperformula.astMod.ParsingErrorType.ParserError & String = js.native
  
  @js.native
  sealed trait RangeOffsetNotAllowed
    extends StObject
       with ParsingErrorType
  /* "RangeOffsetNotAllowed" */ val RangeOffsetNotAllowed: typings.hyperformula.astMod.ParsingErrorType.RangeOffsetNotAllowed & String = js.native
  
  @js.native
  sealed trait StaticOffsetError
    extends StObject
       with ParsingErrorType
  /* "StaticOffsetError" */ val StaticOffsetError: typings.hyperformula.astMod.ParsingErrorType.StaticOffsetError & String = js.native
  
  @js.native
  sealed trait StaticOffsetOutOfRangeError
    extends StObject
       with ParsingErrorType
  /* "StaticOffsetOutOfRangeError" */ val StaticOffsetOutOfRangeError: typings.hyperformula.astMod.ParsingErrorType.StaticOffsetOutOfRangeError & String = js.native
}
