package typings.interactjsTypes

import typings.interactjsTypes.anon.Add
import typings.interactjsTypes.coreScopeMod.Scope
import typings.std.DOMHighResTimeStamp
import typings.std.Event
import typings.std.EventTarget
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreEventsMod {
  
  object default {
    
    @JSImport("@interactjs/core/events", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/core/events", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/core/events", "default.install")
    @js.native
    def install: js.Function1[/* scope */ Scope, Add] = js.native
    inline def install(scope: Scope): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Add]
    inline def install_=(x: js.Function1[/* scope */ Scope, Add]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Partial<std.Event> */
  @js.native
  trait FakeEvent extends StObject {
    
    var AT_TARGET: js.UndefOr[Double] = js.native
    
    var BUBBLING_PHASE: js.UndefOr[Double] = js.native
    
    var CAPTURING_PHASE: js.UndefOr[Double] = js.native
    
    var NONE: js.UndefOr[Double] = js.native
    
    var bubbles: js.UndefOr[Boolean] = js.native
    
    var cancelBubble: js.UndefOr[Boolean] = js.native
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var composed: js.UndefOr[Boolean] = js.native
    
    var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.native
    
    var currentTarget: Node = js.native
    
    var defaultPrevented: js.UndefOr[Boolean] = js.native
    
    var eventPhase: js.UndefOr[Double] = js.native
    
    var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.native
    
    var isTrusted: js.UndefOr[Boolean] = js.native
    
    var originalEvent: Event = js.native
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
    
    def preventOriginalDefault(): Unit = js.native
    
    var returnValue: js.UndefOr[Boolean] = js.native
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.native
    
    def stopImmediatePropagation(): Unit = js.native
    @JSName("stopImmediatePropagation")
    var stopImmediatePropagation_FFakeEvent: js.UndefOr[js.Function0[Unit]] = js.native
    
    def stopPropagation(): Unit = js.native
    @JSName("stopPropagation")
    var stopPropagation_FFakeEvent: js.UndefOr[js.Function0[Unit]] = js.native
    
    var target: js.UndefOr[EventTarget | Null] = js.native
    
    var timeStamp: js.UndefOr[DOMHighResTimeStamp] = js.native
    
    var `type`: String = js.native
  }
  
  type Listener = js.Function1[/* event */ Event | FakeEvent, Any]
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait Scope extends StObject {
      
      var events: ReturnType[js.Function1[/* scope */ this.type, Add]]
    }
    object Scope {
      
      inline def apply(
        events: ReturnType[
              js.Function1[typings.interactjsTypes.coreEventsMod.interactjsCoreScopeAugmentingMod.Scope, Add]
            ]
      ): typings.interactjsTypes.coreEventsMod.interactjsCoreScopeAugmentingMod.Scope = {
        val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.interactjsTypes.coreEventsMod.interactjsCoreScopeAugmentingMod.Scope]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.interactjsTypes.coreEventsMod.interactjsCoreScopeAugmentingMod.Scope] (val x: Self) extends AnyVal {
        
        inline def setEvents(
          value: ReturnType[
                  js.Function1[typings.interactjsTypes.coreEventsMod.interactjsCoreScopeAugmentingMod.Scope, Add]
                ]
        ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      }
    }
  }
}
