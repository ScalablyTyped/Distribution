package typings
package jestDashWhenLib.jestDashWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait WhenMock[T, Y /* <: js.Array[_] */] extends js.Object {
  def calledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): WhenMock[T, Y]
  def expectCalledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): WhenMock[T, Y]
  def mockRejectedValue(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
  ): WhenMock[T, Y]
  def mockRejectedValueOnce(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
  ): WhenMock[T, Y]
  def mockResolvedValue(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
  ): WhenMock[T, Y]
  def mockResolvedValueOnce(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
  ): WhenMock[T, Y]
  def mockReturnValue(value: T): WhenMock[T, Y]
  def mockReturnValueOnce(value: T): WhenMock[T, Y]
}

object WhenMock {
  @scala.inline
  def apply[T, Y /* <: js.Array[_] */](
    calledWith: Y => WhenMock[T, Y],
    expectCalledWith: Y => WhenMock[T, Y],
    mockRejectedValue: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any => WhenMock[T, Y],
    mockRejectedValueOnce: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any => WhenMock[T, Y],
    mockResolvedValue: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any => WhenMock[T, Y],
    mockResolvedValueOnce: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any => WhenMock[T, Y],
    mockReturnValue: T => WhenMock[T, Y],
    mockReturnValueOnce: T => WhenMock[T, Y]
  ): WhenMock[T, Y] = {
    val __obj = js.Dynamic.literal(calledWith = js.Any.fromFunction1(calledWith), expectCalledWith = js.Any.fromFunction1(expectCalledWith), mockRejectedValue = js.Any.fromFunction1(mockRejectedValue), mockRejectedValueOnce = js.Any.fromFunction1(mockRejectedValueOnce), mockResolvedValue = js.Any.fromFunction1(mockResolvedValue), mockResolvedValueOnce = js.Any.fromFunction1(mockResolvedValueOnce), mockReturnValue = js.Any.fromFunction1(mockReturnValue), mockReturnValueOnce = js.Any.fromFunction1(mockReturnValueOnce))
  
    __obj.asInstanceOf[WhenMock[T, Y]]
  }
}

