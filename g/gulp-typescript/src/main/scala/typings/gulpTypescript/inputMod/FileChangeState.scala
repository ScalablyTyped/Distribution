package typings.gulpTypescript.inputMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileChangeState extends js.Object
@JSImport("gulp-typescript/release/input", "FileChangeState")
@js.native
object FileChangeState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeState with Double] = js.native
  
  @js.native
  sealed trait Deleted extends FileChangeState
  /* 3 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
  @js.native
  sealed trait Equal extends FileChangeState
  /* 1 */ @js.native
  object Equal extends TopLevel[Equal with Double]
  
  @js.native
  sealed trait Modified extends FileChangeState
  /* 2 */ @js.native
  object Modified extends TopLevel[Modified with Double]
  
  @js.native
  sealed trait New extends FileChangeState
  /* 0 */ @js.native
  object New extends TopLevel[New with Double]
  
  @js.native
  sealed trait NotFound extends FileChangeState
  /* 4 */ @js.native
  object NotFound extends TopLevel[NotFound with Double]
}
