package typings.atIonicReact.distTypesComponentsReactPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object ReactProps {
  @scala.inline
  def apply(className: String = null): ReactProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ReactProps]
  }
}

