package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateStyleElement extends HydrateElement {
  var href: js.UndefOr[java.lang.String] = js.undefined
}

object HydrateStyleElement {
  @scala.inline
  def apply(
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    href: java.lang.String = null
  ): HydrateStyleElement = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[HydrateStyleElement]
  }
}

