package typings.ipAddress

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ip-address/dist/lib/address-error", JSImport.Namespace)
@js.native
object addressErrorMod extends js.Object {
  
  @js.native
  class AddressError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, parseMessage: String) = this()
    
    var parseMessage: js.UndefOr[String] = js.native
  }
}
