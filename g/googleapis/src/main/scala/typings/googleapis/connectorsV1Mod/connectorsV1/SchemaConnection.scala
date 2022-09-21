package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnection extends StObject {
  
  /**
    * Optional. Configuration for establishing the connection's authentication with an external system.
    */
  var authConfig: js.UndefOr[SchemaAuthConfig] = js.undefined
  
  /**
    * Optional. Configuration for configuring the connection with an external system.
    */
  var configVariables: js.UndefOr[js.Array[SchemaConfigVariable]] = js.undefined
  
  /**
    * Required. Connector version on which the connection is created. The format is: projects/x/locations/x/providers/x/connectors/x/versions/x Only global location is supported for ConnectorVersion resource.
    */
  var connectorVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Created time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Configuration of the Connector's destination. Only accepted for Connectors that accepts user defined destination(s).
    */
  var destinationConfigs: js.UndefOr[js.Array[SchemaDestinationConfig]] = js.undefined
  
  /**
    * Output only. GCR location where the envoy image is stored. formatted like: gcr.io/{bucketName\}/{imageName\}
    */
  var envoyImageLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. GCR location where the runtime image is stored. formatted like: gcr.io/{bucketName\}/{imageName\}
    */
  var imageLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Configuration that indicates whether or not the Connection can be edited.
    */
  var lockConfig: js.UndefOr[SchemaLockConfig] = js.undefined
  
  /**
    * Output only. Resource name of the Connection. Format: projects/{project\}/locations/{location\}/connections/{connection\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Configuration for the connection.
    */
  var nodeConfig: js.UndefOr[SchemaNodeConfig] = js.undefined
  
  /**
    * Optional. Service account needed for runtime plane to access GCP resources.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the Service Directory service name. Used for Private Harpoon to resolve the ILB address. e.g. "projects/cloud-connectors-e2e-testing/locations/us-central1/namespaces/istio-system/services/istio-ingressgateway-connectors"
    */
  var serviceDirectory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current status of the connection.
    */
  var status: js.UndefOr[SchemaConnectionStatus] = js.undefined
  
  /**
    * Optional. Suspended indicates if a user has suspended a connection or not.
    */
  var suspended: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Updated time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnection {
  
  inline def apply(): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnection]
  }
  
  extension [Self <: SchemaConnection](x: Self) {
    
    inline def setAuthConfig(value: SchemaAuthConfig): Self = StObject.set(x, "authConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthConfigUndefined: Self = StObject.set(x, "authConfig", js.undefined)
    
    inline def setConfigVariables(value: js.Array[SchemaConfigVariable]): Self = StObject.set(x, "configVariables", value.asInstanceOf[js.Any])
    
    inline def setConfigVariablesUndefined: Self = StObject.set(x, "configVariables", js.undefined)
    
    inline def setConfigVariablesVarargs(value: SchemaConfigVariable*): Self = StObject.set(x, "configVariables", js.Array(value*))
    
    inline def setConnectorVersion(value: String): Self = StObject.set(x, "connectorVersion", value.asInstanceOf[js.Any])
    
    inline def setConnectorVersionNull: Self = StObject.set(x, "connectorVersion", null)
    
    inline def setConnectorVersionUndefined: Self = StObject.set(x, "connectorVersion", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationConfigs(value: js.Array[SchemaDestinationConfig]): Self = StObject.set(x, "destinationConfigs", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigsUndefined: Self = StObject.set(x, "destinationConfigs", js.undefined)
    
    inline def setDestinationConfigsVarargs(value: SchemaDestinationConfig*): Self = StObject.set(x, "destinationConfigs", js.Array(value*))
    
    inline def setEnvoyImageLocation(value: String): Self = StObject.set(x, "envoyImageLocation", value.asInstanceOf[js.Any])
    
    inline def setEnvoyImageLocationNull: Self = StObject.set(x, "envoyImageLocation", null)
    
    inline def setEnvoyImageLocationUndefined: Self = StObject.set(x, "envoyImageLocation", js.undefined)
    
    inline def setImageLocation(value: String): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
    
    inline def setImageLocationNull: Self = StObject.set(x, "imageLocation", null)
    
    inline def setImageLocationUndefined: Self = StObject.set(x, "imageLocation", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLockConfig(value: SchemaLockConfig): Self = StObject.set(x, "lockConfig", value.asInstanceOf[js.Any])
    
    inline def setLockConfigUndefined: Self = StObject.set(x, "lockConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeConfig(value: SchemaNodeConfig): Self = StObject.set(x, "nodeConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigUndefined: Self = StObject.set(x, "nodeConfig", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setServiceDirectory(value: String): Self = StObject.set(x, "serviceDirectory", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryNull: Self = StObject.set(x, "serviceDirectory", null)
    
    inline def setServiceDirectoryUndefined: Self = StObject.set(x, "serviceDirectory", js.undefined)
    
    inline def setStatus(value: SchemaConnectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
