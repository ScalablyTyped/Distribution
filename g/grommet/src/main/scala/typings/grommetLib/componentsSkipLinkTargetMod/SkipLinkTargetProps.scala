package typings
package grommetLib.componentsSkipLinkTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkTargetProps extends js.Object {
  var id: java.lang.String
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object SkipLinkTargetProps {
  @scala.inline
  def apply(id: java.lang.String, label: reactLib.reactMod.ReactNs.ReactNode = null): SkipLinkTargetProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkTargetProps]
  }
}

