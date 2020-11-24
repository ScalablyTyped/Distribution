package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1GcsFilesetSpec extends js.Object {
  
  /**
    * Required. Patterns to identify a set of files in Google Cloud Storage. See [Cloud Storage documentation](https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames) for
    * more information. Note that bucket wildcards are currently not supported. Examples of valid file_patterns: * `gs://bucket_name/dir/ *`: matches all files within `bucket_name/dir`
    * directory. * `gs://bucket_name/dir/ **`: matches all files in `bucket_name/dir` spanning all subdirectories. * `gs://bucket_name/file*`: matches files prefixed by `file` in
    * `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a
    * single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` *
    * `gs://bucket_name/a/∗/b`: matches all files in `bucket_name` that match `a/∗/b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
    * You can combine wildcards to provide more powerful matches, for example: * `gs://bucket_name/[a-m]??.j*g`
    */
  var filePatterns: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Sample files contained in this fileset, not all files contained in this fileset are represented here. */
  var sampleGcsFileSpecs: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1GcsFileSpec]] = js.native
}
object GoogleCloudDatacatalogV1beta1GcsFilesetSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1GcsFilesetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1GcsFilesetSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1GcsFilesetSpecOps[Self <: GoogleCloudDatacatalogV1beta1GcsFilesetSpec] (val x: Self) extends AnyVal {
    
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
    def setFilePatternsVarargs(value: String*): Self = this.set("filePatterns", js.Array(value :_*))
    
    @scala.inline
    def setFilePatterns(value: js.Array[String]): Self = this.set("filePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePatterns: Self = this.set("filePatterns", js.undefined)
    
    @scala.inline
    def setSampleGcsFileSpecsVarargs(value: GoogleCloudDatacatalogV1beta1GcsFileSpec*): Self = this.set("sampleGcsFileSpecs", js.Array(value :_*))
    
    @scala.inline
    def setSampleGcsFileSpecs(value: js.Array[GoogleCloudDatacatalogV1beta1GcsFileSpec]): Self = this.set("sampleGcsFileSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleGcsFileSpecs: Self = this.set("sampleGcsFileSpecs", js.undefined)
  }
}
