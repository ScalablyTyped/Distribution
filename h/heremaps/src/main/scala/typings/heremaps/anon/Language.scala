package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[js.Array[Leg]] = js.undefined
}

object Language {
  @scala.inline
  def apply(language: String = null, route: js.Array[Leg] = null): Language = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

