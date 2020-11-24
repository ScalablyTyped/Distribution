package typings.gulpTypescript.inputMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileKind extends js.Object
@JSImport("gulp-typescript/release/input", "FileKind")
@js.native
object FileKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileKind with Double] = js.native
  
  @js.native
  sealed trait Config extends FileKind
  /* 1 */ @js.native
  object Config extends TopLevel[Config with Double]
  
  @js.native
  sealed trait Source extends FileKind
  /* 0 */ @js.native
  object Source extends TopLevel[Source with Double]
}
