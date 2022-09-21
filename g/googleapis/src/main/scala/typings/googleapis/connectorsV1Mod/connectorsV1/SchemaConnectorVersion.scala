package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectorVersion extends StObject {
  
  /**
    * Output only. List of auth configs supported by the Connector Version.
    */
  var authConfigTemplates: js.UndefOr[js.Array[SchemaAuthConfigTemplate]] = js.undefined
  
  /**
    * Output only. List of config variables needed to create a connection.
    */
  var configVariableTemplates: js.UndefOr[js.Array[SchemaConfigVariableTemplate]] = js.undefined
  
  /**
    * Output only. Created time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Configuration for Egress Control.
    */
  var egressControlConfig: js.UndefOr[SchemaEgressControlConfig] = js.undefined
  
  /**
    * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Flag to mark the version indicating the launch stage.
    */
  var launchStage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the Version. Format: projects/{project\}/locations/{location\}/providers/{provider\}/connectors/{connector\}/versions/{version\} Only global location is supported for Connector resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. ReleaseVersion of the connector, for example: "1.0.1-alpha".
    */
  var releaseVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Role grant configuration for this config variable. It will be DEPRECATED soon.
    */
  var roleGrant: js.UndefOr[SchemaRoleGrant] = js.undefined
  
  /**
    * Output only. Role grant configurations for this connector version.
    */
  var roleGrants: js.UndefOr[js.Array[SchemaRoleGrant]] = js.undefined
  
  /**
    * Output only. Information about the runtime features supported by the Connector.
    */
  var supportedRuntimeFeatures: js.UndefOr[SchemaSupportedRuntimeFeatures] = js.undefined
  
  /**
    * Output only. Updated time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectorVersion {
  
  inline def apply(): SchemaConnectorVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectorVersion]
  }
  
  extension [Self <: SchemaConnectorVersion](x: Self) {
    
    inline def setAuthConfigTemplates(value: js.Array[SchemaAuthConfigTemplate]): Self = StObject.set(x, "authConfigTemplates", value.asInstanceOf[js.Any])
    
    inline def setAuthConfigTemplatesUndefined: Self = StObject.set(x, "authConfigTemplates", js.undefined)
    
    inline def setAuthConfigTemplatesVarargs(value: SchemaAuthConfigTemplate*): Self = StObject.set(x, "authConfigTemplates", js.Array(value*))
    
    inline def setConfigVariableTemplates(value: js.Array[SchemaConfigVariableTemplate]): Self = StObject.set(x, "configVariableTemplates", value.asInstanceOf[js.Any])
    
    inline def setConfigVariableTemplatesUndefined: Self = StObject.set(x, "configVariableTemplates", js.undefined)
    
    inline def setConfigVariableTemplatesVarargs(value: SchemaConfigVariableTemplate*): Self = StObject.set(x, "configVariableTemplates", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEgressControlConfig(value: SchemaEgressControlConfig): Self = StObject.set(x, "egressControlConfig", value.asInstanceOf[js.Any])
    
    inline def setEgressControlConfigUndefined: Self = StObject.set(x, "egressControlConfig", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageNull: Self = StObject.set(x, "launchStage", null)
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionNull: Self = StObject.set(x, "releaseVersion", null)
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    inline def setRoleGrant(value: SchemaRoleGrant): Self = StObject.set(x, "roleGrant", value.asInstanceOf[js.Any])
    
    inline def setRoleGrantUndefined: Self = StObject.set(x, "roleGrant", js.undefined)
    
    inline def setRoleGrants(value: js.Array[SchemaRoleGrant]): Self = StObject.set(x, "roleGrants", value.asInstanceOf[js.Any])
    
    inline def setRoleGrantsUndefined: Self = StObject.set(x, "roleGrants", js.undefined)
    
    inline def setRoleGrantsVarargs(value: SchemaRoleGrant*): Self = StObject.set(x, "roleGrants", js.Array(value*))
    
    inline def setSupportedRuntimeFeatures(value: SchemaSupportedRuntimeFeatures): Self = StObject.set(x, "supportedRuntimeFeatures", value.asInstanceOf[js.Any])
    
    inline def setSupportedRuntimeFeaturesUndefined: Self = StObject.set(x, "supportedRuntimeFeatures", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
