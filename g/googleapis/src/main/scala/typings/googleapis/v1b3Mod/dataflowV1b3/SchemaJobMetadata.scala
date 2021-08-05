package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata available primarily for filtering jobs. Will be included in the
  * ListJob response and Job SUMMARY view.
  */
trait SchemaJobMetadata extends StObject {
  
  /**
    * Identification of a BigTable source used in the Dataflow job.
    */
  var bigTableDetails: js.UndefOr[js.Array[SchemaBigTableIODetails]] = js.undefined
  
  /**
    * Identification of a BigQuery source used in the Dataflow job.
    */
  var bigqueryDetails: js.UndefOr[js.Array[SchemaBigQueryIODetails]] = js.undefined
  
  /**
    * Identification of a Datastore source used in the Dataflow job.
    */
  var datastoreDetails: js.UndefOr[js.Array[SchemaDatastoreIODetails]] = js.undefined
  
  /**
    * Identification of a File source used in the Dataflow job.
    */
  var fileDetails: js.UndefOr[js.Array[SchemaFileIODetails]] = js.undefined
  
  /**
    * Identification of a PubSub source used in the Dataflow job.
    */
  var pubsubDetails: js.UndefOr[js.Array[SchemaPubSubIODetails]] = js.undefined
  
  /**
    * The SDK version used to run the job.
    */
  var sdkVersion: js.UndefOr[SchemaSdkVersion] = js.undefined
  
  /**
    * Identification of a Spanner source used in the Dataflow job.
    */
  var spannerDetails: js.UndefOr[js.Array[SchemaSpannerIODetails]] = js.undefined
}
object SchemaJobMetadata {
  
  inline def apply(): SchemaJobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMetadata]
  }
  
  extension [Self <: SchemaJobMetadata](x: Self) {
    
    inline def setBigTableDetails(value: js.Array[SchemaBigTableIODetails]): Self = StObject.set(x, "bigTableDetails", value.asInstanceOf[js.Any])
    
    inline def setBigTableDetailsUndefined: Self = StObject.set(x, "bigTableDetails", js.undefined)
    
    inline def setBigTableDetailsVarargs(value: SchemaBigTableIODetails*): Self = StObject.set(x, "bigTableDetails", js.Array(value :_*))
    
    inline def setBigqueryDetails(value: js.Array[SchemaBigQueryIODetails]): Self = StObject.set(x, "bigqueryDetails", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDetailsUndefined: Self = StObject.set(x, "bigqueryDetails", js.undefined)
    
    inline def setBigqueryDetailsVarargs(value: SchemaBigQueryIODetails*): Self = StObject.set(x, "bigqueryDetails", js.Array(value :_*))
    
    inline def setDatastoreDetails(value: js.Array[SchemaDatastoreIODetails]): Self = StObject.set(x, "datastoreDetails", value.asInstanceOf[js.Any])
    
    inline def setDatastoreDetailsUndefined: Self = StObject.set(x, "datastoreDetails", js.undefined)
    
    inline def setDatastoreDetailsVarargs(value: SchemaDatastoreIODetails*): Self = StObject.set(x, "datastoreDetails", js.Array(value :_*))
    
    inline def setFileDetails(value: js.Array[SchemaFileIODetails]): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    inline def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
    
    inline def setFileDetailsVarargs(value: SchemaFileIODetails*): Self = StObject.set(x, "fileDetails", js.Array(value :_*))
    
    inline def setPubsubDetails(value: js.Array[SchemaPubSubIODetails]): Self = StObject.set(x, "pubsubDetails", value.asInstanceOf[js.Any])
    
    inline def setPubsubDetailsUndefined: Self = StObject.set(x, "pubsubDetails", js.undefined)
    
    inline def setPubsubDetailsVarargs(value: SchemaPubSubIODetails*): Self = StObject.set(x, "pubsubDetails", js.Array(value :_*))
    
    inline def setSdkVersion(value: SchemaSdkVersion): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    inline def setSpannerDetails(value: js.Array[SchemaSpannerIODetails]): Self = StObject.set(x, "spannerDetails", value.asInstanceOf[js.Any])
    
    inline def setSpannerDetailsUndefined: Self = StObject.set(x, "spannerDetails", js.undefined)
    
    inline def setSpannerDetailsVarargs(value: SchemaSpannerIODetails*): Self = StObject.set(x, "spannerDetails", js.Array(value :_*))
  }
}
