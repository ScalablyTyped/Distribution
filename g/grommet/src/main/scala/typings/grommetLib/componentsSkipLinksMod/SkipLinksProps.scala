package typings
package grommetLib.componentsSkipLinksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinksProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var messages: js.UndefOr[grommetLib.Anon_SkipTo] = js.undefined
}

object SkipLinksProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode, messages: grommetLib.Anon_SkipTo = null): SkipLinksProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    __obj.asInstanceOf[SkipLinksProps]
  }
}

