package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcksBehaviour extends js.Object

@JSImport("kafkajs", "AcksBehaviour")
@js.native
object AcksBehaviour extends js.Object {
  @js.native
  sealed trait All
    extends kafkajsLib.kafkajsMod.AcksBehaviour
  
  @js.native
  sealed trait Leader
    extends kafkajsLib.kafkajsMod.AcksBehaviour
  
  @js.native
  sealed trait No
    extends kafkajsLib.kafkajsMod.AcksBehaviour
  
  /* -1 */ val All: All with scala.Double = js.native
  /* 1 */ val Leader: Leader with scala.Double = js.native
  /* 0 */ val No: No with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kafkajsLib.kafkajsMod.AcksBehaviour with scala.Double] = js.native
}

