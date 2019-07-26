package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateImgElement extends HydrateElement {
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object HydrateImgElement {
  @scala.inline
  def apply(
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    src: java.lang.String = null
  ): HydrateImgElement = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[HydrateImgElement]
  }
}

