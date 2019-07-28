package typings.atMaterialDashUiCore.stylesWithStylesMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.csstypeMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSProperties
  extends Properties[Double | String]
     with // Allow pseudo selectors and media queries
/* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 494 */ js.Any
      ]
    ]

object CSSProperties {
  @scala.inline
  def apply(
    Properties: Properties[Double | String] = null,
    StringDictionary: // Allow pseudo selectors and media queries
  /* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 494 */ js.Any
      ]
    ] = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Properties)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CSSProperties]
  }
}

