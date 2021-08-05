package typings.linguiReact

import typings.linguiReact.renderMod.RenderProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transMod {
  
  @JSImport("@lingui/react/Trans", JSImport.Default)
  @js.native
  class default ()
    extends Component[TransPropsWithoutI18n, js.Object, js.Any]
  
  type Trans = Component[TransPropsWithoutI18n, js.Object, js.Any]
  
  trait TransPropsWithoutI18n
    extends StObject
       with RenderProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var components: js.UndefOr[js.Array[ReactElement]] = js.undefined
    
    var defaults: js.UndefOr[String] = js.undefined
    
    var formats: js.UndefOr[js.Object] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[js.Object] = js.undefined
  }
  object TransPropsWithoutI18n {
    
    inline def apply(): TransPropsWithoutI18n = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransPropsWithoutI18n]
    }
    
    extension [Self <: TransPropsWithoutI18n](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponents(value: js.Array[ReactElement]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: ReactElement*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      inline def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
