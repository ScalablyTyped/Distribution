package typings.inferno.distCoreTypesMod

import typings.inferno.distCoreNativetypesMod.NativeDragEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationEventHandler[T] = EventHandler[InfernoAnimationEvent[T]]

type Booleanish = Boolean

type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]

type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]

type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  P extends any ? string extends keyof P ? P : std.Pick<P, std.Exclude<keyof P, keyof D>> & std.Partial<std.Pick<P, std.Extract<keyof P, keyof D>>> & std.Partial<std.Pick<D, std.Exclude<keyof D, keyof P>>> : never
  }}}
  */
type Defaultize[P, D] = P

type DragEvent[T] = InfernoMouseEvent[T] & NativeDragEvent

type DragEventHandler[T] = EventHandler[DragEvent[T]]

type EventHandler[E /* <: SemiSyntheticEvent[Any] */] = (js.Function1[/* event */ E, Unit]) | (LinkedEvent[Any, E]) | Null

type FocusEventHandler[T] = EventHandler[FocusEvent[T]]

type FormEvent[T] = SemiSyntheticEvent[T]

type FormEventHandler[T] = EventHandler[FormEvent[T]]

type InfernoEventHandler[T] = EventHandler[SemiSyntheticEvent[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  C extends {  defaultProps :infer D} ? inferno.inferno/dist/core/types.Defaultize<P, D> : P
  }}}
  */
type InfernoManagedAttributes[C, P] = P

type InfernoWheelEvent[T] = InfernoMouseEvent[T] & WheelEvent

type Key = js.UndefOr[String | Double | Null]

type KeyboardEventHandler[T] = EventHandler[InfernoKeyboardEvent[T]]

type MouseEventHandler[T] = EventHandler[InfernoMouseEvent[T]]

type PointerEventHandler[T] = EventHandler[InfernoPointerEvent[T]]

type Ref[T] = js.Function1[/* instance */ T | Null, Any]

type TouchEventHandler[T] = EventHandler[InfernoTouchEvent[T]]

type TransitionEventHandler[T] = EventHandler[InfernoTransitionEvent[T]]

type UIEventHandler[T] = EventHandler[InfernoUIEvent[T]]

type WheelEventHandler[T] = EventHandler[InfernoWheelEvent[T]]
