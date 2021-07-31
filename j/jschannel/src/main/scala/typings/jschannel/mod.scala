package typings.jschannel

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jschannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def build(config: ChannelConfiguration): MessagingChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(config.asInstanceOf[js.Any]).asInstanceOf[MessagingChannel]
  
  trait ChannelConfiguration extends StObject {
    
    var debugOutput: js.UndefOr[Boolean] = js.undefined
    
    var gotMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function1[/* channel */ MessagingChannel, Unit]] = js.undefined
    
    var origin: String
    
    var postMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.undefined
    
    var publish: js.UndefOr[Boolean] = js.undefined
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
    
    var remote: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scope: String
    
    var window: Window
  }
  object ChannelConfiguration {
    
    @scala.inline
    def apply(origin: String, scope: String, window: Window): ChannelConfiguration = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelConfiguration]
    }
    
    @scala.inline
    implicit class ChannelConfigurationMutableBuilder[Self <: ChannelConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebugOutput(value: Boolean): Self = StObject.set(x, "debugOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugOutputUndefined: Self = StObject.set(x, "debugOutput", js.undefined)
      
      @scala.inline
      def setGotMessageObserver(value: (/* origin */ String, /* message */ Message) => Unit): Self = StObject.set(x, "gotMessageObserver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGotMessageObserverUndefined: Self = StObject.set(x, "gotMessageObserver", js.undefined)
      
      @scala.inline
      def setOnReady(value: /* channel */ MessagingChannel => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostMessageObserver(value: (/* origin */ String, /* message */ Message) => Unit): Self = StObject.set(x, "postMessageObserver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostMessageObserverUndefined: Self = StObject.set(x, "postMessageObserver", js.undefined)
      
      @scala.inline
      def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setRemote(value: String | js.Array[String]): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      @scala.inline
      def setRemoteVarargs(value: String*): Self = StObject.set(x, "remote", js.Array(value :_*))
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var error: js.UndefOr[js.Function2[/* error */ js.Any, /* message */ String, Unit]] = js.undefined
    
    var method: String
    
    var params: js.UndefOr[js.Any] = js.undefined
    
    var success: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Message {
    
    @scala.inline
    def apply(method: String): Message = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: (/* error */ js.Any, /* message */ String) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSuccess(value: /* result */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait MessageTransaction extends StObject {
    
    def complete(result: js.Any): Unit
    
    def completed(): Boolean
    
    def delayReturn(delay: Boolean): Boolean
    
    def error(error: js.Any, message: String): Unit
    
    def invoke(callbackName: String, params: js.Any): Unit
  }
  object MessageTransaction {
    
    @scala.inline
    def apply(
      complete: js.Any => Unit,
      completed: () => Boolean,
      delayReturn: Boolean => Boolean,
      error: (js.Any, String) => Unit,
      invoke: (String, js.Any) => Unit
    ): MessageTransaction = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), completed = js.Any.fromFunction0(completed), delayReturn = js.Any.fromFunction1(delayReturn), error = js.Any.fromFunction2(error), invoke = js.Any.fromFunction2(invoke))
      __obj.asInstanceOf[MessageTransaction]
    }
    
    @scala.inline
    implicit class MessageTransactionMutableBuilder[Self <: MessageTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompleted(value: () => Boolean): Self = StObject.set(x, "completed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelayReturn(value: Boolean => Boolean): Self = StObject.set(x, "delayReturn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: (js.Any, String) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvoke(value: (String, js.Any) => Unit): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait MessagingChannel extends StObject {
    
    def bind(method: String): MessagingChannel = js.native
    def bind(
      method: String,
      callback: js.Function2[/* transaction */ MessageTransaction, /* params */ js.Any, Unit]
    ): MessagingChannel = js.native
    def bind(
      method: String,
      callback: js.Function2[/* transaction */ MessageTransaction, /* params */ js.Any, Unit],
      doNotPublish: Boolean
    ): MessagingChannel = js.native
    def bind(method: String, callback: Unit, doNotPublish: Boolean): MessagingChannel = js.native
    
    def call(message: Message): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def notify(message: Message): Unit = js.native
    
    def unbind(method: String): Boolean = js.native
    def unbind(method: String, doNotPublish: Boolean): Boolean = js.native
  }
}
