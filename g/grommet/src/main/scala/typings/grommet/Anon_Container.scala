package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: js.UndefOr[Anon_Align] = js.undefined
  var text: js.UndefOr[Anon_Margin] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(container: Anon_Align = null, text: Anon_Margin = null): Anon_Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Container]
  }
}

