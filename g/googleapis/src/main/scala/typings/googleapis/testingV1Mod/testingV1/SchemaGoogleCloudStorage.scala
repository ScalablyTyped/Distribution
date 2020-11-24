package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A storage location within Google cloud storage (GCS).
  */
@js.native
trait SchemaGoogleCloudStorage extends js.Object {
  
  /**
    * Required. The path to a directory in GCS that will eventually contain the
    * results for this test. The requesting user must have write access on the
    * bucket in the supplied path.
    */
  var gcsPath: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudStorage {
  
  @scala.inline
  def apply(): SchemaGoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudStorage]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudStorageOps[Self <: SchemaGoogleCloudStorage] (val x: Self) extends AnyVal {
    
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
    def setGcsPath(value: String): Self = this.set("gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsPath: Self = this.set("gcsPath", js.undefined)
  }
}
