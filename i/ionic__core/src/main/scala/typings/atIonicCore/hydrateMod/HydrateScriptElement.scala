package typings.atIonicCore.hydrateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateScriptElement extends HydrateElement {
  var src: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object HydrateScriptElement {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.UndefOr[String]] = null,
    src: String = null,
    `type`: String = null
  ): HydrateScriptElement = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateScriptElement]
  }
}

