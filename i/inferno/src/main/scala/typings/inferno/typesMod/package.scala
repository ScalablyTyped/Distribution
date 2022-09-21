package typings.inferno.typesMod

import typings.inferno.nativetypesMod.NativeDragEvent
import typings.std.Exclude
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationEventHandler[T] = EventHandler[InfernoAnimationEvent[T]]

type Booleanish = Boolean

type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]

type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]

type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]

type Defaultize[P, D] = ((Pick[P, Exclude[/* keyof P */ String, /* keyof D */ String]]) & (Partial[Pick[P, Extract[/* keyof P */ String, /* keyof D */ String]]]) & (Partial[Pick[D, Exclude[/* keyof D */ String, /* keyof P */ String]]])) | P

type DragEvent[T] = InfernoMouseEvent[T] & NativeDragEvent

type DragEventHandler[T] = EventHandler[DragEvent[T]]

type EventHandler[E /* <: SemiSyntheticEvent[Any] */] = (js.Function1[/* event */ E, Unit]) | (LinkedEvent[Any, E]) | Null

type FocusEventHandler[T] = EventHandler[FocusEvent[T]]

type FormEvent[T] = SemiSyntheticEvent[T]

type FormEventHandler[T] = EventHandler[FormEvent[T]]

type InfernoEventHandler[T] = EventHandler[SemiSyntheticEvent[T]]

type InfernoManagedAttributes[C, P] = P | (Defaultize[P, Any])

type InfernoWheelEvent[T] = InfernoMouseEvent[T] & WheelEvent

type Key = js.UndefOr[String | Double | Null]

type KeyboardEventHandler[T] = EventHandler[InfernoKeyboardEvent[T]]

type MouseEventHandler[T] = EventHandler[InfernoMouseEvent[T]]

type PointerEventHandler[T] = EventHandler[InfernoPointerEvent[T]]

type Ref[T] = (js.Function1[/* instance */ T | Null, Any]) | RefObject[T]

type TouchEventHandler[T] = EventHandler[InfernoTouchEvent[T]]

type TransitionEventHandler[T] = EventHandler[InfernoTransitionEvent[T]]

type UIEventHandler[T] = EventHandler[InfernoUIEvent[T]]

type WheelEventHandler[T] = EventHandler[InfernoWheelEvent[T]]
