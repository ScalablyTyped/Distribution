package typings.intercomDashWeb

import typings.intercomDashWeb.IntercomUnderscoreNs.IntercomSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var intercomSettings: IntercomSettings
}

object Window {
  @scala.inline
  def apply(intercomSettings: IntercomSettings): Window = {
    val __obj = js.Dynamic.literal(intercomSettings = intercomSettings)
  
    __obj.asInstanceOf[Window]
  }
}

