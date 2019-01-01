package typings
package jestDashWhenLib.jestDashWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait When extends js.Object {
  def apply[T](fn: jestLib.jestNs.Mock[T]): When = js.native
  def apply[T](fn: jestLib.jestNs.Mocked[T]): When = js.native
  // due to no-unnecessary-generics lint rule, the generics have been replaced with 'any'
  // calledWith<T>(...matchers: any[]): PartialMockInstance<T>;
  // expectCalledWith<T>(...matchers: any[]): PartialMockInstance<T>;
  def calledWith(matchers: js.Any*): When = js.native
  def expectCalledWith(matchers: js.Any*): When = js.native
  def mockRejectedValue(value: js.Any): (js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[_]]) with When = js.native
  def mockRejectedValueOnce(value: js.Any): (js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[_]]) with When = js.native
  def mockResolvedValue(value: js.Any): (js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[_]]) with When = js.native
  def mockResolvedValueOnce(value: js.Any): (js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[_]]) with When = js.native
  def mockReturnValue(value: js.Any): (js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[_]]) with When = js.native
  def mockReturnValueOnce(value: js.Any): (js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[_]]) with When = js.native
}

