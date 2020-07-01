package typings.materialUiStyles.withStylesWithStylesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCSSProperties[Props /* <: js.Object */]
  extends BaseCreateCSSProperties[Props]
     with // Allow pseudo selectors and media queries
/* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 502 */ js.Any
      ]
    ]

object CreateCSSProperties {
  @scala.inline
  def apply[/* <: js.Object */ Props](
    BaseCreateCSSProperties: BaseCreateCSSProperties[Props] = null,
    StringDictionary: // Allow pseudo selectors and media queries
  /* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 502 */ js.Any
      ]
    ] = null
  ): CreateCSSProperties[Props] = {
    val __obj = js.Dynamic.literal()
    if (BaseCreateCSSProperties != null) js.Dynamic.global.Object.assign(__obj, BaseCreateCSSProperties)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CreateCSSProperties[Props]]
  }
}

