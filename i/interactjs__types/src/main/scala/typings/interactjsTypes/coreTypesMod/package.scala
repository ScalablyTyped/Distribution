package typings.interactjsTypes.coreTypesMod

import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.PartialNativePointerEvent
import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.std.Document
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.SVGElement
import typings.std.Touch
import typings.std.TouchEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionChecker = js.Function5[
/* pointerEvent */ Any, 
/* defaultAction */ String, 
/* interactable */ InteractableActions, 
/* element */ Element, 
/* interaction */ Interaction[ActionName], 
ActionProps[scala.Nothing]]

type Context = Document | Element

type CursorChecker = js.Function4[
/* action */ ActionProps[ActionName], 
/* interactable */ InteractableActions, 
/* element */ Element, 
/* interacting */ Boolean, 
String]

type Element = HTMLElement | SVGElement

type EventTarget = Window | Document | Element

type EventTypes = String | ListenerMap | (js.Array[String | ListenerMap])

type InertiaOptions = InertiaOption | Boolean

type Listeners = ListenerMap | js.Array[ListenerMap]

/* Rewritten from type alias, can be one of: 
  - typings.interactjsTypes.coreTypesMod.Listener
  - typings.interactjsTypes.coreTypesMod.ListenerMap
  - js.Array[
typings.interactjsTypes.coreTypesMod.Listener | typings.interactjsTypes.coreTypesMod.ListenerMap]
*/
type ListenersArg = _ListenersArg | (js.Array[Listener | ListenerMap])

type NativePointerEventType = PointerEvent

type OriginFunction = js.Function1[/* target */ Element, Rect]

type PointerEventType = MouseEvent | TouchEvent | PartialNativePointerEvent | (InteractEvent[scala.Nothing, EventPhase])

type PointerType = MouseEvent | Touch | PartialNativePointerEvent | (InteractEvent[scala.Nothing, EventPhase])

type RectChecker = js.Function1[/* element */ Element, Rect]

type RectFunction[T /* <: js.Array[Any] */] = js.Function1[/* args */ T, Rect | Element]

type RectResolvable[T /* <: js.Array[Any] */] = Rect | String | Element | RectFunction[T]

type Target = EventTarget | String
