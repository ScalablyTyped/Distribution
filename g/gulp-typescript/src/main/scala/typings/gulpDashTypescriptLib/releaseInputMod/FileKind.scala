package typings
package gulpDashTypescriptLib.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileKind extends js.Object

@JSImport("gulp-typescript/release/input", "FileKind")
@js.native
object FileKind extends js.Object {
  @js.native
  sealed trait Config
    extends gulpDashTypescriptLib.releaseInputMod.FileKind
  
  @js.native
  sealed trait Source
    extends gulpDashTypescriptLib.releaseInputMod.FileKind
  
  /* 1 */ val Config: Config with scala.Double = js.native
  /* 0 */ val Source: Source with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[gulpDashTypescriptLib.releaseInputMod.FileKind with scala.Double] = js.native
}

