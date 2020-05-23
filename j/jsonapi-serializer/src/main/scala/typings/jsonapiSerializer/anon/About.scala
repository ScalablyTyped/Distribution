package typings.jsonapiSerializer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait About extends js.Object {
  var about: js.UndefOr[String] = js.undefined
}

object About {
  @scala.inline
  def apply(about: String = null): About = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    __obj.asInstanceOf[About]
  }
}

