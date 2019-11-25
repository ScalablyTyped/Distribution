package typings.jasmineDashExpect.distToHaveEvenNumberMod._Global_

import typings.jasmineDashExpect.distToHaveEvenNumberMod.ToHaveEvenNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveEvenNumber")
    var toHaveEvenNumber_Original: ToHaveEvenNumber = js.native
    def toHaveEvenNumber(key: String): Boolean = js.native
    def toHaveEvenNumber(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

