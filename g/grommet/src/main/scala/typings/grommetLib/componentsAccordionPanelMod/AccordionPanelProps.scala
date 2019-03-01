package typings
package grommetLib.componentsAccordionPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPanelProps extends js.Object {
  var header: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var label: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object AccordionPanelProps {
  @scala.inline
  def apply(
    header: reactLib.reactMod.ReactNs.ReactNode = null,
    label: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null
  ): AccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionPanelProps]
  }
}

