package typings.jasmineFixture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Affixes the given jquery selectors into the element and will be removed after each spec
    * @param selector The JQuery selector to be added to the dom
    */
  def affix(selector: String): JQuery = js.native
}

object JQuery {
  @scala.inline
  def apply(affix: String => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(affix = js.Any.fromFunction1(affix))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAffix(value: String => JQuery): Self = this.set("affix", js.Any.fromFunction1(value))
  }
  
}

