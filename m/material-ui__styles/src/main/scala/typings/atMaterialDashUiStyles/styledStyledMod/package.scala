package typings.atMaterialDashUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledStyledMod {
  import typings.atMaterialDashUiStyles.Anon_ClassName
  import typings.atMaterialDashUiStyles.Anon_Theme
  import typings.atMaterialDashUiStyles.Anon_ThemeOptional
  import typings.atMaterialDashUiStyles.atMaterialDashUiStylesStrings.root
  import typings.atMaterialDashUiStyles.atMaterialDashUiStylesStrings.theme
  import typings.atMaterialDashUiStyles.defaultThemeMod.DefaultTheme
  import typings.atMaterialDashUiStyles.withStylesWithStylesMod.CreateCSSProperties
  import typings.atMaterialDashUiStyles.withStylesWithStylesMod.StyledComponentProps
  import typings.atMaterialDashUiStyles.withStylesWithStylesMod.WithStylesOptions
  import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.CoerceEmptyInterface
  import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.Omit
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ElementType

  type ComponentCreator[Component /* <: ElementType[_] */] = js.Function2[
    /* styles */ CreateCSSProperties[js.Any] | (js.Function1[
      /* props */ Anon_Theme[DefaultTheme] with CoerceEmptyInterface[_], 
      CreateCSSProperties[js.Any]
    ]), 
    /* options */ js.UndefOr[WithStylesOptions[DefaultTheme]], 
    ComponentType[
      js.Object with StyledComponentProps[root] with Anon_ClassName with (CoerceEmptyInterface[(Omit[_, theme]) with Anon_ThemeOptional[DefaultTheme]])
    ]
  ]
}
