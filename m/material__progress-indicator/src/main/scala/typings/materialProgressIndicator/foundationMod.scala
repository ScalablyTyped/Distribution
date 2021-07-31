package typings.materialProgressIndicator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  trait MDCProgressIndicatorFoundation extends StObject {
    
    /**
      * Puts the component in the closed state.
      */
    def close(): Unit
    
    /**
      * Puts the component in the open state.
      */
    def open(): Unit
    
    /**
      * Toggles the component between the determinate and indeterminate state.
      *
      * @param isDeterminate - Whether the component is in determinate state
      */
    def setDeterminate(isDeterminate: Boolean): Unit
    
    /**
      * Sets the current progress value.
      *
      * @param value - the current progress value, should be between [0,1]
      */
    def setProgress(value: Double): Unit
  }
  object MDCProgressIndicatorFoundation {
    
    @scala.inline
    def apply(close: () => Unit, open: () => Unit, setDeterminate: Boolean => Unit, setProgress: Double => Unit): MDCProgressIndicatorFoundation = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), setDeterminate = js.Any.fromFunction1(setDeterminate), setProgress = js.Any.fromFunction1(setProgress))
      __obj.asInstanceOf[MDCProgressIndicatorFoundation]
    }
    
    @scala.inline
    implicit class MDCProgressIndicatorFoundationMutableBuilder[Self <: MDCProgressIndicatorFoundation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDeterminate(value: Boolean => Unit): Self = StObject.set(x, "setDeterminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetProgress(value: Double => Unit): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
    }
  }
}
