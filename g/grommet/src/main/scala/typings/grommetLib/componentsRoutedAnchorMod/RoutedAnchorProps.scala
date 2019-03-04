package typings
package grommetLib.componentsRoutedAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutedAnchorProps extends js.Object {
  var method: js.UndefOr[grommetLib.grommetLibStrings.push | grommetLib.grommetLibStrings.replace] = js.undefined
  var path: java.lang.String
}

object RoutedAnchorProps {
  @scala.inline
  def apply(
    path: java.lang.String,
    method: grommetLib.grommetLibStrings.push | grommetLib.grommetLibStrings.replace = null
  ): RoutedAnchorProps = {
    val __obj = js.Dynamic.literal(path = path)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedAnchorProps]
  }
}

