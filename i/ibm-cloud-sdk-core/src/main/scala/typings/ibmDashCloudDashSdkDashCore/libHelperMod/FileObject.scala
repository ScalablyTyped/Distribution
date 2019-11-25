package typings.ibmDashCloudDashSdkDashCore.libHelperMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObject extends js.Object {
  var options: js.UndefOr[FileOptions] = js.undefined
  var value: ReadableStream | Buffer | String
}

object FileObject {
  @scala.inline
  def apply(value: ReadableStream | Buffer | String, options: FileOptions = null): FileObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObject]
  }
}

