package typings.makeEventProps

import typings.makeEventProps.makeEventPropsStrings.onAnimationEnd
import typings.makeEventProps.makeEventPropsStrings.onAnimationIteration
import typings.makeEventProps.makeEventPropsStrings.onAnimationStart
import typings.makeEventProps.makeEventPropsStrings.onBlur
import typings.makeEventProps.makeEventPropsStrings.onChange
import typings.makeEventProps.makeEventPropsStrings.onClick
import typings.makeEventProps.makeEventPropsStrings.onCompositionEnd
import typings.makeEventProps.makeEventPropsStrings.onCompositionStart
import typings.makeEventProps.makeEventPropsStrings.onCompositionUpdate
import typings.makeEventProps.makeEventPropsStrings.onContextMenu
import typings.makeEventProps.makeEventPropsStrings.onCopy
import typings.makeEventProps.makeEventPropsStrings.onCut
import typings.makeEventProps.makeEventPropsStrings.onDoubleClick
import typings.makeEventProps.makeEventPropsStrings.onDrag
import typings.makeEventProps.makeEventPropsStrings.onDragEnd
import typings.makeEventProps.makeEventPropsStrings.onDragEnter
import typings.makeEventProps.makeEventPropsStrings.onDragExit
import typings.makeEventProps.makeEventPropsStrings.onDragLeave
import typings.makeEventProps.makeEventPropsStrings.onDragOver
import typings.makeEventProps.makeEventPropsStrings.onDragStart
import typings.makeEventProps.makeEventPropsStrings.onDrop
import typings.makeEventProps.makeEventPropsStrings.onError
import typings.makeEventProps.makeEventPropsStrings.onFocus
import typings.makeEventProps.makeEventPropsStrings.onGotPointerCapture
import typings.makeEventProps.makeEventPropsStrings.onInput
import typings.makeEventProps.makeEventPropsStrings.onInvalid
import typings.makeEventProps.makeEventPropsStrings.onKeyDown
import typings.makeEventProps.makeEventPropsStrings.onKeyPress
import typings.makeEventProps.makeEventPropsStrings.onKeyUp
import typings.makeEventProps.makeEventPropsStrings.onLoad
import typings.makeEventProps.makeEventPropsStrings.onLostPointerCapture
import typings.makeEventProps.makeEventPropsStrings.onMouseDown
import typings.makeEventProps.makeEventPropsStrings.onMouseEnter
import typings.makeEventProps.makeEventPropsStrings.onMouseLeave
import typings.makeEventProps.makeEventPropsStrings.onMouseMove
import typings.makeEventProps.makeEventPropsStrings.onMouseOut
import typings.makeEventProps.makeEventPropsStrings.onMouseOver
import typings.makeEventProps.makeEventPropsStrings.onMouseUp
import typings.makeEventProps.makeEventPropsStrings.onPaste
import typings.makeEventProps.makeEventPropsStrings.onPointerCancel
import typings.makeEventProps.makeEventPropsStrings.onPointerDown
import typings.makeEventProps.makeEventPropsStrings.onPointerEnter
import typings.makeEventProps.makeEventPropsStrings.onPointerLeave
import typings.makeEventProps.makeEventPropsStrings.onPointerMove
import typings.makeEventProps.makeEventPropsStrings.onPointerOut
import typings.makeEventProps.makeEventPropsStrings.onPointerOver
import typings.makeEventProps.makeEventPropsStrings.onPointerUp
import typings.makeEventProps.makeEventPropsStrings.onReset
import typings.makeEventProps.makeEventPropsStrings.onScroll
import typings.makeEventProps.makeEventPropsStrings.onSelect
import typings.makeEventProps.makeEventPropsStrings.onSubmit
import typings.makeEventProps.makeEventPropsStrings.onToggle
import typings.makeEventProps.makeEventPropsStrings.onTouchCancel
import typings.makeEventProps.makeEventPropsStrings.onTouchEnd
import typings.makeEventProps.makeEventPropsStrings.onTouchMove
import typings.makeEventProps.makeEventPropsStrings.onTouchStart
import typings.makeEventProps.makeEventPropsStrings.onTransitionEnd
import typings.makeEventProps.makeEventPropsStrings.onWheel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("make-event-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ArgsType, PropsType /* <: Props[ArgsType] */](props: PropsType): EventPropsWithoutArgs[ArgsType, PropsType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[EventPropsWithoutArgs[ArgsType, PropsType]]
  inline def default[ArgsType, PropsType /* <: Props[ArgsType] */](props: PropsType, getArgs: js.Function1[/* eventName */ String, ArgsType]): EventPropsWithoutArgs[ArgsType, PropsType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], getArgs.asInstanceOf[js.Any])).asInstanceOf[EventPropsWithoutArgs[ArgsType, PropsType]]
  
  @JSImport("make-event-props", "allEvents")
  @js.native
  val allEvents: js.Array[Any] = js.native
  
  @JSImport("make-event-props", "animationEvents")
  @js.native
  val animationEvents: js.Tuple3[onAnimationStart, onAnimationEnd, onAnimationIteration] = js.native
  
  @JSImport("make-event-props", "changeEvents")
  @js.native
  val changeEvents: js.Array[onChange] = js.native
  
  @JSImport("make-event-props", "clipboardEvents")
  @js.native
  val clipboardEvents: js.Tuple3[onCopy, onCut, onPaste] = js.native
  
  @JSImport("make-event-props", "compositionEvents")
  @js.native
  val compositionEvents: js.Tuple3[onCompositionEnd, onCompositionStart, onCompositionUpdate] = js.native
  
  @JSImport("make-event-props", "dragEvents")
  @js.native
  val dragEvents: js.Tuple8[onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop] = js.native
  
  @JSImport("make-event-props", "focusEvents")
  @js.native
  val focusEvents: js.Tuple2[onFocus, onBlur] = js.native
  
  @JSImport("make-event-props", "formEvents")
  @js.native
  val formEvents: js.Tuple4[onInput, onInvalid, onReset, onSubmit] = js.native
  
  @JSImport("make-event-props", "imageEvents")
  @js.native
  val imageEvents: js.Tuple2[onLoad, onError] = js.native
  
  @JSImport("make-event-props", "keyboardEvents")
  @js.native
  val keyboardEvents: js.Tuple3[onKeyDown, onKeyPress, onKeyUp] = js.native
  
  @JSImport("make-event-props", "mediaEvents")
  @js.native
  val mediaEvents: js.Array[Any] = js.native
  
  @JSImport("make-event-props", "mouseEvents")
  @js.native
  val mouseEvents: js.Tuple10[
    onClick, 
    onContextMenu, 
    onDoubleClick, 
    onMouseDown, 
    onMouseEnter, 
    onMouseLeave, 
    onMouseMove, 
    onMouseOut, 
    onMouseOver, 
    onMouseUp
  ] = js.native
  
  @JSImport("make-event-props", "otherEvents")
  @js.native
  val otherEvents: js.Array[onToggle] = js.native
  
  @JSImport("make-event-props", "pointerEvents")
  @js.native
  val pointerEvents: js.Tuple10[
    onPointerDown, 
    onPointerMove, 
    onPointerUp, 
    onPointerCancel, 
    onGotPointerCapture, 
    onLostPointerCapture, 
    onPointerEnter, 
    onPointerLeave, 
    onPointerOver, 
    onPointerOut
  ] = js.native
  
  @JSImport("make-event-props", "selectionEvents")
  @js.native
  val selectionEvents: js.Array[onSelect] = js.native
  
  @JSImport("make-event-props", "touchEvents")
  @js.native
  val touchEvents: js.Tuple4[onTouchCancel, onTouchEnd, onTouchMove, onTouchStart] = js.native
  
  @JSImport("make-event-props", "transitionEvents")
  @js.native
  val transitionEvents: js.Array[onTransitionEnd] = js.native
  
  @JSImport("make-event-props", "uiEvents")
  @js.native
  val uiEvents: js.Array[onScroll] = js.native
  
  @JSImport("make-event-props", "wheelEvents")
  @js.native
  val wheelEvents: js.Array[onWheel] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.makeEventProps.makeEventPropsStrings.onCopy
    - typings.makeEventProps.makeEventPropsStrings.onCut
    - typings.makeEventProps.makeEventPropsStrings.onPaste
    - typings.makeEventProps.makeEventPropsStrings.onCompositionEnd
    - typings.makeEventProps.makeEventPropsStrings.onCompositionStart
    - typings.makeEventProps.makeEventPropsStrings.onCompositionUpdate
    - typings.makeEventProps.makeEventPropsStrings.onFocus
    - typings.makeEventProps.makeEventPropsStrings.onBlur
    - typings.makeEventProps.makeEventPropsStrings.onInput
    - typings.makeEventProps.makeEventPropsStrings.onInvalid
    - typings.makeEventProps.makeEventPropsStrings.onReset
    - typings.makeEventProps.makeEventPropsStrings.onSubmit
    - typings.makeEventProps.makeEventPropsStrings.onLoad
    - typings.makeEventProps.makeEventPropsStrings.onError
    - typings.makeEventProps.makeEventPropsStrings.onKeyDown
    - typings.makeEventProps.makeEventPropsStrings.onKeyPress
    - typings.makeEventProps.makeEventPropsStrings.onKeyUp
    - typings.makeEventProps.makeEventPropsStrings.onAbort
    - typings.makeEventProps.makeEventPropsStrings.onCanPlay
    - typings.makeEventProps.makeEventPropsStrings.onCanPlayThrough
    - typings.makeEventProps.makeEventPropsStrings.onDurationChange
    - typings.makeEventProps.makeEventPropsStrings.onEmptied
    - typings.makeEventProps.makeEventPropsStrings.onEncrypted
    - typings.makeEventProps.makeEventPropsStrings.onEnded
    - typings.makeEventProps.makeEventPropsStrings.onLoadedData
    - typings.makeEventProps.makeEventPropsStrings.onLoadedMetadata
    - typings.makeEventProps.makeEventPropsStrings.onLoadStart
    - typings.makeEventProps.makeEventPropsStrings.onPause
    - typings.makeEventProps.makeEventPropsStrings.onPlay
    - typings.makeEventProps.makeEventPropsStrings.onPlaying
    - typings.makeEventProps.makeEventPropsStrings.onProgress
    - typings.makeEventProps.makeEventPropsStrings.onRateChange
    - typings.makeEventProps.makeEventPropsStrings.onSeeked
    - typings.makeEventProps.makeEventPropsStrings.onSeeking
    - typings.makeEventProps.makeEventPropsStrings.onStalled
    - typings.makeEventProps.makeEventPropsStrings.onSuspend
    - typings.makeEventProps.makeEventPropsStrings.onTimeUpdate
    - typings.makeEventProps.makeEventPropsStrings.onVolumeChange
    - typings.makeEventProps.makeEventPropsStrings.onWaiting
    - typings.makeEventProps.makeEventPropsStrings.onClick
    - typings.makeEventProps.makeEventPropsStrings.onContextMenu
    - typings.makeEventProps.makeEventPropsStrings.onDoubleClick
    - typings.makeEventProps.makeEventPropsStrings.onMouseDown
    - typings.makeEventProps.makeEventPropsStrings.onMouseEnter
    - typings.makeEventProps.makeEventPropsStrings.onMouseLeave
    - typings.makeEventProps.makeEventPropsStrings.onMouseMove
    - typings.makeEventProps.makeEventPropsStrings.onMouseOut
    - typings.makeEventProps.makeEventPropsStrings.onMouseOver
    - typings.makeEventProps.makeEventPropsStrings.onMouseUp
    - typings.makeEventProps.makeEventPropsStrings.onDrag
    - typings.makeEventProps.makeEventPropsStrings.onDragEnd
    - typings.makeEventProps.makeEventPropsStrings.onDragEnter
    - typings.makeEventProps.makeEventPropsStrings.onDragExit
    - typings.makeEventProps.makeEventPropsStrings.onDragLeave
    - typings.makeEventProps.makeEventPropsStrings.onDragOver
    - typings.makeEventProps.makeEventPropsStrings.onDragStart
    - typings.makeEventProps.makeEventPropsStrings.onDrop
    - typings.makeEventProps.makeEventPropsStrings.onSelect
    - typings.makeEventProps.makeEventPropsStrings.onTouchCancel
    - typings.makeEventProps.makeEventPropsStrings.onTouchEnd
    - typings.makeEventProps.makeEventPropsStrings.onTouchMove
    - typings.makeEventProps.makeEventPropsStrings.onTouchStart
    - typings.makeEventProps.makeEventPropsStrings.onPointerDown
    - typings.makeEventProps.makeEventPropsStrings.onPointerMove
    - typings.makeEventProps.makeEventPropsStrings.onPointerUp
    - typings.makeEventProps.makeEventPropsStrings.onPointerCancel
    - typings.makeEventProps.makeEventPropsStrings.onGotPointerCapture
    - typings.makeEventProps.makeEventPropsStrings.onLostPointerCapture
    - typings.makeEventProps.makeEventPropsStrings.onPointerEnter
    - typings.makeEventProps.makeEventPropsStrings.onPointerLeave
    - typings.makeEventProps.makeEventPropsStrings.onPointerOver
    - typings.makeEventProps.makeEventPropsStrings.onPointerOut
    - typings.makeEventProps.makeEventPropsStrings.onScroll
    - typings.makeEventProps.makeEventPropsStrings.onWheel
    - typings.makeEventProps.makeEventPropsStrings.onAnimationStart
    - typings.makeEventProps.makeEventPropsStrings.onAnimationEnd
    - typings.makeEventProps.makeEventPropsStrings.onAnimationIteration
    - typings.makeEventProps.makeEventPropsStrings.onTransitionEnd
    - typings.makeEventProps.makeEventPropsStrings.onChange
    - typings.makeEventProps.makeEventPropsStrings.onToggle
  */
  trait AllEvents_ extends StObject
  
  type EventHandler[ArgsType] = js.Function2[/* event */ Any, /* args */ ArgsType, Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    OriginalEventHandler extends (event : infer Event, args : ArgsType): void ? (event : Event): void : never
    }}}
    */
  @js.native
  trait EventHandlerWithoutArgs[ArgsType, OriginalEventHandler] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in make-event-props.make-event-props.AllEvents ]:? make-event-props.make-event-props.EventHandler<ArgsType>}
    }}}
    */
  @js.native
  trait EventProps[ArgsType] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof PropsType as K extends make-event-props.make-event-props.AllEvents? K : never ]: make-event-props.make-event-props.EventHandlerWithoutArgs<ArgsType, PropsType[K]>}
    }}}
    */
  @js.native
  trait EventPropsWithoutArgs[ArgsType, PropsType] extends StObject
  
  type Props[ArgsType] = (Record[String, Any]) & EventProps[ArgsType]
}
