package typings.ionicReact

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewItemMod {
  
  @js.native
  trait ViewItem[T] extends StObject {
    
    var disableIonPageManagement: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var ionPageElement: js.UndefOr[HTMLElement] = js.native
    
    var ionRoute: js.UndefOr[Boolean] = js.native
    
    var mount: Boolean = js.native
    
    var outletId: String = js.native
    
    var reactElement: ReactElement = js.native
    
    var routeData: js.UndefOr[T] = js.native
    
    var transitionHtml: js.UndefOr[String] = js.native
  }
  object ViewItem {
    
    @scala.inline
    def apply[T](id: String, mount: Boolean, outletId: String, reactElement: ReactElement): ViewItem[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], outletId = outletId.asInstanceOf[js.Any], reactElement = reactElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewItem[T]]
    }
    
    @scala.inline
    implicit class ViewItemMutableBuilder[Self <: ViewItem[_], T] (val x: Self with ViewItem[T]) extends AnyVal {
      
      @scala.inline
      def setDisableIonPageManagement(value: Boolean): Self = StObject.set(x, "disableIonPageManagement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableIonPageManagementUndefined: Self = StObject.set(x, "disableIonPageManagement", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIonPageElement(value: HTMLElement): Self = StObject.set(x, "ionPageElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIonPageElementUndefined: Self = StObject.set(x, "ionPageElement", js.undefined)
      
      @scala.inline
      def setIonRoute(value: Boolean): Self = StObject.set(x, "ionRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIonRouteUndefined: Self = StObject.set(x, "ionRoute", js.undefined)
      
      @scala.inline
      def setMount(value: Boolean): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutletId(value: String): Self = StObject.set(x, "outletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactElement(value: ReactElement): Self = StObject.set(x, "reactElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteData(value: T): Self = StObject.set(x, "routeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteDataUndefined: Self = StObject.set(x, "routeData", js.undefined)
      
      @scala.inline
      def setTransitionHtml(value: String): Self = StObject.set(x, "transitionHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionHtmlUndefined: Self = StObject.set(x, "transitionHtml", js.undefined)
    }
  }
}
