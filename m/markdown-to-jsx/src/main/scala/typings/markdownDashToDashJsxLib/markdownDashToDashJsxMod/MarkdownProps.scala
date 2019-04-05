package typings
package markdownDashToDashJsxLib.markdownDashToDashJsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownProps extends js.Object {
  // React.ReactNode contains both null and undefined
  // tslint:disable-next-line:no-null-undefined-union
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var options: js.UndefOr[MarkdownOptions] = js.undefined
}

object MarkdownProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode = null, options: MarkdownOptions = null): MarkdownProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[MarkdownProps]
  }
}

