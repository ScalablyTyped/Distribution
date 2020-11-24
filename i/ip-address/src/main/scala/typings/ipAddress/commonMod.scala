package typings.ipAddress

import typings.ipAddress.ipv4Mod.Address4
import typings.ipAddress.ipv6Mod.Address6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ip-address/dist/lib/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  
  def isCorrect(defaultBits: Double): js.ThisFunction0[/* this */ Address4 | Address6, Boolean] = js.native
  
  def isInSubnet(address: Address4): Boolean = js.native
  def isInSubnet(address: Address6): Boolean = js.native
}
