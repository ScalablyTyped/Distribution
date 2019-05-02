package typings
package jestDashWhenLib.jestDashWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait WhenMock[T, Y /* <: js.Array[_] */] extends js.Object {
  def calledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): WhenMock[T, Y] = js.native
  def expectCalledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): WhenMock[T, Y] = js.native
  def mockImplementation(fn: js.Function1[/* args */ Y, T]): WhenMock[T, Y] = js.native
  def mockImplementationOnce(): WhenMock[T, Y] = js.native
  def mockImplementationOnce(fn: js.Function1[/* args */ Y, T]): WhenMock[T, Y] = js.native
  def mockRejectedValue(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
  ): WhenMock[T, Y] = js.native
  def mockRejectedValueOnce(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
  ): WhenMock[T, Y] = js.native
  def mockResolvedValue(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
  ): WhenMock[T, Y] = js.native
  def mockResolvedValueOnce(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
  ): WhenMock[T, Y] = js.native
  def mockReturnValue(value: T): WhenMock[T, Y] = js.native
  def mockReturnValueOnce(value: T): WhenMock[T, Y] = js.native
}

