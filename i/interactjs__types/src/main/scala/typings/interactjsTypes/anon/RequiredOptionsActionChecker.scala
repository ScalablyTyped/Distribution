package typings.interactjsTypes.anon

import typings.interactjsTypes.autoScrollPluginMod.AutoScrollOptions
import typings.interactjsTypes.coreTypesMod.ListenerMap
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.devToolsPluginMod.DevToolsOptions
import typings.interactjsTypes.interactjsTypesInts.`16`
import typings.interactjsTypes.interactjsTypesInts.`8`
import typings.interactjsTypes.interactjsTypesStrings.auto
import typings.interactjsTypes.interactjsTypesStrings.client
import typings.interactjsTypes.interactjsTypesStrings.never
import typings.interactjsTypes.interactjsTypesStrings.page
import typings.interactjsTypes.modifiersTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@interactjs/types.@interactjs/core/options.Options> */
trait RequiredOptionsActionChecker extends StObject {
  
  var actionChecker: Any
  
  var allowFrom: String | typings.interactjsTypes.coreTypesMod.Element
  
  var autoScroll: AutoScrollOptions
  
  var context: typings.std.Node
  
  var cursorChecker: Any
  
  var delay: Double
  
  var deltaSource: page | client
  
  var devTools: DevToolsOptions
  
  var drag: PartialDraggableOptions
  
  var drop: PartialDropzoneOptionsAllowFrom
  
  var enabled: Boolean
  
  var gesture: PartialGesturableOptions
  
  var hold: Double
  
  var ignoreFrom: String | typings.interactjsTypes.coreTypesMod.Element
  
  var inertia: AllowResume
  
  var listeners: typings.interactjsTypes.coreTypesMod.Listeners
  
  var manualStart: Boolean
  
  var max: Double
  
  var maxPerElement: Double
  
  var modifiers: js.Array[Modifier[Any, Any, Any, Any]]
  
  var mouseButtons: typings.interactjsTypes.interactjsTypesInts.`0` | typings.interactjsTypes.interactjsTypesInts.`1` | typings.interactjsTypes.interactjsTypesInts.`2` | typings.interactjsTypes.interactjsTypesInts.`4` | `8` | `16`
  
  var origin: Point | String | typings.interactjsTypes.coreTypesMod.Element
  
  var pointerEvents: PartialOptionsAllowFrom
  
  var preventDefault: auto | never | String
  
  var resize: PartialResizableOptions
  
  var styleCursor: Any
}
object RequiredOptionsActionChecker {
  
  inline def apply(
    actionChecker: Any,
    allowFrom: String | typings.interactjsTypes.coreTypesMod.Element,
    autoScroll: AutoScrollOptions,
    context: typings.std.Node,
    cursorChecker: Any,
    delay: Double,
    deltaSource: page | client,
    devTools: DevToolsOptions,
    drag: PartialDraggableOptions,
    drop: PartialDropzoneOptionsAllowFrom,
    enabled: Boolean,
    gesture: PartialGesturableOptions,
    hold: Double,
    ignoreFrom: String | typings.interactjsTypes.coreTypesMod.Element,
    inertia: AllowResume,
    listeners: typings.interactjsTypes.coreTypesMod.Listeners,
    manualStart: Boolean,
    max: Double,
    maxPerElement: Double,
    modifiers: js.Array[Modifier[Any, Any, Any, Any]],
    mouseButtons: typings.interactjsTypes.interactjsTypesInts.`0` | typings.interactjsTypes.interactjsTypesInts.`1` | typings.interactjsTypes.interactjsTypesInts.`2` | typings.interactjsTypes.interactjsTypesInts.`4` | `8` | `16`,
    origin: Point | String | typings.interactjsTypes.coreTypesMod.Element,
    pointerEvents: PartialOptionsAllowFrom,
    preventDefault: auto | never | String,
    resize: PartialResizableOptions,
    styleCursor: Any
  ): RequiredOptionsActionChecker = {
    val __obj = js.Dynamic.literal(actionChecker = actionChecker.asInstanceOf[js.Any], allowFrom = allowFrom.asInstanceOf[js.Any], autoScroll = autoScroll.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], cursorChecker = cursorChecker.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], deltaSource = deltaSource.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], ignoreFrom = ignoreFrom.asInstanceOf[js.Any], inertia = inertia.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], manualStart = manualStart.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxPerElement = maxPerElement.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], mouseButtons = mouseButtons.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], styleCursor = styleCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOptionsActionChecker]
  }
  
  extension [Self <: RequiredOptionsActionChecker](x: Self) {
    
    inline def setActionChecker(value: Any): Self = StObject.set(x, "actionChecker", value.asInstanceOf[js.Any])
    
    inline def setAllowFrom(value: String | typings.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
    
    inline def setAutoScroll(value: AutoScrollOptions): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setContext(value: typings.std.Node): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setCursorChecker(value: Any): Self = StObject.set(x, "cursorChecker", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDeltaSource(value: page | client): Self = StObject.set(x, "deltaSource", value.asInstanceOf[js.Any])
    
    inline def setDevTools(value: DevToolsOptions): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    inline def setDrag(value: PartialDraggableOptions): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDrop(value: PartialDropzoneOptionsAllowFrom): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setGesture(value: PartialGesturableOptions): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFrom(value: String | typings.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
    
    inline def setInertia(value: AllowResume): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: typings.interactjsTypes.coreTypesMod.Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: ListenerMap*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxPerElement(value: Double): Self = StObject.set(x, "maxPerElement", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setMouseButtons(
      value: typings.interactjsTypes.interactjsTypesInts.`0` | typings.interactjsTypes.interactjsTypesInts.`1` | typings.interactjsTypes.interactjsTypesInts.`2` | typings.interactjsTypes.interactjsTypesInts.`4` | `8` | `16`
    ): Self = StObject.set(x, "mouseButtons", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Point | String | typings.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPointerEvents(value: PartialOptionsAllowFrom): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: auto | never | String): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setResize(value: PartialResizableOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setStyleCursor(value: Any): Self = StObject.set(x, "styleCursor", value.asInstanceOf[js.Any])
  }
}
