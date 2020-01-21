package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFound extends js.Object {
  var endsAt: Double
  var number: PhoneNumber
  var startsAt: Double
}

object NumberFound {
  @scala.inline
  def apply(endsAt: Double, number: PhoneNumber, startsAt: Double): NumberFound = {
    val __obj = js.Dynamic.literal(endsAt = endsAt.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberFound]
  }
}

