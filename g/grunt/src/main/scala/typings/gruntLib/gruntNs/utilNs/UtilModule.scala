package typings
package gruntLib.gruntNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.util}
  */
@js.native
trait UtilModule extends js.Object {
  /**
    * The linefeed character, normalized for the current operating system.
    * (\r\n on Windows, \n otherwise)
    */
  var linefeed: java.lang.String = js.native
  // Internal libraries
  var namespace: js.Any = js.native
  var task: js.Any = js.native
  /**
    * Normalizes both "returns a value" and "passes result to a callback" functions to always
    * pass a result to the specified callback. If the original function returns a value,
    * that value will now be passed to the callback, which is specified as the last argument,
    * after all other predefined arguments. If the original function passed a value to a callback,
    * it will continue to do so.
    */
  def callbackify[R](syncOrAsyncFunction: js.Function0[R]): js.Function1[/* callback */ js.Function1[/* result */ R, scala.Unit], scala.Unit] = js.native
  def callbackify[A, R](syncOrAsyncFunction: js.Function1[/* a */ A, R]): js.Function2[/* a */ A, /* callback */ js.Function1[/* result */ R, scala.Unit], scala.Unit] = js.native
  def callbackify[A, B, R](syncOrAsyncFunction: js.Function2[/* a */ A, /* b */ B, R]): js.Function3[
    /* a */ A, 
    /* b */ B, 
    /* callback */ js.Function1[/* result */ R, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[A, B, C, R](syncOrAsyncFunction: js.Function3[/* a */ A, /* b */ B, /* c */ C, R]): js.Function4[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* callback */ js.Function1[/* result */ R, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[A, B, C, D, R](syncOrAsyncFunction: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, R]): js.Function5[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* callback */ js.Function1[/* result */ R, scala.Unit], 
    scala.Unit
  ] = js.native
  def error(error: js.Any): nodeLib.Error = js.native
  def error(error: js.Any, origError: nodeLib.Error): nodeLib.Error = js.native
  def error(error: nodeLib.Error): nodeLib.Error = js.native
  def error(error: nodeLib.Error, origError: nodeLib.Error): nodeLib.Error = js.native
  /**
    * Return a new Error instance (that can be thrown) with the appropriate message.
    * If an Error object is specified instead of message that object will be returned.
    * Also, if an Error object is specified for origError and Grunt was run with the --debug 9 option,
    * the original Error stack will be dumped.
    */
  def error(message: java.lang.String): nodeLib.Error = js.native
  def error(message: java.lang.String, origError: nodeLib.Error): nodeLib.Error = js.native
  /**
    * Return the "kind" of a value. Like typeof but returns the internal [Class](Class/) value.
    * Possible results are "number", "string", "boolean", "function", "regexp", "array", "date",
    * "error", "null", "undefined" and the catch-all "object".
    */
  def kindOf(value: js.Any): java.lang.String = js.native
  /**
    * Given a string, return a new string with all the linefeeds normalized for the current operating system.
    * (\r\n on Windows, \n otherwise)
    */
  def normalizelf(str: java.lang.String): java.lang.String = js.native
  /**
    * Given str of "a/b", If n is 1, return "a" otherwise "b".
    * You can specify a custom separator if '/' doesn't work for you.
    */
  def pluralize(n: scala.Double, str: java.lang.String): java.lang.String = js.native
  def pluralize(n: scala.Double, str: java.lang.String, separator: java.lang.String): java.lang.String = js.native
  /**
    * Recurse through nested objects and arrays, executing callbackFunction for each non-object value.
    * If continueFunction returns false, a given object or value will be skipped.
    */
  def recurse(
    `object`: js.Any,
    callbackFunction: js.Function1[/* value */ js.Any, scala.Unit],
    continueFunction: js.Function1[/* objOrValue */ js.Any, scala.Boolean]
  ): scala.Unit = js.native
  /**
    * Return string str repeated n times.
    */
  def repeat(n: scala.Double, str: java.lang.String): java.lang.String = js.native
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
    done: js.Function3[
      /* error */ nodeLib.Error, 
      /* result */ ISpawnResult, 
      /* code */ scala.Double, 
      scala.Unit
    ]
  ): ISpawnedChild = js.native
  /**
    * Given an array or array-like object, return an array.
    * Great for converting arguments objects into arrays.
    */
  def toArray[T](arrayLikeObject: js.Any): js.Array[T] = js.native
}

