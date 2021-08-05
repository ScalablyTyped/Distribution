package typings.inboxsdk.mod

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.escape
import typings.inboxsdk.inboxsdkStrings.outsideInteraction
import typings.inboxsdk.inboxsdkStrings.preautoclose
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  trait Contact extends StObject {
    
    var emailAddress: String
    
    var name: String
  }
  object Contact {
    
    inline def apply(emailAddress: String, name: String): Contact = {
      val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    extension [Self <: Contact](x: Self) {
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropdownView extends StObject {
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
    
    def reposition(): Unit = js.native
    
    def setPlacementOptions(options: PositionOptions): Unit = js.native
  }
  
  trait PositionOptions extends StObject {
    
    var bottomBuffer: js.UndefOr[Double] = js.undefined
    
    var buffer: js.UndefOr[Double] = js.undefined
    
    var forceHAlign: js.UndefOr[Boolean] = js.undefined
    
    var forcePosition: js.UndefOr[Boolean] = js.undefined
    
    var forceVAlign: js.UndefOr[Boolean] = js.undefined
    
    var hAlign: js.UndefOr[String] = js.undefined
    
    var leftBuffer: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var rightBuffer: js.UndefOr[Double] = js.undefined
    
    var topBuffer: js.UndefOr[Double] = js.undefined
    
    var vAlign: js.UndefOr[String] = js.undefined
  }
  object PositionOptions {
    
    inline def apply(): PositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionOptions]
    }
    
    extension [Self <: PositionOptions](x: Self) {
      
      inline def setBottomBuffer(value: Double): Self = StObject.set(x, "bottomBuffer", value.asInstanceOf[js.Any])
      
      inline def setBottomBufferUndefined: Self = StObject.set(x, "bottomBuffer", js.undefined)
      
      inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setForceHAlign(value: Boolean): Self = StObject.set(x, "forceHAlign", value.asInstanceOf[js.Any])
      
      inline def setForceHAlignUndefined: Self = StObject.set(x, "forceHAlign", js.undefined)
      
      inline def setForcePosition(value: Boolean): Self = StObject.set(x, "forcePosition", value.asInstanceOf[js.Any])
      
      inline def setForcePositionUndefined: Self = StObject.set(x, "forcePosition", js.undefined)
      
      inline def setForceVAlign(value: Boolean): Self = StObject.set(x, "forceVAlign", value.asInstanceOf[js.Any])
      
      inline def setForceVAlignUndefined: Self = StObject.set(x, "forceVAlign", js.undefined)
      
      inline def setHAlign(value: String): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setLeftBuffer(value: Double): Self = StObject.set(x, "leftBuffer", value.asInstanceOf[js.Any])
      
      inline def setLeftBufferUndefined: Self = StObject.set(x, "leftBuffer", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRightBuffer(value: Double): Self = StObject.set(x, "rightBuffer", value.asInstanceOf[js.Any])
      
      inline def setRightBufferUndefined: Self = StObject.set(x, "rightBuffer", js.undefined)
      
      inline def setTopBuffer(value: Double): Self = StObject.set(x, "topBuffer", value.asInstanceOf[js.Any])
      
      inline def setTopBufferUndefined: Self = StObject.set(x, "topBuffer", js.undefined)
      
      inline def setVAlign(value: String): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  trait PreAutoCloseEvent extends StObject {
    
    def cancel(): Unit
    
    var cause: Event
    
    var `type`: outsideInteraction | escape
  }
  object PreAutoCloseEvent {
    
    inline def apply(cancel: () => Unit, cause: Event, `type`: outsideInteraction | escape): PreAutoCloseEvent = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cause = cause.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreAutoCloseEvent]
    }
    
    extension [Self <: PreAutoCloseEvent](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCause(value: Event): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setType(value: outsideInteraction | escape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleElementView extends StObject {
    
    def destroy(): Unit
    
    var destroyed: Boolean
    
    var el: HTMLElement
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  }
  object SimpleElementView {
    
    inline def apply(
      destroy: () => Unit,
      destroyed: Boolean,
      el: HTMLElement,
      on: (destroy, js.Function0[Unit]) => Unit
    ): SimpleElementView = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[SimpleElementView]
    }
    
    extension [Self <: SimpleElementView](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
