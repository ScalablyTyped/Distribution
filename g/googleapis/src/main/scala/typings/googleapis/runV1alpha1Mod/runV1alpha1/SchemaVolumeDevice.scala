package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
@js.native
trait SchemaVolumeDevice extends js.Object {
  /**
    * devicePath is the path inside of the container that the device will be
    * mapped to.
    */
  var devicePath: js.UndefOr[String] = js.native
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaVolumeDevice {
  @scala.inline
  def apply(devicePath: String = null, name: String = null): SchemaVolumeDevice = {
    val __obj = js.Dynamic.literal()
    if (devicePath != null) __obj.updateDynamic("devicePath")(devicePath.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolumeDevice]
  }
}

