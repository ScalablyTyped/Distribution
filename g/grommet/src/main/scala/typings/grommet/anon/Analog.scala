package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analog extends js.Object {
  var analog: js.UndefOr[Hour] = js.undefined
  var digital: js.UndefOr[TextXsmall] = js.undefined
}

object Analog {
  @scala.inline
  def apply(analog: Hour = null, digital: TextXsmall = null): Analog = {
    val __obj = js.Dynamic.literal()
    if (analog != null) __obj.updateDynamic("analog")(analog.asInstanceOf[js.Any])
    if (digital != null) __obj.updateDynamic("digital")(digital.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analog]
  }
}

