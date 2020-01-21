package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[js.Array[AnonLeg]] = js.undefined
}

object AnonLanguage {
  @scala.inline
  def apply(language: String = null, route: js.Array[AnonLeg] = null): AnonLanguage = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguage]
  }
}

