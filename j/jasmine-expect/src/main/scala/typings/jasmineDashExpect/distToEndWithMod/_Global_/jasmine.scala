package typings.jasmineDashExpect.distToEndWithMod._Global_

import typings.jasmineDashExpect.distToEndWithMod.ToEndWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toEndWith")
    var toEndWith_Original: ToEndWith = js.native
    def toEndWith(subString: String): Boolean = js.native
    def toEndWith(subString: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

