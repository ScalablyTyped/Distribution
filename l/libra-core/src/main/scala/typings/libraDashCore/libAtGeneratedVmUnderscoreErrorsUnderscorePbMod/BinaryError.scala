package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BinaryError extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "BinaryError")
@js.native
object BinaryError extends js.Object {
  @js.native
  sealed trait BADHEADERTABLE extends BinaryError
  
  @js.native
  sealed trait BADMAGIC extends BinaryError
  
  @js.native
  sealed trait DUPLICATETABLE extends BinaryError
  
  @js.native
  sealed trait MALFORMED extends BinaryError
  
  @js.native
  sealed trait UNEXPECTEDSIGNATURETYPE extends BinaryError
  
  @js.native
  sealed trait UNKNOWNBINARYERROR extends BinaryError
  
  @js.native
  sealed trait UNKNOWNOPCODE extends BinaryError
  
  @js.native
  sealed trait UNKNOWNSERIALIZEDTYPE extends BinaryError
  
  @js.native
  sealed trait UNKNOWNSIGNATURETYPE extends BinaryError
  
  @js.native
  sealed trait UNKNOWNTABLETYPE extends BinaryError
  
  @js.native
  sealed trait UNKNOWNVERSION extends BinaryError
  
  /* 8 */ val BADHEADERTABLE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.BADHEADERTABLE with Double = js.native
  /* 2 */ val BADMAGIC: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.BADMAGIC with Double = js.native
  /* 10 */ val DUPLICATETABLE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.DUPLICATETABLE with Double = js.native
  /* 1 */ val MALFORMED: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.MALFORMED with Double = js.native
  /* 9 */ val UNEXPECTEDSIGNATURETYPE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.UNEXPECTEDSIGNATURETYPE with Double = js.native
  /* 0 */ val UNKNOWNBINARYERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.UNKNOWNBINARYERROR with Double = js.native
  /* 7 */ val UNKNOWNOPCODE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.UNKNOWNOPCODE with Double = js.native
  /* 6 */ val UNKNOWNSERIALIZEDTYPE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.UNKNOWNSERIALIZEDTYPE with Double = js.native
  /* 5 */ val UNKNOWNSIGNATURETYPE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.UNKNOWNSIGNATURETYPE with Double = js.native
  /* 4 */ val UNKNOWNTABLETYPE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.UNKNOWNTABLETYPE with Double = js.native
  /* 3 */ val UNKNOWNVERSION: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError.UNKNOWNVERSION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryError with Double] = js.native
}

