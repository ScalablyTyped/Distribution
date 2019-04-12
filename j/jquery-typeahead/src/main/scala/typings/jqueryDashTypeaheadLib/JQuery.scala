package typings
package jqueryDashTypeaheadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def typeahead(options: jqueryDashTypeaheadLib.RunningCoderNs.TypeaheadNs.Options): JQuery
}

object JQuery {
  @scala.inline
  def apply(typeahead: jqueryDashTypeaheadLib.RunningCoderNs.TypeaheadNs.Options => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(typeahead = js.Any.fromFunction1(typeahead))
  
    __obj.asInstanceOf[JQuery]
  }
}

