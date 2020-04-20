package typings.materialUiStyles.withThemeWithThemeMod

import typings.materialUiStyles.materialUiStylesStrings.innerRef
import typings.materialUiStyles.materialUiStylesStrings.theme
import typings.materialUiTypes.mod.ConsistentWith
import typings.materialUiTypes.mod.Omit
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod._Global_.JSX.LibraryManagedAttributes
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withTheme/withTheme", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState], 
        ComponentProps[
          ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]
        ]
      ], 
      theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def apply[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
}

