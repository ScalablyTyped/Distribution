package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResourceTypes extends js.Object

@JSImport("kafkajs", "ResourceTypes")
@js.native
object ResourceTypes extends js.Object {
  @js.native
  sealed trait ANY extends ResourceTypes
  
  @js.native
  sealed trait CLUSTER extends ResourceTypes
  
  @js.native
  sealed trait DELEGATION_TOKEN extends ResourceTypes
  
  @js.native
  sealed trait GROUP extends ResourceTypes
  
  @js.native
  sealed trait TOPIC extends ResourceTypes
  
  @js.native
  sealed trait TRANSACTIONAL_ID extends ResourceTypes
  
  @js.native
  sealed trait UNKNOWN extends ResourceTypes
  
  /* 1 */ val ANY: typings.kafkajs.kafkajsMod.ResourceTypes.ANY with Double = js.native
  /* 4 */ val CLUSTER: typings.kafkajs.kafkajsMod.ResourceTypes.CLUSTER with Double = js.native
  /* 6 */ val DELEGATION_TOKEN: typings.kafkajs.kafkajsMod.ResourceTypes.DELEGATION_TOKEN with Double = js.native
  /* 3 */ val GROUP: typings.kafkajs.kafkajsMod.ResourceTypes.GROUP with Double = js.native
  /* 2 */ val TOPIC: typings.kafkajs.kafkajsMod.ResourceTypes.TOPIC with Double = js.native
  /* 5 */ val TRANSACTIONAL_ID: typings.kafkajs.kafkajsMod.ResourceTypes.TRANSACTIONAL_ID with Double = js.native
  /* 0 */ val UNKNOWN: typings.kafkajs.kafkajsMod.ResourceTypes.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResourceTypes with Double] = js.native
}

