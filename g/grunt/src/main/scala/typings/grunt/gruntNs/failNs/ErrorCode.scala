package typings.grunt.gruntNs.failNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSGlobal("grunt.fail.ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait Autocomplete extends ErrorCode
  
  @js.native
  sealed trait Fatal extends ErrorCode
  
  @js.native
  sealed trait MissingGruntfile extends ErrorCode
  
  @js.native
  sealed trait NoError extends ErrorCode
  
  @js.native
  sealed trait Task extends ErrorCode
  
  @js.native
  sealed trait Template extends ErrorCode
  
  @js.native
  sealed trait Warning extends ErrorCode
  
  /* 5 */ val Autocomplete: typings.grunt.gruntNs.failNs.ErrorCode.Autocomplete with Double = js.native
  /* 1 */ val Fatal: typings.grunt.gruntNs.failNs.ErrorCode.Fatal with Double = js.native
  /* 2 */ val MissingGruntfile: typings.grunt.gruntNs.failNs.ErrorCode.MissingGruntfile with Double = js.native
  /* 0 */ val NoError: typings.grunt.gruntNs.failNs.ErrorCode.NoError with Double = js.native
  /* 3 */ val Task: typings.grunt.gruntNs.failNs.ErrorCode.Task with Double = js.native
  /* 4 */ val Template: typings.grunt.gruntNs.failNs.ErrorCode.Template with Double = js.native
  /* 6 */ val Warning: typings.grunt.gruntNs.failNs.ErrorCode.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
}

