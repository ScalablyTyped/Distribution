package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcksBehaviour extends js.Object

@JSImport("kafkajs", "AcksBehaviour")
@js.native
object AcksBehaviour extends js.Object {
  @js.native
  sealed trait All extends AcksBehaviour
  
  @js.native
  sealed trait Leader extends AcksBehaviour
  
  @js.native
  sealed trait No extends AcksBehaviour
  
  /* -1 */ val All: typings.kafkajs.kafkajsMod.AcksBehaviour.All with Double = js.native
  /* 1 */ val Leader: typings.kafkajs.kafkajsMod.AcksBehaviour.Leader with Double = js.native
  /* 0 */ val No: typings.kafkajs.kafkajsMod.AcksBehaviour.No with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcksBehaviour with Double] = js.native
}

