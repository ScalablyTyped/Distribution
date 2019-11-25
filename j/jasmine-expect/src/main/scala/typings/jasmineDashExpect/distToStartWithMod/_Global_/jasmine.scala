package typings.jasmineDashExpect.distToStartWithMod._Global_

import typings.jasmineDashExpect.distToStartWithMod.ToStartWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toStartWith")
    var toStartWith_Original: ToStartWith = js.native
    def toStartWith(subString: String): Boolean = js.native
    def toStartWith(subString: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

