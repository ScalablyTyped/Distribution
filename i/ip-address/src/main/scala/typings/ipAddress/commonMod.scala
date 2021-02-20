package typings.ipAddress

import typings.ipAddress.ipv4Mod.Address4
import typings.ipAddress.ipv6Mod.Address6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("ip-address/dist/lib/common", "isCorrect")
  @js.native
  def isCorrect(defaultBits: Double): js.ThisFunction0[/* this */ Address4 | Address6, Boolean] = js.native
  
  @JSImport("ip-address/dist/lib/common", "isInSubnet")
  @js.native
  def isInSubnet(address: Address4): Boolean = js.native
  @JSImport("ip-address/dist/lib/common", "isInSubnet")
  @js.native
  def isInSubnet(address: Address6): Boolean = js.native
}
