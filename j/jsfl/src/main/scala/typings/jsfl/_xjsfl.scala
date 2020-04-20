package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _xjsfl extends js.Object {
  var uri: String
  def init(_this: js.Any): Unit
}

object _xjsfl {
  @scala.inline
  def apply(init: js.Any => Unit, uri: String): _xjsfl = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[_xjsfl]
  }
}

