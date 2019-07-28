package typings.grommet.componentsSkipLinksMod

import typings.grommet.Anon_SkipTo
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinksProps extends js.Object {
  var children: ReactNode
  var messages: js.UndefOr[Anon_SkipTo] = js.undefined
}

object SkipLinksProps {
  @scala.inline
  def apply(children: ReactNode, messages: Anon_SkipTo = null): SkipLinksProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    __obj.asInstanceOf[SkipLinksProps]
  }
}

