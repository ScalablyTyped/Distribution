package typings.jasmineDashExpect.distToHaveTrueMod._Global_

import typings.jasmineDashExpect.distToHaveTrueMod.ToHaveTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveTrue")
    var toHaveTrue_Original: ToHaveTrue = js.native
    def toHaveTrue(key: String): Boolean = js.native
    def toHaveTrue(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

