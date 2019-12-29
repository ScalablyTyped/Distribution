package typings.gulpDashTypescript.releaseInputMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeState with Double] = js.native
  /* 3 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
  /* 1 */ @js.native
  object Equal extends TopLevel[Equal with Double]
  
  /* 2 */ @js.native
  object Modified extends TopLevel[Modified with Double]
  
  /* 0 */ @js.native
  object New extends TopLevel[New with Double]
  
  /* 4 */ @js.native
  object NotFound extends TopLevel[NotFound with Double]
  
}

