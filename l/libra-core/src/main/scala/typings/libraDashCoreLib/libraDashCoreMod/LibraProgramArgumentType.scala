package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraProgramArgumentType extends js.Object

@JSImport("libra-core", "LibraProgramArgumentType")
@js.native
object LibraProgramArgumentType extends js.Object {
  @js.native
  sealed trait ADDRESS
    extends libraDashCoreLib.libraDashCoreMod.LibraProgramArgumentType
  
  @js.native
  sealed trait BYTEARRAY
    extends libraDashCoreLib.libraDashCoreMod.LibraProgramArgumentType
  
  @js.native
  sealed trait STRING
    extends libraDashCoreLib.libraDashCoreMod.LibraProgramArgumentType
  
  @js.native
  sealed trait U64
    extends libraDashCoreLib.libraDashCoreMod.LibraProgramArgumentType
  
  /* 1 */ val ADDRESS: ADDRESS with scala.Double = js.native
  /* 3 */ val BYTEARRAY: BYTEARRAY with scala.Double = js.native
  /* 2 */ val STRING: STRING with scala.Double = js.native
  /* 0 */ val U64: U64 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraProgramArgumentType with scala.Double] = js.native
}

