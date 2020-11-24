package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobMetadata extends js.Object {
  
  /** Identification of a BigTable source used in the Dataflow job. */
  var bigTableDetails: js.UndefOr[js.Array[BigTableIODetails]] = js.native
  
  /** Identification of a BigQuery source used in the Dataflow job. */
  var bigqueryDetails: js.UndefOr[js.Array[BigQueryIODetails]] = js.native
  
  /** Identification of a Datastore source used in the Dataflow job. */
  var datastoreDetails: js.UndefOr[js.Array[DatastoreIODetails]] = js.native
  
  /** Identification of a File source used in the Dataflow job. */
  var fileDetails: js.UndefOr[js.Array[FileIODetails]] = js.native
  
  /** Identification of a PubSub source used in the Dataflow job. */
  var pubsubDetails: js.UndefOr[js.Array[PubSubIODetails]] = js.native
  
  /** The SDK version used to run the job. */
  var sdkVersion: js.UndefOr[SdkVersion] = js.native
  
  /** Identification of a Spanner source used in the Dataflow job. */
  var spannerDetails: js.UndefOr[js.Array[SpannerIODetails]] = js.native
}
object JobMetadata {
  
  @scala.inline
  def apply(): JobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetadata]
  }
  
  @scala.inline
  implicit class JobMetadataOps[Self <: JobMetadata] (val x: Self) extends AnyVal {
    
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
    def setBigTableDetailsVarargs(value: BigTableIODetails*): Self = this.set("bigTableDetails", js.Array(value :_*))
    
    @scala.inline
    def setBigTableDetails(value: js.Array[BigTableIODetails]): Self = this.set("bigTableDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigTableDetails: Self = this.set("bigTableDetails", js.undefined)
    
    @scala.inline
    def setBigqueryDetailsVarargs(value: BigQueryIODetails*): Self = this.set("bigqueryDetails", js.Array(value :_*))
    
    @scala.inline
    def setBigqueryDetails(value: js.Array[BigQueryIODetails]): Self = this.set("bigqueryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDetails: Self = this.set("bigqueryDetails", js.undefined)
    
    @scala.inline
    def setDatastoreDetailsVarargs(value: DatastoreIODetails*): Self = this.set("datastoreDetails", js.Array(value :_*))
    
    @scala.inline
    def setDatastoreDetails(value: js.Array[DatastoreIODetails]): Self = this.set("datastoreDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreDetails: Self = this.set("datastoreDetails", js.undefined)
    
    @scala.inline
    def setFileDetailsVarargs(value: FileIODetails*): Self = this.set("fileDetails", js.Array(value :_*))
    
    @scala.inline
    def setFileDetails(value: js.Array[FileIODetails]): Self = this.set("fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDetails: Self = this.set("fileDetails", js.undefined)
    
    @scala.inline
    def setPubsubDetailsVarargs(value: PubSubIODetails*): Self = this.set("pubsubDetails", js.Array(value :_*))
    
    @scala.inline
    def setPubsubDetails(value: js.Array[PubSubIODetails]): Self = this.set("pubsubDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubDetails: Self = this.set("pubsubDetails", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: SdkVersion): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
    
    @scala.inline
    def setSpannerDetailsVarargs(value: SpannerIODetails*): Self = this.set("spannerDetails", js.Array(value :_*))
    
    @scala.inline
    def setSpannerDetails(value: js.Array[SpannerIODetails]): Self = this.set("spannerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpannerDetails: Self = this.set("spannerDetails", js.undefined)
  }
}
