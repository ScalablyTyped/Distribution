package typings.jszip.mod

import typings.jszip.anon.Level
import typings.jszip.jszipStrings.DOS
import typings.jszip.jszipStrings.UNIX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipGeneratorOptions[T /* <: OutputType */] extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var compression: js.UndefOr[Compression] = js.undefined
  var compressionOptions: js.UndefOr[Null | Level] = js.undefined
  var encodeFileName: js.UndefOr[js.Function1[/* filename */ String, String]] = js.undefined
  /**
    * mime-type for the generated file.
    * Useful when you need to generate a file with a different extension, ie: “.ods”.
    * @default 'application/zip'
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /** DOS (default) or UNIX */
  var platform: js.UndefOr[DOS | UNIX] = js.undefined
  /** Stream the files and create file descriptors */
  var streamFiles: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[T] = js.undefined
}

object JSZipGeneratorOptions {
  @scala.inline
  def apply[/* <: typings.jszip.mod.OutputType */ T](
    comment: String = null,
    compression: Compression = null,
    compressionOptions: js.UndefOr[Null | Level] = js.undefined,
    encodeFileName: /* filename */ String => String = null,
    mimeType: String = null,
    platform: DOS | UNIX = null,
    streamFiles: js.UndefOr[Boolean] = js.undefined,
    `type`: T = null
  ): JSZipGeneratorOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(compressionOptions)) __obj.updateDynamic("compressionOptions")(compressionOptions.asInstanceOf[js.Any])
    if (encodeFileName != null) __obj.updateDynamic("encodeFileName")(js.Any.fromFunction1(encodeFileName))
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(streamFiles)) __obj.updateDynamic("streamFiles")(streamFiles.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipGeneratorOptions[T]]
  }
}

