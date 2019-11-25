package typings.jasmineDashExpect.distToHaveStringShorterThanMod._Global_

import typings.jasmineDashExpect.distToHaveStringShorterThanMod.ToHaveStringShorterThan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveStringShorterThan")
    var toHaveStringShorterThan_Original: ToHaveStringShorterThan = js.native
    def toHaveStringShorterThan(key: String, other: String): Boolean = js.native
    def toHaveStringShorterThan(key: String, other: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

