package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.routeInterfaceMod.NavigationHookCallback
import typings.ionicCore.routeInterfaceMod.NavigationHookResult
import typings.std.AddEventListenerOptions
import typings.std.DocumentAndElementEventHandlers
import typings.std.Element
import typings.std.ElementCSSInlineStyle
import typings.std.ElementContentEditable
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.HTMLOrSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait HTMLStencilElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def componentOnReady(): js.Promise[this.type] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  @js.native
  trait NavOutlet extends StObject {
    
    def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
    
    def setRouteId(id: String, params: Unit, direction: RouterDirection): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typings.std.HTMLElement because Inheritance from two classes. Inlined accessKeyLabel, offsetWidth, accessKey, spellcheck, offsetTop, innerText, offsetLeft, offsetParent, lang, translate, autocapitalize, dir, draggable, hidden, title, offsetHeight, click, addEventListener, addEventListener, removeEventListener, removeEventListener, addEventListener, removeEventListener
  - typings.ionicCore.interfaceMod.HTMLStencilElement because Inheritance from two classes. Inlined componentOnReady */ @js.native
  trait NavOutletElement
    extends StObject
       with NavOutlet
       with Element
       with DocumentAndElementEventHandlers
       with ElementCSSInlineStyle
       with ElementContentEditable
       with GlobalEventHandlers
       with HTMLOrSVGElement {
    
    var accessKey: String = js.native
    
    val accessKeyLabel: String = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var autocapitalize: String = js.native
    
    def click(): Unit = js.native
    
    def componentOnReady(): js.Promise[this.type] = js.native
    
    var dir: String = js.native
    
    var draggable: Boolean = js.native
    
    var hidden: Boolean = js.native
    
    var innerText: String = js.native
    
    var lang: String = js.native
    
    val offsetHeight: Double = js.native
    
    val offsetLeft: Double = js.native
    
    val offsetParent: Element | Null = js.native
    
    val offsetTop: Double = js.native
    
    val offsetWidth: Double = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    var spellcheck: Boolean = js.native
    
    var title: String = js.native
    
    var translate: Boolean = js.native
  }
  
  type RouteChain = js.Array[RouteEntry]
  
  trait RouteEntry extends StObject {
    
    var beforeEnter: js.UndefOr[NavigationHookCallback] = js.undefined
    
    var beforeLeave: js.UndefOr[NavigationHookCallback] = js.undefined
    
    var id: String
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var path: js.Array[String]
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
  
  trait RouteID extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var id: String
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
  
  trait RouteNode
    extends StObject
       with RouteEntry {
    
    var children: RouteTree
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
  
  trait RouteRedirect extends StObject {
    
    var from: js.Array[String]
    
    var to: js.UndefOr[js.Array[String]] = js.undefined
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
  
  trait RouteWrite extends StObject {
    
    var changed: Boolean
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var markVisible: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
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
  
  trait RouterEventDetail extends StObject {
    
    var from: String | Null
    
    var redirectedFrom: String | Null
    
    var to: String
  }
  object RouterEventDetail {
    
    @scala.inline
    def apply(to: String): RouterEventDetail = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any], from = null, redirectedFrom = null)
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
