package typings.materialUiStyles

import org.scalablytyped.runtime.TopLevel
import typings.materialUiStyles.anon.NameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getThemePropsGetThemePropsMod {
  
  @JSImport("@material-ui/styles/getThemeProps/getThemeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme /* <: ThemeWithProps[js.Any] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  trait ThemeWithProps[Components] extends StObject {
    
    var props: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Components ]: std.Partial<Components[K]>}
      */ typings.materialUiStyles.materialUiStylesStrings.ThemeWithProps & TopLevel[Components]
      ] = js.undefined
  }
  object ThemeWithProps {
    
    inline def apply[Components](): ThemeWithProps[Components] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeWithProps[Components]]
    }
    
    extension [Self <: ThemeWithProps[?], Components](x: Self & ThemeWithProps[Components]) {
      
      inline def setProps(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof Components ]: std.Partial<Components[K]>}
        */ typings.materialUiStyles.materialUiStylesStrings.ThemeWithProps & TopLevel[Components]
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  type ThemedProps[Theme, Name /* <: /* keyof any */ String */] = js.Object
}
