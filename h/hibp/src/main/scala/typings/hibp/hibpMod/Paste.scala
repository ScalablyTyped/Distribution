package typings.hibp.hibpMod

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
    val __obj = js.Dynamic.literal(Date = Date, EmailCount = EmailCount, Id = Id, Source = Source, Title = Title)
  
    __obj.asInstanceOf[Paste]
  }
}

