package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var route: js.UndefOr[js.Array[Anon_Leg]] = js.undefined
}

object Anon_Language {
  @scala.inline
  def apply(language: java.lang.String = null, route: js.Array[Anon_Leg] = null): Anon_Language = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[Anon_Language]
  }
}

