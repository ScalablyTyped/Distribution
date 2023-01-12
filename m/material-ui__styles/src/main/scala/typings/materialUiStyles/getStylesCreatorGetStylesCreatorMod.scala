package typings.materialUiStyles

import typings.materialUiStyles.withStylesWithStylesMod.StyleRules
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStylesCreatorGetStylesCreatorMod {
  
  @JSImport("@material-ui/styles/getStylesCreator/getStylesCreator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: Styles[Any, Any, String] */](style: S): StylesCreator[Any, Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[StylesCreator[Any, Any, String]]
  
  trait StylesCreator[Theme, Props /* <: js.Object */, ClassKey /* <: String */] extends StObject {
    
    def create(theme: Theme, name: String): StyleRules[Props, ClassKey]
    
    var themingEnabled: Boolean
  }
  object StylesCreator {
    
    inline def apply[Theme, Props /* <: js.Object */, ClassKey /* <: String */](create: (Theme, String) => StyleRules[Props, ClassKey], themingEnabled: Boolean): StylesCreator[Theme, Props, ClassKey] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), themingEnabled = themingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylesCreator[Theme, Props, ClassKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylesCreator[?, ?, ?], Theme, Props /* <: js.Object */, ClassKey /* <: String */] (val x: Self & (StylesCreator[Theme, Props, ClassKey])) extends AnyVal {
      
      inline def setCreate(value: (Theme, String) => StyleRules[Props, ClassKey]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setThemingEnabled(value: Boolean): Self = StObject.set(x, "themingEnabled", value.asInstanceOf[js.Any])
    }
  }
}
