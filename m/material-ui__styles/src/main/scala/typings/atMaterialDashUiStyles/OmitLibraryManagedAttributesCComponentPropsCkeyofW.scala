package typings.atMaterialDashUiStyles

import typings.atMaterialDashUiStyles.defaultThemeMod.DefaultTheme
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @material-ui/types.@material-ui/types.Omit<react.react._Global_.JSX.LibraryManagedAttributes<C, react.react.ComponentProps<C>>, keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme>> & std.Partial<@material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme>> & @material-ui/styles.@material-ui/styles/withTheme/withTheme.ThemedComponentProps */
trait OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme] extends js.Object {
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var theme: js.UndefOr[Theme with DefaultTheme] = js.undefined
}

object OmitLibraryManagedAttributesCComponentPropsCkeyofW {
  @scala.inline
  def apply[Theme](innerRef: Ref[_] = null, ref: Ref[_] = null, theme: Theme with DefaultTheme = null): OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme] = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]]
  }
}

