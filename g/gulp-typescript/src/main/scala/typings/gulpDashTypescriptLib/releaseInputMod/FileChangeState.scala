package typings
package gulpDashTypescriptLib.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileChangeState extends js.Object

@JSImport("gulp-typescript/release/input", "FileChangeState")
@js.native
object FileChangeState extends js.Object {
  @js.native
  sealed trait Deleted
    extends gulpDashTypescriptLib.releaseInputMod.FileChangeState
  
  @js.native
  sealed trait Equal
    extends gulpDashTypescriptLib.releaseInputMod.FileChangeState
  
  @js.native
  sealed trait Modified
    extends gulpDashTypescriptLib.releaseInputMod.FileChangeState
  
  @js.native
  sealed trait New
    extends gulpDashTypescriptLib.releaseInputMod.FileChangeState
  
  @js.native
  sealed trait NotFound
    extends gulpDashTypescriptLib.releaseInputMod.FileChangeState
  
  /* 3 */ val Deleted: Deleted with scala.Double = js.native
  /* 1 */ val Equal: Equal with scala.Double = js.native
  /* 2 */ val Modified: Modified with scala.Double = js.native
  /* 0 */ val New: New with scala.Double = js.native
  /* 4 */ val NotFound: NotFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[gulpDashTypescriptLib.releaseInputMod.FileChangeState with scala.Double] = js.native
}

