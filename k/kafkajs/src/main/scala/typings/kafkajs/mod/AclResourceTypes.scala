package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AclResourceTypes extends StObject
@JSImport("kafkajs", "AclResourceTypes")
@js.native
object AclResourceTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AclResourceTypes & Double] = js.native
  
  @js.native
  sealed trait ANY
    extends StObject
       with AclResourceTypes
  /* 1 */ val ANY: typings.kafkajs.mod.AclResourceTypes.ANY & Double = js.native
  
  @js.native
  sealed trait CLUSTER
    extends StObject
       with AclResourceTypes
  /* 4 */ val CLUSTER: typings.kafkajs.mod.AclResourceTypes.CLUSTER & Double = js.native
  
  @js.native
  sealed trait DELEGATION_TOKEN
    extends StObject
       with AclResourceTypes
  /* 6 */ val DELEGATION_TOKEN: typings.kafkajs.mod.AclResourceTypes.DELEGATION_TOKEN & Double = js.native
  
  @js.native
  sealed trait GROUP
    extends StObject
       with AclResourceTypes
  /* 3 */ val GROUP: typings.kafkajs.mod.AclResourceTypes.GROUP & Double = js.native
  
  @js.native
  sealed trait TOPIC
    extends StObject
       with AclResourceTypes
  /* 2 */ val TOPIC: typings.kafkajs.mod.AclResourceTypes.TOPIC & Double = js.native
  
  @js.native
  sealed trait TRANSACTIONAL_ID
    extends StObject
       with AclResourceTypes
  /* 5 */ val TRANSACTIONAL_ID: typings.kafkajs.mod.AclResourceTypes.TRANSACTIONAL_ID & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with AclResourceTypes
  /* 0 */ val UNKNOWN: typings.kafkajs.mod.AclResourceTypes.UNKNOWN & Double = js.native
}
