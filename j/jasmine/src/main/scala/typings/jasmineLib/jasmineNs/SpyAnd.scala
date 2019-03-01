package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyAnd extends js.Object {
  var identity: java.lang.String
  /** By chaining the spy with and.callFake, all calls to the spy will delegate to the supplied function. */
  def callFake(fn: js.Function): Spy
  /** By chaining the spy with and.callThrough, the spy will still track all calls to it but in addition it will delegate to the actual implementation. */
  def callThrough(): Spy
  /** By chaining the spy with and.returnValue, all calls to the function will return a specific value. */
  def returnValue(`val`: js.Any): Spy
  /** By chaining the spy with and.returnValues, all calls to the function will return specific values in order until it reaches the end of the return values list. */
  def returnValues(values: js.Any*): Spy
  /** When a calling strategy is used for a spy, the original stubbing behavior can be returned at any time with and.stub. */
  def stub(): Spy
  /** By chaining the spy with and.throwError, all calls to the spy will throw the specified value. */
  def throwError(msg: java.lang.String): Spy
}

object SpyAnd {
  @scala.inline
  def apply(
    callFake: js.Function1[js.Function, Spy],
    callThrough: js.Function0[Spy],
    identity: java.lang.String,
    returnValue: js.Function1[js.Any, Spy],
    returnValues: js.Function1[/* repeated */ js.Any, Spy],
    stub: js.Function0[Spy],
    throwError: js.Function1[java.lang.String, Spy]
  ): SpyAnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callFake")(callFake)
    __obj.updateDynamic("callThrough")(callThrough)
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("returnValues")(returnValues)
    __obj.updateDynamic("stub")(stub)
    __obj.updateDynamic("throwError")(throwError)
    __obj.asInstanceOf[SpyAnd]
  }
}

