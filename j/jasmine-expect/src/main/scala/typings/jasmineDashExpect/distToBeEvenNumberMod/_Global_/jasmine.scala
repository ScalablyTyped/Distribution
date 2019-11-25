package typings.jasmineDashExpect.distToBeEvenNumberMod._Global_

import typings.jasmineDashExpect.distToBeEvenNumberMod.ToBeEvenNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeEvenNumber")
    var toBeEvenNumber_Original: ToBeEvenNumber = js.native
    def toBeEvenNumber(): Boolean = js.native
    def toBeEvenNumber(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

