package typings.markdownDashToDashJsx

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var component: String | (ComponentClass[js.Object, ComponentState]) | SFC[js.Object]
  var props: js.UndefOr[js.Any] = js.undefined
}

object Anon_Component {
  @scala.inline
  def apply(
    component: String | (ComponentClass[js.Object, ComponentState]) | SFC[js.Object],
    props: js.Any = null
  ): Anon_Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[Anon_Component]
  }
}

