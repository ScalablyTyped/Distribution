package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTerm extends js.Object {
  // the term to search for
  var filter: js.Object
  var term: String
}

object AnonTerm {
  @scala.inline
  def apply(filter: js.Object, term: String): AnonTerm = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTerm]
  }
}

