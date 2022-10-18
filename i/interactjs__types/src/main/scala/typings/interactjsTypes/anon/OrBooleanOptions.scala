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

/* Inlined @interactjs/types.@interactjs/core/types.OrBoolean<@interactjs/types.@interactjs/core/options.Options> */
trait OrBooleanOptions extends StObject {
  
  var actionChecker: js.UndefOr[Any | Boolean] = js.undefined
  
  var allowFrom: js.UndefOr[String | typings.interactjsTypes.coreTypesMod.Element | Boolean] = js.undefined
  
  var autoScroll: js.UndefOr[AutoScrollOptions | Boolean] = js.undefined
  
  var context: js.UndefOr[typings.std.Node | Boolean] = js.undefined
  
  var cursorChecker: js.UndefOr[Any | Boolean] = js.undefined
  
  var delay: js.UndefOr[Double | Boolean] = js.undefined
  
  var deltaSource: js.UndefOr[page | client | Boolean] = js.undefined
  
  var devTools: js.UndefOr[DevToolsOptions | Boolean] = js.undefined
  
  var drag: js.UndefOr[PartialDraggableOptions | Boolean] = js.undefined
  
  var drop: js.UndefOr[PartialDropzoneOptions | Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var gesture: js.UndefOr[PartialGesturableOptions | Boolean] = js.undefined
  
  var hold: js.UndefOr[Double | Boolean] = js.undefined
  
  var ignoreFrom: js.UndefOr[String | typings.interactjsTypes.coreTypesMod.Element | Boolean] = js.undefined
  
  var inertia: js.UndefOr[AllowResume | Boolean] = js.undefined
  
  var listeners: js.UndefOr[typings.interactjsTypes.coreTypesMod.Listeners | Boolean] = js.undefined
  
  var manualStart: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double | Boolean] = js.undefined
  
  var maxPerElement: js.UndefOr[Double | Boolean] = js.undefined
  
  var modifiers: js.UndefOr[(js.Array[Modifier[Any, Any, Any, Any]]) | Boolean] = js.undefined
  
  var mouseButtons: js.UndefOr[
    typings.interactjsTypes.interactjsTypesInts.`0` | typings.interactjsTypes.interactjsTypesInts.`1` | typings.interactjsTypes.interactjsTypesInts.`2` | typings.interactjsTypes.interactjsTypesInts.`4` | `8` | `16` | Boolean
  ] = js.undefined
  
  var origin: js.UndefOr[Point | String | typings.interactjsTypes.coreTypesMod.Element | Boolean] = js.undefined
  
  var pointerEvents: js.UndefOr[PartialOptions | Boolean] = js.undefined
  
  var preventDefault: js.UndefOr[auto | never | String | Boolean] = js.undefined
  
  var resize: js.UndefOr[PartialResizableOptions | Boolean] = js.undefined
  
  var styleCursor: js.UndefOr[Any | Boolean] = js.undefined
}
object OrBooleanOptions {
  
  inline def apply(): OrBooleanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrBooleanOptions]
  }
  
  extension [Self <: OrBooleanOptions](x: Self) {
    
    inline def setActionChecker(value: Any | Boolean): Self = StObject.set(x, "actionChecker", value.asInstanceOf[js.Any])
    
    inline def setActionCheckerUndefined: Self = StObject.set(x, "actionChecker", js.undefined)
    
    inline def setAllowFrom(value: String | typings.interactjsTypes.coreTypesMod.Element | Boolean): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
    
    inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
    
    inline def setAutoScroll(value: AutoScrollOptions | Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setContext(value: typings.std.Node | Boolean): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCursorChecker(value: Any | Boolean): Self = StObject.set(x, "cursorChecker", value.asInstanceOf[js.Any])
    
    inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
    
    inline def setDelay(value: Double | Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDeltaSource(value: page | client | Boolean): Self = StObject.set(x, "deltaSource", value.asInstanceOf[js.Any])
    
    inline def setDeltaSourceUndefined: Self = StObject.set(x, "deltaSource", js.undefined)
    
    inline def setDevTools(value: DevToolsOptions | Boolean): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
    
    inline def setDrag(value: PartialDraggableOptions | Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDrop(value: PartialDropzoneOptions | Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGesture(value: PartialGesturableOptions | Boolean): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
    
    inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
    
    inline def setHold(value: Double | Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setIgnoreFrom(value: String | typings.interactjsTypes.coreTypesMod.Element | Boolean): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
    
    inline def setInertia(value: AllowResume | Boolean): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
    
    inline def setListeners(value: typings.interactjsTypes.coreTypesMod.Listeners | Boolean): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: ListenerMap*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
    
    inline def setManualStartUndefined: Self = StObject.set(x, "manualStart", js.undefined)
    
    inline def setMax(value: Double | Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxPerElement(value: Double | Boolean): Self = StObject.set(x, "maxPerElement", value.asInstanceOf[js.Any])
    
    inline def setMaxPerElementUndefined: Self = StObject.set(x, "maxPerElement", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setModifiers(value: (js.Array[Modifier[Any, Any, Any, Any]]) | Boolean): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setMouseButtons(
      value: typings.interactjsTypes.interactjsTypesInts.`0` | typings.interactjsTypes.interactjsTypesInts.`1` | typings.interactjsTypes.interactjsTypesInts.`2` | typings.interactjsTypes.interactjsTypesInts.`4` | `8` | `16` | Boolean
    ): Self = StObject.set(x, "mouseButtons", value.asInstanceOf[js.Any])
    
    inline def setMouseButtonsUndefined: Self = StObject.set(x, "mouseButtons", js.undefined)
    
    inline def setOrigin(value: Point | String | typings.interactjsTypes.coreTypesMod.Element | Boolean): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPointerEvents(value: PartialOptions | Boolean): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setPreventDefault(value: auto | never | String | Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setResize(value: PartialResizableOptions | Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setStyleCursor(value: Any | Boolean): Self = StObject.set(x, "styleCursor", value.asInstanceOf[js.Any])
    
    inline def setStyleCursorUndefined: Self = StObject.set(x, "styleCursor", js.undefined)
  }
}
