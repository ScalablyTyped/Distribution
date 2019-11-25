package typings.grommet.componentsRoutedAnchorMod

import typings.grommet.grommetStrings.push
import typings.grommet.grommetStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutedAnchorProps extends js.Object {
  var method: js.UndefOr[push | replace] = js.undefined
  var path: String
}

object RoutedAnchorProps {
  @scala.inline
  def apply(path: String, method: push | replace = null): RoutedAnchorProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedAnchorProps]
  }
}

