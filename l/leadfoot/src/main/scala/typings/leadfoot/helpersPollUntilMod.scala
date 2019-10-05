package typings.leadfoot

import typings.dojo.promisePromiseMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leadfoot/helpers/pollUntil", JSImport.Namespace)
@js.native
object helpersPollUntilMod extends js.Object {
  def apply[T](poller: String): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: String, args: js.Array[_]): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: String, args: js.Array[_], timeout: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: String, args: js.Array[_], timeout: Double, pollInterval: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: String, timeout: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: String, timeout: Double, pollInterval: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  /**
  	 * A {@link module:leadfoot/Command} helper that polls for a value within the client environment until the value exists
  	 * or a timeout is reached.
  	 *
  	 * @param poller
  	 * The poller function to execute on an interval. The function should return `null` or `undefined` if there is not a
  	 * result. If the poller function throws, polling will halt.
  	 *
  	 * @param args
  	 * An array of arguments to pass to the poller function when it is invoked. Only values that can be serialised to JSON,
  	 * plus {@link module:leadfoot/Element} objects, can be specified as arguments.
  	 *
  	 * @param timeout
  	 * The maximum amount of time to wait for a successful result, in milliseconds. If not specified, the current
  	 * `executeAsync` maximum timeout for the session will be used.
  	 *
  	 * @param pollInterval
  	 * The amount of time to wait between calls to the poller function, in milliseconds. If not specified, defaults to 67ms.
  	 *
  	 * @returns
  	 * A {@link module:leadfoot/Command#then} callback function that, when called, returns a promise that resolves to the
  	 * value returned by the poller function on success and rejects on failure.
  	 *
  	 * @example
  	 * var Command = require('leadfoot/Command');
  	 * var pollUntil = require('leadfoot/helpers/pollUntil');
  	 *
  	 * new Command(session)
  	 *     .get('http://example.com')
  	 *     .then(pollUntil('return document.getElementById("a");', 1000))
  	 *     .then(function (elementA) {
  	 *         // element was found
  	 *     }, function (error) {
  	 *         // element was not found
  	 *     });
  	 *
  	 * @example
  	 * var Command = require('leadfoot/Command');
  	 * var pollUntil = require('leadfoot/helpers/pollUntil');
  	 *
  	 * new Command(session)
  	 *     .get('http://example.com')
  	 *     .then(pollUntil(function (value) {
  	 *         var element = document.getElementById('a');
  	 *         return element && element.value === value ? true : null;
  	 *     }, [ 'foo' ], 1000))
  	 *     .then(function () {
  	 *         // value was set to 'foo'
  	 *     }, function (error) {
  	 *         // value was never set
  	 *     });
  	 */
  def apply[T](poller: js.Function): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: js.Function, args: js.Array[_]): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: js.Function, args: js.Array[_], timeout: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: js.Function, args: js.Array[_], timeout: Double, pollInterval: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: js.Function, timeout: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
  def apply[T](poller: js.Function, timeout: Double, pollInterval: Double): js.Function1[/* value */ js.Any, Promise[T]] = js.native
}

