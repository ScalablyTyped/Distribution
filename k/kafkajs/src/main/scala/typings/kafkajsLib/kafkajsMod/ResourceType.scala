package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResourceType extends js.Object

@JSImport("kafkajs", "ResourceType")
@js.native
object ResourceType extends js.Object {
  @js.native
  sealed trait ANY
    extends kafkajsLib.kafkajsMod.ResourceType
  
  @js.native
  sealed trait CLUSTER
    extends kafkajsLib.kafkajsMod.ResourceType
  
  @js.native
  sealed trait DELEGATION_TOKEN
    extends kafkajsLib.kafkajsMod.ResourceType
  
  @js.native
  sealed trait GROUP
    extends kafkajsLib.kafkajsMod.ResourceType
  
  @js.native
  sealed trait TOPIC
    extends kafkajsLib.kafkajsMod.ResourceType
  
  @js.native
  sealed trait TRANSACTIONAL_ID
    extends kafkajsLib.kafkajsMod.ResourceType
  
  @js.native
  sealed trait UNKNOWN
    extends kafkajsLib.kafkajsMod.ResourceType
  
  /* 1 */ val ANY: ANY with scala.Double = js.native
  /* 4 */ val CLUSTER: CLUSTER with scala.Double = js.native
  /* 6 */ val DELEGATION_TOKEN: DELEGATION_TOKEN with scala.Double = js.native
  /* 3 */ val GROUP: GROUP with scala.Double = js.native
  /* 2 */ val TOPIC: TOPIC with scala.Double = js.native
  /* 5 */ val TRANSACTIONAL_ID: TRANSACTIONAL_ID with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kafkajsLib.kafkajsMod.ResourceType with scala.Double] = js.native
}

