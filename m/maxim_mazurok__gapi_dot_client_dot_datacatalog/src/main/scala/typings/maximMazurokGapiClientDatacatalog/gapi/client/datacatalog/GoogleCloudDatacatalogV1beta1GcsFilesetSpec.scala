package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1GcsFilesetSpec extends StObject {
  
  /**
    * Required. Patterns to identify a set of files in Google Cloud Storage. See [Cloud Storage documentation](https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames) for
    * more information. Note that bucket wildcards are currently not supported. Examples of valid file_patterns: * `gs://bucket_name/dir/ *`: matches all files within `bucket_name/dir`
    * directory. * `gs://bucket_name/dir/ **`: matches all files in `bucket_name/dir` spanning all subdirectories. * `gs://bucket_name/file*`: matches files prefixed by `file` in
    * `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a
    * single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` *
    * `gs://bucket_name/a/∗/b`: matches all files in `bucket_name` that match `a/∗/b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
    * You can combine wildcards to provide more powerful matches, for example: * `gs://bucket_name/[a-m]??.j*g`
    */
  var filePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Sample files contained in this fileset, not all files contained in this fileset are represented here. */
  var sampleGcsFileSpecs: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1GcsFileSpec]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1GcsFilesetSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1GcsFilesetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1GcsFilesetSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1GcsFilesetSpec](x: Self) {
    
    inline def setFilePatterns(value: js.Array[String]): Self = StObject.set(x, "filePatterns", value.asInstanceOf[js.Any])
    
    inline def setFilePatternsUndefined: Self = StObject.set(x, "filePatterns", js.undefined)
    
    inline def setFilePatternsVarargs(value: String*): Self = StObject.set(x, "filePatterns", js.Array(value :_*))
    
    inline def setSampleGcsFileSpecs(value: js.Array[GoogleCloudDatacatalogV1beta1GcsFileSpec]): Self = StObject.set(x, "sampleGcsFileSpecs", value.asInstanceOf[js.Any])
    
    inline def setSampleGcsFileSpecsUndefined: Self = StObject.set(x, "sampleGcsFileSpecs", js.undefined)
    
    inline def setSampleGcsFileSpecsVarargs(value: GoogleCloudDatacatalogV1beta1GcsFileSpec*): Self = StObject.set(x, "sampleGcsFileSpecs", js.Array(value :_*))
  }
}
