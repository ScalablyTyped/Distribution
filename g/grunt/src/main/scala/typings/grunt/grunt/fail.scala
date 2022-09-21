package typings.grunt.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fail {
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSGlobal("grunt.fail.ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @js.native
    sealed trait Autocomplete
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait Fatal
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait MissingGruntfile
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait NoError
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait Task
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait Template
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait Warning
      extends StObject
         with ErrorCode
  }
  
  @js.native
  trait FailModule extends StObject {
    
    /**
      * Display a warning and abort Grunt immediately.
      */
    def fatal(error: String): Unit = js.native
    def fatal(error: String, errorCode: ErrorCode): Unit = js.native
    def fatal(error: js.Error): Unit = js.native
    def fatal(error: js.Error, errorCode: ErrorCode): Unit = js.native
    
    /**
      * Display a warning and abort Grunt immediately.
      * Grunt will continue processing tasks if the --force command-line option was specified.
      */
    def warn(error: String): Unit = js.native
    def warn(error: String, errorCode: ErrorCode): Unit = js.native
    def warn(error: js.Error): Unit = js.native
    def warn(error: js.Error, errorCode: ErrorCode): Unit = js.native
  }
}
