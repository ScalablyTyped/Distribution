package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cluster extends js.Object {
  var cluster: kafkajsLib.kafkajsMod.Cluster
}

object Anon_Cluster {
  @scala.inline
  def apply(cluster: kafkajsLib.kafkajsMod.Cluster): Anon_Cluster = {
    val __obj = js.Dynamic.literal(cluster = cluster)
  
    __obj.asInstanceOf[Anon_Cluster]
  }
}

