package typings.materialUiStyles

import typings.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typings.materialUiStyles.withThemeWithThemeMod.WithTheme
import typings.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typings.materialUiTypes.mod.ConsistentWith
import typings.materialUiTypes.mod.Omit
import typings.materialUiTypes.mod.PropInjector
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

@JSImport("@material-ui/styles/withTheme", JSImport.Namespace)
@js.native
object withThemeMod extends js.Object {
  def default[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState], 
        ComponentProps[
          ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]
        ]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def default[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
}

