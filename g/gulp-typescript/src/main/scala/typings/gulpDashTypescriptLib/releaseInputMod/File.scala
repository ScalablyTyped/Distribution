package typings
package gulpDashTypescriptLib.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var content: java.lang.String
  var fileNameNormalized: java.lang.String
  var fileNameOriginal: java.lang.String
  var gulp: js.UndefOr[gulpDashTypescriptLib.releaseTypesMod.VinylFile] = js.undefined
  var kind: FileKind
  var ts: js.UndefOr[typescriptLib.typescriptMod.SourceFile] = js.undefined
}

object File {
  @scala.inline
  def apply(
    content: java.lang.String,
    fileNameNormalized: java.lang.String,
    fileNameOriginal: java.lang.String,
    kind: FileKind,
    gulp: gulpDashTypescriptLib.releaseTypesMod.VinylFile = null,
    ts: typescriptLib.typescriptMod.SourceFile = null
  ): File = {
    val __obj = js.Dynamic.literal(content = content, fileNameNormalized = fileNameNormalized, fileNameOriginal = fileNameOriginal, kind = kind)
    if (gulp != null) __obj.updateDynamic("gulp")(gulp)
    if (ts != null) __obj.updateDynamic("ts")(ts)
    __obj.asInstanceOf[File]
  }
}

