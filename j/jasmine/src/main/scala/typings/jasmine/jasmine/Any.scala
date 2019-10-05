package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import typings.std.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Any
  extends AsymmetricMatcher[js.Any]
     with _Expected[js.Any]
     with  // jasmine.Any can also be a function
Instantiable1[/* expectedClass */ js.Any, js.Any] {
  def apply(params: js.Any*): js.Any = js.native
  def jasmineMatches(other: js.Any): Boolean = js.native
  @JSName("jasmineToString")
  def jasmineToString_MAny(): String = js.native
}

@JSGlobal("jasmine.any")
@js.native
object any extends js.Object {
  /**
    * That will succeed if the actual value being compared is an instance of the specified class/constructor.
    */
  def apply(aclass: Constructor): AsymmetricMatcher[_] = js.native
  def apply(aclass: Symbol): AsymmetricMatcher[_] = js.native
}

