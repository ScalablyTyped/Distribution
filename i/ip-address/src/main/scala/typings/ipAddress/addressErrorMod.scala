package typings.ipAddress

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressErrorMod {
  
  @JSImport("ip-address/dist/lib/address-error", "AddressError")
  @js.native
  class AddressError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, parseMessage: String) = this()
    
    var parseMessage: js.UndefOr[String] = js.native
  }
}
