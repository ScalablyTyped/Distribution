package typings.jasmineFixture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("affix")
@js.native
object affix extends js.Object {
  /**
    * Affixes the given jquery selectors into the body and will be removed after each spec
    * @param selector The JQuery selector to be added to the dom
    */
  def apply(selector: String): JQuery = js.native
}

