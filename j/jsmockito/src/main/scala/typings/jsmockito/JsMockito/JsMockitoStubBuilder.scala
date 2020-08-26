package typings.jsmockito.JsMockito

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsMockitoStubBuilder extends js.Object {
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
  @scala.inline
  implicit class JsMockitoStubBuilderOps[Self <: JsMockitoStubBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setThen(value: /* repeated */ js.Function1[/* obj */ js.Any, _] => JsMockitoStubBuilder): Self = this.set("then", js.Any.fromFunction1(value))
    @scala.inline
    def setThenReturn(value: /* repeated */ js.Any => JsMockitoStubBuilder): Self = this.set("thenReturn", js.Any.fromFunction1(value))
    @scala.inline
    def setThenThrow(value: /* repeated */ Error => JsMockitoStubBuilder): Self = this.set("thenThrow", js.Any.fromFunction1(value))
  }
  
}

