package typings.jszip.mod

import typings.jszip.anon.Level
import typings.jszip.jszipStrings.DOS
import typings.jszip.jszipStrings.UNIX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZipGeneratorOptions[T /* <: OutputType */] extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var compression: js.UndefOr[Compression] = js.native
  var compressionOptions: js.UndefOr[Null | Level] = js.native
  var encodeFileName: js.UndefOr[js.Function1[/* filename */ String, String]] = js.native
  /**
    * mime-type for the generated file.
    * Useful when you need to generate a file with a different extension, ie: “.ods”.
    * @default 'application/zip'
    */
  var mimeType: js.UndefOr[String] = js.native
  /** DOS (default) or UNIX */
  var platform: js.UndefOr[DOS | UNIX] = js.native
  /** Stream the files and create file descriptors */
  var streamFiles: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[T] = js.native
}

object JSZipGeneratorOptions {
  @scala.inline
  def apply[/* <: typings.jszip.mod.OutputType */ T](): JSZipGeneratorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSZipGeneratorOptions[T]]
  }
  @scala.inline
  implicit class JSZipGeneratorOptionsOps[Self <: JSZipGeneratorOptions[_], /* <: typings.jszip.mod.OutputType */ T] (val x: Self with JSZipGeneratorOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCompression(value: Compression): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCompressionOptions(value: Level): Self = this.set("compressionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionOptions: Self = this.set("compressionOptions", js.undefined)
    @scala.inline
    def setCompressionOptionsNull: Self = this.set("compressionOptions", null)
    @scala.inline
    def setEncodeFileName(value: /* filename */ String => String): Self = this.set("encodeFileName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncodeFileName: Self = this.set("encodeFileName", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setPlatform(value: DOS | UNIX): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setStreamFiles(value: Boolean): Self = this.set("streamFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamFiles: Self = this.set("streamFiles", js.undefined)
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

