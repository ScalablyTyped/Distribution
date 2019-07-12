package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraDeserializationError extends js.Object

@JSImport("libra-core", "LibraDeserializationError")
@js.native
object LibraDeserializationError extends js.Object {
  @js.native
  sealed trait BADHEADERTABLE
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait BADMAGIC
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait DUPLICATETABLE
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait MALFORMED
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait UNEXPECTEDSIGNATURETYPE
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNBINARYERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNOPCODE
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNSERIALIZEDTYPE
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNSIGNATURETYPE
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNTABLETYPE
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  @js.native
  sealed trait UNKNOWNVERSION
    extends libraDashCoreLib.libraDashCoreMod.LibraDeserializationError
  
  /* 8 */ val BADHEADERTABLE: BADHEADERTABLE with scala.Double = js.native
  /* 2 */ val BADMAGIC: BADMAGIC with scala.Double = js.native
  /* 10 */ val DUPLICATETABLE: DUPLICATETABLE with scala.Double = js.native
  /* 1 */ val MALFORMED: MALFORMED with scala.Double = js.native
  /* 9 */ val UNEXPECTEDSIGNATURETYPE: UNEXPECTEDSIGNATURETYPE with scala.Double = js.native
  /* 0 */ val UNKNOWNBINARYERROR: UNKNOWNBINARYERROR with scala.Double = js.native
  /* 7 */ val UNKNOWNOPCODE: UNKNOWNOPCODE with scala.Double = js.native
  /* 6 */ val UNKNOWNSERIALIZEDTYPE: UNKNOWNSERIALIZEDTYPE with scala.Double = js.native
  /* 5 */ val UNKNOWNSIGNATURETYPE: UNKNOWNSIGNATURETYPE with scala.Double = js.native
  /* 4 */ val UNKNOWNTABLETYPE: UNKNOWNTABLETYPE with scala.Double = js.native
  /* 3 */ val UNKNOWNVERSION: UNKNOWNVERSION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraDeserializationError with scala.Double] = js.native
}

