package typings.atMaterialDashUiStyles

import typings.atMaterialDashUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typings.atMaterialDashUiStyles.withThemeWithThemeMod.WithTheme
import typings.atMaterialDashUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.PropInjector
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withTheme", JSImport.Namespace)
@js.native
object withThemeMod extends js.Object {
  def default[Theme](component: ComponentClass[js.Object, ComponentState]): ComponentType[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def default[Theme](component: FunctionComponent[js.Object]): ComponentType[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
}

