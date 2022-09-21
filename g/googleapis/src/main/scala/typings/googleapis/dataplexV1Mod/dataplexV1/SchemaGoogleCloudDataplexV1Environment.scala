package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Environment extends StObject {
  
  /**
    * Output only. Environment creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the environment.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User friendly display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URI Endpoints to access sessions associated with the Environment.
    */
  var endpoints: js.UndefOr[SchemaGoogleCloudDataplexV1EnvironmentEndpoints] = js.undefined
  
  /**
    * Required. Infrastructure specification for the Environment.
    */
  var infrastructureSpec: js.UndefOr[SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpec] = js.undefined
  
  /**
    * Optional. User defined labels for the environment.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the environment, of the form: projects/{project_id\}/locations/{location_id\}/lakes/{lake_id\}/environment/{environment_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Configuration for sessions created for this environment.
    */
  var sessionSpec: js.UndefOr[SchemaGoogleCloudDataplexV1EnvironmentSessionSpec] = js.undefined
  
  /**
    * Output only. Status of sessions created for this environment.
    */
  var sessionStatus: js.UndefOr[SchemaGoogleCloudDataplexV1EnvironmentSessionStatus] = js.undefined
  
  /**
    * Output only. Current state of the environment.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. System generated globally unique ID for the environment. This ID will be different if the environment is deleted and re-created with the same name.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the environment was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Environment {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Environment]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Environment](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndpoints(value: SchemaGoogleCloudDataplexV1EnvironmentEndpoints): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setInfrastructureSpec(value: SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpec): Self = StObject.set(x, "infrastructureSpec", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureSpecUndefined: Self = StObject.set(x, "infrastructureSpec", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSessionSpec(value: SchemaGoogleCloudDataplexV1EnvironmentSessionSpec): Self = StObject.set(x, "sessionSpec", value.asInstanceOf[js.Any])
    
    inline def setSessionSpecUndefined: Self = StObject.set(x, "sessionSpec", js.undefined)
    
    inline def setSessionStatus(value: SchemaGoogleCloudDataplexV1EnvironmentSessionStatus): Self = StObject.set(x, "sessionStatus", value.asInstanceOf[js.Any])
    
    inline def setSessionStatusUndefined: Self = StObject.set(x, "sessionStatus", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
