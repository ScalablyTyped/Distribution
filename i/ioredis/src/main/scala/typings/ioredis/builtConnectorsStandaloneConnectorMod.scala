package typings.ioredis

import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtConnectorsStandaloneConnectorMod {
  
  @JSImport("ioredis/built/connectors/StandaloneConnector", JSImport.Default)
  @js.native
  open class default protected () extends StandaloneConnector {
    def this(options: StandaloneConnectionOptions) = this()
  }
  
  /* Inlined std.Pick<node.net.IpcNetConnectOpts, 'path'> */
  trait IpcOptions extends StObject {
    
    var path: String
  }
  object IpcOptions {
    
    inline def apply(path: String): IpcOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpcOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IpcOptions] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ioredis.ioredis/built/connectors/StandaloneConnector.TcpOptions & ioredis.ioredis/built/connectors/StandaloneConnector.IpcOptions> & {  disconnectTimeout :number | undefined,   tls :node.tls.ConnectionOptions | undefined} */
  trait StandaloneConnectionOptions extends StObject {
    
    var disconnectTimeout: js.UndefOr[Double] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var tls: js.UndefOr[ConnectionOptions] = js.undefined
  }
  object StandaloneConnectionOptions {
    
    inline def apply(): StandaloneConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandaloneConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StandaloneConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setDisconnectTimeout(value: Double): Self = StObject.set(x, "disconnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setDisconnectTimeoutUndefined: Self = StObject.set(x, "disconnectTimeout", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  @js.native
  trait StandaloneConnector
    extends typings.ioredis.builtConnectorsAbstractConnectorMod.default {
    
    /* protected */ var options: StandaloneConnectionOptions = js.native
  }
  
  /* Inlined std.Pick<node.net.TcpNetConnectOpts, 'port' | 'host' | 'family'> */
  trait TcpOptions extends StObject {
    
    var family: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: Double
  }
  object TcpOptions {
    
    inline def apply(port: Double): TcpOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TcpOptions] (val x: Self) extends AnyVal {
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
