package typings.kafkaDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Partition extends js.Object {
  var partition: Double
  var replicas: js.Array[Double]
}

object Anon_Partition {
  @scala.inline
  def apply(partition: Double, replicas: js.Array[Double]): Anon_Partition = {
    val __obj = js.Dynamic.literal(partition = partition, replicas = replicas)
  
    __obj.asInstanceOf[Anon_Partition]
  }
}

