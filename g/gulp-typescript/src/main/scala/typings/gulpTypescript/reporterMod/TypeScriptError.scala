package typings.gulpTypescript.reporterMod

import typings.gulpTypescript.anon.Character
import typings.gulpTypescript.typesMod.VinylFile
import typings.std.Error
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeScriptError extends Error {
  var diagnostic: Diagnostic = js.native
  var endPosition: js.UndefOr[Character] = js.native
  var file: js.UndefOr[VinylFile] = js.native
  var fullFilename: js.UndefOr[String] = js.native
  var relativeFilename: js.UndefOr[String] = js.native
  var startPosition: js.UndefOr[Character] = js.native
  var tsFile: js.UndefOr[SourceFile] = js.native
}

object TypeScriptError {
  @scala.inline
  def apply(diagnostic: Diagnostic, message: String, name: String): TypeScriptError = {
    val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptError]
  }
  @scala.inline
  implicit class TypeScriptErrorOps[Self <: TypeScriptError] (val x: Self) extends AnyVal {
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
    def setDiagnostic(value: Diagnostic): Self = this.set("diagnostic", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndPosition(value: Character): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    @scala.inline
    def setFile(value: VinylFile): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFullFilename(value: String): Self = this.set("fullFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullFilename: Self = this.set("fullFilename", js.undefined)
    @scala.inline
    def setRelativeFilename(value: String): Self = this.set("relativeFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeFilename: Self = this.set("relativeFilename", js.undefined)
    @scala.inline
    def setStartPosition(value: Character): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    @scala.inline
    def setTsFile(value: SourceFile): Self = this.set("tsFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsFile: Self = this.set("tsFile", js.undefined)
  }
  
}

