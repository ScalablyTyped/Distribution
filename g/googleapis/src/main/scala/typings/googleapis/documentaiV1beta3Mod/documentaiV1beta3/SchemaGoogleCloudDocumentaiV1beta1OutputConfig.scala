package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1OutputConfig extends StObject {
  
  /**
    * The Google Cloud Storage location to write the output to.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1GcsDestination] = js.undefined
  
  /**
    * The max number of pages to include into each output Document shard JSON on Google Cloud Storage. The valid range is [1, 100]. If not specified, the default value is 20. For example, for one pdf file with 100 pages, 100 parsed pages will be produced. If `pages_per_shard` = 20, then 5 Document shard JSON files each containing 20 parsed pages will be written under the prefix OutputConfig.gcs_destination.uri and suffix pages-x-to-y.json where x and y are 1-indexed page numbers. Example GCS outputs with 157 pages and pages_per_shard = 50: pages-001-to-050.json pages-051-to-100.json pages-101-to-150.json pages-151-to-157.json
    */
  var pagesPerShard: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1OutputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1OutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1OutputConfig](x: Self) {
    
    inline def setGcsDestination(value: SchemaGoogleCloudDocumentaiV1beta1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def setPagesPerShard(value: Double): Self = StObject.set(x, "pagesPerShard", value.asInstanceOf[js.Any])
    
    inline def setPagesPerShardNull: Self = StObject.set(x, "pagesPerShard", null)
    
    inline def setPagesPerShardUndefined: Self = StObject.set(x, "pagesPerShard", js.undefined)
  }
}
