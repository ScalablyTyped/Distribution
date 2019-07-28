package typings.jqueryDashTypeahead

import typings.jqueryDashTypeahead.RunningCoderNs.TypeaheadNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def typeahead(options: Options): JQuery
}

object JQueryStatic {
  @scala.inline
  def apply(typeahead: Options => JQuery): JQueryStatic = {
    val __obj = js.Dynamic.literal(typeahead = js.Any.fromFunction1(typeahead))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

