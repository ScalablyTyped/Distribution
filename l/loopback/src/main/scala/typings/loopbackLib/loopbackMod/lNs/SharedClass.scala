package typings
package loopbackLib.loopbackMod.lNs

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
trait SharedClass extends js.Object {
  var http: js.Any
  /** The SharedClass name */
  def ctor(): scala.Unit
  /**
    * Define a shared method with the given name.
    * @param {string} name The method name
    * @param {any} options Set of options used to create a SharedMethod. See the full set of options https://apidocs.strongloop.com/strong-remoting/#sharedmethod
    */
  def defineMethod(name: java.lang.String, options: js.Any): scala.Unit
  /**
    * Disable a sharedMethod with the given name or function object.
    * @param {string} fn The function or method name
    * @param {boolean} isStatic Disable a static or prototype method
    */
  def disableMethod(fn: java.lang.String, isStatic: scala.Boolean): scala.Unit
  /**
    * Disable a sharedMethod with the given static or prototype method name.
    * @param {string} methodName	The method name
    */
  def disableMethodByName(methodName: java.lang.String): scala.Unit
  /**
    * Find a sharedMethod with the given name or function object.
    * @param {string|() => void} fn The function or method name
    * @param {boolean} isStatic Required if fn is a String. Only find a static method with the given name.
    * @return {any} SharedMethod https://apidocs.strongloop.com/strong-remoting/#sharedmethod
    */
  def find(fn: js.Function0[scala.Unit | java.lang.String], isStatic: scala.Boolean): js.Any
  /**
    * Find a sharedMethod with the given static or prototype method name.
    * @param {string} methodName the method name Find a static or prototype method with the given name.
    * @return {any} SharedMethod
    */
  def findMethodByName(methodName: java.lang.String): js.Any
  /**
    * Get a key for the given method.
    * @param {string} fn The function or method name
    * @param {boolean} isStatic Disable a static or prototype method
    */
  def getKeyFromMethodNameAndTarget(fn: java.lang.String, isStatic: scala.Boolean): scala.Unit
  /**
    * Get all shared methods belonging to this shared class.
    * @param {any} options
    * @return {any[]} An array of shared methods SharedMethod[]
    */
  def methods(options: loopbackLib.Anon_IncludeDisabled): js.Array[_]
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
  def resolve(resolver: js.Function0[scala.Unit]): scala.Unit
}

object SharedClass {
  @scala.inline
  def apply(
    ctor: () => scala.Unit,
    defineMethod: (java.lang.String, js.Any) => scala.Unit,
    disableMethod: (java.lang.String, scala.Boolean) => scala.Unit,
    disableMethodByName: java.lang.String => scala.Unit,
    find: (js.Function0[scala.Unit | java.lang.String], scala.Boolean) => js.Any,
    findMethodByName: java.lang.String => js.Any,
    getKeyFromMethodNameAndTarget: (java.lang.String, scala.Boolean) => scala.Unit,
    http: js.Any,
    methods: loopbackLib.Anon_IncludeDisabled => js.Array[_],
    resolve: js.Function0[scala.Unit] => scala.Unit
  ): SharedClass = {
    val __obj = js.Dynamic.literal(ctor = js.Any.fromFunction0(ctor), defineMethod = js.Any.fromFunction2(defineMethod), disableMethod = js.Any.fromFunction2(disableMethod), disableMethodByName = js.Any.fromFunction1(disableMethodByName), find = js.Any.fromFunction2(find), findMethodByName = js.Any.fromFunction1(findMethodByName), getKeyFromMethodNameAndTarget = js.Any.fromFunction2(getKeyFromMethodNameAndTarget), http = http, methods = js.Any.fromFunction1(methods), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[SharedClass]
  }
}

