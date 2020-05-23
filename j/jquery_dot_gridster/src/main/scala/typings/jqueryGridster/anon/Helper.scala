package typings.jqueryGridster.anon

import typings.jqueryGridster.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Helper extends js.Object {
  var helper: JQuery
}

object Helper {
  @scala.inline
  def apply(helper: JQuery): Helper = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Helper]
  }
}

