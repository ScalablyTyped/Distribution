package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[Boolean | String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(background: Boolean | String = null): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Background]
  }
}

