package typings.grommet.componentsAccordionPanelMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPanelProps extends js.Object {
  var header: js.UndefOr[ReactNode] = js.undefined
  var label: js.UndefOr[String | ReactNode] = js.undefined
}

object AccordionPanelProps {
  @scala.inline
  def apply(header: ReactNode = null, label: String | ReactNode = null): AccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionPanelProps]
  }
}

