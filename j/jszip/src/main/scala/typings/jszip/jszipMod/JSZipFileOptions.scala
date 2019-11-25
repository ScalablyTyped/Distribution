package typings.jszip.jszipMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipFileOptions extends js.Object {
  /** Set to `true` if the data is `base64` encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option. */
  var base64: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` if the data should be treated as raw content, `false` if this is a text. If `base64` is used,
    * this defaults to `true`, if the data is not a `string`, this will be set to `true`.
    */
  var binary: js.UndefOr[Boolean] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var compression: js.UndefOr[String] = js.undefined
  /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
  var createFolders: js.UndefOr[Boolean] = js.undefined
  /**
    * The last modification date, defaults to the current date.
    */
  var date: js.UndefOr[Date] = js.undefined
  /** Set to `true` if this is a directory and content should be ignored. */
  var dir: js.UndefOr[Boolean] = js.undefined
  /** 6 bits number. The DOS permissions of the file, if any. */
  var dosPermissions: js.UndefOr[Double | Null] = js.undefined
  /** Set to `true` if (and only if) the input is a "binary string" and has already been prepared with a `0xFF` mask. */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
  /**
    * 16 bits number. The UNIX permissions of the file, if any.
    * Also accepts a `string` representing the octal value: `"644"`, `"755"`, etc.
    */
  var unixPermissions: js.UndefOr[Double | String | Null] = js.undefined
}

object JSZipFileOptions {
  @scala.inline
  def apply(
    base64: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    compression: String = null,
    createFolders: js.UndefOr[Boolean] = js.undefined,
    date: Date = null,
    dir: js.UndefOr[Boolean] = js.undefined,
    dosPermissions: Int | Double = null,
    optimizedBinaryString: js.UndefOr[Boolean] = js.undefined,
    unixPermissions: Double | String = null
  ): JSZipFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(createFolders)) __obj.updateDynamic("createFolders")(createFolders.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dosPermissions != null) __obj.updateDynamic("dosPermissions")(dosPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizedBinaryString)) __obj.updateDynamic("optimizedBinaryString")(optimizedBinaryString.asInstanceOf[js.Any])
    if (unixPermissions != null) __obj.updateDynamic("unixPermissions")(unixPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipFileOptions]
  }
}

