package typings.atLinguiMacro.renderMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[ReactNode] = js.undefined
}

object RenderProps {
  @scala.inline
  def apply(className: String = null, description: String = null, render: ReactNode = null): RenderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

