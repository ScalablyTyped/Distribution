package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsumerConfig extends StObject {
  
  /**
    * Represents one or multiple Cloud SQL configurations.
    */
  var cloudsqlConfigs: js.UndefOr[js.Array[SchemaCloudSQLConfig]] = js.undefined
  
  /**
    * Export custom routes flag value for peering from consumer to producer.
    */
  var consumerExportCustomRoutes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Export subnet routes with public ip flag value for peering from consumer to producer.
    */
  var consumerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Import custom routes flag value for peering from consumer to producer.
    */
  var consumerImportCustomRoutes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Import subnet routes with public ip flag value for peering from consumer to producer.
    */
  var consumerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Export custom routes flag value for peering from producer to consumer.
    */
  var producerExportCustomRoutes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Export subnet routes with public ip flag value for peering from producer to consumer.
    */
  var producerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Import custom routes flag value for peering from producer to consumer.
    */
  var producerImportCustomRoutes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Import subnet routes with public ip flag value for peering from producer to consumer.
    */
  var producerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The VPC host network that is used to host managed service instances. In the format, projects/{project\}/global/networks/{network\} where {project\} is the project number e.g. '12345' and {network\} is the network name.
    */
  var producerNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The reserved ranges associated with this private service access connection.
    */
  var reservedRanges: js.UndefOr[js.Array[SchemaGoogleCloudServicenetworkingV1ConsumerConfigReservedRange]] = js.undefined
  
  /**
    * Output only. The IP ranges already in use by consumer or producer
    */
  var usedIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the VPC Service Controls reference architecture is configured for the producer VPC host network.
    */
  var vpcScReferenceArchitectureEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConsumerConfig {
  
  inline def apply(): SchemaConsumerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumerConfig]
  }
  
  extension [Self <: SchemaConsumerConfig](x: Self) {
    
    inline def setCloudsqlConfigs(value: js.Array[SchemaCloudSQLConfig]): Self = StObject.set(x, "cloudsqlConfigs", value.asInstanceOf[js.Any])
    
    inline def setCloudsqlConfigsUndefined: Self = StObject.set(x, "cloudsqlConfigs", js.undefined)
    
    inline def setCloudsqlConfigsVarargs(value: SchemaCloudSQLConfig*): Self = StObject.set(x, "cloudsqlConfigs", js.Array(value*))
    
    inline def setConsumerExportCustomRoutes(value: Boolean): Self = StObject.set(x, "consumerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setConsumerExportCustomRoutesNull: Self = StObject.set(x, "consumerExportCustomRoutes", null)
    
    inline def setConsumerExportCustomRoutesUndefined: Self = StObject.set(x, "consumerExportCustomRoutes", js.undefined)
    
    inline def setConsumerExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "consumerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setConsumerExportSubnetRoutesWithPublicIpNull: Self = StObject.set(x, "consumerExportSubnetRoutesWithPublicIp", null)
    
    inline def setConsumerExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "consumerExportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setConsumerImportCustomRoutes(value: Boolean): Self = StObject.set(x, "consumerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setConsumerImportCustomRoutesNull: Self = StObject.set(x, "consumerImportCustomRoutes", null)
    
    inline def setConsumerImportCustomRoutesUndefined: Self = StObject.set(x, "consumerImportCustomRoutes", js.undefined)
    
    inline def setConsumerImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "consumerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setConsumerImportSubnetRoutesWithPublicIpNull: Self = StObject.set(x, "consumerImportSubnetRoutesWithPublicIp", null)
    
    inline def setConsumerImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "consumerImportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setProducerExportCustomRoutes(value: Boolean): Self = StObject.set(x, "producerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setProducerExportCustomRoutesNull: Self = StObject.set(x, "producerExportCustomRoutes", null)
    
    inline def setProducerExportCustomRoutesUndefined: Self = StObject.set(x, "producerExportCustomRoutes", js.undefined)
    
    inline def setProducerExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "producerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setProducerExportSubnetRoutesWithPublicIpNull: Self = StObject.set(x, "producerExportSubnetRoutesWithPublicIp", null)
    
    inline def setProducerExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "producerExportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setProducerImportCustomRoutes(value: Boolean): Self = StObject.set(x, "producerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setProducerImportCustomRoutesNull: Self = StObject.set(x, "producerImportCustomRoutes", null)
    
    inline def setProducerImportCustomRoutesUndefined: Self = StObject.set(x, "producerImportCustomRoutes", js.undefined)
    
    inline def setProducerImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "producerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setProducerImportSubnetRoutesWithPublicIpNull: Self = StObject.set(x, "producerImportSubnetRoutesWithPublicIp", null)
    
    inline def setProducerImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "producerImportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setProducerNetwork(value: String): Self = StObject.set(x, "producerNetwork", value.asInstanceOf[js.Any])
    
    inline def setProducerNetworkNull: Self = StObject.set(x, "producerNetwork", null)
    
    inline def setProducerNetworkUndefined: Self = StObject.set(x, "producerNetwork", js.undefined)
    
    inline def setReservedRanges(value: js.Array[SchemaGoogleCloudServicenetworkingV1ConsumerConfigReservedRange]): Self = StObject.set(x, "reservedRanges", value.asInstanceOf[js.Any])
    
    inline def setReservedRangesUndefined: Self = StObject.set(x, "reservedRanges", js.undefined)
    
    inline def setReservedRangesVarargs(value: SchemaGoogleCloudServicenetworkingV1ConsumerConfigReservedRange*): Self = StObject.set(x, "reservedRanges", js.Array(value*))
    
    inline def setUsedIpRanges(value: js.Array[String]): Self = StObject.set(x, "usedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setUsedIpRangesNull: Self = StObject.set(x, "usedIpRanges", null)
    
    inline def setUsedIpRangesUndefined: Self = StObject.set(x, "usedIpRanges", js.undefined)
    
    inline def setUsedIpRangesVarargs(value: String*): Self = StObject.set(x, "usedIpRanges", js.Array(value*))
    
    inline def setVpcScReferenceArchitectureEnabled(value: Boolean): Self = StObject.set(x, "vpcScReferenceArchitectureEnabled", value.asInstanceOf[js.Any])
    
    inline def setVpcScReferenceArchitectureEnabledNull: Self = StObject.set(x, "vpcScReferenceArchitectureEnabled", null)
    
    inline def setVpcScReferenceArchitectureEnabledUndefined: Self = StObject.set(x, "vpcScReferenceArchitectureEnabled", js.undefined)
  }
}
