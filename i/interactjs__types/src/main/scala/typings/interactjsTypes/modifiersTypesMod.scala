package typings.interactjsTypes

import typings.interactjsTypes.anon.BeforeEnd
import typings.interactjsTypes.anon.Enabled
import typings.interactjsTypes.anon.Index
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.EdgeOptions
import typings.interactjsTypes.coreTypesMod.FullRect
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.Rect
import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersTypesMod {
  
  trait Modifier[Defaults, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result] extends StObject {
    
    def disable(): Modifier[Defaults, State, Name, Result]
    
    def enable(): Modifier[Defaults, State, Name, Result]
    
    var methods: BeforeEnd[State, Result]
    
    var name: js.UndefOr[Name] = js.undefined
    
    var options: Defaults
  }
  object Modifier {
    
    inline def apply[Defaults, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result](
      disable: () => Modifier[Defaults, State, Name, Result],
      enable: () => Modifier[Defaults, State, Name, Result],
      methods: BeforeEnd[State, Result],
      options: Defaults
    ): Modifier[Defaults, State, Name, Result] = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), methods = methods.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifier[Defaults, State, Name, Result]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Modifier[?, ?, ?, ?], Defaults, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result] (val x: Self & (Modifier[Defaults, State, Name, Result])) extends AnyVal {
      
      inline def setDisable(value: () => Modifier[Defaults, State, Name, Result]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Modifier[Defaults, State, Name, Result]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setMethods(value: BeforeEnd[State, Result]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: Defaults): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModifierArg[State /* <: ModifierState[Any, Any, Any] */] extends StObject {
    
    var coords: Point
    
    var edges: EdgeOptions
    
    var element: Element
    
    var interactable: InteractableActions
    
    var interaction: Interaction[ActionName]
    
    var pageCoords: Point
    
    var phase: EventPhase
    
    var preEnd: js.UndefOr[Boolean] = js.undefined
    
    var prevCoords: Point
    
    var prevRect: js.UndefOr[FullRect] = js.undefined
    
    var rect: FullRect
    
    var startOffset: Rect
    
    var state: State
  }
  object ModifierArg {
    
    inline def apply[State /* <: ModifierState[Any, Any, Any] */](
      coords: Point,
      edges: EdgeOptions,
      element: Element,
      interactable: InteractableActions,
      interaction: Interaction[ActionName],
      pageCoords: Point,
      phase: EventPhase,
      prevCoords: Point,
      rect: FullRect,
      startOffset: Rect,
      state: State
    ): ModifierArg[State] = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], interactable = interactable.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], pageCoords = pageCoords.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], prevCoords = prevCoords.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifierArg[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierArg[?], State /* <: ModifierState[Any, Any, Any] */] (val x: Self & ModifierArg[State]) extends AnyVal {
      
      inline def setCoords(value: Point): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInteractable(value: InteractableActions): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
      
      inline def setInteraction(value: Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
      
      inline def setPageCoords(value: Point): Self = StObject.set(x, "pageCoords", value.asInstanceOf[js.Any])
      
      inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
      
      inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
      
      inline def setPrevCoords(value: Point): Self = StObject.set(x, "prevCoords", value.asInstanceOf[js.Any])
      
      inline def setPrevRect(value: FullRect): Self = StObject.set(x, "prevRect", value.asInstanceOf[js.Any])
      
      inline def setPrevRectUndefined: Self = StObject.set(x, "prevRect", js.undefined)
      
      inline def setRect(value: FullRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Rect): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModifierFunction[Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */] extends StObject {
    
    def apply(): Modifier[Defaults, State, Name, Any] = js.native
    def apply(_options: Partial[Defaults]): Modifier[Defaults, State, Name, Any] = js.native
    
    var _defaults: Defaults = js.native
    
    var _methods: ModifierModule[Defaults, State, Any] = js.native
  }
  
  trait ModifierModule[Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Result] extends StObject {
    
    var beforeEnd: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Point | Unit]] = js.undefined
    
    var defaults: js.UndefOr[Defaults] = js.undefined
    
    var set: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Result]] = js.undefined
    
    var start: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Unit]] = js.undefined
    
    var stop: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Unit]] = js.undefined
  }
  object ModifierModule {
    
    inline def apply[Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Result](): ModifierModule[Defaults, State, Result] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifierModule[Defaults, State, Result]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierModule[?, ?, ?], Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Result] (val x: Self & (ModifierModule[Defaults, State, Result])) extends AnyVal {
      
      inline def setBeforeEnd(value: /* arg */ ModifierArg[State] => Point | Unit): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
      
      inline def setBeforeEndUndefined: Self = StObject.set(x, "beforeEnd", js.undefined)
      
      inline def setDefaults(value: Defaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setSet(value: /* arg */ ModifierArg[State] => Result): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setStart(value: /* arg */ ModifierArg[State] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* arg */ ModifierArg[State] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
  
  type ModifierState[Defaults, StateProps, Name /* <: String */] = (Index[Defaults, Name]) & StateProps
}
