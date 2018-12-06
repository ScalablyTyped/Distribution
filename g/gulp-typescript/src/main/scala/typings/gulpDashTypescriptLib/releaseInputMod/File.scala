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
  var ts: js.UndefOr[typescriptLib.typescriptMod.tsNs.SourceFile] = js.undefined
}

