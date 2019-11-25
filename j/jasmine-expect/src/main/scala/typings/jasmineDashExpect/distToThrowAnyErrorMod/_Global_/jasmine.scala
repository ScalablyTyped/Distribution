package typings.jasmineDashExpect.distToThrowAnyErrorMod._Global_

import typings.jasmineDashExpect.distToThrowAnyErrorMod.ToThrowAnyError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toThrowAnyError")
    var toThrowAnyError_Original: ToThrowAnyError = js.native
    def toThrowAnyError(): Boolean = js.native
    def toThrowAnyError(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

