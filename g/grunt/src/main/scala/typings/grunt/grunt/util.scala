package typings.grunt.grunt

import typings.grunt.anon.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  /**
    * {@link http://gruntjs.com/api/grunt.util#grunt.util.spawn}
    */
  trait ISpawnOptions extends StObject {
    
    /**
      * An array of arguments to pass to the command.
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The command to execute. It should be in the system path.
      */
    var cmd: js.UndefOr[String] = js.undefined
    
    /**
      * If this value is set and an error occurs, it will be used as the value
      * and null will be passed as the error value.
      */
    var fallback: js.UndefOr[Any] = js.undefined
    
    /**
      * If specified, the same grunt bin that is currently running will be
      * spawned as the child command, instead of the "cmd" option.
      * Defaults to false.
      */
    var grunt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional options for the Node.js child_process spawn method.
      */
    var opts: js.UndefOr[Custom] = js.undefined
  }
  object ISpawnOptions {
    
    inline def apply(): ISpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpawnOptions]
    }
    
    extension [Self <: ISpawnOptions](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
      
      inline def setFallback(value: Any): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setGrunt(value: Boolean): Self = StObject.set(x, "grunt", value.asInstanceOf[js.Any])
      
      inline def setGruntUndefined: Self = StObject.set(x, "grunt", js.undefined)
      
      inline def setOpts(value: Custom): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    }
  }
  
  /**
    * @note When result is coerced to a string, the value is stdout if the exit code
    *       was zero, the fallback if the exit code was non-zero and a fallback was
    *       specified, or stderr if the exit code was non-zero and a fallback was
    *       not specified.
    */
  trait ISpawnResult extends StObject {
    
    var code: Double
    
    var stderr: String
    
    var stdout: String
  }
  object ISpawnResult {
    
    inline def apply(code: Double, stderr: String, stdout: String): ISpawnResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpawnResult]
    }
    
    extension [Self <: ISpawnResult](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * {@link https://github.com/snbartell/node-spawn}
    */
  trait ISpawnedChild extends StObject {
    
    /**
      * Convenience function. Overrides options.restarts to -1.
      * Runs command indefinitely no matter the options passed into the constructor.
      */
    def forever(): Unit
    
    /**
      * Shut down the child and don't let it restart.
      */
    def kill(): Unit
    
    /**
      * Convenience function. Overrides options. restarts to 0.
      * Runs command exactly once no matter the options passed into the constructor.
      */
    def once(): Unit
    
    /**
      * Start the cmd with the options provided.
      */
    def start(): Unit
  }
  object ISpawnedChild {
    
    inline def apply(forever: () => Unit, kill: () => Unit, once: () => Unit, start: () => Unit): ISpawnedChild = {
      val __obj = js.Dynamic.literal(forever = js.Any.fromFunction0(forever), kill = js.Any.fromFunction0(kill), once = js.Any.fromFunction0(once), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[ISpawnedChild]
    }
    
    extension [Self <: ISpawnedChild](x: Self) {
      
      inline def setForever(value: () => Unit): Self = StObject.set(x, "forever", js.Any.fromFunction0(value))
      
      inline def setKill(value: () => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction0(value))
      
      inline def setOnce(value: () => Unit): Self = StObject.set(x, "once", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * {@link http://gruntjs.com/api/grunt.util}
    */
  @js.native
  trait UtilModule extends StObject {
    
    /**
      * Normalizes both "returns a value" and "passes result to a callback" functions to always
      * pass a result to the specified callback. If the original function returns a value,
      * that value will now be passed to the callback, which is specified as the last argument,
      * after all other predefined arguments. If the original function passed a value to a callback,
      * it will continue to do so.
      */
    def callbackify[R](syncOrAsyncFunction: js.Function0[R]): js.Function1[/* callback */ js.Function1[/* result */ R, Unit], Unit] = js.native
    def callbackify[A, R](syncOrAsyncFunction: js.Function1[/* a */ A, R]): js.Function2[/* a */ A, /* callback */ js.Function1[/* result */ R, Unit], Unit] = js.native
    def callbackify[A, B, R](syncOrAsyncFunction: js.Function2[/* a */ A, /* b */ B, R]): js.Function3[/* a */ A, /* b */ B, /* callback */ js.Function1[/* result */ R, Unit], Unit] = js.native
    def callbackify[A, B, C, R](syncOrAsyncFunction: js.Function3[/* a */ A, /* b */ B, /* c */ C, R]): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* callback */ js.Function1[/* result */ R, Unit], Unit] = js.native
    def callbackify[A, B, C, D, R](syncOrAsyncFunction: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, R]): js.Function5[
        /* a */ A, 
        /* b */ B, 
        /* c */ C, 
        /* d */ D, 
        /* callback */ js.Function1[/* result */ R, Unit], 
        Unit
      ] = js.native
    
    def error(error: js.Error): js.Error = js.native
    def error(error: js.Error, origError: js.Error): js.Error = js.native
    def error(error: Any): js.Error = js.native
    def error(error: Any, origError: js.Error): js.Error = js.native
    /**
      * Return a new Error instance (that can be thrown) with the appropriate message.
      * If an Error object is specified instead of message that object will be returned.
      * Also, if an Error object is specified for origError and Grunt was run with the --debug 9 option,
      * the original Error stack will be dumped.
      */
    def error(message: String): js.Error = js.native
    def error(message: String, origError: js.Error): js.Error = js.native
    
    /**
      * Return the "kind" of a value. Like typeof but returns the internal [Class](Class/) value.
      * Possible results are "number", "string", "boolean", "function", "regexp", "array", "date",
      * "error", "null", "undefined" and the catch-all "object".
      */
    def kindOf(value: Any): String = js.native
    
    /**
      * The linefeed character, normalized for the current operating system.
      * (\r\n on Windows, \n otherwise)
      */
    var linefeed: String = js.native
    
    // Internal libraries
    var namespace: Any = js.native
    
    /**
      * Given a string, return a new string with all the linefeeds normalized for the current operating system.
      * (\r\n on Windows, \n otherwise)
      */
    def normalizelf(str: String): String = js.native
    
    /**
      * Given str of "a/b", If n is 1, return "a" otherwise "b".
      * You can specify a custom separator if '/' doesn't work for you.
      */
    def pluralize(n: Double, str: String): String = js.native
    def pluralize(n: Double, str: String, separator: String): String = js.native
    
    /**
      * Recurse through nested objects and arrays, executing callbackFunction for each non-object value.
      * If continueFunction returns false, a given object or value will be skipped.
      */
    def recurse(
      `object`: Any,
      callbackFunction: js.Function1[/* value */ Any, Unit],
      continueFunction: js.Function1[/* objOrValue */ Any, Boolean]
    ): Unit = js.native
    
    /**
      * Return string str repeated n times.
      */
    def repeat(n: Double, str: String): String = js.native
    
    /**
      * Spawn a child process, keeping track of its stdout, stderr and exit code.
      * The method returns a reference to the spawned child.
      * When the child exits, the done function is called.
      *
      * @param done a function with arguments:
      *        error  - If the exit code was non-zero and a fallback wasn't specified,
      *                 an Error object, otherwise null.
      *        result - The result object is an
      *        code   - The numeric exit code.
      */
    def spawn(
      options: ISpawnOptions,
      done: js.Function3[/* error */ js.Error, /* result */ ISpawnResult, /* code */ Double, Unit]
    ): ISpawnedChild = js.native
    
    var task: Any = js.native
    
    /**
      * Given an array or array-like object, return an array.
      * Great for converting arguments objects into arrays.
      */
    def toArray[T](arrayLikeObject: Any): js.Array[T] = js.native
  }
}
