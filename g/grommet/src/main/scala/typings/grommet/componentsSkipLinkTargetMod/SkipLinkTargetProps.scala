package typings.grommet.componentsSkipLinkTargetMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkTargetProps extends js.Object {
  var id: String
  var label: js.UndefOr[ReactNode] = js.undefined
}

object SkipLinkTargetProps {
  @scala.inline
  def apply(id: String, label: ReactNode = null): SkipLinkTargetProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkTargetProps]
  }
}

