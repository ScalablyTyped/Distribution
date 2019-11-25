package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[js.Array[Anon_Leg]] = js.undefined
}

object Anon_Language {
  @scala.inline
  def apply(language: String = null, route: js.Array[Anon_Leg] = null): Anon_Language = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Language]
  }
}

