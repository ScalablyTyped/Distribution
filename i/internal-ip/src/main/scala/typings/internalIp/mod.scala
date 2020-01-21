package typings.internalIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("internal-ip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait v4 extends js.Object {
    /**
    	 * @returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
    	 *
    	 * @example
    	 *
    	 * console.log(await internalIp.v4())
    	 * //=> '10.0.0.79'
    	 */
    def apply(): js.Promise[String] = js.native
    /**
    	 * @returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
    	 *
    	 * @example
    	 *
    	 * console.log(internalIp.v4.sync())
    	 * //=> '10.0.0.79'
    	 */
    def sync(): String = js.native
  }
  
  @js.native
  trait v6 extends js.Object {
    /**
    	 * @returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
    	 *
    	 * @example
    	 *
    	 * console.log(await internalIp.v6());
    	 * //=> 'fe80::1'
    	 */
    def apply(): js.Promise[String] = js.native
    /**
    	 * @returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
    	 *
    	 * @example
    	 *
    	 * console.log(internalIp.v6.sync());
    	 * //=> 'fe80::1'
    	 */
    def sync(): String = js.native
  }
  
  // TODO: Remove this for the next major release
  var default: AnonDefault = js.native
  @JSName("v4")
  var v4_Original: v4 = js.native
  @JSName("v6")
  var v6_Original: v6 = js.native
  /**
  	 * @returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
  	 *
  	 * @example
  	 *
  	 * console.log(await internalIp.v4())
  	 * //=> '10.0.0.79'
  	 */
  def v4(): js.Promise[String] = js.native
  /**
  	 * @returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
  	 *
  	 * @example
  	 *
  	 * console.log(await internalIp.v6());
  	 * //=> 'fe80::1'
  	 */
  def v6(): js.Promise[String] = js.native
}

