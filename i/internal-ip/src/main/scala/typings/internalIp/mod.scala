package typings.internalIp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("internal-ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait v4 extends StObject {
    
    /**
    	@returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
    	@example
    	```
    	import internalIp = require('internal-ip');
    	console.log(await internalIp.v4())
    	//=> '10.0.0.79'
    	```
    	*/
    def apply(): js.Promise[js.UndefOr[String]] = js.native
    
    /**
    	@returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
    	@example
    	```
    	import internalIp = require('internal-ip');
    	console.log(internalIp.v4.sync())
    	//=> '10.0.0.79'
    	```
    	*/
    def sync(): js.UndefOr[String] = js.native
  }
  object v4 {
    
    /**
    	@returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
    	@example
    	```
    	import internalIp = require('internal-ip');
    	console.log(await internalIp.v4())
    	//=> '10.0.0.79'
    	```
    	*/
    @scala.inline
    def apply(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  }
  @JSImport("internal-ip", "v4")
  @js.native
  def v4_Fmod: v4 = js.native
  
  @scala.inline
  def v4_Fmod_=(x: v4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4")(x.asInstanceOf[js.Any])
  
  @js.native
  trait v6 extends StObject {
    
    /**
    	@returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
    	@example
    	```
    	import internalIp = require('internal-ip');
    	console.log(await internalIp.v6());
    	//=> 'fe80::1'
    	```
    	*/
    def apply(): js.Promise[js.UndefOr[String]] = js.native
    
    /**
    	@returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
    	@example
    	```
    	import internalIp = require('internal-ip');
    	console.log(internalIp.v6.sync());
    	//=> 'fe80::1'
    	```
    	*/
    def sync(): js.UndefOr[String] = js.native
  }
  object v6 {
    
    /**
    	@returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
    	@example
    	```
    	import internalIp = require('internal-ip');
    	console.log(await internalIp.v6());
    	//=> 'fe80::1'
    	```
    	*/
    @scala.inline
    def apply(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("v6")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  }
  @JSImport("internal-ip", "v6")
  @js.native
  def v6_Fmod: v6 = js.native
  
  @scala.inline
  def v6_Fmod_=(x: v6): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v6")(x.asInstanceOf[js.Any])
}
