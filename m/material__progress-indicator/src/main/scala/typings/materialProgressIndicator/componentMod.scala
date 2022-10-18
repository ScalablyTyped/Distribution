package typings.materialProgressIndicator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  trait MDCProgressIndicator extends StObject {
    
    /**
      * Puts the component in the closed state.
      */
    def close(): Unit
    
    /**
      * Toggles the component between the determinate and indeterminate state.
      */
    var determinate: Boolean
    
    /**
      * Puts the component in the open state.
      */
    def open(): Unit
    
    /**
      * The current progress value. Value should be between [0, 1].
      */
    var progress: Double
  }
  object MDCProgressIndicator {
    
    inline def apply(close: () => Unit, determinate: Boolean, open: () => Unit, progress: Double): MDCProgressIndicator = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), determinate = determinate.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCProgressIndicator]
    }
    
    extension [Self <: MDCProgressIndicator](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDeterminate(value: Boolean): Self = StObject.set(x, "determinate", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
