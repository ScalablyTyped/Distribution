package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: String
  var html: String
  var subject: String
  var text: String
  var to: String
}

object Anon_From {
  @scala.inline
  def apply(from: String, html: String, subject: String, text: String, to: String): Anon_From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_From]
  }
}

