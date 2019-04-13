package typings
package markdownDashToDashJsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var component: java.lang.String | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.SFC[js.Object]
  var props: js.UndefOr[js.Any] = js.undefined
}

object Anon_Component {
  @scala.inline
  def apply(
    component: java.lang.String | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.SFC[js.Object],
    props: js.Any = null
  ): Anon_Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[Anon_Component]
  }
}

