package typings.jszip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipLoadOptions extends js.Object {
  var base64: js.UndefOr[Boolean] = js.undefined
  var checkCRC32: js.UndefOr[Boolean] = js.undefined
  var createFolders: js.UndefOr[Boolean] = js.undefined
  var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
}

object JSZipLoadOptions {
  @scala.inline
  def apply(
    base64: js.UndefOr[Boolean] = js.undefined,
    checkCRC32: js.UndefOr[Boolean] = js.undefined,
    createFolders: js.UndefOr[Boolean] = js.undefined,
    optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
  ): JSZipLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCRC32)) __obj.updateDynamic("checkCRC32")(checkCRC32.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createFolders)) __obj.updateDynamic("createFolders")(createFolders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizedBinaryString)) __obj.updateDynamic("optimizedBinaryString")(optimizedBinaryString.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipLoadOptions]
  }
}

