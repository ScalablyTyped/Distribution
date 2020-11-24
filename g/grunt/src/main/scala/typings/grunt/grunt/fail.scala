package typings.grunt.grunt

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("grunt.fail")
@js.native
object fail extends js.Object {
  
  @js.native
  sealed trait ErrorCode extends js.Object
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
  }
  
  @js.native
  trait FailModule extends js.Object {
    
    /**
      * Display a warning and abort Grunt immediately.
      */
    def fatal(error: String): Unit = js.native
    def fatal(error: String, errorCode: ErrorCode): Unit = js.native
    def fatal(error: Error): Unit = js.native
    def fatal(error: Error, errorCode: ErrorCode): Unit = js.native
    
    /**
      * Display a warning and abort Grunt immediately.
      * Grunt will continue processing tasks if the --force command-line option was specified.
      */
    def warn(error: String): Unit = js.native
    def warn(error: String, errorCode: ErrorCode): Unit = js.native
    def warn(error: Error): Unit = js.native
    def warn(error: Error, errorCode: ErrorCode): Unit = js.native
  }
}
