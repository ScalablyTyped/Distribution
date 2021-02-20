package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.routeInterfaceMod.NavigationHookCallback
import typings.ionicCore.routeInterfaceMod.NavigationHookResult
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait HTMLStencilElement extends HTMLElement {
    
    def componentOnReady(): js.Promise[this.type] = js.native
  }
  
  @js.native
  trait NavOutlet extends StObject {
    
    def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
    
    def setRouteId(id: String, params: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[RouteWrite] = js.native
    def setRouteId(
      id: String,
      params: js.UndefOr[scala.Nothing],
      direction: RouterDirection,
      animation: AnimationBuilder
    ): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
  }
  
  type NavOutletElement = NavOutlet with HTMLStencilElement
  
  type RouteChain = js.Array[RouteEntry]
  
  @js.native
  trait RouteEntry extends StObject {
    
    var beforeEnter: js.UndefOr[NavigationHookCallback] = js.native
    
    var beforeLeave: js.UndefOr[NavigationHookCallback] = js.native
    
    var id: String = js.native
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var path: js.Array[String] = js.native
  }
  object RouteEntry {
    
    @scala.inline
    def apply(id: String, path: js.Array[String]): RouteEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteEntry]
    }
    
    @scala.inline
    implicit class RouteEntryMutableBuilder[Self <: RouteEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeEnter(value: () => NavigationHookResult | js.Promise[NavigationHookResult]): Self = StObject.set(x, "beforeEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
      
      @scala.inline
      def setBeforeLeave(value: () => NavigationHookResult | js.Promise[NavigationHookResult]): Self = StObject.set(x, "beforeLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeLeaveUndefined: Self = StObject.set(x, "beforeLeave", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RouteID extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var id: String = js.native
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object RouteID {
    
    @scala.inline
    def apply(id: String): RouteID = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteID]
    }
    
    @scala.inline
    implicit class RouteIDMutableBuilder[Self <: RouteID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  @js.native
  trait RouteNode extends RouteEntry {
    
    var children: RouteTree = js.native
  }
  object RouteNode {
    
    @scala.inline
    def apply(children: RouteTree, id: String, path: js.Array[String]): RouteNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteNode]
    }
    
    @scala.inline
    implicit class RouteNodeMutableBuilder[Self <: RouteNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: RouteTree): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: RouteNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RouteRedirect extends StObject {
    
    var from: js.Array[String] = js.native
    
    var to: js.UndefOr[js.Array[String]] = js.native
  }
  object RouteRedirect {
    
    @scala.inline
    def apply(from: js.Array[String]): RouteRedirect = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteRedirect]
    }
    
    @scala.inline
    implicit class RouteRedirectMutableBuilder[Self <: RouteRedirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  type RouteTree = js.Array[RouteNode]
  
  @js.native
  trait RouteWrite extends StObject {
    
    var changed: Boolean = js.native
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var markVisible: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  }
  object RouteWrite {
    
    @scala.inline
    def apply(changed: Boolean): RouteWrite = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteWrite]
    }
    
    @scala.inline
    implicit class RouteWriteMutableBuilder[Self <: RouteWrite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setMarkVisible(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "markVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMarkVisibleUndefined: Self = StObject.set(x, "markVisible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.forward
    - typings.ionicCore.ionicCoreStrings.back
    - typings.ionicCore.ionicCoreStrings.root
  */
  trait RouterDirection extends StObject
  object RouterDirection {
    
    @scala.inline
    def back: typings.ionicCore.ionicCoreStrings.back = "back".asInstanceOf[typings.ionicCore.ionicCoreStrings.back]
    
    @scala.inline
    def forward: typings.ionicCore.ionicCoreStrings.forward = "forward".asInstanceOf[typings.ionicCore.ionicCoreStrings.forward]
    
    @scala.inline
    def root: typings.ionicCore.ionicCoreStrings.root = "root".asInstanceOf[typings.ionicCore.ionicCoreStrings.root]
  }
  
  @js.native
  trait RouterEventDetail extends StObject {
    
    var from: String | Null = js.native
    
    var redirectedFrom: String | Null = js.native
    
    var to: String = js.native
  }
  object RouterEventDetail {
    
    @scala.inline
    def apply(to: String): RouterEventDetail = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterEventDetail]
    }
    
    @scala.inline
    implicit class RouterEventDetailMutableBuilder[Self <: RouterEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromNull: Self = StObject.set(x, "from", null)
      
      @scala.inline
      def setRedirectedFrom(value: String): Self = StObject.set(x, "redirectedFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectedFromNull: Self = StObject.set(x, "redirectedFrom", null)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
