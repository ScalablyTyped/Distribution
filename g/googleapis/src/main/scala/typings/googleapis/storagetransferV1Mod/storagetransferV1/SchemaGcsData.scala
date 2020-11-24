package typings.googleapis.storagetransferV1Mod.storagetransferV1

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
trait SchemaGcsData extends js.Object {
  
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
  implicit class SchemaGcsDataOps[Self <: SchemaGcsData] (val x: Self) extends AnyVal {
    
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
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
  }
}
