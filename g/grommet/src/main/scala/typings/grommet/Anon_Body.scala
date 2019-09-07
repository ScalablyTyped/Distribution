package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[String | Anon_ColorDark] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[String | Anon_ColorDark] = js.undefined
  var header: js.UndefOr[String | Anon_ColorDark] = js.undefined
  var light: js.UndefOr[String] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: String | Anon_ColorDark = null,
    color: String = null,
    dark: String = null,
    footer: String | Anon_ColorDark = null,
    header: String | Anon_ColorDark = null,
    light: String = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light)
    __obj.asInstanceOf[Anon_Body]
  }
}

