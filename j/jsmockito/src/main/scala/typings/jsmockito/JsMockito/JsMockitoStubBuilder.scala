package typings.jsmockito.JsMockito

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsMockitoStubBuilder extends js.Object {
  /**
    * Provide functions to be run in place of the mocked method.
    *
    * @param func Functions to be run in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def `then`(func: (js.Function1[/* obj */ js.Any, _])*): JsMockitoStubBuilder
  /**
    * Provide values to be returned by the mocked function.
    *
    * @param obj Values to be returned in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def thenReturn(obj: js.Any*): JsMockitoStubBuilder
  /**
    * Provide exceptions to be thrown by the mocked function.
    *
    * @param obj Exceptions to be thrown in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def thenThrow(obj: Error*): JsMockitoStubBuilder
}

object JsMockitoStubBuilder {
  @scala.inline
  def apply(
    `then`: /* repeated */ js.Function1[/* obj */ js.Any, _] => JsMockitoStubBuilder,
    thenReturn: /* repeated */ js.Any => JsMockitoStubBuilder,
    thenThrow: /* repeated */ Error => JsMockitoStubBuilder
  ): JsMockitoStubBuilder = {
    val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[JsMockitoStubBuilder]
  }
}

