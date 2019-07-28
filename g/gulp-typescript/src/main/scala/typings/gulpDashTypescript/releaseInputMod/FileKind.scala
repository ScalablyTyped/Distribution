package typings.gulpDashTypescript.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileKind extends js.Object

@JSImport("gulp-typescript/release/input", "FileKind")
@js.native
object FileKind extends js.Object {
  @js.native
  sealed trait Config extends FileKind
  
  @js.native
  sealed trait Source extends FileKind
  
  /* 1 */ val Config: typings.gulpDashTypescript.releaseInputMod.FileKind.Config with Double = js.native
  /* 0 */ val Source: typings.gulpDashTypescript.releaseInputMod.FileKind.Source with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileKind with Double] = js.native
}

