package typings.gulpTypescript.inputMod

import typings.gulpTypescript.typesMod.VinylFile
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var content: String = js.native
  var fileNameNormalized: String = js.native
  var fileNameOriginal: String = js.native
  var gulp: js.UndefOr[VinylFile] = js.native
  var kind: FileKind = js.native
  var ts: js.UndefOr[SourceFile] = js.native
}

@JSImport("gulp-typescript/release/input", "File")
@js.native
object File extends js.Object {
  def equal(a: File, b: File): Boolean = js.native
  def fromContent(caseSensitive: Boolean, fileName: String, content: String): File = js.native
  def fromGulp(caseSensitive: Boolean, file: VinylFile): File = js.native
  def getChangeState(previous: File, current: File): FileChangeState = js.native
}

