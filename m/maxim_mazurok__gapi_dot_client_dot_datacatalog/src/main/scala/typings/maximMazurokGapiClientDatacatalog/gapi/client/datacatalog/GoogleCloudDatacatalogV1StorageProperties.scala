package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1StorageProperties extends StObject {
  
  /**
    * Patterns to identify a set of files for this fileset. Examples of a valid `file_pattern`: * `gs://bucket_name/dir/ *`: matches all files in the `bucket_name/dir` directory *
    * `gs://bucket_name/dir/ **`: matches all files in the `bucket_name/dir` and all subdirectories recursively * `gs://bucket_name/file*`: matches files prefixed by `file` in
    * `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a
    * single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` *
    * `gs://bucket_name/a/ *‍/b`: matches all files in `bucket_name` that match the `a/ *‍/b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches
    * `gs://another_bucket/a.txt`
    */
  var filePattern: js.UndefOr[js.Array[String]] = js.undefined
  
  /** File type in MIME format, for example, `text/plain`. */
  var fileType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1StorageProperties {
  
  inline def apply(): GoogleCloudDatacatalogV1StorageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1StorageProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1StorageProperties] (val x: Self) extends AnyVal {
    
    inline def setFilePattern(value: js.Array[String]): Self = StObject.set(x, "filePattern", value.asInstanceOf[js.Any])
    
    inline def setFilePatternUndefined: Self = StObject.set(x, "filePattern", js.undefined)
    
    inline def setFilePatternVarargs(value: String*): Self = StObject.set(x, "filePattern", js.Array(value*))
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
