package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobMetadata extends StObject {
  
  /** Identification of a BigTable source used in the Dataflow job. */
  var bigTableDetails: js.UndefOr[js.Array[BigTableIODetails]] = js.undefined
  
  /** Identification of a BigQuery source used in the Dataflow job. */
  var bigqueryDetails: js.UndefOr[js.Array[BigQueryIODetails]] = js.undefined
  
  /** Identification of a Datastore source used in the Dataflow job. */
  var datastoreDetails: js.UndefOr[js.Array[DatastoreIODetails]] = js.undefined
  
  /** Identification of a File source used in the Dataflow job. */
  var fileDetails: js.UndefOr[js.Array[FileIODetails]] = js.undefined
  
  /** Identification of a PubSub source used in the Dataflow job. */
  var pubsubDetails: js.UndefOr[js.Array[PubSubIODetails]] = js.undefined
  
  /** The SDK version used to run the job. */
  var sdkVersion: js.UndefOr[SdkVersion] = js.undefined
  
  /** Identification of a Spanner source used in the Dataflow job. */
  var spannerDetails: js.UndefOr[js.Array[SpannerIODetails]] = js.undefined
}
object JobMetadata {
  
  @scala.inline
  def apply(): JobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetadata]
  }
  
  @scala.inline
  implicit class JobMetadataMutableBuilder[Self <: JobMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigTableDetails(value: js.Array[BigTableIODetails]): Self = StObject.set(x, "bigTableDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigTableDetailsUndefined: Self = StObject.set(x, "bigTableDetails", js.undefined)
    
    @scala.inline
    def setBigTableDetailsVarargs(value: BigTableIODetails*): Self = StObject.set(x, "bigTableDetails", js.Array(value :_*))
    
    @scala.inline
    def setBigqueryDetails(value: js.Array[BigQueryIODetails]): Self = StObject.set(x, "bigqueryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDetailsUndefined: Self = StObject.set(x, "bigqueryDetails", js.undefined)
    
    @scala.inline
    def setBigqueryDetailsVarargs(value: BigQueryIODetails*): Self = StObject.set(x, "bigqueryDetails", js.Array(value :_*))
    
    @scala.inline
    def setDatastoreDetails(value: js.Array[DatastoreIODetails]): Self = StObject.set(x, "datastoreDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreDetailsUndefined: Self = StObject.set(x, "datastoreDetails", js.undefined)
    
    @scala.inline
    def setDatastoreDetailsVarargs(value: DatastoreIODetails*): Self = StObject.set(x, "datastoreDetails", js.Array(value :_*))
    
    @scala.inline
    def setFileDetails(value: js.Array[FileIODetails]): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
    
    @scala.inline
    def setFileDetailsVarargs(value: FileIODetails*): Self = StObject.set(x, "fileDetails", js.Array(value :_*))
    
    @scala.inline
    def setPubsubDetails(value: js.Array[PubSubIODetails]): Self = StObject.set(x, "pubsubDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubDetailsUndefined: Self = StObject.set(x, "pubsubDetails", js.undefined)
    
    @scala.inline
    def setPubsubDetailsVarargs(value: PubSubIODetails*): Self = StObject.set(x, "pubsubDetails", js.Array(value :_*))
    
    @scala.inline
    def setSdkVersion(value: SdkVersion): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    @scala.inline
    def setSpannerDetails(value: js.Array[SpannerIODetails]): Self = StObject.set(x, "spannerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpannerDetailsUndefined: Self = StObject.set(x, "spannerDetails", js.undefined)
    
    @scala.inline
    def setSpannerDetailsVarargs(value: SpannerIODetails*): Self = StObject.set(x, "spannerDetails", js.Array(value :_*))
  }
}
