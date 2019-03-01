package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylesCreateTypographyMod {
  type FontStyle = stdLib.Required[atMaterialDashUiCoreLib.Anon_FontFamily]
  type TypographyOptions = stdLib.Partial[(stdLib.Record[ThemeStyle, TypographyStyleOptions]) with FontStyleOptions]
  type TypographyStyle = (stdLib.Required[
    stdLib.Pick[
      atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties, 
      atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fontFamily | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fontSize | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fontWeight | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.color
    ]
  ]) with (stdLib.Partial[
    stdLib.Pick[
      atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties, 
      atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.letterSpacing | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.lineHeight | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.textTransform
    ]
  ])
  type TypographyStyleOptions = /* InlineNestedIdentityAlias: stdLib.Partial*/ TypographyStyle
}
