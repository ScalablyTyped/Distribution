package typings.jqueryDotAjaxfile.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Suite` class. */
trait ISuite extends js.Object {
  var parent: ISuite
  var title: String
  def fullTitle(): String
}

object ISuite {
  @scala.inline
  def apply(fullTitle: () => String, parent: ISuite, title: String): ISuite = {
    val __obj = js.Dynamic.literal(fullTitle = js.Any.fromFunction0(fullTitle), parent = parent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISuite]
  }
}

