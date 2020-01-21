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
  def apply(obb: SchemaFileReference = null, obbFileName: String = null): SchemaObbFile = {
    val __obj = js.Dynamic.literal()
    if (obb != null) __obj.updateDynamic("obb")(obb.asInstanceOf[js.Any])
    if (obbFileName != null) __obj.updateDynamic("obbFileName")(obbFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObbFile]
  }
}

