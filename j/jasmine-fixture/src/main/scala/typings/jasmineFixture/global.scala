package typings.jasmineFixture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * Affixes the given jquery selectors into the body and will be removed after each spec
    * @param selector The JQuery selector to be added to the dom
    */
  def affix(selector: String): JQuery = js.native
}

