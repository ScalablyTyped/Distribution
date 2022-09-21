package typings.materialUiCore

import typings.materialUiCore.materialUiCoreStrings.withTheme
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiTypes.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeStylesMod {
  
  @JSImport("@material-ui/core/styles/makeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]]]
  
  inline def default_withTheme[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]]]
}
