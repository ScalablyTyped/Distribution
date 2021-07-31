package typings.httpGracefulShutdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(server: js.Any): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  @scala.inline
  def apply(server: js.Any, options: Options): js.Function0[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Promise[Unit]]]
  
  @JSImport("http-graceful-shutdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var development: js.UndefOr[Boolean] = js.undefined
    
    var `finally`: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShutdown: js.UndefOr[js.Function1[/* signal */ String, js.Promise[Unit]]] = js.undefined
    
    var signals: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      @scala.inline
      def setFinally(value: () => Unit): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinallyUndefined: Self = StObject.set(x, "finally", js.undefined)
      
      @scala.inline
      def setOnShutdown(value: /* signal */ String => js.Promise[Unit]): Self = StObject.set(x, "onShutdown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShutdownUndefined: Self = StObject.set(x, "onShutdown", js.undefined)
      
      @scala.inline
      def setSignals(value: String): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
