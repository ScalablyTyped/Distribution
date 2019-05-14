package typings
package graphqlDashUploadLib.graphqlDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var maxFieldSize: js.UndefOr[scala.Double] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var maxFiles: js.UndefOr[scala.Double] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    maxFieldSize: scala.Int | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    maxFiles: scala.Int | scala.Double = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (maxFieldSize != null) __obj.updateDynamic("maxFieldSize")(maxFieldSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

