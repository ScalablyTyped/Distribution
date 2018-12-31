package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SharedClass
  * Create a new SharedClass with the given options.
  * **NOTE** TODO : exported from another module type definition called strong-remoting
  *
  * @param {string} name The SharedClass name
  * @param {() => void} constructor The constructor the SharedClass represents
  * @param {any} options Additional options.
  * @property {() => void } ctor The constructor
  * @property {any} http The HTTP settings
  */
@JSImport("loopback", "SharedClass")
@js.native
class SharedClass protected ()
  extends loopbackLib.loopbackMod.lNs.SharedClass {
  def this(name: java.lang.String, constructor: js.Function0[scala.Unit]) = this()
  /* CompleteClass */
  override var http: js.Any = js.native
  /** The SharedClass name */
  /* CompleteClass */
  override def ctor(): scala.Unit = js.native
  /**
    * Define a shared method with the given name.
    * @param {string} name The method name
    * @param {any} options Set of options used to create a SharedMethod. See the full set of options https://apidocs.strongloop.com/strong-remoting/#sharedmethod
    */
  /* CompleteClass */
  override def defineMethod(name: java.lang.String, options: js.Any): scala.Unit = js.native
  /**
    * Disable a sharedMethod with the given name or function object.
    * @param {string} fn The function or method name
    * @param {boolean} isStatic Disable a static or prototype method
    */
  /* CompleteClass */
  override def disableMethod(fn: java.lang.String, isStatic: scala.Boolean): scala.Unit = js.native
  /**
    * Disable a sharedMethod with the given static or prototype method name.
    * @param {string} methodName	The method name
    */
  /* CompleteClass */
  override def disableMethodByName(methodName: java.lang.String): scala.Unit = js.native
  /**
    * Find a sharedMethod with the given name or function object.
    * @param {string|() => void} fn The function or method name
    * @param {boolean} isStatic Required if fn is a String. Only find a static method with the given name.
    * @return {any} SharedMethod https://apidocs.strongloop.com/strong-remoting/#sharedmethod
    */
  /* CompleteClass */
  override def find(fn: js.Function0[scala.Unit | java.lang.String], isStatic: scala.Boolean): js.Any = js.native
  /**
    * Find a sharedMethod with the given static or prototype method name.
    * @param {string} methodName the method name Find a static or prototype method with the given name.
    * @return {any} SharedMethod
    */
  /* CompleteClass */
  override def findMethodByName(methodName: java.lang.String): js.Any = js.native
  /**
    * Get a key for the given method.
    * @param {string} fn The function or method name
    * @param {boolean} isStatic Disable a static or prototype method
    */
  /* CompleteClass */
  override def getKeyFromMethodNameAndTarget(fn: java.lang.String, isStatic: scala.Boolean): scala.Unit = js.native
  /**
    * Get all shared methods belonging to this shared class.
    * @param {any} options
    * @return {any[]} An array of shared methods SharedMethod[]
    */
  /* CompleteClass */
  override def methods(options: loopbackLib.Anon_IncludeDisabled): js.Array[_] = js.native
  /**
    * Define a shared method resolver for dynamically defining methods.
    * ```
    * // below is a simple example
    * sharedClass.resolve(function(define) {
    *    define('myMethod', {
    *          accepts: {arg: 'str', type: 'string'},
    *          returns: {arg: 'str', type: 'string'}
    *          errors: [ { code: 404, message: 'Not Found', responseModel: 'Error' } ]
    *    }, myMethod);
    * });
    * function myMethod(str, cb) {
    * cb(null, str);
    * }
    * ```
    *
    * @param {() => void} resolver The resolver function.
    */
  /* CompleteClass */
  override def resolve(resolver: js.Function0[scala.Unit]): scala.Unit = js.native
}

/**
  * SharedClass
  * Create a new SharedClass with the given options.
  * **NOTE** TODO : exported from another module type definition called strong-remoting
  *
  * @param {string} name The SharedClass name
  * @param {() => void} constructor The constructor the SharedClass represents
  * @param {any} options Additional options.
  * @property {() => void } ctor The constructor
  * @property {any} http The HTTP settings
  */
@JSImport("loopback", "SharedClass")
@js.native
object SharedClass extends js.Object {
  /**
    * Normalize HTTP path.
    */
  def normalizeHttpPath(): scala.Unit = js.native
}

