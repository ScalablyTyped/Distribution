package typings.gulpDashTypescript.releaseInputMod

import typings.gulpDashTypescript.releaseTypesMod.VinylFile
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var content: String
  var fileNameNormalized: String
  var fileNameOriginal: String
  var gulp: js.UndefOr[VinylFile] = js.undefined
  var kind: FileKind
  var ts: js.UndefOr[SourceFile] = js.undefined
}

object File {
  @scala.inline
  def apply(
    content: String,
    fileNameNormalized: String,
    fileNameOriginal: String,
    kind: FileKind,
    gulp: VinylFile = null,
    ts: SourceFile = null
  ): File = {
    val __obj = js.Dynamic.literal(content = content, fileNameNormalized = fileNameNormalized, fileNameOriginal = fileNameOriginal, kind = kind)
    if (gulp != null) __obj.updateDynamic("gulp")(gulp)
    if (ts != null) __obj.updateDynamic("ts")(ts)
    __obj.asInstanceOf[File]
  }
}

