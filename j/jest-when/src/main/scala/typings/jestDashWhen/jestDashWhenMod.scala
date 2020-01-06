package typings.jestDashWhen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-when", JSImport.Namespace)
@js.native
object jestDashWhenMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MockInstance<T, Y> * / any */ @js.native
  trait WhenMock[T, Y /* <: js.Array[_] */] extends js.Object {
    def calledWith(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
    ): this.type = js.native
    def expectCalledWith(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
    ): this.type = js.native
    def mockImplementation(fn: js.Function1[/* args */ Y, T]): this.type = js.native
    def mockImplementationOnce(): this.type = js.native
    def mockImplementationOnce(fn: js.Function1[/* args */ Y, T]): this.type = js.native
    def mockRejectedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
    ): this.type = js.native
    def mockRejectedValueOnce(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ js.Any
    ): this.type = js.native
    def mockResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
    ): this.type = js.native
    def mockResolvedValueOnce(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ js.Any
    ): this.type = js.native
    def mockReturnValue(value: T): this.type = js.native
    def mockReturnValueOnce(value: T): this.type = js.native
  }
  
  val when: When = js.native
  def resetAllWhenMocks(): Unit = js.native
  def verifyAllWhenMocksCalled(): Unit = js.native
  type When = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MockInstance<T, Y> */ /* fn */ js.Any, 
    WhenMock[js.Any, js.Array[js.Any]]
  ]
}

