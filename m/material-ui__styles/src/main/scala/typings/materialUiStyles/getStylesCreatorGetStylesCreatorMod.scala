package typings.materialUiStyles

import typings.materialUiStyles.withStylesWithStylesMod.StyleRules
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStylesCreatorGetStylesCreatorMod {
  
  @JSImport("@material-ui/styles/getStylesCreator/getStylesCreator", JSImport.Default)
  @js.native
  def default[S /* <: Styles[_, _, String] */](style: S): StylesCreator[_, _, String] = js.native
  
  @js.native
  trait StylesCreator[Theme, Props /* <: js.Object */, ClassKey /* <: String */] extends StObject {
    
    def create(theme: Theme, name: String): StyleRules[Props, ClassKey] = js.native
    
    var themingEnabled: Boolean = js.native
  }
  object StylesCreator {
    
    @scala.inline
    def apply[Theme, Props /* <: js.Object */, ClassKey /* <: String */](create: (Theme, String) => StyleRules[Props, ClassKey], themingEnabled: Boolean): StylesCreator[Theme, Props, ClassKey] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), themingEnabled = themingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylesCreator[Theme, Props, ClassKey]]
    }
    
    @scala.inline
    implicit class StylesCreatorMutableBuilder[Self <: StylesCreator[_, _, _], Theme, Props /* <: js.Object */, ClassKey /* <: String */] (val x: Self with (StylesCreator[Theme, Props, ClassKey])) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (Theme, String) => StyleRules[Props, ClassKey]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThemingEnabled(value: Boolean): Self = StObject.set(x, "themingEnabled", value.asInstanceOf[js.Any])
    }
  }
}
