package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about a particular disk mount inside a container.
  */
@js.native
trait SchemaMount extends js.Object {
  /**
    * The name of the disk to mount, as specified in the resources section.
    */
  var disk: js.UndefOr[String] = js.native
  /**
    * The path to mount the disk inside the container.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * If true, the disk is mounted read-only inside the container.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
}

object SchemaMount {
  @scala.inline
  def apply(disk: String = null, path: String = null, readOnly: js.UndefOr[Boolean] = js.undefined): SchemaMount = {
    val __obj = js.Dynamic.literal()
    if (disk != null) __obj.updateDynamic("disk")(disk.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMount]
  }
}

