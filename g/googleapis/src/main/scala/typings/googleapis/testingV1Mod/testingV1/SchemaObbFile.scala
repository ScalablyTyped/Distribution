package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An opaque binary blob file to install on the device before the test starts.
  */
@js.native
trait SchemaObbFile extends js.Object {
  /**
    * Required. Opaque Binary Blob (OBB) file(s) to install on the device.
    */
  var obb: js.UndefOr[SchemaFileReference] = js.native
  /**
    * Required. OBB file name which must conform to the format as specified by
    * Android e.g. [main|patch].0300110.com.example.android.obb which will be
    * installed into
    * \&lt;shared-storage\&gt;/Android/obb/\&lt;package-name\&gt;/ on the
    * device.
    */
  var obbFileName: js.UndefOr[String] = js.native
}

object SchemaObbFile {
  @scala.inline
  def apply(): SchemaObbFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObbFile]
  }
  @scala.inline
  implicit class SchemaObbFileOps[Self <: SchemaObbFile] (val x: Self) extends AnyVal {
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
    def setObb(value: SchemaFileReference): Self = this.set("obb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObb: Self = this.set("obb", js.undefined)
    @scala.inline
    def setObbFileName(value: String): Self = this.set("obbFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObbFileName: Self = this.set("obbFileName", js.undefined)
  }
  
}

