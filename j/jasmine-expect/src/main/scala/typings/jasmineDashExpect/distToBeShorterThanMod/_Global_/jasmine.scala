package typings.jasmineDashExpect.distToBeShorterThanMod._Global_

import typings.jasmineDashExpect.distToBeShorterThanMod.ToBeShorterThan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeShorterThan")
    var toBeShorterThan_Original: ToBeShorterThan = js.native
    def toBeShorterThan(other: String): Boolean = js.native
    def toBeShorterThan(other: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

