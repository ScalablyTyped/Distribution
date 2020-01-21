package typings.jasmineFixture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /**
    * Affixes the given jquery selectors into the element and will be removed after each spec
    * @param selector The JQuery selector to be added to the dom
    */
  def affix(selector: String): JQuery
}

object JQuery {
  @scala.inline
  def apply(affix: String => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(affix = js.Any.fromFunction1(affix))
  
    __obj.asInstanceOf[JQuery]
  }
}

