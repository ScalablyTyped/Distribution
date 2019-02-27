package typings
package internalDashIpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("internal-ip", JSImport.Namespace)
@js.native
object internalDashIpMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def v4(): js.Promise[java.lang.String] = js.native
    def v6(): js.Promise[java.lang.String] = js.native
    @JSName("v4")
    @js.native
    object v4Ns extends js.Object {
      /**
      		 * @returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
      		 *
      		 * @example
      		 *
      		 * console.log(internalIp.v4.sync())
      		 * //=> '10.0.0.79'
      		 */
      def sync(): java.lang.String = js.native
    }
    
    @JSName("v6")
    @js.native
    object v6Ns extends js.Object {
      /**
      		 * @returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
      		 *
      		 * @example
      		 *
      		 * console.log(internalIp.v6.sync());
      		 * //=> 'fe80::1'
      		 */
      def sync(): java.lang.String = js.native
    }
    
  }
  
}

