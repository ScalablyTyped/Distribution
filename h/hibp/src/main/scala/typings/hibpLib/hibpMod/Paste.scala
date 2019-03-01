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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Date")(Date)
    __obj.updateDynamic("EmailCount")(EmailCount)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[Paste]
  }
}

