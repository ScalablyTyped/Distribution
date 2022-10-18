package typings.interactjsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.anon.Bottom
import typings.interactjsTypes.anon.ClientX
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.RequiredRect
import typings.interactjsTypes.coreOptionsMod.Options
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreScopeMod.Scope
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.EventTypes
import typings.interactjsTypes.coreTypesMod.ListenersArg
import typings.interactjsTypes.coreTypesMod.PointerType
import typings.interactjsTypes.coreTypesMod.Target
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Node
import typings.std.SVGElement
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInteractStaticMod {
  
  @JSImport("@interactjs/core/InteractStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInteractStatic(scope: Scope): _InteractStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("createInteractStatic")(scope.asInstanceOf[js.Any]).asInstanceOf[_InteractStatic]
  
  @js.native
  trait InteractStatic extends StObject {
    
    def apply(target: Target): InteractableActions = js.native
    def apply(target: Target, options: Options): InteractableActions = js.native
    
    def addDocument(doc: Document): Unit = js.native
    def addDocument(doc: Document, options: js.Object): Unit = js.native
    
    def closest(element: Node, selector: String): HTMLElement | SVGElement = js.native
    @JSName("closest")
    var closest_Original: js.Function2[/* element */ Node, /* selector */ String, HTMLElement | SVGElement] = js.native
    
    var createSnapGrid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof allSnappers.grid */ Any = js.native
    
    def debug(): Any = js.native
    
    def dynamicDrop(): Boolean | this.type = js.native
    def dynamicDrop(newValue: Boolean): Boolean | this.type = js.native
    
    def getElementClientRect(element: Element): RequiredRect = js.native
    @JSName("getElementClientRect")
    var getElementClientRect_Original: js.Function1[/* element */ Element, RequiredRect] = js.native
    
    def getElementRect(element: Element): RequiredRect = js.native
    @JSName("getElementRect")
    var getElementRect_Original: js.Function1[/* element */ Element, RequiredRect] = js.native
    
    def getPointerAverage(pointers: js.Array[PointerType]): ClientX = js.native
    @JSName("getPointerAverage")
    var getPointerAverage_Original: js.Function1[/* pointers */ js.Array[PointerType], ClientX] = js.native
    
    def getTouchAngle(event: js.Array[PointerType], deltaSource: String): Double = js.native
    def getTouchAngle(event: TouchEvent, deltaSource: String): Double = js.native
    @JSName("getTouchAngle")
    var getTouchAngle_Original: js.Function2[/* event */ js.Array[PointerType] | TouchEvent, /* deltaSource */ String, Double] = js.native
    
    def getTouchBBox(event: js.Array[PointerType]): Bottom = js.native
    @JSName("getTouchBBox")
    var getTouchBBox_Original: js.Function1[/* event */ js.Array[PointerType], Bottom] = js.native
    
    def getTouchDistance(event: js.Array[PointerType], deltaSource: String): Double = js.native
    def getTouchDistance(event: TouchEvent, deltaSource: String): Double = js.native
    @JSName("getTouchDistance")
    var getTouchDistance_Original: js.Function2[/* event */ js.Array[PointerType] | TouchEvent, /* deltaSource */ String, Double] = js.native
    
    def isSet(target: Target): Boolean = js.native
    def isSet(target: Target, options: Any): Boolean = js.native
    
    def matchesSelector(element: Element, selector: String): Boolean = js.native
    @JSName("matchesSelector")
    var matchesSelector_Original: js.Function2[/* element */ Element, /* selector */ String, Boolean] = js.native
    
    def maxInteractions(newValue: Any): Any = js.native
    
    var modifiers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof all */ Any = js.native
    
    def off(`type`: EventTypes, listener: Any): Any = js.native
    def off(`type`: EventTypes, listener: Any, options: js.Object): Any = js.native
    
    def on(`type`: String, listener: ListenersArg): Any = js.native
    def on(`type`: String, listener: ListenersArg, options: js.Object): Any = js.native
    def on(`type`: EventTypes, listener: ListenersArg): Any = js.native
    def on(`type`: EventTypes, listener: ListenersArg, options: js.Object): Any = js.native
    
    def pointerMoveTolerance(): Any = js.native
    def pointerMoveTolerance(newValue: Double): Any = js.native
    
    def removeDocument(doc: Document): Unit = js.native
    
    var snappers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof allSnappers */ Any = js.native
    
    def stop(): Any = js.native
    
    def supportsPointerEvent(): Boolean = js.native
    
    def supportsTouch(): Boolean = js.native
    
    def use(plugin: Plugin): Any = js.native
    def use(plugin: Plugin, options: StringDictionary[Any]): Any = js.native
    
    var version: String = js.native
    
    var visializer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof visualizer */ Any = js.native
  }
  
  type _InteractStatic = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any
  
  /* augmented module */
  object interactjsCoreInteractStaticAugmentingMod {
    
    @js.native
    trait InteractStatic extends StObject {
      
      def apply(target: Target): InteractableActions = js.native
      def apply(target: Target, options: Options): InteractableActions = js.native
      
      def addDocument(doc: Document): Unit = js.native
      def addDocument(doc: Document, options: js.Object): Unit = js.native
      
      def closest(element: Node, selector: String): HTMLElement | SVGElement = js.native
      @JSName("closest")
      var closest_Original: js.Function2[/* element */ Node, /* selector */ String, HTMLElement | SVGElement] = js.native
      
      def debug(): Any = js.native
      
      def getElementClientRect(element: Element): RequiredRect = js.native
      @JSName("getElementClientRect")
      var getElementClientRect_Original: js.Function1[/* element */ Element, RequiredRect] = js.native
      
      def getElementRect(element: Element): RequiredRect = js.native
      @JSName("getElementRect")
      var getElementRect_Original: js.Function1[/* element */ Element, RequiredRect] = js.native
      
      def getPointerAverage(pointers: js.Array[PointerType]): ClientX = js.native
      @JSName("getPointerAverage")
      var getPointerAverage_Original: js.Function1[/* pointers */ js.Array[PointerType], ClientX] = js.native
      
      def getTouchAngle(event: js.Array[PointerType], deltaSource: String): Double = js.native
      def getTouchAngle(event: TouchEvent, deltaSource: String): Double = js.native
      @JSName("getTouchAngle")
      var getTouchAngle_Original: js.Function2[/* event */ js.Array[PointerType] | TouchEvent, /* deltaSource */ String, Double] = js.native
      
      def getTouchBBox(event: js.Array[PointerType]): Bottom = js.native
      @JSName("getTouchBBox")
      var getTouchBBox_Original: js.Function1[/* event */ js.Array[PointerType], Bottom] = js.native
      
      def getTouchDistance(event: js.Array[PointerType], deltaSource: String): Double = js.native
      def getTouchDistance(event: TouchEvent, deltaSource: String): Double = js.native
      @JSName("getTouchDistance")
      var getTouchDistance_Original: js.Function2[/* event */ js.Array[PointerType] | TouchEvent, /* deltaSource */ String, Double] = js.native
      
      def isSet(target: Target): Boolean = js.native
      def isSet(target: Target, options: Any): Boolean = js.native
      
      def matchesSelector(element: Element, selector: String): Boolean = js.native
      @JSName("matchesSelector")
      var matchesSelector_Original: js.Function2[/* element */ Element, /* selector */ String, Boolean] = js.native
      
      def off(`type`: EventTypes, listener: Any): Any = js.native
      def off(`type`: EventTypes, listener: Any, options: js.Object): Any = js.native
      
      def on(`type`: String, listener: ListenersArg): Any = js.native
      def on(`type`: String, listener: ListenersArg, options: js.Object): Any = js.native
      def on(`type`: EventTypes, listener: ListenersArg): Any = js.native
      def on(`type`: EventTypes, listener: ListenersArg, options: js.Object): Any = js.native
      
      def pointerMoveTolerance(): Any = js.native
      def pointerMoveTolerance(newValue: Double): Any = js.native
      
      def removeDocument(doc: Document): Unit = js.native
      
      def stop(): Any = js.native
      
      def supportsPointerEvent(): Boolean = js.native
      
      def supportsTouch(): Boolean = js.native
      
      def use(plugin: Plugin): Any = js.native
      def use(plugin: Plugin, options: StringDictionary[Any]): Any = js.native
      
      var version: String = js.native
    }
  }
}
