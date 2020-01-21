package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single device file description.
  */
@js.native
trait SchemaDeviceFile extends js.Object {
  /**
    * A reference to an opaque binary blob file
    */
  var obbFile: js.UndefOr[SchemaObbFile] = js.native
  /**
    * A reference to a regular file
    */
  var regularFile: js.UndefOr[SchemaRegularFile] = js.native
}

object SchemaDeviceFile {
  @scala.inline
  def apply(obbFile: SchemaObbFile = null, regularFile: SchemaRegularFile = null): SchemaDeviceFile = {
    val __obj = js.Dynamic.literal()
    if (obbFile != null) __obj.updateDynamic("obbFile")(obbFile.asInstanceOf[js.Any])
    if (regularFile != null) __obj.updateDynamic("regularFile")(regularFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceFile]
  }
}

