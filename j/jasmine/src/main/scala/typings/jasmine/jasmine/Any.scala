package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
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

