package typings
package jasmineDashFixtureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /**
    * Affixes the given jquery selectors into the element and will be removed after each spec
    * @param selector The JQuery selector to be added to the dom
    */
  def affix(selector: java.lang.String): JQuery
}

object JQuery {
  @scala.inline
  def apply(affix: js.Function1[java.lang.String, JQuery]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("affix")(affix)
    __obj.asInstanceOf[JQuery]
  }
}

