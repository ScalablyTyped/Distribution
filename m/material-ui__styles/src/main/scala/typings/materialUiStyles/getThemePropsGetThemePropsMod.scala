package typings.materialUiStyles

import typings.materialUiStyles.anon.NameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getThemePropsGetThemePropsMod {
  
  @JSImport("@material-ui/styles/getThemeProps/getThemeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme /* <: ThemeWithProps[Any] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  trait ThemeWithProps[Components] extends StObject {
    
    var props: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Components ]: std.Partial<Components[K]>} */ js.Any
      ] = js.undefined
  }
  object ThemeWithProps {
    
    inline def apply[Components](): ThemeWithProps[Components] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeWithProps[Components]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeWithProps[?], Components] (val x: Self & ThemeWithProps[Components]) extends AnyVal {
      
      inline def setProps(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Components ]: std.Partial<Components[K]>} */ js.Any
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Theme extends {  props :std.Record<Name, infer Props>} ? Props : {}
    }}}
    */
  @js.native
  trait ThemedProps[Theme, Name /* <: /* keyof any */ String */] extends StObject
}
