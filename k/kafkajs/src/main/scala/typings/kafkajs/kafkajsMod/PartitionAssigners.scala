package typings.kafkajs.kafkajsMod

import typings.kafkajs.Anon_Assign
import typings.kafkajs.Anon_Cluster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafkajs", "PartitionAssigners")
@js.native
object PartitionAssigners extends js.Object {
  @JSName("roundRobin")
  var roundRobin_Original: PartitionAssigner = js.native
  def roundRobin(hasCluster: Anon_Cluster): Anon_Assign = js.native
}

