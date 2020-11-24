package typings.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object styledStyledMod {
  
  type ComponentCreator[Component /* <: typings.react.mod.ElementType[_] */] = js.Function2[
    /* styles */ typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[typings.react.mod.ComponentPropsWithoutRef[Component]] | (js.Function1[
      /* props */ typings.materialUiStyles.anon.ThemeTheme[typings.materialUiStyles.defaultThemeMod.DefaultTheme] with typings.react.mod.ComponentPropsWithoutRef[Component], 
      typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[typings.react.mod.ComponentPropsWithoutRef[Component]]
    ]), 
    /* options */ js.UndefOr[
      typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions[typings.materialUiStyles.defaultThemeMod.DefaultTheme]
    ], 
    typings.materialUiStyles.styledStyledMod.StyledComponent[
      (typings.materialUiTypes.mod.Omit[
        typings.react.mod.global.JSX.LibraryManagedAttributes[Component, typings.react.mod.ComponentProps[Component]], 
        typings.materialUiStyles.materialUiStylesStrings.classes | typings.materialUiStyles.materialUiStylesStrings.className
      ]) with typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps[typings.materialUiStyles.materialUiStylesStrings.root] with (typings.materialUiTypes.mod.Overwrite[
        typings.react.mod.ComponentPropsWithoutRef[Component], 
        typings.materialUiStyles.anon.ClassName[typings.materialUiStyles.defaultThemeMod.DefaultTheme]
      ])
    ]
  ]
  
  type StyledComponent[P /* <: js.Object */] = js.Function1[/* props */ P, typings.react.mod.ReactElement | scala.Null]
}
