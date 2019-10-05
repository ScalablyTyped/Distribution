package typings.jsmockito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mockFunction")
@js.native
object mockFunction extends js.Object {
  /**
    * Create a mockable and stubbable anonymous function.
    *
    * <p>Once created, the function can be invoked and will return undefined for
    * any interactions that do not match stub declarations.</p>
    *
    * <pre>
    * var mockFunc = JsMockito.mockFunction();
    * JsMockito.when(mockFunc).call(anything(), 1, 5).thenReturn(6);
    * mockFunc(1, 5); // result is 6
    * JsMockito.verify(mockFunc)(1, greaterThan(2));
    * </pre>
    *
    * @param funcName The name of the mock function to use in messages (defaults to 'func')
    * @param delegate The function to delegate unstubbed calls to (optional)
    * @return {T} an anonymous function
    */
  def apply(): js.Function = js.native
  def apply(funcName: String): js.Function = js.native
  def apply(funcName: String, delegate: js.Function): js.Function = js.native
}

