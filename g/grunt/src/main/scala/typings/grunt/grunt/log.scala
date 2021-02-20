package typings.grunt.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object log {
  
  /**
    * Grunt output should look consistent, and maybe even pretty.
    * As such, there is a plethora of logging methods, and a few useful patterns.
    * All of the methods that actually log something are chainable.
    */
  @js.native
  trait CommonLogging[T] extends StObject {
    
    /**
      * If msg string is omitted, logs ERROR in red,
      * otherwise logs >> msg, with trailing newline.
      */
    def error(msg: String): T = js.native
    
    /**
      * Log an error with grunt.log.error, wrapping text to 80 columns using grunt.log.wraptext.
      */
    def errorlns(msg: String): T = js.native
    
    /**
      * If msg string is omitted, logs OK in green, otherwise logs >> msg, with trailing newline.
      */
    def ok(msg: String): T = js.native
    
    /**
      * Log an ok message with grunt.log.ok, wrapping text to 80 columns using grunt.log.wraptext.
      */
    def oklns(msg: String): T = js.native
    
    /**
      * Log the specified msg string in bold, with trailing newline.
      */
    def subhead(msg: String): T = js.native
    
    /**
      * Log an warning with grunt.log.warn
      */
    def warn(msg: String): T = js.native
    
    /**
      * Log the specified msg string, with no trailing newline.
      */
    def write(msg: String): T = js.native
    
    /**
      * Log a list of obj properties (good for debugging flags).
      */
    def writeflags(obj: js.Any): T = js.native
    
    /**
      * Log the specified msg string, with trailing newline.
      */
    def writeln(msg: String): T = js.native
  }
  object CommonLogging {
    
    @scala.inline
    def apply[T](
      error: String => T,
      errorlns: String => T,
      ok: String => T,
      oklns: String => T,
      subhead: String => T,
      warn: String => T,
      write: String => T,
      writeflags: js.Any => T,
      writeln: String => T
    ): CommonLogging[T] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), subhead = js.Any.fromFunction1(subhead), warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
      __obj.asInstanceOf[CommonLogging[T]]
    }
    
    @scala.inline
    implicit class CommonLoggingMutableBuilder[Self <: CommonLogging[_], T] (val x: Self with CommonLogging[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: String => T): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorlns(value: String => T): Self = StObject.set(x, "errorlns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOk(value: String => T): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOklns(value: String => T): Self = StObject.set(x, "oklns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubhead(value: String => T): Self = StObject.set(x, "subhead", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: String => T): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: String => T): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteflags(value: js.Any => T): Self = StObject.set(x, "writeflags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteln(value: String => T): Self = StObject.set(x, "writeln", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * {@link http://gruntjs.com/api/grunt.log}
    */
  @js.native
  trait LogModule extends CommonLogging[LogModule] {
    
    var notverbose: NotVerboseLogModule = js.native
    
    var verbose: VerboseLogModule = js.native
  }
  object LogModule {
    
    @scala.inline
    def apply(
      error: String => LogModule,
      errorlns: String => LogModule,
      notverbose: NotVerboseLogModule,
      ok: String => LogModule,
      oklns: String => LogModule,
      subhead: String => LogModule,
      verbose: VerboseLogModule,
      warn: String => LogModule,
      write: String => LogModule,
      writeflags: js.Any => LogModule,
      writeln: String => LogModule
    ): LogModule = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), notverbose = notverbose.asInstanceOf[js.Any], ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), subhead = js.Any.fromFunction1(subhead), verbose = verbose.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
      __obj.asInstanceOf[LogModule]
    }
    
    @scala.inline
    implicit class LogModuleMutableBuilder[Self <: LogModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotverbose(value: NotVerboseLogModule): Self = StObject.set(x, "notverbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: VerboseLogModule): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @note all methods available under grunt.verbose work exactly like grunt.log methods,
    *       but only log if the --verbose command-line option was not specified.
    */
  @js.native
  trait NotVerboseLogModule extends CommonLogging[NotVerboseLogModule] {
    
    var or: VerboseLogModule = js.native
  }
  object NotVerboseLogModule {
    
    @scala.inline
    def apply(
      error: String => NotVerboseLogModule,
      errorlns: String => NotVerboseLogModule,
      ok: String => NotVerboseLogModule,
      oklns: String => NotVerboseLogModule,
      or: VerboseLogModule,
      subhead: String => NotVerboseLogModule,
      warn: String => NotVerboseLogModule,
      write: String => NotVerboseLogModule,
      writeflags: js.Any => NotVerboseLogModule,
      writeln: String => NotVerboseLogModule
    ): NotVerboseLogModule = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), or = or.asInstanceOf[js.Any], subhead = js.Any.fromFunction1(subhead), warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
      __obj.asInstanceOf[NotVerboseLogModule]
    }
    
    @scala.inline
    implicit class NotVerboseLogModuleMutableBuilder[Self <: NotVerboseLogModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOr(value: VerboseLogModule): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @note all methods available under grunt.verbose work exactly like grunt.log methods,
    *       but only log if the --verbose command-line option was specified.
    */
  @js.native
  trait VerboseLogModule extends CommonLogging[VerboseLogModule] {
    
    var or: NotVerboseLogModule = js.native
  }
  object VerboseLogModule {
    
    @scala.inline
    def apply(
      error: String => VerboseLogModule,
      errorlns: String => VerboseLogModule,
      ok: String => VerboseLogModule,
      oklns: String => VerboseLogModule,
      or: NotVerboseLogModule,
      subhead: String => VerboseLogModule,
      warn: String => VerboseLogModule,
      write: String => VerboseLogModule,
      writeflags: js.Any => VerboseLogModule,
      writeln: String => VerboseLogModule
    ): VerboseLogModule = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), or = or.asInstanceOf[js.Any], subhead = js.Any.fromFunction1(subhead), warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
      __obj.asInstanceOf[VerboseLogModule]
    }
    
    @scala.inline
    implicit class VerboseLogModuleMutableBuilder[Self <: VerboseLogModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOr(value: NotVerboseLogModule): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    }
  }
}
