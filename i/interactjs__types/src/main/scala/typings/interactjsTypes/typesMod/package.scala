package typings.interactjsTypes.typesMod

import org.scalablytyped.runtime.TopLevel
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.PartialNativePointerEvent
import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.interactionMod.Interaction
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

type ArrayElementType[T] = Any

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
  - typings.interactjsTypes.typesMod.Listener
  - typings.interactjsTypes.typesMod.ListenerMap
  - js.Array[
typings.interactjsTypes.typesMod.Listener | typings.interactjsTypes.typesMod.ListenerMap]
*/
type ListenersArg = _ListenersArg | (js.Array[Listener | ListenerMap])

type NativePointerEventType = PointerEvent

type OrBoolean[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: T[P] | boolean}
  */ typings.interactjsTypes.interactjsTypesStrings.OrBoolean & TopLevel[T]

type OriginFunction = js.Function1[/* target */ Element, Rect]

type PointerEventType = MouseEvent | TouchEvent | PartialNativePointerEvent | (InteractEvent[scala.Nothing, EventPhase])

type PointerType = MouseEvent | Touch | PartialNativePointerEvent | (InteractEvent[scala.Nothing, EventPhase])

type RectChecker = js.Function1[/* element */ Element, Rect]

type RectFunction[T /* <: js.Array[Any] */] = js.Function1[/* args */ T, Rect | Element]

type RectResolvable[T /* <: js.Array[Any] */] = Rect | String | Element | RectFunction[T]

type Target = EventTarget | String
