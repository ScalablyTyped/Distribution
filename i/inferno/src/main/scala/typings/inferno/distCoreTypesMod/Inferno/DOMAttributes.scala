package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.anon.Html
import typings.inferno.distCoreTypesMod.AnimationEventHandler
import typings.inferno.distCoreTypesMod.ClipboardEvent
import typings.inferno.distCoreTypesMod.ClipboardEventHandler
import typings.inferno.distCoreTypesMod.CompositionEvent
import typings.inferno.distCoreTypesMod.CompositionEventHandler
import typings.inferno.distCoreTypesMod.DragEvent
import typings.inferno.distCoreTypesMod.DragEventHandler
import typings.inferno.distCoreTypesMod.FocusEvent
import typings.inferno.distCoreTypesMod.FocusEventHandler
import typings.inferno.distCoreTypesMod.FormEvent
import typings.inferno.distCoreTypesMod.FormEventHandler
import typings.inferno.distCoreTypesMod.InfernoAnimationEvent
import typings.inferno.distCoreTypesMod.InfernoEventHandler
import typings.inferno.distCoreTypesMod.InfernoKeyboardEvent
import typings.inferno.distCoreTypesMod.InfernoMouseEvent
import typings.inferno.distCoreTypesMod.InfernoPointerEvent
import typings.inferno.distCoreTypesMod.InfernoTouchEvent
import typings.inferno.distCoreTypesMod.InfernoTransitionEvent
import typings.inferno.distCoreTypesMod.InfernoUIEvent
import typings.inferno.distCoreTypesMod.InfernoWheelEvent
import typings.inferno.distCoreTypesMod.KeyboardEventHandler
import typings.inferno.distCoreTypesMod.MouseEventHandler
import typings.inferno.distCoreTypesMod.PointerEventHandler
import typings.inferno.distCoreTypesMod.SemiSyntheticEvent
import typings.inferno.distCoreTypesMod.TouchEventHandler
import typings.inferno.distCoreTypesMod.TransitionEventHandler
import typings.inferno.distCoreTypesMod.UIEventHandler
import typings.inferno.distCoreTypesMod.WheelEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMAttributes[T] extends StObject {
  
  var children: js.UndefOr[InfernoNode] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html | Null] = js.undefined
  
  var onAbort: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onCanPlay: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onChange: js.UndefOr[FormEventHandler[T] | Null] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onDblClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDurationChange: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onEmptied: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onEncrypted: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onEnded: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onError: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onLoad: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onLoadStart: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onLoadedData: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onPause: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onPlay: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onPlaying: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onProgress: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onRateChange: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onSeeked: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onSeeking: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onSelect: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onStalled: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSuspend: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  
  var onVolumeChange: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onWaiting: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
}
object DOMAttributes {
  
  inline def apply[T](): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMAttributes[?], T] (val x: Self & DOMAttributes[T]) extends AnyVal {
    
    inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLNull: Self = StObject.set(x, "dangerouslySetInnerHTML", null)
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setOnAbort(value: InfernoEventHandler[T]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    inline def setOnAbortFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    inline def setOnAbortNull: Self = StObject.set(x, "onAbort", null)
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: AnimationEventHandler[T]): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationEndFunction1(value: InfernoAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndNull: Self = StObject.set(x, "onAnimationEnd", null)
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: AnimationEventHandler[T]): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationIterationFunction1(value: InfernoAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    inline def setOnAnimationIterationNull: Self = StObject.set(x, "onAnimationIteration", null)
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: AnimationEventHandler[T]): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationStartFunction1(value: InfernoAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartNull: Self = StObject.set(x, "onAnimationStart", null)
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: MouseEventHandler[T]): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
    
    inline def setOnAuxClickFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    inline def setOnAuxClickNull: Self = StObject.set(x, "onAuxClick", null)
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: FormEventHandler[T]): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeInputFunction1(value: FormEvent[T] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    inline def setOnBeforeInputNull: Self = StObject.set(x, "onBeforeInput", null)
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: FocusEventHandler[T]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurFunction1(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurNull: Self = StObject.set(x, "onBlur", null)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: InfernoEventHandler[T]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayNull: Self = StObject.set(x, "onCanPlay", null)
    
    inline def setOnCanPlayThrough(value: InfernoEventHandler[T]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayThroughFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThroughNull: Self = StObject.set(x, "onCanPlayThrough", null)
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: FormEventHandler[T]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeFunction1(value: FormEvent[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeNull: Self = StObject.set(x, "onChange", null)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: MouseEventHandler[T]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickNull: Self = StObject.set(x, "onClick", null)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: CompositionEventHandler[T]): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionEndFunction1(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    inline def setOnCompositionEndNull: Self = StObject.set(x, "onCompositionEnd", null)
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: CompositionEventHandler[T]): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionStartFunction1(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    inline def setOnCompositionStartNull: Self = StObject.set(x, "onCompositionStart", null)
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: CompositionEventHandler[T]): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionUpdateFunction1(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    inline def setOnCompositionUpdateNull: Self = StObject.set(x, "onCompositionUpdate", null)
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: MouseEventHandler[T]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
    
    inline def setOnContextMenuFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuNull: Self = StObject.set(x, "onContextMenu", null)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ClipboardEventHandler[T]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    inline def setOnCopyFunction1(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyNull: Self = StObject.set(x, "onCopy", null)
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ClipboardEventHandler[T]): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    inline def setOnCutFunction1(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutNull: Self = StObject.set(x, "onCut", null)
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDblClick(value: MouseEventHandler[T]): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
    
    inline def setOnDblClickFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
    
    inline def setOnDblClickNull: Self = StObject.set(x, "onDblClick", null)
    
    inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    inline def setOnDrag(value: DragEventHandler[T]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    inline def setOnDragEnd(value: DragEventHandler[T]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    inline def setOnDragEndFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndNull: Self = StObject.set(x, "onDragEnd", null)
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: DragEventHandler[T]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
    
    inline def setOnDragEnterFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterNull: Self = StObject.set(x, "onDragEnter", null)
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: DragEventHandler[T]): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
    
    inline def setOnDragExitFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    inline def setOnDragExitNull: Self = StObject.set(x, "onDragExit", null)
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragLeave(value: DragEventHandler[T]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
    
    inline def setOnDragLeaveFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveNull: Self = StObject.set(x, "onDragLeave", null)
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragNull: Self = StObject.set(x, "onDrag", null)
    
    inline def setOnDragOver(value: DragEventHandler[T]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
    
    inline def setOnDragOverFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    inline def setOnDragOverNull: Self = StObject.set(x, "onDragOver", null)
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: DragEventHandler[T]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartNull: Self = StObject.set(x, "onDragStart", null)
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: DragEventHandler[T]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    inline def setOnDropFunction1(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropNull: Self = StObject.set(x, "onDrop", null)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: InfernoEventHandler[T]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
    
    inline def setOnDurationChangeFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeNull: Self = StObject.set(x, "onDurationChange", null)
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: InfernoEventHandler[T]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    inline def setOnEmptiedFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    inline def setOnEmptiedNull: Self = StObject.set(x, "onEmptied", null)
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: InfernoEventHandler[T]): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    inline def setOnEncryptedFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    inline def setOnEncryptedNull: Self = StObject.set(x, "onEncrypted", null)
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: InfernoEventHandler[T]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    inline def setOnEndedFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedNull: Self = StObject.set(x, "onEnded", null)
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: InfernoEventHandler[T]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: FocusEventHandler[T]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusFunction1(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusNull: Self = StObject.set(x, "onFocus", null)
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInput(value: FormEventHandler[T]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    inline def setOnInputFunction1(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputNull: Self = StObject.set(x, "onInput", null)
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: FormEventHandler[T]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    inline def setOnInvalidFunction1(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    inline def setOnInvalidNull: Self = StObject.set(x, "onInvalid", null)
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEventHandler[T]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDownFunction1(value: InfernoKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownNull: Self = StObject.set(x, "onKeyDown", null)
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: KeyboardEventHandler[T]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPressFunction1(value: InfernoKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressNull: Self = StObject.set(x, "onKeyPress", null)
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: KeyboardEventHandler[T]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUpFunction1(value: InfernoKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpNull: Self = StObject.set(x, "onKeyUp", null)
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: InfernoEventHandler[T]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadNull: Self = StObject.set(x, "onLoad", null)
    
    inline def setOnLoadStart(value: InfernoEventHandler[T]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
    
    inline def setOnLoadStartFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartNull: Self = StObject.set(x, "onLoadStart", null)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: InfernoEventHandler[T]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedDataFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    inline def setOnLoadedDataNull: Self = StObject.set(x, "onLoadedData", null)
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: InfernoEventHandler[T]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedMetadataFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    inline def setOnLoadedMetadataNull: Self = StObject.set(x, "onLoadedMetadata", null)
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnMouseDown(value: MouseEventHandler[T]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownNull: Self = StObject.set(x, "onMouseDown", null)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: MouseEventHandler[T]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnterFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterNull: Self = StObject.set(x, "onMouseEnter", null)
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: MouseEventHandler[T]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeaveFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveNull: Self = StObject.set(x, "onMouseLeave", null)
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: MouseEventHandler[T]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveNull: Self = StObject.set(x, "onMouseMove", null)
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: MouseEventHandler[T]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOutFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutNull: Self = StObject.set(x, "onMouseOut", null)
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: MouseEventHandler[T]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOverFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnMouseOverNull: Self = StObject.set(x, "onMouseOver", null)
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: MouseEventHandler[T]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpFunction1(value: InfernoMouseEvent[T] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpNull: Self = StObject.set(x, "onMouseUp", null)
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ClipboardEventHandler[T]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    inline def setOnPasteFunction1(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteNull: Self = StObject.set(x, "onPaste", null)
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: InfernoEventHandler[T]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnPauseNull: Self = StObject.set(x, "onPause", null)
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: InfernoEventHandler[T]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    inline def setOnPlayFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    inline def setOnPlayNull: Self = StObject.set(x, "onPlay", null)
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: InfernoEventHandler[T]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    inline def setOnPlayingFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    inline def setOnPlayingNull: Self = StObject.set(x, "onPlaying", null)
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelNull: Self = StObject.set(x, "onPointerCancel", null)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownNull: Self = StObject.set(x, "onPointerDown", null)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterNull: Self = StObject.set(x, "onPointerEnter", null)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveNull: Self = StObject.set(x, "onPointerLeave", null)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveNull: Self = StObject.set(x, "onPointerMove", null)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOutFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    inline def setOnPointerOutNull: Self = StObject.set(x, "onPointerOut", null)
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOverFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    inline def setOnPointerOverNull: Self = StObject.set(x, "onPointerOver", null)
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: PointerEventHandler[T]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpFunction1(value: InfernoPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpNull: Self = StObject.set(x, "onPointerUp", null)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: InfernoEventHandler[T]): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnProgressFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressNull: Self = StObject.set(x, "onProgress", null)
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: InfernoEventHandler[T]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
    
    inline def setOnRateChangeFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    inline def setOnRateChangeNull: Self = StObject.set(x, "onRateChange", null)
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: FormEventHandler[T]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    inline def setOnResetFunction1(value: FormEvent[T] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    inline def setOnResetNull: Self = StObject.set(x, "onReset", null)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: UIEventHandler[T]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnScrollFunction1(value: InfernoUIEvent[T] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollNull: Self = StObject.set(x, "onScroll", null)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: InfernoEventHandler[T]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    inline def setOnSeekedFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    inline def setOnSeekedNull: Self = StObject.set(x, "onSeeked", null)
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: InfernoEventHandler[T]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    inline def setOnSeekingFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    inline def setOnSeekingNull: Self = StObject.set(x, "onSeeking", null)
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: InfernoEventHandler[T]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectNull: Self = StObject.set(x, "onSelect", null)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: InfernoEventHandler[T]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    inline def setOnStalledFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    inline def setOnStalledNull: Self = StObject.set(x, "onStalled", null)
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: FormEventHandler[T]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    inline def setOnSubmitFunction1(value: FormEvent[T] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitNull: Self = StObject.set(x, "onSubmit", null)
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: InfernoEventHandler[T]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    inline def setOnSuspendFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    inline def setOnSuspendNull: Self = StObject.set(x, "onSuspend", null)
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: InfernoEventHandler[T]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnTimeUpdateFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    inline def setOnTimeUpdateNull: Self = StObject.set(x, "onTimeUpdate", null)
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: TouchEventHandler[T]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelFunction1(value: InfernoTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelNull: Self = StObject.set(x, "onTouchCancel", null)
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: TouchEventHandler[T]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndFunction1(value: InfernoTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndNull: Self = StObject.set(x, "onTouchEnd", null)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: TouchEventHandler[T]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveFunction1(value: InfernoTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveNull: Self = StObject.set(x, "onTouchMove", null)
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: TouchEventHandler[T]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartFunction1(value: InfernoTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartNull: Self = StObject.set(x, "onTouchStart", null)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: TransitionEventHandler[T]): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionEndFunction1(value: InfernoTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    inline def setOnTransitionEndNull: Self = StObject.set(x, "onTransitionEnd", null)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: InfernoEventHandler[T]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
    
    inline def setOnVolumeChangeFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeNull: Self = StObject.set(x, "onVolumeChange", null)
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: InfernoEventHandler[T]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    inline def setOnWaitingFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    inline def setOnWaitingNull: Self = StObject.set(x, "onWaiting", null)
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: WheelEventHandler[T]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
    
    inline def setOnWheelFunction1(value: InfernoWheelEvent[T] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    inline def setOnWheelNull: Self = StObject.set(x, "onWheel", null)
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
  }
}
