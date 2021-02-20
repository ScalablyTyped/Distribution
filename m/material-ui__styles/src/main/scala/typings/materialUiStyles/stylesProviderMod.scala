package typings.materialUiStyles

import org.scalablytyped.runtime.Shortcut
import typings.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typings.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typings.react.mod.ComponentType
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesProviderMod extends Shortcut {
  
  @JSImport("@material-ui/styles/StylesProvider", JSImport.Default)
  @js.native
  val default: ComponentType[StylesProviderProps] = js.native
  
  @JSImport("@material-ui/styles/StylesProvider", "StylesContext")
  @js.native
  val StylesContext: Context[StylesOptions] = js.native
  
  type _To = ComponentType[StylesProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `stylesProviderMod.foo` */
  override def _to: ComponentType[StylesProviderProps] = default
}
