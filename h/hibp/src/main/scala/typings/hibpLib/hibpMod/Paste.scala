package typings
package hibpLib.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paste extends js.Object {
  var Date: java.lang.String
  var EmailCount: scala.Double
  var Id: java.lang.String
  var Source: java.lang.String
  var Title: java.lang.String
}

object Paste {
  @scala.inline
  def apply(
    Date: java.lang.String,
    EmailCount: scala.Double,
    Id: java.lang.String,
    Source: java.lang.String,
    Title: java.lang.String
  ): Paste = {
    val __obj = js.Dynamic.literal(Date = Date, EmailCount = EmailCount, Id = Id, Source = Source, Title = Title)
  
    __obj.asInstanceOf[Paste]
  }
}

