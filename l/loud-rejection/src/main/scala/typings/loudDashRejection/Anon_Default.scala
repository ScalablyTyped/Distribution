package typings.loudDashRejection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
}

