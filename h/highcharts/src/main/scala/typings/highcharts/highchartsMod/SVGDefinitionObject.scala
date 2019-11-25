package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGDefinitionObject
  extends /* key */ StringDictionary[js.UndefOr[Double | String | js.Array[SVGDefinitionObject]]] {
  var children: js.UndefOr[js.Array[SVGDefinitionObject]] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
}

object SVGDefinitionObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[Double | String | js.Array[SVGDefinitionObject]]] = null,
    children: js.Array[SVGDefinitionObject] = null,
    tagName: String = null,
    textContent: String = null
  ): SVGDefinitionObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGDefinitionObject]
  }
}

