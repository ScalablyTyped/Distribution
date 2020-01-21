package typings.jsonapiSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbout extends js.Object {
  var about: js.UndefOr[String] = js.undefined
}

object AnonAbout {
  @scala.inline
  def apply(about: String = null): AnonAbout = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbout]
  }
}

