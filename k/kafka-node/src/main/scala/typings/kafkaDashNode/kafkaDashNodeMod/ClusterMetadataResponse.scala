package typings.kafkaDashNode.kafkaDashNodeMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.kafkaDashNode.Anon_ControllerId
import typings.kafkaDashNode.Anon_Isr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMetadataResponse extends js.Object {
  var clusterMetadata: Anon_ControllerId
  var metadata: StringDictionary[NumberDictionary[Anon_Isr]]
}

object ClusterMetadataResponse {
  @scala.inline
  def apply(clusterMetadata: Anon_ControllerId, metadata: StringDictionary[NumberDictionary[Anon_Isr]]): ClusterMetadataResponse = {
    val __obj = js.Dynamic.literal(clusterMetadata = clusterMetadata, metadata = metadata)
  
    __obj.asInstanceOf[ClusterMetadataResponse]
  }
}

