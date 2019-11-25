package typings.grommet.componentsSkipLinkMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkProps extends js.Object {
  var id: String
  var label: js.UndefOr[ReactNode] = js.undefined
}

object SkipLinkProps {
  @scala.inline
  def apply(id: String, label: ReactNode = null): SkipLinkProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkProps]
  }
}

