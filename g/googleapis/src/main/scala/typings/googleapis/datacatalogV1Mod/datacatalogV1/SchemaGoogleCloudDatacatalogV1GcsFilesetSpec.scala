package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1GcsFilesetSpec extends StObject {
  
  /**
    * Required. Patterns to identify a set of files in Google Cloud Storage. For more information, see [Wildcard Names] (https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note: Currently, bucket wildcards are not supported. Examples of valid `file_patterns`: * `gs://bucket_name/dir/x`: matches all files in `bucket_name/dir` directory * `gs://bucket_name/dir/x*`: matches all files in `bucket_name/dir` and all subdirectories * `gs://bucket_name/file*`: matches files prefixed by `file` in `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` * `gs://bucket_name/a/x/b`: matches all files in `bucket_name` that match the `a/x/b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt` You can combine wildcards to match complex sets of files, for example: `gs://bucket_name/[a-m]??.j*g`
    */
  var filePatterns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Sample files contained in this fileset, not all files contained in this fileset are represented here.
    */
  var sampleGcsFileSpecs: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1GcsFileSpec]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1GcsFilesetSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1GcsFilesetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1GcsFilesetSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1GcsFilesetSpec](x: Self) {
    
    inline def setFilePatterns(value: js.Array[String]): Self = StObject.set(x, "filePatterns", value.asInstanceOf[js.Any])
    
    inline def setFilePatternsNull: Self = StObject.set(x, "filePatterns", null)
    
    inline def setFilePatternsUndefined: Self = StObject.set(x, "filePatterns", js.undefined)
    
    inline def setFilePatternsVarargs(value: String*): Self = StObject.set(x, "filePatterns", js.Array(value*))
    
    inline def setSampleGcsFileSpecs(value: js.Array[SchemaGoogleCloudDatacatalogV1GcsFileSpec]): Self = StObject.set(x, "sampleGcsFileSpecs", value.asInstanceOf[js.Any])
    
    inline def setSampleGcsFileSpecsUndefined: Self = StObject.set(x, "sampleGcsFileSpecs", js.undefined)
    
    inline def setSampleGcsFileSpecsVarargs(value: SchemaGoogleCloudDatacatalogV1GcsFileSpec*): Self = StObject.set(x, "sampleGcsFileSpecs", js.Array(value*))
  }
}
