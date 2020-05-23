package typings.lasso.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crossorigin extends js.Object {
  var crossorigin: String
  var integrity: String
}

object Crossorigin {
  @scala.inline
  def apply(crossorigin: String, integrity: String): Crossorigin = {
    val __obj = js.Dynamic.literal(crossorigin = crossorigin.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crossorigin]
  }
}

