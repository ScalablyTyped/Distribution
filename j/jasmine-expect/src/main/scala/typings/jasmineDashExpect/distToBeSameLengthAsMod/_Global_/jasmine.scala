package typings.jasmineDashExpect.distToBeSameLengthAsMod._Global_

import typings.jasmineDashExpect.distToBeSameLengthAsMod.ToBeSameLengthAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeSameLengthAs")
    var toBeSameLengthAs_Original: ToBeSameLengthAs = js.native
    def toBeSameLengthAs(other: String): Boolean = js.native
    def toBeSameLengthAs(other: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

