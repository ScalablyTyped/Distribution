package typings.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledStyledMod {
  type ComponentCreator[Component /* <: typings.react.mod.ElementType[_] */] = js.Function2[
    /* styles */ typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[js.Object] | (js.Function1[
      /* props */ typings.materialUiStyles.AnonTheme[typings.materialUiStyles.defaultThemeMod.DefaultTheme] with js.Object, 
      typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[js.Object]
    ]), 
    /* options */ js.UndefOr[
      typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions[typings.materialUiStyles.defaultThemeMod.DefaultTheme]
    ], 
    typings.react.mod.ComponentType[
      (typings.materialUiTypes.mod.Omit[
        typings.react.mod._Global_.JSX.LibraryManagedAttributes[Component, typings.react.mod.ComponentProps[Component]], 
        typings.materialUiStyles.materialUiStylesStrings.classes | typings.materialUiStyles.materialUiStylesStrings.className
      ]) with typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps[typings.materialUiStyles.materialUiStylesStrings.root] with typings.materialUiStyles.AnonClassName with (js.Object | ((typings.materialUiTypes.mod.Omit[js.Object, typings.materialUiStyles.materialUiStylesStrings.theme]) with typings.materialUiStyles.AnonThemeTheme[typings.materialUiStyles.defaultThemeMod.DefaultTheme]))
    ]
  ]
}
