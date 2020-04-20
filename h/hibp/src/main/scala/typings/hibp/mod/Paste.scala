package typings.hibp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paste extends js.Object {
  var Date: String
  var EmailCount: Double
  var Id: String
  var Source: String
  var Title: String
}

object Paste {
  @scala.inline
  def apply(Date: String, EmailCount: Double, Id: String, Source: String, Title: String): Paste = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], EmailCount = EmailCount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paste]
  }
}

