package typings.materialUiStyles.withStylesWithStylesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCSSProperties[Props /* <: js.Object */]
  extends BaseCreateCSSProperties[Props]
     with // Allow pseudo selectors and media queries
/* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 529 */ js.Any
      ]
    ]

object CreateCSSProperties {
  @scala.inline
  def apply[/* <: js.Object */ Props](): CreateCSSProperties[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCSSProperties[Props]]
  }
}

