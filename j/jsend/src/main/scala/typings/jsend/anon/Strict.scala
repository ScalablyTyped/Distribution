package typings.jsend.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strict extends js.Object {
  var strict: Boolean
}

object Strict {
  @scala.inline
  def apply(strict: Boolean): Strict = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strict]
  }
}

