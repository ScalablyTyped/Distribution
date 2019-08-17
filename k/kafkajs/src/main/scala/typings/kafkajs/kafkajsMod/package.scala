package typings.kafkajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kafkajsMod {
  import typings.kafkajs.Anon_Assign
  import typings.kafkajs.Anon_Cluster

  type PartitionAssigner = js.Function1[/* hasCluster */ Anon_Cluster, Anon_Assign]
}
