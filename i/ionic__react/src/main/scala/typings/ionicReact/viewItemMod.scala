package typings.ionicReact

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewItemMod {
  
  trait ViewItem[T] extends StObject {
    
    var disableIonPageManagement: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var ionPageElement: js.UndefOr[HTMLElement] = js.undefined
    
    var ionRoute: js.UndefOr[Boolean] = js.undefined
    
    var mount: Boolean
    
    var outletId: String
    
    var reactElement: ReactElement
    
    var routeData: js.UndefOr[T] = js.undefined
    
    var transitionHtml: js.UndefOr[String] = js.undefined
  }
  object ViewItem {
    
    inline def apply[T](id: String, mount: Boolean, outletId: String, reactElement: ReactElement): ViewItem[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], outletId = outletId.asInstanceOf[js.Any], reactElement = reactElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewItem[T]]
    }
    
    extension [Self <: ViewItem[?], T](x: Self & ViewItem[T]) {
      
      inline def setDisableIonPageManagement(value: Boolean): Self = StObject.set(x, "disableIonPageManagement", value.asInstanceOf[js.Any])
      
      inline def setDisableIonPageManagementUndefined: Self = StObject.set(x, "disableIonPageManagement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIonPageElement(value: HTMLElement): Self = StObject.set(x, "ionPageElement", value.asInstanceOf[js.Any])
      
      inline def setIonPageElementUndefined: Self = StObject.set(x, "ionPageElement", js.undefined)
      
      inline def setIonRoute(value: Boolean): Self = StObject.set(x, "ionRoute", value.asInstanceOf[js.Any])
      
      inline def setIonRouteUndefined: Self = StObject.set(x, "ionRoute", js.undefined)
      
      inline def setMount(value: Boolean): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setOutletId(value: String): Self = StObject.set(x, "outletId", value.asInstanceOf[js.Any])
      
      inline def setReactElement(value: ReactElement): Self = StObject.set(x, "reactElement", value.asInstanceOf[js.Any])
      
      inline def setRouteData(value: T): Self = StObject.set(x, "routeData", value.asInstanceOf[js.Any])
      
      inline def setRouteDataUndefined: Self = StObject.set(x, "routeData", js.undefined)
      
      inline def setTransitionHtml(value: String): Self = StObject.set(x, "transitionHtml", value.asInstanceOf[js.Any])
      
      inline def setTransitionHtmlUndefined: Self = StObject.set(x, "transitionHtml", js.undefined)
    }
  }
}
