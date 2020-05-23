package typings.jqueryAjaxfile.Mocha.reporters

import typings.jqueryAjaxfile.anon.Failures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var stats: Failures
}

object Base {
  @scala.inline
  def apply(stats: Failures): Base = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

