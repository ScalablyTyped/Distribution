package typings.kafkaDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Isr extends js.Object {
  var isr: js.Array[Double]
  var leader: Double
  var partition: Double
  var replicas: js.Array[Double]
  var topic: String
}

object Anon_Isr {
  @scala.inline
  def apply(
    isr: js.Array[Double],
    leader: Double,
    partition: Double,
    replicas: js.Array[Double],
    topic: String
  ): Anon_Isr = {
    val __obj = js.Dynamic.literal(isr = isr, leader = leader, partition = partition, replicas = replicas, topic = topic)
  
    __obj.asInstanceOf[Anon_Isr]
  }
}

