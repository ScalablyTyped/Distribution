package typings.jasmineDashExpect.distToBeRegExpMod._Global_

import typings.jasmineDashExpect.distToBeRegExpMod.ToBeRegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeRegExp")
    var toBeRegExp_Original: ToBeRegExp = js.native
    def toBeRegExp(): Boolean = js.native
    def toBeRegExp(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

