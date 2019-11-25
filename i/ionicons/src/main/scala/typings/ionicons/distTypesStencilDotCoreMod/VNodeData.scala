package typings.ionicons.distTypesStencilDotCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeData
  extends /* attrName */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object VNodeData {
  @scala.inline
  def apply(
    StringDictionary: /* attrName */ StringDictionary[js.Any] = null,
    `class`: StringDictionary[Boolean] = null,
    style: js.Any = null
  ): VNodeData = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeData]
  }
}

