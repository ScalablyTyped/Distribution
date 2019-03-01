package typings
package atLinguiReactLib.renderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object RenderProps {
  @scala.inline
  def apply(className: java.lang.String = null, render: reactLib.reactMod.ReactNs.ReactNode = null): RenderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

