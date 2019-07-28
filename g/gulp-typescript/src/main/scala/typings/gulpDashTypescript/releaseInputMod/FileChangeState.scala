package typings.gulpDashTypescript.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileChangeState extends js.Object

@JSImport("gulp-typescript/release/input", "FileChangeState")
@js.native
object FileChangeState extends js.Object {
  @js.native
  sealed trait Deleted extends FileChangeState
  
  @js.native
  sealed trait Equal extends FileChangeState
  
  @js.native
  sealed trait Modified extends FileChangeState
  
  @js.native
  sealed trait New extends FileChangeState
  
  @js.native
  sealed trait NotFound extends FileChangeState
  
  /* 3 */ val Deleted: typings.gulpDashTypescript.releaseInputMod.FileChangeState.Deleted with Double = js.native
  /* 1 */ val Equal: typings.gulpDashTypescript.releaseInputMod.FileChangeState.Equal with Double = js.native
  /* 2 */ val Modified: typings.gulpDashTypescript.releaseInputMod.FileChangeState.Modified with Double = js.native
  /* 0 */ val New: typings.gulpDashTypescript.releaseInputMod.FileChangeState.New with Double = js.native
  /* 4 */ val NotFound: typings.gulpDashTypescript.releaseInputMod.FileChangeState.NotFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeState with Double] = js.native
}

