package typings.ionicAngular

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FrameRequestCallback
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait HTMLStencilElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def componentOnReady(): js.Promise[this.type] = js.native
    
    def forceUpdate(): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  trait IonicGlobal extends StObject {
    
    var asyncQueue: js.UndefOr[Boolean] = js.undefined
    
    var config: js.UndefOr[js.Any] = js.undefined
  }
  object IonicGlobal {
    
    @scala.inline
    def apply(): IonicGlobal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonicGlobal]
    }
    
    @scala.inline
    implicit class IonicGlobalMutableBuilder[Self <: IonicGlobal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncQueue(value: Boolean): Self = StObject.set(x, "asyncQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncQueueUndefined: Self = StObject.set(x, "asyncQueue", js.undefined)
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
  
  @js.native
  trait IonicWindow
    extends StObject
       with Window {
    
    var Ionic: IonicGlobal = js.native
    
    var __zone_symbol__requestAnimationFrame: js.UndefOr[js.Function1[/* ts */ FrameRequestCallback, Double]] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
