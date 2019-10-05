package typings.jsmockito.JsMockito

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsMockito.JsMockitoStubBuilder")
@js.native
class JsMockitoStubBuilder () extends js.Object {
  /**
    * Provide functions to be run in place of the mocked method.
    *
    * @param func Functions to be run in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def `then`(func: (js.Function1[/* obj */ js.Any, _])*): JsMockitoStubBuilder = js.native
  /**
    * Provide values to be returned by the mocked function.
    *
    * @param obj Values to be returned in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def thenReturn(obj: js.Any*): JsMockitoStubBuilder = js.native
  /**
    * Provide exceptions to be thrown by the mocked function.
    *
    * @param obj Exceptions to be thrown in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def thenThrow(obj: Error*): JsMockitoStubBuilder = js.native
}

