package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Analog extends js.Object {
  var analog: js.UndefOr[Anon_ExtendHour] = js.undefined
  var digital: js.UndefOr[Anon_Text] = js.undefined
}

object Anon_Analog {
  @scala.inline
  def apply(analog: Anon_ExtendHour = null, digital: Anon_Text = null): Anon_Analog = {
    val __obj = js.Dynamic.literal()
    if (analog != null) __obj.updateDynamic("analog")(analog.asInstanceOf[js.Any])
    if (digital != null) __obj.updateDynamic("digital")(digital.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Analog]
  }
}

