package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AclOperationTypes extends StObject
@JSImport("kafkajs", "AclOperationTypes")
@js.native
object AclOperationTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AclOperationTypes & Double] = js.native
  
  @js.native
  sealed trait ALL
    extends StObject
       with AclOperationTypes
  /* 2 */ val ALL: typings.kafkajs.mod.AclOperationTypes.ALL & Double = js.native
  
  @js.native
  sealed trait ALTER
    extends StObject
       with AclOperationTypes
  /* 7 */ val ALTER: typings.kafkajs.mod.AclOperationTypes.ALTER & Double = js.native
  
  @js.native
  sealed trait ALTER_CONFIGS
    extends StObject
       with AclOperationTypes
  /* 11 */ val ALTER_CONFIGS: typings.kafkajs.mod.AclOperationTypes.ALTER_CONFIGS & Double = js.native
  
  @js.native
  sealed trait ANY
    extends StObject
       with AclOperationTypes
  /* 1 */ val ANY: typings.kafkajs.mod.AclOperationTypes.ANY & Double = js.native
  
  @js.native
  sealed trait CLUSTER_ACTION
    extends StObject
       with AclOperationTypes
  /* 9 */ val CLUSTER_ACTION: typings.kafkajs.mod.AclOperationTypes.CLUSTER_ACTION & Double = js.native
  
  @js.native
  sealed trait CREATE
    extends StObject
       with AclOperationTypes
  /* 5 */ val CREATE: typings.kafkajs.mod.AclOperationTypes.CREATE & Double = js.native
  
  @js.native
  sealed trait DELETE
    extends StObject
       with AclOperationTypes
  /* 6 */ val DELETE: typings.kafkajs.mod.AclOperationTypes.DELETE & Double = js.native
  
  @js.native
  sealed trait DESCRIBE
    extends StObject
       with AclOperationTypes
  /* 8 */ val DESCRIBE: typings.kafkajs.mod.AclOperationTypes.DESCRIBE & Double = js.native
  
  @js.native
  sealed trait DESCRIBE_CONFIGS
    extends StObject
       with AclOperationTypes
  /* 10 */ val DESCRIBE_CONFIGS: typings.kafkajs.mod.AclOperationTypes.DESCRIBE_CONFIGS & Double = js.native
  
  @js.native
  sealed trait IDEMPOTENT_WRITE
    extends StObject
       with AclOperationTypes
  /* 12 */ val IDEMPOTENT_WRITE: typings.kafkajs.mod.AclOperationTypes.IDEMPOTENT_WRITE & Double = js.native
  
  @js.native
  sealed trait READ
    extends StObject
       with AclOperationTypes
  /* 3 */ val READ: typings.kafkajs.mod.AclOperationTypes.READ & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with AclOperationTypes
  /* 0 */ val UNKNOWN: typings.kafkajs.mod.AclOperationTypes.UNKNOWN & Double = js.native
  
  @js.native
  sealed trait WRITE
    extends StObject
       with AclOperationTypes
  /* 4 */ val WRITE: typings.kafkajs.mod.AclOperationTypes.WRITE & Double = js.native
}
