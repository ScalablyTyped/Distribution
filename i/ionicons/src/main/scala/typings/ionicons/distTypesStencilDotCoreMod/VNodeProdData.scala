package typings.ionicons.distTypesStencilDotCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeProdData
  extends /* key */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[StringDictionary[Boolean] | String] = js.undefined
  var className: js.UndefOr[StringDictionary[Boolean] | String] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object VNodeProdData {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `class`: StringDictionary[Boolean] | String = null,
    className: StringDictionary[Boolean] | String = null,
    key: String | Double = null,
    style: js.Any = null
  ): VNodeProdData = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeProdData]
  }
}

