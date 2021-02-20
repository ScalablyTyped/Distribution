package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In a GcsData resource, an object&#39;s name is the Google Cloud Storage
  * object&#39;s name and its `lastModificationTime` refers to the object&#39;s
  * updated time, which changes when the content or the metadata of the object
  * is updated.
  */
@js.native
trait SchemaGcsData extends StObject {
  
  /**
    * Google Cloud Storage bucket name (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/naming#requirements)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.native
}
object SchemaGcsData {
  
  @scala.inline
  def apply(): SchemaGcsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsData]
  }
  
  @scala.inline
  implicit class SchemaGcsDataMutableBuilder[Self <: SchemaGcsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
  }
}
