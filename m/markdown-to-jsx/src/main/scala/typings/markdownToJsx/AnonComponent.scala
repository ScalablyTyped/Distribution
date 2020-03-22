package typings.markdownToJsx

import typings.react.mod.ComponentClass
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent[P, S] extends js.Object {
  var component: String | (ComponentClass[P, S]) | SFC[P]
  var props: js.UndefOr[js.Any] = js.undefined
}

object AnonComponent {
  @scala.inline
  def apply[P, S](component: String | (ComponentClass[P, S]) | SFC[P], props: js.Any = null): AnonComponent[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent[P, S]]
  }
}

