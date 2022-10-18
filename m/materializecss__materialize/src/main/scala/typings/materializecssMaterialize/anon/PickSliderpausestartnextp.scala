package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Slider, 'pause' | 'start' | 'next' | 'prev' | 'destroy'> */
trait PickSliderpausestartnextp extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
  
  def next(): Unit
  @JSName("next")
  var next_Original: js.Function0[Unit]
  
  def pause(): Unit
  @JSName("pause")
  var pause_Original: js.Function0[Unit]
  
  def prev(): Unit
  @JSName("prev")
  var prev_Original: js.Function0[Unit]
  
  def start(): Unit
  @JSName("start")
  var start_Original: js.Function0[Unit]
}
object PickSliderpausestartnextp {
  
  inline def apply(destroy: () => Unit, next: () => Unit, pause: () => Unit, prev: () => Unit, start: () => Unit): PickSliderpausestartnextp = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), next = js.Any.fromFunction0(next), pause = js.Any.fromFunction0(pause), prev = js.Any.fromFunction0(prev), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[PickSliderpausestartnextp]
  }
  
  extension [Self <: PickSliderpausestartnextp](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
