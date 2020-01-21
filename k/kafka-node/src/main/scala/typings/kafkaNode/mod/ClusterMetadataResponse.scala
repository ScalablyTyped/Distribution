package typings.kafkaNode.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.kafkaNode.AnonControllerId
import typings.kafkaNode.AnonIsr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMetadataResponse extends js.Object {
  var clusterMetadata: AnonControllerId
  var metadata: StringDictionary[NumberDictionary[AnonIsr]]
}

object ClusterMetadataResponse {
  @scala.inline
  def apply(clusterMetadata: AnonControllerId, metadata: StringDictionary[NumberDictionary[AnonIsr]]): ClusterMetadataResponse = {
    val __obj = js.Dynamic.literal(clusterMetadata = clusterMetadata.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterMetadataResponse]
  }
}

