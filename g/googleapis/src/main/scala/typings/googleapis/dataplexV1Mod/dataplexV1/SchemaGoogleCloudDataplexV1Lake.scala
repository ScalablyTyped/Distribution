package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Lake extends StObject {
  
  /**
    * Output only. Aggregated status of the underlying assets of the lake.
    */
  var assetStatus: js.UndefOr[SchemaGoogleCloudDataplexV1AssetStatus] = js.undefined
  
  /**
    * Output only. The time when the lake was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the lake.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User friendly display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User-defined labels for the lake.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Settings to manage lake and Dataproc Metastore service instance association.
    */
  var metastore: js.UndefOr[SchemaGoogleCloudDataplexV1LakeMetastore] = js.undefined
  
  /**
    * Output only. Metastore status of the lake.
    */
  var metastoreStatus: js.UndefOr[SchemaGoogleCloudDataplexV1LakeMetastoreStatus] = js.undefined
  
  /**
    * Output only. The relative resource name of the lake, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the lake.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the lake was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Lake {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Lake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Lake]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Lake](x: Self) {
    
    inline def setAssetStatus(value: SchemaGoogleCloudDataplexV1AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
    
    inline def setAssetStatusUndefined: Self = StObject.set(x, "assetStatus", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMetastore(value: SchemaGoogleCloudDataplexV1LakeMetastore): Self = StObject.set(x, "metastore", value.asInstanceOf[js.Any])
    
    inline def setMetastoreStatus(value: SchemaGoogleCloudDataplexV1LakeMetastoreStatus): Self = StObject.set(x, "metastoreStatus", value.asInstanceOf[js.Any])
    
    inline def setMetastoreStatusUndefined: Self = StObject.set(x, "metastoreStatus", js.undefined)
    
    inline def setMetastoreUndefined: Self = StObject.set(x, "metastore", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
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
