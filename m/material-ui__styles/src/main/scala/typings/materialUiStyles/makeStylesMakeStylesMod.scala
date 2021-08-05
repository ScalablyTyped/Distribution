package typings.materialUiStyles

import typings.materialUiStyles.materialUiStylesStrings.withTheme
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiTypes.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeStylesMakeStylesMod {
  
  @JSImport("@material-ui/styles/makeStyles/makeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]]]
  
  inline def default_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Props, ClassNameMap[ClassKey]]]
  
  inline def default_withTheme[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]]]
  
  inline def default_withTheme_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Props, ClassNameMap[ClassKey]]]
}
