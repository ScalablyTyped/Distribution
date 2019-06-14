package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brokers extends js.Object {
  var brokers: js.Array[Anon_Host]
  var topicMetadata: js.Array[Anon_PartitionMetadata]
}

object Anon_Brokers {
  @scala.inline
  def apply(brokers: js.Array[Anon_Host], topicMetadata: js.Array[Anon_PartitionMetadata]): Anon_Brokers = {
    val __obj = js.Dynamic.literal(brokers = brokers, topicMetadata = topicMetadata)
  
    __obj.asInstanceOf[Anon_Brokers]
  }
}

