package typings.ladda

import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ladda", "bind")
  @js.native
  def bind(target: String): Unit = js.native
  @JSImport("ladda", "bind")
  @js.native
  def bind(target: String, options: BindOptions): Unit = js.native
  @JSImport("ladda", "bind")
  @js.native
  def bind(target: HTMLElement): Unit = js.native
  @JSImport("ladda", "bind")
  @js.native
  def bind(target: HTMLElement, options: BindOptions): Unit = js.native
  
  @JSImport("ladda", "create")
  @js.native
  def create(button: HTMLButtonElement): LaddaButton = js.native
  
  @JSImport("ladda", "stopAll")
  @js.native
  def stopAll(): Unit = js.native
  
  @js.native
  trait BindOptions extends StObject {
    
    /**
      * A function to be called with the Ladda instance when a target button is clicked.
      */
    var callback: js.UndefOr[js.Function1[/* instance */ LaddaButton, Unit]] = js.native
    
    /**
      * Number of milliseconds to wait before automatically cancelling the animation.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object BindOptions {
    
    @scala.inline
    def apply(): BindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindOptions]
    }
    
    @scala.inline
    implicit class BindOptionsMutableBuilder[Self <: BindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* instance */ LaddaButton => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait LaddaButton extends StObject {
    
    def isLoading(): Boolean = js.native
    
    def remove(): Unit = js.native
    
    def setProgress(progress: Double): Unit = js.native
    
    def start(): LaddaButton = js.native
    
    def startAfter(delay: Double): LaddaButton = js.native
    
    def stop(): LaddaButton = js.native
    
    def toggle(): LaddaButton = js.native
  }
  object LaddaButton {
    
    @scala.inline
    def apply(
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
    implicit class LaddaButtonMutableBuilder[Self <: LaddaButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetProgress(value: Double => Unit): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: () => LaddaButton): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartAfter(value: Double => LaddaButton): Self = StObject.set(x, "startAfter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStop(value: () => LaddaButton): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => LaddaButton): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
