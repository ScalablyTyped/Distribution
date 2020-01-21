package typings.jqueryTypeahead

import typings.jqueryTypeahead.RunningCoder.Typeahead.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def typeahead(options: Options): JQuery
}

object JQuery {
  @scala.inline
  def apply(typeahead: Options => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(typeahead = js.Any.fromFunction1(typeahead))
  
    __obj.asInstanceOf[JQuery]
  }
}

