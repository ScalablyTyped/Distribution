package typings.atIonicCore.hydrateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateStyleElement extends HydrateElement {
  var href: js.UndefOr[String] = js.undefined
}

object HydrateStyleElement {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.UndefOr[String]] = null, href: String = null): HydrateStyleElement = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateStyleElement]
  }
}

