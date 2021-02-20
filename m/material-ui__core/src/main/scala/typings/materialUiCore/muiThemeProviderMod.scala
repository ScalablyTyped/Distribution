package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.jss.mod.StyleSheet
import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.withStylesMod.StylesCreator
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object muiThemeProviderMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/MuiThemeProvider", JSImport.Default)
  @js.native
  val default: ComponentType[MuiThemeProviderProps] = js.native
  
  @js.native
  trait MuiThemeProviderProps extends StObject {
    
    var children: ReactNode = js.native
    
    var disableStylesGeneration: js.UndefOr[Boolean] = js.native
    
    var sheetsManager: js.UndefOr[Map[StylesCreator, Map[Theme, SheetManagerTheme]]] = js.native
    
    var theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]) = js.native
  }
  object MuiThemeProviderProps {
    
    @scala.inline
    def apply(theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme])): MuiThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuiThemeProviderProps]
    }
    
    @scala.inline
    implicit class MuiThemeProviderPropsMutableBuilder[Self <: MuiThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisableStylesGeneration(value: Boolean): Self = StObject.set(x, "disableStylesGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesGenerationUndefined: Self = StObject.set(x, "disableStylesGeneration", js.undefined)
      
      @scala.inline
      def setSheetsManager(value: Map[StylesCreator, Map[Theme, SheetManagerTheme]]): Self = StObject.set(x, "sheetsManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetsManagerUndefined: Self = StObject.set(x, "sheetsManager", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme | (js.Function1[/* outer */ Theme | Null, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* outer */ Theme | Null => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SheetManagerTheme extends StObject {
    
    var refs: Double = js.native
    
    var sheet: StyleSheet[String | Double | js.Symbol] = js.native
  }
  object SheetManagerTheme {
    
    @scala.inline
    def apply(refs: Double, sheet: StyleSheet[String | Double | js.Symbol]): SheetManagerTheme = {
      val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetManagerTheme]
    }
    
    @scala.inline
    implicit class SheetManagerThemeMutableBuilder[Self <: SheetManagerTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefs(value: Double): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[MuiThemeProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `muiThemeProviderMod.foo` */
  override def _to: ComponentType[MuiThemeProviderProps] = default
}
