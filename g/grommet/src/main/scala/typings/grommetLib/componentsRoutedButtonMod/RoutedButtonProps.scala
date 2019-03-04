package typings
package grommetLib.componentsRoutedButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutedButtonProps extends js.Object {
  var method: js.UndefOr[grommetLib.grommetLibStrings.push | grommetLib.grommetLibStrings.replace] = js.undefined
  var path: java.lang.String
}

object RoutedButtonProps {
  @scala.inline
  def apply(
    path: java.lang.String,
    method: grommetLib.grommetLibStrings.push | grommetLib.grommetLibStrings.replace = null
  ): RoutedButtonProps = {
    val __obj = js.Dynamic.literal(path = path)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedButtonProps]
  }
}

