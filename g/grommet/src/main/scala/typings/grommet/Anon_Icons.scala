package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icons extends js.Object {
  var icons: js.UndefOr[Anon_ColorColorType] = js.undefined
}

object Anon_Icons {
  @scala.inline
  def apply(icons: Anon_ColorColorType = null): Anon_Icons = {
    val __obj = js.Dynamic.literal()
    if (icons != null) __obj.updateDynamic("icons")(icons)
    __obj.asInstanceOf[Anon_Icons]
  }
}

