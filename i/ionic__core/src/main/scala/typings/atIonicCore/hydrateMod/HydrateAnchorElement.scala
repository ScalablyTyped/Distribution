package typings.atIonicCore.hydrateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateAnchorElement extends HydrateElement {
  var href: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object HydrateAnchorElement {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.UndefOr[String]] = null,
    href: String = null,
    target: String = null
  ): HydrateAnchorElement = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (href != null) __obj.updateDynamic("href")(href)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[HydrateAnchorElement]
  }
}

