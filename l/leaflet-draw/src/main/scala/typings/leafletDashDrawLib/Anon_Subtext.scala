package typings
package leafletDashDrawLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Subtext extends js.Object {
  var subtext: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object Anon_Subtext {
  @scala.inline
  def apply(text: java.lang.String, subtext: java.lang.String = null): Anon_Subtext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (subtext != null) __obj.updateDynamic("subtext")(subtext)
    __obj.asInstanceOf[Anon_Subtext]
  }
}

