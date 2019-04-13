package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafkajs", "PartitionAssigners")
@js.native
object PartitionAssigners extends js.Object {
  @JSName("roundRobin")
  var roundRobin_Original: kafkajsLib.kafkajsMod.PartitionAssigner = js.native
  def roundRobin(hasCluster: kafkajsLib.Anon_Cluster): kafkajsLib.Anon_Assign = js.native
}

