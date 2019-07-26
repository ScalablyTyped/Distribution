package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateAnchorElement extends HydrateElement {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object HydrateAnchorElement {
  @scala.inline
  def apply(
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    href: java.lang.String = null,
    target: java.lang.String = null
  ): HydrateAnchorElement = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (href != null) __obj.updateDynamic("href")(href)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[HydrateAnchorElement]
  }
}

