package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResourceTypes extends js.Object

@JSImport("kafkajs", "ResourceTypes")
@js.native
object ResourceTypes extends js.Object {
  @js.native
  sealed trait ANY
    extends kafkajsLib.kafkajsMod.ResourceTypes
  
  @js.native
  sealed trait CLUSTER
    extends kafkajsLib.kafkajsMod.ResourceTypes
  
  @js.native
  sealed trait DELEGATION_TOKEN
    extends kafkajsLib.kafkajsMod.ResourceTypes
  
  @js.native
  sealed trait GROUP
    extends kafkajsLib.kafkajsMod.ResourceTypes
  
  @js.native
  sealed trait TOPIC
    extends kafkajsLib.kafkajsMod.ResourceTypes
  
  @js.native
  sealed trait TRANSACTIONAL_ID
    extends kafkajsLib.kafkajsMod.ResourceTypes
  
  @js.native
  sealed trait UNKNOWN
    extends kafkajsLib.kafkajsMod.ResourceTypes
  
  /* 1 */ val ANY: ANY with scala.Double = js.native
  /* 4 */ val CLUSTER: CLUSTER with scala.Double = js.native
  /* 6 */ val DELEGATION_TOKEN: DELEGATION_TOKEN with scala.Double = js.native
  /* 3 */ val GROUP: GROUP with scala.Double = js.native
  /* 2 */ val TOPIC: TOPIC with scala.Double = js.native
  /* 5 */ val TRANSACTIONAL_ID: TRANSACTIONAL_ID with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kafkajsLib.kafkajsMod.ResourceTypes with scala.Double] = js.native
}

