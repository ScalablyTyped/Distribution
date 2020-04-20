package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: String
  var html: String
  var subject: String
  var text: String
  var to: String
}

object AnonFrom {
  @scala.inline
  def apply(from: String, html: String, subject: String, text: String, to: String): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

