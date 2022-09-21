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
      * @return the current progress value [0,1];
      */
    def getProgress(): Double
    
    /**
      * @return Whether the component is closed.
      */
    def isClosed(): Boolean
    
    /**
      * @return Whether the component is determinate.
      */
    def isDeterminate(): Boolean
    
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
    
    inline def apply(
      close: () => Unit,
      getProgress: () => Double,
      isClosed: () => Boolean,
      isDeterminate: () => Boolean,
      open: () => Unit,
      setDeterminate: Boolean => Unit,
      setProgress: Double => Unit
    ): MDCProgressIndicatorFoundation = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgress = js.Any.fromFunction0(getProgress), isClosed = js.Any.fromFunction0(isClosed), isDeterminate = js.Any.fromFunction0(isDeterminate), open = js.Any.fromFunction0(open), setDeterminate = js.Any.fromFunction1(setDeterminate), setProgress = js.Any.fromFunction1(setProgress))
      __obj.asInstanceOf[MDCProgressIndicatorFoundation]
    }
    
    extension [Self <: MDCProgressIndicatorFoundation](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetProgress(value: () => Double): Self = StObject.set(x, "getProgress", js.Any.fromFunction0(value))
      
      inline def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
      
      inline def setIsDeterminate(value: () => Boolean): Self = StObject.set(x, "isDeterminate", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setSetDeterminate(value: Boolean => Unit): Self = StObject.set(x, "setDeterminate", js.Any.fromFunction1(value))
      
      inline def setSetProgress(value: Double => Unit): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
    }
  }
}
