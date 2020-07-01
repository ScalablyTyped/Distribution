package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how to attach a disk to a Replica.
  */
@js.native
trait SchemaDiskAttachment extends js.Object {
  /**
    * The device name of this disk.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * A zero-based index to assign to this disk, where 0 is reserved for the
    * boot disk. If not specified, this is assigned by the server.
    */
  var index: js.UndefOr[Double] = js.native
}

object SchemaDiskAttachment {
  @scala.inline
  def apply(deviceName: String = null, index: js.UndefOr[Double] = js.undefined): SchemaDiskAttachment = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiskAttachment]
  }
}

