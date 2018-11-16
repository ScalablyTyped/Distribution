package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylesCreateTypographyMod {
  type FontStyle = stdLib.Required[atMaterialDashUiCoreLib.Anon_FontWeightLight]
  type ThemeStyle = atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.h1 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.h2 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.h3 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.h4 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.h5 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.h6 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.subtitle1 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.subtitle2 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.body1 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.body2 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.caption | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.button | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.overline | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.display4 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.display3 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.display2 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.display1 | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.headline | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.title | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.subheading
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
