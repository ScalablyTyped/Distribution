package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TableDataProfile extends StObject {
  
  /**
    * The snapshot of the configurations used to generate the profile.
    */
  var configSnapshot: js.UndefOr[SchemaGooglePrivacyDlpV2DataProfileConfigSnapshot] = js.undefined
  
  /**
    * The time at which the table was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data risk level of this table.
    */
  var dataRiskLevel: js.UndefOr[SchemaGooglePrivacyDlpV2DataRiskLevel] = js.undefined
  
  /**
    * The BigQuery dataset ID.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BigQuery location where the dataset's data is stored. See https://cloud.google.com/bigquery/docs/locations for supported locations.
    */
  var datasetLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GCP project ID that owns the BigQuery dataset.
    */
  var datasetProjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How the table is encrypted.
    */
  var encryptionStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The time when this table expires.
    */
  var expirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of columns skipped in the table because of an error.
    */
  var failedColumnCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the table. https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var fullResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when this table was last modified
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the profile.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Other infoTypes found in this table's data.
    */
  var otherInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2OtherInfoTypeSummary]] = js.undefined
  
  /**
    * The infoTypes predicted from this table's data.
    */
  var predictedInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeSummary]] = js.undefined
  
  /**
    * The last time the profile was generated.
    */
  var profileLastGenerated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Success or error status from the most recent profile generation attempt. May be empty if the profile is still being generated.
    */
  var profileStatus: js.UndefOr[SchemaGooglePrivacyDlpV2ProfileStatus] = js.undefined
  
  /**
    * The resource name to the project data profile for this table.
    */
  var projectDataProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels applied to the resource at the time the profile was generated.
    */
  var resourceLabels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * How broadly a resource has been shared.
    */
  var resourceVisibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of rows in the table when the profile was generated.
    */
  var rowCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of columns profiled in the table.
    */
  var scannedColumnCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sensitivity score of this table.
    */
  var sensitivityScore: js.UndefOr[SchemaGooglePrivacyDlpV2SensitivityScore] = js.undefined
  
  /**
    * State of a profile.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BigQuery table ID.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the table when the profile was generated.
    */
  var tableSizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2TableDataProfile {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TableDataProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TableDataProfile]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TableDataProfile](x: Self) {
    
    inline def setConfigSnapshot(value: SchemaGooglePrivacyDlpV2DataProfileConfigSnapshot): Self = StObject.set(x, "configSnapshot", value.asInstanceOf[js.Any])
    
    inline def setConfigSnapshotUndefined: Self = StObject.set(x, "configSnapshot", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataRiskLevel(value: SchemaGooglePrivacyDlpV2DataRiskLevel): Self = StObject.set(x, "dataRiskLevel", value.asInstanceOf[js.Any])
    
    inline def setDataRiskLevelUndefined: Self = StObject.set(x, "dataRiskLevel", js.undefined)
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setDatasetLocation(value: String): Self = StObject.set(x, "datasetLocation", value.asInstanceOf[js.Any])
    
    inline def setDatasetLocationNull: Self = StObject.set(x, "datasetLocation", null)
    
    inline def setDatasetLocationUndefined: Self = StObject.set(x, "datasetLocation", js.undefined)
    
    inline def setDatasetProjectId(value: String): Self = StObject.set(x, "datasetProjectId", value.asInstanceOf[js.Any])
    
    inline def setDatasetProjectIdNull: Self = StObject.set(x, "datasetProjectId", null)
    
    inline def setDatasetProjectIdUndefined: Self = StObject.set(x, "datasetProjectId", js.undefined)
    
    inline def setEncryptionStatus(value: String): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStatusNull: Self = StObject.set(x, "encryptionStatus", null)
    
    inline def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setFailedColumnCount(value: String): Self = StObject.set(x, "failedColumnCount", value.asInstanceOf[js.Any])
    
    inline def setFailedColumnCountNull: Self = StObject.set(x, "failedColumnCount", null)
    
    inline def setFailedColumnCountUndefined: Self = StObject.set(x, "failedColumnCount", js.undefined)
    
    inline def setFullResource(value: String): Self = StObject.set(x, "fullResource", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNull: Self = StObject.set(x, "fullResource", null)
    
    inline def setFullResourceUndefined: Self = StObject.set(x, "fullResource", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOtherInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2OtherInfoTypeSummary]): Self = StObject.set(x, "otherInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setOtherInfoTypesUndefined: Self = StObject.set(x, "otherInfoTypes", js.undefined)
    
    inline def setOtherInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2OtherInfoTypeSummary*): Self = StObject.set(x, "otherInfoTypes", js.Array(value*))
    
    inline def setPredictedInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeSummary]): Self = StObject.set(x, "predictedInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setPredictedInfoTypesUndefined: Self = StObject.set(x, "predictedInfoTypes", js.undefined)
    
    inline def setPredictedInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeSummary*): Self = StObject.set(x, "predictedInfoTypes", js.Array(value*))
    
    inline def setProfileLastGenerated(value: String): Self = StObject.set(x, "profileLastGenerated", value.asInstanceOf[js.Any])
    
    inline def setProfileLastGeneratedNull: Self = StObject.set(x, "profileLastGenerated", null)
    
    inline def setProfileLastGeneratedUndefined: Self = StObject.set(x, "profileLastGenerated", js.undefined)
    
    inline def setProfileStatus(value: SchemaGooglePrivacyDlpV2ProfileStatus): Self = StObject.set(x, "profileStatus", value.asInstanceOf[js.Any])
    
    inline def setProfileStatusUndefined: Self = StObject.set(x, "profileStatus", js.undefined)
    
    inline def setProjectDataProfile(value: String): Self = StObject.set(x, "projectDataProfile", value.asInstanceOf[js.Any])
    
    inline def setProjectDataProfileNull: Self = StObject.set(x, "projectDataProfile", null)
    
    inline def setProjectDataProfileUndefined: Self = StObject.set(x, "projectDataProfile", js.undefined)
    
    inline def setResourceLabels(value: StringDictionary[String]): Self = StObject.set(x, "resourceLabels", value.asInstanceOf[js.Any])
    
    inline def setResourceLabelsNull: Self = StObject.set(x, "resourceLabels", null)
    
    inline def setResourceLabelsUndefined: Self = StObject.set(x, "resourceLabels", js.undefined)
    
    inline def setResourceVisibility(value: String): Self = StObject.set(x, "resourceVisibility", value.asInstanceOf[js.Any])
    
    inline def setResourceVisibilityNull: Self = StObject.set(x, "resourceVisibility", null)
    
    inline def setResourceVisibilityUndefined: Self = StObject.set(x, "resourceVisibility", js.undefined)
    
    inline def setRowCount(value: String): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountNull: Self = StObject.set(x, "rowCount", null)
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setScannedColumnCount(value: String): Self = StObject.set(x, "scannedColumnCount", value.asInstanceOf[js.Any])
    
    inline def setScannedColumnCountNull: Self = StObject.set(x, "scannedColumnCount", null)
    
    inline def setScannedColumnCountUndefined: Self = StObject.set(x, "scannedColumnCount", js.undefined)
    
    inline def setSensitivityScore(value: SchemaGooglePrivacyDlpV2SensitivityScore): Self = StObject.set(x, "sensitivityScore", value.asInstanceOf[js.Any])
    
    inline def setSensitivityScoreUndefined: Self = StObject.set(x, "sensitivityScore", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    inline def setTableSizeBytes(value: String): Self = StObject.set(x, "tableSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setTableSizeBytesNull: Self = StObject.set(x, "tableSizeBytes", null)
    
    inline def setTableSizeBytesUndefined: Self = StObject.set(x, "tableSizeBytes", js.undefined)
  }
}
