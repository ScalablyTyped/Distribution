package typings
package ioniconsLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeProdData
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `class`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean] | java.lang.String] = js.undefined
  var className: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean] | java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object VNodeProdData {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `class`: org.scalablytyped.runtime.StringDictionary[scala.Boolean] | java.lang.String = null,
    className: org.scalablytyped.runtime.StringDictionary[scala.Boolean] | java.lang.String = null,
    key: java.lang.String | scala.Double = null,
    style: js.Any = null
  ): VNodeProdData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[VNodeProdData]
  }
}

