package typings.internalIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("internal-ip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	@returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
  	@example
  	```
  	import internalIp = require('internal-ip');
  	console.log(await internalIp.v4())
  	//=> '10.0.0.79'
  	```
  	*/
  def v4(): js.Promise[js.UndefOr[String]] = js.native
  @JSName("v4")
  var v4_Original: v4 = js.native
  
  /**
  	@returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `undefined` will be returned.
  	@example
  	```
  	import internalIp = require('internal-ip');
  	console.log(await internalIp.v6());
  	//=> 'fe80::1'
  	```
  	*/
  def v6(): js.Promise[js.UndefOr[String]] = js.native
  @JSName("v6")
  var v6_Original: v6 = js.native
  
  @js.native
  trait v4 extends js.Object {
    
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
  
  @js.native
  trait v6 extends js.Object {
    
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
}
