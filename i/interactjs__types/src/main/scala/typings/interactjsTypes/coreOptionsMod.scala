package typings.interactjsTypes

import typings.interactjsTypes.actionsDragPluginMod.DraggableOptions
import typings.interactjsTypes.actionsDropPluginMod.DropzoneOptions
import typings.interactjsTypes.actionsGesturePluginMod.GesturableOptions
import typings.interactjsTypes.actionsResizePluginMod.ResizableOptions
import typings.interactjsTypes.anon.AllowResume
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.PartialDraggableOptions
import typings.interactjsTypes.anon.PartialDropzoneOptionsAccept
import typings.interactjsTypes.anon.PartialGesturableOptions
import typings.interactjsTypes.anon.PartialOptionsActionChecker
import typings.interactjsTypes.anon.PartialResizableOptions
import typings.interactjsTypes.autoScrollPluginMod.AutoScrollOptions
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.ActionProps
import typings.interactjsTypes.coreTypesMod.CursorChecker
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.ListenerMap
import typings.interactjsTypes.coreTypesMod.Listeners
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.devToolsPluginMod.DevToolsOptions
import typings.interactjsTypes.interactjsTypesInts.`0`
import typings.interactjsTypes.interactjsTypesInts.`16`
import typings.interactjsTypes.interactjsTypesInts.`1`
import typings.interactjsTypes.interactjsTypesInts.`2`
import typings.interactjsTypes.interactjsTypesInts.`4`
import typings.interactjsTypes.interactjsTypesInts.`8`
import typings.interactjsTypes.interactjsTypesStrings.auto
import typings.interactjsTypes.interactjsTypesStrings.client
import typings.interactjsTypes.interactjsTypesStrings.never
import typings.interactjsTypes.interactjsTypesStrings.page
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreOptionsMod {
  
  @JSImport("@interactjs/core/options", "defaults")
  @js.native
  val defaults: Defaults_ = js.native
  
  trait ActionDefaults extends StObject {
    
    var drag: DraggableOptions
    
    var drop: DropzoneOptions
    
    var gesture: GesturableOptions
    
    var pointerEvents: Options
    
    var resize: ResizableOptions
  }
  object ActionDefaults {
    
    inline def apply(
      drag: DraggableOptions,
      drop: DropzoneOptions,
      gesture: GesturableOptions,
      pointerEvents: Options,
      resize: ResizableOptions
    ): ActionDefaults = {
      val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionDefaults]
    }
    
    extension [Self <: ActionDefaults](x: Self) {
      
      inline def setDrag(value: DraggableOptions): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDrop(value: DropzoneOptions): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setGesture(value: GesturableOptions): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setPointerEvents(value: Options): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setResize(value: ResizableOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseDefaults extends StObject {
    
    var actionChecker: js.UndefOr[Any] = js.undefined
    
    var context: js.UndefOr[Node] = js.undefined
    
    var cursorChecker: js.UndefOr[Any] = js.undefined
    
    var deltaSource: js.UndefOr[page | client] = js.undefined
    
    var devTools: js.UndefOr[DevToolsOptions] = js.undefined
    
    var preventDefault: js.UndefOr[auto | never | String] = js.undefined
    
    var styleCursor: js.UndefOr[Any] = js.undefined
  }
  object BaseDefaults {
    
    inline def apply(): BaseDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseDefaults]
    }
    
    extension [Self <: BaseDefaults](x: Self) {
      
      inline def setActionChecker(value: Any): Self = StObject.set(x, "actionChecker", value.asInstanceOf[js.Any])
      
      inline def setActionCheckerUndefined: Self = StObject.set(x, "actionChecker", js.undefined)
      
      inline def setContext(value: Node): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCursorChecker(value: Any): Self = StObject.set(x, "cursorChecker", value.asInstanceOf[js.Any])
      
      inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
      
      inline def setDeltaSource(value: page | client): Self = StObject.set(x, "deltaSource", value.asInstanceOf[js.Any])
      
      inline def setDeltaSourceUndefined: Self = StObject.set(x, "deltaSource", js.undefined)
      
      inline def setDevTools(value: DevToolsOptions): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
      
      inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
      
      inline def setPreventDefault(value: auto | never | String): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setStyleCursor(value: Any): Self = StObject.set(x, "styleCursor", value.asInstanceOf[js.Any])
      
      inline def setStyleCursorUndefined: Self = StObject.set(x, "styleCursor", js.undefined)
    }
  }
  
  trait Defaults_ extends StObject {
    
    var actions: ActionDefaults
    
    var base: BaseDefaults
    
    var perAction: PerActionDefaults
  }
  object Defaults_ {
    
    inline def apply(actions: ActionDefaults, base: BaseDefaults, perAction: PerActionDefaults): Defaults_ = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], perAction = perAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Defaults_]
    }
    
    extension [Self <: Defaults_](x: Self) {
      
      inline def setActions(value: ActionDefaults): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setBase(value: BaseDefaults): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setPerAction(value: PerActionDefaults): Self = StObject.set(x, "perAction", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@interactjs/types.@interactjs/core/options.BaseDefaults> & std.Partial<@interactjs/types.@interactjs/core/options.PerActionDefaults> & {[ P in keyof @interactjs/types.@interactjs/core/options.ActionDefaults ]:? std.Partial<@interactjs/types.@interactjs/core/options.ActionDefaults[P]>} */
  trait Options extends StObject {
    
    var actionChecker: js.UndefOr[Any] = js.undefined
    
    var allowFrom: js.UndefOr[String | Element] = js.undefined
    
    var autoScroll: js.UndefOr[AutoScrollOptions] = js.undefined
    
    var context: js.UndefOr[Node] = js.undefined
    
    var cursorChecker: js.UndefOr[Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var deltaSource: js.UndefOr[page | client] = js.undefined
    
    var devTools: js.UndefOr[DevToolsOptions] = js.undefined
    
    var drag: js.UndefOr[PartialDraggableOptions] = js.undefined
    
    var drop: js.UndefOr[PartialDropzoneOptionsAccept] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var gesture: js.UndefOr[PartialGesturableOptions] = js.undefined
    
    var hold: js.UndefOr[Double] = js.undefined
    
    var ignoreFrom: js.UndefOr[String | Element] = js.undefined
    
    var inertia: js.UndefOr[AllowResume] = js.undefined
    
    var listeners: js.UndefOr[Listeners] = js.undefined
    
    var manualStart: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxPerElement: js.UndefOr[Double] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
    
    var mouseButtons: js.UndefOr[`0` | `1` | `2` | `4` | `8` | `16`] = js.undefined
    
    var origin: js.UndefOr[Point | String | Element] = js.undefined
    
    var pointerEvents: js.UndefOr[PartialOptionsActionChecker] = js.undefined
    
    var preventDefault: js.UndefOr[auto | never | String] = js.undefined
    
    var resize: js.UndefOr[PartialResizableOptions] = js.undefined
    
    var styleCursor: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActionChecker(value: Any): Self = StObject.set(x, "actionChecker", value.asInstanceOf[js.Any])
      
      inline def setActionCheckerUndefined: Self = StObject.set(x, "actionChecker", js.undefined)
      
      inline def setAllowFrom(value: String | Element): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
      
      inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
      
      inline def setAutoScroll(value: AutoScrollOptions): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
      
      inline def setContext(value: Node): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCursorChecker(value: Any): Self = StObject.set(x, "cursorChecker", value.asInstanceOf[js.Any])
      
      inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDeltaSource(value: page | client): Self = StObject.set(x, "deltaSource", value.asInstanceOf[js.Any])
      
      inline def setDeltaSourceUndefined: Self = StObject.set(x, "deltaSource", js.undefined)
      
      inline def setDevTools(value: DevToolsOptions): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
      
      inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
      
      inline def setDrag(value: PartialDraggableOptions): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDrop(value: PartialDropzoneOptionsAccept): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGesture(value: PartialGesturableOptions): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
      
      inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setIgnoreFrom(value: String | Element): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
      
      inline def setInertia(value: AllowResume): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
      
      inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
      
      inline def setListeners(value: Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setListenersVarargs(value: ListenerMap*): Self = StObject.set(x, "listeners", js.Array(value*))
      
      inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
      
      inline def setManualStartUndefined: Self = StObject.set(x, "manualStart", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxPerElement(value: Double): Self = StObject.set(x, "maxPerElement", value.asInstanceOf[js.Any])
      
      inline def setMaxPerElementUndefined: Self = StObject.set(x, "maxPerElement", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setMouseButtons(value: `0` | `1` | `2` | `4` | `8` | `16`): Self = StObject.set(x, "mouseButtons", value.asInstanceOf[js.Any])
      
      inline def setMouseButtonsUndefined: Self = StObject.set(x, "mouseButtons", js.undefined)
      
      inline def setOrigin(value: Point | String | Element): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPointerEvents(value: PartialOptionsActionChecker): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPreventDefault(value: auto | never | String): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setResize(value: PartialResizableOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setStyleCursor(value: Any): Self = StObject.set(x, "styleCursor", value.asInstanceOf[js.Any])
      
      inline def setStyleCursorUndefined: Self = StObject.set(x, "styleCursor", js.undefined)
    }
  }
  
  /* Inlined parent @interactjs/types.@interactjs/core/options.BaseDefaults */
  /* Inlined parent @interactjs/types.@interactjs/core/types.OrBoolean<std.Partial<@interactjs/types.@interactjs/core/options.ActionDefaults>> */
  trait OptionsArg extends StObject {
    
    var actionChecker: js.UndefOr[Any] = js.undefined
    
    var context: js.UndefOr[Node] = js.undefined
    
    var cursorChecker: js.UndefOr[Any] = js.undefined
    
    var deltaSource: js.UndefOr[page | client] = js.undefined
    
    var devTools: js.UndefOr[DevToolsOptions] = js.undefined
    
    var drag: js.UndefOr[DraggableOptions | Boolean] = js.undefined
    
    var drop: js.UndefOr[DropzoneOptions | Boolean] = js.undefined
    
    var gesture: js.UndefOr[GesturableOptions | Boolean] = js.undefined
    
    var pointerEvents: js.UndefOr[Options | Boolean] = js.undefined
    
    var preventDefault: js.UndefOr[auto | never | String] = js.undefined
    
    var resize: js.UndefOr[ResizableOptions | Boolean] = js.undefined
    
    var styleCursor: js.UndefOr[Any] = js.undefined
  }
  object OptionsArg {
    
    inline def apply(): OptionsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsArg]
    }
    
    extension [Self <: OptionsArg](x: Self) {
      
      inline def setActionChecker(value: Any): Self = StObject.set(x, "actionChecker", value.asInstanceOf[js.Any])
      
      inline def setActionCheckerUndefined: Self = StObject.set(x, "actionChecker", js.undefined)
      
      inline def setContext(value: Node): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCursorChecker(value: Any): Self = StObject.set(x, "cursorChecker", value.asInstanceOf[js.Any])
      
      inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
      
      inline def setDeltaSource(value: page | client): Self = StObject.set(x, "deltaSource", value.asInstanceOf[js.Any])
      
      inline def setDeltaSourceUndefined: Self = StObject.set(x, "deltaSource", js.undefined)
      
      inline def setDevTools(value: DevToolsOptions): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
      
      inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
      
      inline def setDrag(value: DraggableOptions | Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDrop(value: DropzoneOptions | Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setGesture(value: GesturableOptions | Boolean): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
      
      inline def setPointerEvents(value: Options | Boolean): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPreventDefault(value: auto | never | String): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setResize(value: ResizableOptions | Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setStyleCursor(value: Any): Self = StObject.set(x, "styleCursor", value.asInstanceOf[js.Any])
      
      inline def setStyleCursorUndefined: Self = StObject.set(x, "styleCursor", js.undefined)
    }
  }
  
  trait PerActionDefaults extends StObject {
    
    var allowFrom: js.UndefOr[String | Element] = js.undefined
    
    var autoScroll: js.UndefOr[AutoScrollOptions] = js.undefined
    
    var cursorChecker: js.UndefOr[CursorChecker] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var hold: js.UndefOr[Double] = js.undefined
    
    var ignoreFrom: js.UndefOr[String | Element] = js.undefined
    
    var inertia: js.UndefOr[AllowResume] = js.undefined
    
    var listeners: js.UndefOr[Listeners] = js.undefined
    
    var manualStart: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxPerElement: js.UndefOr[Double] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
    
    var mouseButtons: js.UndefOr[`0` | `1` | `2` | `4` | `8` | `16`] = js.undefined
    
    var origin: js.UndefOr[Point | String | Element] = js.undefined
  }
  object PerActionDefaults {
    
    inline def apply(): PerActionDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerActionDefaults]
    }
    
    extension [Self <: PerActionDefaults](x: Self) {
      
      inline def setAllowFrom(value: String | Element): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
      
      inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
      
      inline def setAutoScroll(value: AutoScrollOptions): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
      
      inline def setCursorChecker(
        value: (/* action */ ActionProps[ActionName], /* interactable */ InteractableActions, /* element */ Element, /* interacting */ Boolean) => String
      ): Self = StObject.set(x, "cursorChecker", js.Any.fromFunction4(value))
      
      inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setIgnoreFrom(value: String | Element): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
      
      inline def setInertia(value: AllowResume): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
      
      inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
      
      inline def setListeners(value: Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setListenersVarargs(value: ListenerMap*): Self = StObject.set(x, "listeners", js.Array(value*))
      
      inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
      
      inline def setManualStartUndefined: Self = StObject.set(x, "manualStart", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxPerElement(value: Double): Self = StObject.set(x, "maxPerElement", value.asInstanceOf[js.Any])
      
      inline def setMaxPerElementUndefined: Self = StObject.set(x, "maxPerElement", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setMouseButtons(value: `0` | `1` | `2` | `4` | `8` | `16`): Self = StObject.set(x, "mouseButtons", value.asInstanceOf[js.Any])
      
      inline def setMouseButtonsUndefined: Self = StObject.set(x, "mouseButtons", js.undefined)
      
      inline def setOrigin(value: Point | String | Element): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
