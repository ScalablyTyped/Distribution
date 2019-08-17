package typings.jestDashWhen.jestDashWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.MockInstance<T, Y> * / any */ @js.native
trait WhenMock[T, Y /* <: js.Array[_] */] extends js.Object {
  def calledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): this.type = js.native
  def expectCalledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): this.type = js.native
  def mockImplementation(fn: js.Function1[/* args */ Y, T]): this.type = js.native
  def mockImplementationOnce(): this.type = js.native
  def mockImplementationOnce(fn: js.Function1[/* args */ Y, T]): this.type = js.native
  def mockRejectedValue(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
  ): this.type = js.native
  def mockRejectedValueOnce(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
  ): this.type = js.native
  def mockResolvedValue(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
  ): this.type = js.native
  def mockResolvedValueOnce(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
  ): this.type = js.native
  def mockReturnValue(value: T): this.type = js.native
  def mockReturnValueOnce(value: T): this.type = js.native
}

