package typings.jasmine.jasmine

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpyAnd extends js.Object {
  var identity: String = js.native
  /** By chaining the spy with and.callFake, all calls to the spy will delegate to the supplied function. */
  def callFake(fn: js.Function): Spy = js.native
  /** By chaining the spy with and.callThrough, the spy will still track all calls to it but in addition it will delegate to the actual implementation. */
  def callThrough(): Spy = js.native
  /** Tell the spy to return a promise rejecting with the specified value when invoked. */
  def rejectWith(): Spy = js.native
  def rejectWith(`val`: js.Any): Spy = js.native
  /** Tell the spy to return a promise resolving to the specified value when invoked. */
  def resolveTo(): Spy = js.native
  def resolveTo(`val`: js.Any): Spy = js.native
  /** By chaining the spy with and.returnValue, all calls to the function will return a specific value. */
  def returnValue(`val`: js.Any): Spy = js.native
  /** By chaining the spy with and.returnValues, all calls to the function will return specific values in order until it reaches the end of the return values list. */
  def returnValues(values: js.Any*): Spy = js.native
  /** When a calling strategy is used for a spy, the original stubbing behavior can be returned at any time with and.stub. */
  def stub(): Spy = js.native
  /** By chaining the spy with and.throwError, all calls to the spy will throw the specified value. */
  def throwError(msg: String): Spy = js.native
  def throwError(msg: Error): Spy = js.native
}

