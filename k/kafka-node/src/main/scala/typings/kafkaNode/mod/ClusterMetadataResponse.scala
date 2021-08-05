package typings.kafkaNode.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.kafkaNode.anon.ControllerId
import typings.kafkaNode.anon.Isr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMetadataResponse extends StObject {
  
  var clusterMetadata: ControllerId
  
  var metadata: StringDictionary[NumberDictionary[Isr]]
}
object ClusterMetadataResponse {
  
  inline def apply(clusterMetadata: ControllerId, metadata: StringDictionary[NumberDictionary[Isr]]): ClusterMetadataResponse = {
    val __obj = js.Dynamic.literal(clusterMetadata = clusterMetadata.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMetadataResponse]
  }
  
  extension [Self <: ClusterMetadataResponse](x: Self) {
    
    inline def setClusterMetadata(value: ControllerId): Self = StObject.set(x, "clusterMetadata", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[NumberDictionary[Isr]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
