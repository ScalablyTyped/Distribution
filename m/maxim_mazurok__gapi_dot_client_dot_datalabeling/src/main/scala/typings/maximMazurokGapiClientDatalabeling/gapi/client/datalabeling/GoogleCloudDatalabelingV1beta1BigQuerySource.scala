package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1BigQuerySource extends js.Object {
  
  /**
    * Required. BigQuery URI to a table, up to 2,000 characters long. If you specify the URI of a table that does not exist, Data Labeling Service creates a table at the URI with the
    * correct schema when you create your EvaluationJob. If you specify the URI of a table that already exists, it must have the [correct
    * schema](/ml-engine/docs/continuous-evaluation/create-job#table-schema). Provide the table URI in the following format: "bq://{your_project_id}/
    * {your_dataset_name}/{your_table_name}" [Learn more](/ml-engine/docs/continuous-evaluation/create-job#table-schema).
    */
  var inputUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1BigQuerySource {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1BigQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1BigQuerySource]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1BigQuerySourceOps[Self <: GoogleCloudDatalabelingV1beta1BigQuerySource] (val x: Self) extends AnyVal {
    
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
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
  }
}
