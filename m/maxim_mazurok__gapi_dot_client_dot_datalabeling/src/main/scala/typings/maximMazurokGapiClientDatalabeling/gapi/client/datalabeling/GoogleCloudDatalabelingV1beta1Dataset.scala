package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Dataset extends js.Object {
  
  /** Output only. The names of any related resources that are blocking changes to the dataset. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Time the dataset is created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The number of data items in the dataset. */
  var dataItemCount: js.UndefOr[String] = js.native
  
  /** Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. The display name of the dataset. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. This is populated with the original input configs where ImportData is called. It is available only after the clients import data to this dataset. */
  var inputConfigs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1InputConfig]] = js.native
  
  /** Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated. */
  var lastMigrateTime: js.UndefOr[String] = js.native
  
  /** Output only. Dataset resource name, format is: projects/{project_id}/datasets/{dataset_id} */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1Dataset {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Dataset]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1DatasetOps[Self <: GoogleCloudDatalabelingV1beta1Dataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockingResourcesVarargs(value: String*): Self = this.set("blockingResources", js.Array(value :_*))
    
    @scala.inline
    def setBlockingResources(value: js.Array[String]): Self = this.set("blockingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockingResources: Self = this.set("blockingResources", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDataItemCount(value: String): Self = this.set("dataItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataItemCount: Self = this.set("dataItemCount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setInputConfigsVarargs(value: GoogleCloudDatalabelingV1beta1InputConfig*): Self = this.set("inputConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInputConfigs(value: js.Array[GoogleCloudDatalabelingV1beta1InputConfig]): Self = this.set("inputConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfigs: Self = this.set("inputConfigs", js.undefined)
    
    @scala.inline
    def setLastMigrateTime(value: String): Self = this.set("lastMigrateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastMigrateTime: Self = this.set("lastMigrateTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
