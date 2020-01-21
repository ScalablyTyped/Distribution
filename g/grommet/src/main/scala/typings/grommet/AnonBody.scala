package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.UndefOr[String | AnonColorDark | js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[String | AnonColorDark] = js.undefined
  var header: js.UndefOr[String | AnonColorDark] = js.undefined
  var light: js.UndefOr[String] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(
    body: String | AnonColorDark | js.Array[String] = null,
    color: String = null,
    dark: String = null,
    footer: String | AnonColorDark = null,
    header: String | AnonColorDark = null,
    light: String = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

