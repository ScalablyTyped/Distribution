package typings
package grommetLib.componentsSkipLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkProps extends js.Object {
  var id: java.lang.String
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object SkipLinkProps {
  @scala.inline
  def apply(id: java.lang.String, label: reactLib.reactMod.ReactNode = null): SkipLinkProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkProps]
  }
}

