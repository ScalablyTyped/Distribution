package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraProgramArgumentType extends js.Object

@JSImport("libra-core", "LibraProgramArgumentType")
@js.native
object LibraProgramArgumentType extends js.Object {
  @js.native
  sealed trait ADDRESS extends LibraProgramArgumentType
  
  @js.native
  sealed trait BYTEARRAY extends LibraProgramArgumentType
  
  @js.native
  sealed trait STRING extends LibraProgramArgumentType
  
  @js.native
  sealed trait U64 extends LibraProgramArgumentType
  
  /* 1 */ val ADDRESS: typings.libraDashCore.libraDashCoreMod.LibraProgramArgumentType.ADDRESS with Double = js.native
  /* 3 */ val BYTEARRAY: typings.libraDashCore.libraDashCoreMod.LibraProgramArgumentType.BYTEARRAY with Double = js.native
  /* 2 */ val STRING: typings.libraDashCore.libraDashCoreMod.LibraProgramArgumentType.STRING with Double = js.native
  /* 0 */ val U64: typings.libraDashCore.libraDashCoreMod.LibraProgramArgumentType.U64 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraProgramArgumentType with Double] = js.native
}

