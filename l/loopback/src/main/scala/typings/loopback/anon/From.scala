package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var from: String
  var html: String
  var subject: String
  var text: String
  var to: String
}

object From {
  @scala.inline
  def apply(from: String, html: String, subject: String, text: String, to: String): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

