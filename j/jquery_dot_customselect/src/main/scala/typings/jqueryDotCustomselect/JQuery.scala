package typings.jqueryDotCustomselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def customSelect(`val`: JQueryCustomSelectOption): JQuery
}

object JQuery {
  @scala.inline
  def apply(customSelect: JQueryCustomSelectOption => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(customSelect = js.Any.fromFunction1(customSelect))
  
    __obj.asInstanceOf[JQuery]
  }
}

