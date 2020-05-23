package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends js.Object {
  // the term to search for
  var filter: js.Object
  var term: String
}

object Term {
  @scala.inline
  def apply(filter: js.Object, term: String): Term = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
}

