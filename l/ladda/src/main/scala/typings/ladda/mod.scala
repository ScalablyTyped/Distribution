package typings.ladda

import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ladda", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(target: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def bind(target: String, options: BindOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bind(target: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def bind(target: HTMLElement, options: BindOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(button: HTMLButtonElement): LaddaButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(button.asInstanceOf[js.Any]).asInstanceOf[LaddaButton]
  
  inline def stopAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAll")().asInstanceOf[Unit]
  
  trait BindOptions extends StObject {
    
    /**
      * A function to be called with the Ladda instance when a target button is clicked.
      */
    var callback: js.UndefOr[js.Function1[/* instance */ LaddaButton, Unit]] = js.undefined
    
    /**
      * Number of milliseconds to wait before automatically cancelling the animation.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BindOptions {
    
    inline def apply(): BindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BindOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: /* instance */ LaddaButton => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait LaddaButton extends StObject {
    
    def isLoading(): Boolean
    
    def remove(): Unit
    
    def setProgress(progress: Double): Unit
    
    def start(): LaddaButton
    
    def startAfter(delay: Double): LaddaButton
    
    def stop(): LaddaButton
    
    def toggle(): LaddaButton
  }
  object LaddaButton {
    
    inline def apply(
      isLoading: () => Boolean,
      remove: () => Unit,
      setProgress: Double => Unit,
      start: () => LaddaButton,
      startAfter: Double => LaddaButton,
      stop: () => LaddaButton,
      toggle: () => LaddaButton
    ): LaddaButton = {
      val __obj = js.Dynamic.literal(isLoading = js.Any.fromFunction0(isLoading), remove = js.Any.fromFunction0(remove), setProgress = js.Any.fromFunction1(setProgress), start = js.Any.fromFunction0(start), startAfter = js.Any.fromFunction1(startAfter), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[LaddaButton]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LaddaButton] (val x: Self) extends AnyVal {
      
      inline def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setSetProgress(value: Double => Unit): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
      
      inline def setStart(value: () => LaddaButton): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStartAfter(value: Double => LaddaButton): Self = StObject.set(x, "startAfter", js.Any.fromFunction1(value))
      
      inline def setStop(value: () => LaddaButton): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => LaddaButton): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
