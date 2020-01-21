package typings.markdownToJsx

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends js.Object {
  var component: String | (ComponentClass[js.Object, ComponentState]) | SFC[js.Object]
  var props: js.UndefOr[js.Any] = js.undefined
}

object AnonComponent {
  @scala.inline
  def apply(
    component: String | (ComponentClass[js.Object, ComponentState]) | SFC[js.Object],
    props: js.Any = null
  ): AnonComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
}

