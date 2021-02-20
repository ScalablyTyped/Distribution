package typings.localtunnel

import typings.localtunnel.anon.TunnelConfigportnumber
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("localtunnel", JSImport.Namespace)
  @js.native
  def apply(opts: TunnelConfigportnumber, callback: TunnelCallback): Tunnel = js.native
  @JSImport("localtunnel", JSImport.Namespace)
  @js.native
  def apply(port: Double): js.Promise[Tunnel] = js.native
  @JSImport("localtunnel", JSImport.Namespace)
  @js.native
  def apply(port: Double, opts: TunnelConfig): js.Promise[Tunnel] = js.native
  @JSImport("localtunnel", JSImport.Namespace)
  @js.native
  def apply(port: Double, opts: TunnelConfig, callback: TunnelCallback): Tunnel = js.native
  @JSImport("localtunnel", JSImport.Namespace)
  @js.native
  def apply(port: TunnelConfigportnumber): js.Promise[Tunnel] = js.native
  
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
  
  @js.native
  trait TunnelConfig extends StObject {
    
    var allow_invalid_cert: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var local_ca: js.UndefOr[String] = js.native
    
    var local_cert: js.UndefOr[String] = js.native
    
    var local_host: js.UndefOr[String] = js.native
    
    var local_https: js.UndefOr[Boolean] = js.native
    
    var local_key: js.UndefOr[String] = js.native
    
    var subdomain: js.UndefOr[String] = js.native
  }
  object TunnelConfig {
    
    @scala.inline
    def apply(): TunnelConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TunnelConfig]
    }
    
    @scala.inline
    implicit class TunnelConfigMutableBuilder[Self <: TunnelConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_invalid_cert(value: Boolean): Self = StObject.set(x, "allow_invalid_cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_invalid_certUndefined: Self = StObject.set(x, "allow_invalid_cert", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLocal_ca(value: String): Self = StObject.set(x, "local_ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_caUndefined: Self = StObject.set(x, "local_ca", js.undefined)
      
      @scala.inline
      def setLocal_cert(value: String): Self = StObject.set(x, "local_cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_certUndefined: Self = StObject.set(x, "local_cert", js.undefined)
      
      @scala.inline
      def setLocal_host(value: String): Self = StObject.set(x, "local_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_hostUndefined: Self = StObject.set(x, "local_host", js.undefined)
      
      @scala.inline
      def setLocal_https(value: Boolean): Self = StObject.set(x, "local_https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_httpsUndefined: Self = StObject.set(x, "local_https", js.undefined)
      
      @scala.inline
      def setLocal_key(value: String): Self = StObject.set(x, "local_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_keyUndefined: Self = StObject.set(x, "local_key", js.undefined)
      
      @scala.inline
      def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdomainUndefined: Self = StObject.set(x, "subdomain", js.undefined)
    }
  }
}
