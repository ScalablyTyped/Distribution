package typings.gulpDashTypescript.releaseInputMod

import org.scalablytyped.runtime.TopLevel
import typings.gulpDashTypescript.releaseInputMod.FileKind.Config
import typings.gulpDashTypescript.releaseInputMod.FileKind.Source
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileKind with Double] = js.native
  /* 1 */ @js.native
  object Config extends TopLevel[Config with Double]
  
  /* 0 */ @js.native
  object Source extends TopLevel[Source with Double]
  
}

