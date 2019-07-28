package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraDeserializationError extends js.Object

@JSImport("libra-core", "LibraDeserializationError")
@js.native
object LibraDeserializationError extends js.Object {
  @js.native
  sealed trait BADHEADERTABLE extends LibraDeserializationError
  
  @js.native
  sealed trait BADMAGIC extends LibraDeserializationError
  
  @js.native
  sealed trait DUPLICATETABLE extends LibraDeserializationError
  
  @js.native
  sealed trait MALFORMED extends LibraDeserializationError
  
  @js.native
  sealed trait UNEXPECTEDSIGNATURETYPE extends LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNBINARYERROR extends LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNOPCODE extends LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNSERIALIZEDTYPE extends LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNSIGNATURETYPE extends LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNTABLETYPE extends LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNVERSION extends LibraDeserializationError
  
  /* 8 */ val BADHEADERTABLE: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.BADHEADERTABLE with Double = js.native
  /* 2 */ val BADMAGIC: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.BADMAGIC with Double = js.native
  /* 10 */ val DUPLICATETABLE: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.DUPLICATETABLE with Double = js.native
  /* 1 */ val MALFORMED: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.MALFORMED with Double = js.native
  /* 9 */ val UNEXPECTEDSIGNATURETYPE: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.UNEXPECTEDSIGNATURETYPE with Double = js.native
  /* 0 */ val UNKNOWNBINARYERROR: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.UNKNOWNBINARYERROR with Double = js.native
  /* 7 */ val UNKNOWNOPCODE: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.UNKNOWNOPCODE with Double = js.native
  /* 6 */ val UNKNOWNSERIALIZEDTYPE: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.UNKNOWNSERIALIZEDTYPE with Double = js.native
  /* 5 */ val UNKNOWNSIGNATURETYPE: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.UNKNOWNSIGNATURETYPE with Double = js.native
  /* 4 */ val UNKNOWNTABLETYPE: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.UNKNOWNTABLETYPE with Double = js.native
  /* 3 */ val UNKNOWNVERSION: typings.libraDashCore.libraDashCoreMod.LibraDeserializationError.UNKNOWNVERSION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraDeserializationError with Double] = js.native
}

