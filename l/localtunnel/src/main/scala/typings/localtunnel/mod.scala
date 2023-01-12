package typings.localtunnel

import typings.localtunnel.anon.TunnelConfigportnumber
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: TunnelConfigportnumber, callback: TunnelCallback): Tunnel = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Tunnel]
  inline def apply(port: Double): js.Promise[Tunnel] = ^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tunnel]]
  inline def apply(port: Double, opts: TunnelConfig): js.Promise[Tunnel] = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tunnel]]
  inline def apply(port: Double, opts: TunnelConfig, callback: TunnelCallback): Tunnel = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Tunnel]
  inline def apply(port: TunnelConfigportnumber): js.Promise[Tunnel] = ^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tunnel]]
  
  @JSImport("localtunnel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Tunnel extends EventEmitter {
    
    def close(): Unit = js.native
    
    def open(cb: js.Function0[Unit]): Unit = js.native
    def open(cb: js.Function1[/* err */ String, Unit]): Unit = js.native
    
    var tunnelCluster: TunnelCluster = js.native
    
    var url: String = js.native
  }
  
  type TunnelCallback = js.Function2[/* err */ js.UndefOr[String], /* tunnel */ js.UndefOr[Tunnel], Unit]
  
  @js.native
  trait TunnelCluster extends EventEmitter {
    
    def open(): Unit = js.native
  }
  
  trait TunnelConfig extends StObject {
    
    var allow_invalid_cert: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var local_ca: js.UndefOr[String] = js.undefined
    
    var local_cert: js.UndefOr[String] = js.undefined
    
    var local_host: js.UndefOr[String] = js.undefined
    
    var local_https: js.UndefOr[Boolean] = js.undefined
    
    var local_key: js.UndefOr[String] = js.undefined
    
    var subdomain: js.UndefOr[String] = js.undefined
  }
  object TunnelConfig {
    
    inline def apply(): TunnelConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TunnelConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TunnelConfig] (val x: Self) extends AnyVal {
      
      inline def setAllow_invalid_cert(value: Boolean): Self = StObject.set(x, "allow_invalid_cert", value.asInstanceOf[js.Any])
      
      inline def setAllow_invalid_certUndefined: Self = StObject.set(x, "allow_invalid_cert", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocal_ca(value: String): Self = StObject.set(x, "local_ca", value.asInstanceOf[js.Any])
      
      inline def setLocal_caUndefined: Self = StObject.set(x, "local_ca", js.undefined)
      
      inline def setLocal_cert(value: String): Self = StObject.set(x, "local_cert", value.asInstanceOf[js.Any])
      
      inline def setLocal_certUndefined: Self = StObject.set(x, "local_cert", js.undefined)
      
      inline def setLocal_host(value: String): Self = StObject.set(x, "local_host", value.asInstanceOf[js.Any])
      
      inline def setLocal_hostUndefined: Self = StObject.set(x, "local_host", js.undefined)
      
      inline def setLocal_https(value: Boolean): Self = StObject.set(x, "local_https", value.asInstanceOf[js.Any])
      
      inline def setLocal_httpsUndefined: Self = StObject.set(x, "local_https", js.undefined)
      
      inline def setLocal_key(value: String): Self = StObject.set(x, "local_key", value.asInstanceOf[js.Any])
      
      inline def setLocal_keyUndefined: Self = StObject.set(x, "local_key", js.undefined)
      
      inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setSubdomainUndefined: Self = StObject.set(x, "subdomain", js.undefined)
    }
  }
}
