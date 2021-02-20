package typings.linguiReact

import typings.linguiReact.renderMod.RenderProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transMod {
  
  @JSImport("@lingui/react/Trans", JSImport.Default)
  @js.native
  class default ()
    extends Component[TransPropsWithoutI18n, js.Object, js.Any]
  
  type Trans = Component[TransPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  trait TransPropsWithoutI18n extends RenderProps {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var components: js.UndefOr[js.Array[ReactElement]] = js.native
    
    var defaults: js.UndefOr[String] = js.native
    
    var formats: js.UndefOr[js.Object] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var values: js.UndefOr[js.Object] = js.native
  }
  object TransPropsWithoutI18n {
    
    @scala.inline
    def apply(): TransPropsWithoutI18n = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransPropsWithoutI18n]
    }
    
    @scala.inline
    implicit class TransPropsWithoutI18nMutableBuilder[Self <: TransPropsWithoutI18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponents(value: js.Array[ReactElement]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setComponentsVarargs(value: ReactElement*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      @scala.inline
      def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
