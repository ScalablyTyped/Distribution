package typings.materialUiStyles

import org.scalablytyped.runtime.TopLevel
import typings.materialUiStyles.anon.NameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getThemePropsGetThemePropsMod {
  
  @JSImport("@material-ui/styles/getThemeProps/getThemeProps", JSImport.Default)
  @js.native
  def default[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
  
  @js.native
  trait ThemeWithProps[Components] extends StObject {
    
    var props: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Components ]: std.Partial<Components[K]>}
      */ typings.materialUiStyles.materialUiStylesStrings.ThemeWithProps with TopLevel[Components]
      ] = js.native
  }
  object ThemeWithProps {
    
    @scala.inline
    def apply[Components](): ThemeWithProps[Components] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeWithProps[Components]]
    }
    
    @scala.inline
    implicit class ThemeWithPropsMutableBuilder[Self <: ThemeWithProps[_], Components] (val x: Self with ThemeWithProps[Components]) extends AnyVal {
      
      @scala.inline
      def setProps(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof Components ]: std.Partial<Components[K]>}
        */ typings.materialUiStyles.materialUiStylesStrings.ThemeWithProps with TopLevel[Components]
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  type ThemedProps[Theme, Name /* <: /* keyof any */ String */] = js.Object
}
