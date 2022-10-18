package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PartitionAssigners {
  
  @JSImport("kafkajs", "PartitionAssigners")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kafkajs", "PartitionAssigners.roundRobin")
  @js.native
  def roundRobin: PartitionAssigner = js.native
  inline def roundRobin(config: typings.kafkajs.anon.Cluster): Assigner = ^.asInstanceOf[js.Dynamic].applyDynamic("roundRobin")(config.asInstanceOf[js.Any]).asInstanceOf[Assigner]
  inline def roundRobin_=(x: PartitionAssigner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundRobin")(x.asInstanceOf[js.Any])
}
