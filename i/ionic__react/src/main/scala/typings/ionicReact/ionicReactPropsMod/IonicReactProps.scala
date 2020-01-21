package typings.ionicReact.ionicReactPropsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicReactProps extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object IonicReactProps {
  @scala.inline
  def apply(`class`: String = null, className: String = null, style: StringDictionary[js.Any] = null): IonicReactProps = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicReactProps]
  }
}

