package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryError extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "BinaryError")
@js.native
object BinaryError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryError & Double] = js.native
  
  @js.native
  sealed trait BADHEADERTABLE
    extends StObject
       with BinaryError
  /* 8 */ val BADHEADERTABLE: typings.libraCore.vmErrorsPbMod.BinaryError.BADHEADERTABLE & Double = js.native
  
  @js.native
  sealed trait BADMAGIC
    extends StObject
       with BinaryError
  /* 2 */ val BADMAGIC: typings.libraCore.vmErrorsPbMod.BinaryError.BADMAGIC & Double = js.native
  
  @js.native
  sealed trait DUPLICATETABLE
    extends StObject
       with BinaryError
  /* 10 */ val DUPLICATETABLE: typings.libraCore.vmErrorsPbMod.BinaryError.DUPLICATETABLE & Double = js.native
  
  @js.native
  sealed trait MALFORMED
    extends StObject
       with BinaryError
  /* 1 */ val MALFORMED: typings.libraCore.vmErrorsPbMod.BinaryError.MALFORMED & Double = js.native
  
  @js.native
  sealed trait UNEXPECTEDSIGNATURETYPE
    extends StObject
       with BinaryError
  /* 9 */ val UNEXPECTEDSIGNATURETYPE: typings.libraCore.vmErrorsPbMod.BinaryError.UNEXPECTEDSIGNATURETYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNBINARYERROR
    extends StObject
       with BinaryError
  /* 0 */ val UNKNOWNBINARYERROR: typings.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNBINARYERROR & Double = js.native
  
  @js.native
  sealed trait UNKNOWNOPCODE
    extends StObject
       with BinaryError
  /* 7 */ val UNKNOWNOPCODE: typings.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNOPCODE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNSERIALIZEDTYPE
    extends StObject
       with BinaryError
  /* 6 */ val UNKNOWNSERIALIZEDTYPE: typings.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNSERIALIZEDTYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNSIGNATURETYPE
    extends StObject
       with BinaryError
  /* 5 */ val UNKNOWNSIGNATURETYPE: typings.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNSIGNATURETYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNTABLETYPE
    extends StObject
       with BinaryError
  /* 4 */ val UNKNOWNTABLETYPE: typings.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNTABLETYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNVERSION
    extends StObject
       with BinaryError
  /* 3 */ val UNKNOWNVERSION: typings.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNVERSION & Double = js.native
}
