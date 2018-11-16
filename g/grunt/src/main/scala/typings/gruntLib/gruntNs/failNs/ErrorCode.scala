package typings
package gruntLib.gruntNs.failNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSGlobal("grunt.fail.ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait Autocomplete
    extends gruntLib.gruntNs.failNs.ErrorCode
  
  @js.native
  sealed trait Fatal
    extends gruntLib.gruntNs.failNs.ErrorCode
  
  @js.native
  sealed trait MissingGruntfile
    extends gruntLib.gruntNs.failNs.ErrorCode
  
  @js.native
  sealed trait NoError
    extends gruntLib.gruntNs.failNs.ErrorCode
  
  @js.native
  sealed trait Task
    extends gruntLib.gruntNs.failNs.ErrorCode
  
  @js.native
  sealed trait Template
    extends gruntLib.gruntNs.failNs.ErrorCode
  
  @js.native
  sealed trait Warning
    extends gruntLib.gruntNs.failNs.ErrorCode
  
  /* 5 */ val Autocomplete: Autocomplete with scala.Double = js.native
  /* 1 */ val Fatal: Fatal with scala.Double = js.native
  /* 2 */ val MissingGruntfile: MissingGruntfile with scala.Double = js.native
  /* 0 */ val NoError: NoError with scala.Double = js.native
  /* 3 */ val Task: Task with scala.Double = js.native
  /* 4 */ val Template: Template with scala.Double = js.native
  /* 6 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[gruntLib.gruntNs.failNs.ErrorCode with scala.Double] = js.native
}

