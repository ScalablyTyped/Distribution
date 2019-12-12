package typings.grunt.grunt

import org.scalablytyped.runtime.TopLevel
import typings.grunt.grunt.fail.ErrorCode
import typings.grunt.grunt.fail.ErrorCode.Autocomplete
import typings.grunt.grunt.fail.ErrorCode.Fatal
import typings.grunt.grunt.fail.ErrorCode.MissingGruntfile
import typings.grunt.grunt.fail.ErrorCode.NoError
import typings.grunt.grunt.fail.ErrorCode.Task
import typings.grunt.grunt.fail.ErrorCode.Template
import typings.grunt.grunt.fail.ErrorCode.Warning
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("grunt.fail")
@js.native
object fail extends js.Object {
  @js.native
  sealed trait ErrorCode extends js.Object
  
  @js.native
  trait FailModule extends js.Object {
    /**
      * Display a warning and abort Grunt immediately.
      */
    def fatal(error: java.lang.String): Unit = js.native
    def fatal(error: java.lang.String, errorCode: ErrorCode): Unit = js.native
    def fatal(error: Error): Unit = js.native
    def fatal(error: Error, errorCode: ErrorCode): Unit = js.native
    /**
      * Display a warning and abort Grunt immediately.
      * Grunt will continue processing tasks if the --force command-line option was specified.
      */
    def warn(error: java.lang.String): Unit = js.native
    def warn(error: java.lang.String, errorCode: ErrorCode): Unit = js.native
    def warn(error: Error): Unit = js.native
    def warn(error: Error, errorCode: ErrorCode): Unit = js.native
  }
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
    /* 5 */ @js.native
    object Autocomplete extends TopLevel[Autocomplete with Double]
    
    /* 1 */ @js.native
    object Fatal extends TopLevel[Fatal with Double]
    
    /* 2 */ @js.native
    object MissingGruntfile extends TopLevel[MissingGruntfile with Double]
    
    /* 0 */ @js.native
    object NoError extends TopLevel[NoError with Double]
    
    /* 3 */ @js.native
    object Task extends TopLevel[Task with Double]
    
    /* 4 */ @js.native
    object Template extends TopLevel[Template with Double]
    
    /* 6 */ @js.native
    object Warning extends TopLevel[Warning with Double]
    
  }
  
}

