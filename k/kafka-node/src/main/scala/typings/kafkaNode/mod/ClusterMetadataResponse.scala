package typings.kafkaNode.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.kafkaNode.anon.ControllerId
import typings.kafkaNode.anon.Isr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMetadataResponse extends js.Object {
  var clusterMetadata: ControllerId
  var metadata: StringDictionary[NumberDictionary[Isr]]
}

object ClusterMetadataResponse {
  @scala.inline
  def apply(clusterMetadata: ControllerId, metadata: StringDictionary[NumberDictionary[Isr]]): ClusterMetadataResponse = {
    val __obj = js.Dynamic.literal(clusterMetadata = clusterMetadata.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMetadataResponse]
  }
}

