package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryError extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "BinaryError")
@js.native
object BinaryError extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryError with Double] = js.native
  
  @js.native
  sealed trait BADHEADERTABLE extends BinaryError
  /* 8 */ @js.native
  object BADHEADERTABLE extends TopLevel[BADHEADERTABLE with Double]
  
  @js.native
  sealed trait BADMAGIC extends BinaryError
  /* 2 */ @js.native
  object BADMAGIC extends TopLevel[BADMAGIC with Double]
  
  @js.native
  sealed trait DUPLICATETABLE extends BinaryError
  /* 10 */ @js.native
  object DUPLICATETABLE extends TopLevel[DUPLICATETABLE with Double]
  
  @js.native
  sealed trait MALFORMED extends BinaryError
  /* 1 */ @js.native
  object MALFORMED extends TopLevel[MALFORMED with Double]
  
  @js.native
  sealed trait UNEXPECTEDSIGNATURETYPE extends BinaryError
  /* 9 */ @js.native
  object UNEXPECTEDSIGNATURETYPE extends TopLevel[UNEXPECTEDSIGNATURETYPE with Double]
  
  @js.native
  sealed trait UNKNOWNBINARYERROR extends BinaryError
  /* 0 */ @js.native
  object UNKNOWNBINARYERROR extends TopLevel[UNKNOWNBINARYERROR with Double]
  
  @js.native
  sealed trait UNKNOWNOPCODE extends BinaryError
  /* 7 */ @js.native
  object UNKNOWNOPCODE extends TopLevel[UNKNOWNOPCODE with Double]
  
  @js.native
  sealed trait UNKNOWNSERIALIZEDTYPE extends BinaryError
  /* 6 */ @js.native
  object UNKNOWNSERIALIZEDTYPE extends TopLevel[UNKNOWNSERIALIZEDTYPE with Double]
  
  @js.native
  sealed trait UNKNOWNSIGNATURETYPE extends BinaryError
  /* 5 */ @js.native
  object UNKNOWNSIGNATURETYPE extends TopLevel[UNKNOWNSIGNATURETYPE with Double]
  
  @js.native
  sealed trait UNKNOWNTABLETYPE extends BinaryError
  /* 4 */ @js.native
  object UNKNOWNTABLETYPE extends TopLevel[UNKNOWNTABLETYPE with Double]
  
  @js.native
  sealed trait UNKNOWNVERSION extends BinaryError
  /* 3 */ @js.native
  object UNKNOWNVERSION extends TopLevel[UNKNOWNVERSION with Double]
}
