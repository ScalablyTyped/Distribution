package typings.loudRejection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loud-rejection", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function loudRejection(log?: (stack: string) => void): void;
  // export = loudRejection;
  @JSName("default")
  var default_Original: AnonCall = js.native
  /**
  	Make unhandled promise rejections fail loudly instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	@example
  	```
  	import loudRejection = require('loud-rejection');
  	import promiseFunction = require('promise-fn');
  	// Install the `unhandledRejection` listeners
  	loudRejection();
  	promiseFunction();
  	```
  	*/
  def apply(): Unit = js.native
  def apply(log: js.Function1[/* stack */ String, Unit]): Unit = js.native
  /**
  	Make unhandled promise rejections fail loudly instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	@example
  	```
  	import loudRejection = require('loud-rejection');
  	import promiseFunction = require('promise-fn');
  	// Install the `unhandledRejection` listeners
  	loudRejection();
  	promiseFunction();
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function loudRejection(log?: (stack: string) => void): void;
  // export = loudRejection;
  def default(): Unit = js.native
  def default(log: js.Function1[/* stack */ String, Unit]): Unit = js.native
}

