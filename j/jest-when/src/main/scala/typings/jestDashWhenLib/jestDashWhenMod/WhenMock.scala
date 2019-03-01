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
    calledWith: js.Function1[Y, WhenMock[T, Y]],
    expectCalledWith: js.Function1[Y, WhenMock[T, Y]],
    mockRejectedValue: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any, 
      WhenMock[T, Y]
    ],
    mockRejectedValueOnce: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any, 
      WhenMock[T, Y]
    ],
    mockResolvedValue: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any, 
      WhenMock[T, Y]
    ],
    mockResolvedValueOnce: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any, 
      WhenMock[T, Y]
    ],
    mockReturnValue: js.Function1[T, WhenMock[T, Y]],
    mockReturnValueOnce: js.Function1[T, WhenMock[T, Y]]
  ): WhenMock[T, Y] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calledWith")(calledWith)
    __obj.updateDynamic("expectCalledWith")(expectCalledWith)
    __obj.updateDynamic("mockRejectedValue")(mockRejectedValue)
    __obj.updateDynamic("mockRejectedValueOnce")(mockRejectedValueOnce)
    __obj.updateDynamic("mockResolvedValue")(mockResolvedValue)
    __obj.updateDynamic("mockResolvedValueOnce")(mockResolvedValueOnce)
    __obj.updateDynamic("mockReturnValue")(mockReturnValue)
    __obj.updateDynamic("mockReturnValueOnce")(mockReturnValueOnce)
    __obj.asInstanceOf[WhenMock[T, Y]]
  }
}

