package typings.jasmine.jasmine

import typings.std.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine.any")
@js.native
object any extends js.Object {
  /**
    * That will succeed if the actual value being compared is an instance of the specified class/constructor.
    */
  def apply(aclass: Constructor): AsymmetricMatcher[_] = js.native
  def apply(aclass: Symbol): AsymmetricMatcher[_] = js.native
}

