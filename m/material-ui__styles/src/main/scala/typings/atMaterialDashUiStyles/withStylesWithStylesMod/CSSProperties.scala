package typings.atMaterialDashUiStyles.withStylesWithStylesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSProperties
  extends BaseCSSProperties
     with // Allow pseudo selectors and media queries
/* k */ StringDictionary[js.UndefOr[JSSFontface | js.Array[JSSFontface] | CSSProperties]]

object CSSProperties {
  @scala.inline
  def apply(
    BaseCSSProperties: BaseCSSProperties = null,
    StringDictionary: // Allow pseudo selectors and media queries
  /* k */ StringDictionary[js.UndefOr[JSSFontface | js.Array[JSSFontface] | CSSProperties]] = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    if (BaseCSSProperties != null) js.Dynamic.global.Object.assign(__obj, BaseCSSProperties)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CSSProperties]
  }
}

