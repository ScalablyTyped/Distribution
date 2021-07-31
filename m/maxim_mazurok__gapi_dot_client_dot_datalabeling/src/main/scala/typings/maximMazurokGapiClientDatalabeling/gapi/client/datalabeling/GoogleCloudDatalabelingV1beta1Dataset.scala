package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1Dataset extends StObject {
  
  /** Output only. The names of any related resources that are blocking changes to the dataset. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Time the dataset is created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The number of data items in the dataset. */
  var dataItemCount: js.UndefOr[String] = js.undefined
  
  /** Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the dataset. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. This is populated with the original input configs where ImportData is called. It is available only after the clients import data to this dataset. */
  var inputConfigs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1InputConfig]] = js.undefined
  
  /** Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated. */
  var lastMigrateTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Dataset resource name, format is: projects/{project_id}/datasets/{dataset_id} */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1Dataset {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Dataset]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1DatasetMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Dataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockingResources(value: js.Array[String]): Self = StObject.set(x, "blockingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockingResourcesUndefined: Self = StObject.set(x, "blockingResources", js.undefined)
    
    @scala.inline
    def setBlockingResourcesVarargs(value: String*): Self = StObject.set(x, "blockingResources", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDataItemCount(value: String): Self = StObject.set(x, "dataItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemCountUndefined: Self = StObject.set(x, "dataItemCount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setInputConfigs(value: js.Array[GoogleCloudDatalabelingV1beta1InputConfig]): Self = StObject.set(x, "inputConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigsUndefined: Self = StObject.set(x, "inputConfigs", js.undefined)
    
    @scala.inline
    def setInputConfigsVarargs(value: GoogleCloudDatalabelingV1beta1InputConfig*): Self = StObject.set(x, "inputConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLastMigrateTime(value: String): Self = StObject.set(x, "lastMigrateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMigrateTimeUndefined: Self = StObject.set(x, "lastMigrateTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
