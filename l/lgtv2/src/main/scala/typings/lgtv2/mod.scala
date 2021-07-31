package typings.lgtv2

import typings.lgtv2.lgtv2Strings.close
import typings.lgtv2.lgtv2Strings.connect
import typings.lgtv2.lgtv2Strings.connecting
import typings.lgtv2.lgtv2Strings.error
import typings.lgtv2.lgtv2Strings.prompt
import typings.node.NodeJS.ErrnoException
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): LGTV = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LGTV]
  @scala.inline
  def apply(config: Config): LGTV = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[LGTV]
  
  @JSImport("lgtv2", JSImport.Namespace)
  @js.native
  class ^ () extends LGTV {
    def this(config: Config) = this()
  }
  @JSImport("lgtv2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config extends StObject {
    
    var clientKey: js.UndefOr[String] = js.undefined
    
    var keyFile: js.UndefOr[String] = js.undefined
    
    var reconnect: js.UndefOr[Double] = js.undefined
    
    var saveKey: js.UndefOr[
        js.Function2[
          /* key */ String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[ErrnoException | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
      
      @scala.inline
      def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      @scala.inline
      def setReconnect(value: Double): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setSaveKey(
        value: (/* key */ String, /* callback */ js.Function1[/* error */ js.UndefOr[ErrnoException | Null], Unit]) => Unit
      ): Self = StObject.set(x, "saveKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSaveKeyUndefined: Self = StObject.set(x, "saveKey", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait LGTV extends EventEmitter {
    
    var clientKey: String = js.native
    
    def connect(host: String): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def getSocket(
      url: String,
      callback: js.Function2[/* error */ Error | Null, /* socket */ SpecializedSocket, Unit]
    ): Unit = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connecting(event: connecting, listener: js.Function1[/* host */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_prompt(event: prompt, listener: js.Function0[Unit]): this.type = js.native
    
    /* private */ def register(): Unit = js.native
    
    def request(uri: String): Unit = js.native
    def request(uri: String, callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]): Unit = js.native
    def request(uri: String, payload: js.Any): Unit = js.native
    def request(
      uri: String,
      payload: js.Any,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
    def request(
      uri: String,
      payload: Unit,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
    
    /* private */ def send(`type`: String, uri: String): Unit = js.native
    /* private */ def send(
      `type`: String,
      uri: String,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
    /* private */ def send(`type`: String, uri: String, payload: js.Any): Unit = js.native
    /* private */ def send(
      `type`: String,
      uri: String,
      payload: js.Any,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
    /* private */ def send(
      `type`: String,
      uri: String,
      payload: Unit,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
    
    def subscribe(uri: String): Unit = js.native
    def subscribe(uri: String, callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]): Unit = js.native
    def subscribe(uri: String, payload: js.Any): Unit = js.native
    def subscribe(
      uri: String,
      payload: js.Any,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
    def subscribe(
      uri: String,
      payload: Unit,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait SpecializedSocket extends StObject {
    
    def close(): Unit = js.native
    
    def send(`type`: String): Unit = js.native
    def send(`type`: String, payload: js.Any): Unit = js.native
  }
}
