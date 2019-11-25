package typings.grommet.componentsRoutedButtonMod

import typings.grommet.grommetStrings.push
import typings.grommet.grommetStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutedButtonProps extends js.Object {
  var method: js.UndefOr[push | replace] = js.undefined
  var path: String
}

object RoutedButtonProps {
  @scala.inline
  def apply(path: String, method: push | replace = null): RoutedButtonProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedButtonProps]
  }
}

