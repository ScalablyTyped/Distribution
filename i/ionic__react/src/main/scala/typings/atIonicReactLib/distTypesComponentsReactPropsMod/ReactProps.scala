package typings
package atIonicReactLib.distTypesComponentsReactPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object ReactProps {
  @scala.inline
  def apply(className: java.lang.String = null): ReactProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ReactProps]
  }
}

