package typings.materialUiStyles.withStylesWithStylesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCSSProperties[Props /* <: js.Object */]
  extends BaseCreateCSSProperties[Props]
     with // Allow pseudo selectors and media queries
/* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 511 */ js.Any
      ]
    ]
object CreateCSSProperties {
  
  @scala.inline
  def apply[Props /* <: js.Object */](): CreateCSSProperties[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCSSProperties[Props]]
  }
}
