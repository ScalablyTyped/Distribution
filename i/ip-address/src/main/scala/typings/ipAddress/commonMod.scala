package typings.ipAddress

import typings.ipAddress.ipv4Mod.Address4
import typings.ipAddress.ipv6Mod.Address6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("ip-address/dist/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isCorrect(defaultBits: Double): js.ThisFunction0[/* this */ Address4 | Address6, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCorrect")(defaultBits.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction0[/* this */ Address4 | Address6, Boolean]]
  
  @scala.inline
  def isInSubnet(address: Address4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInSubnet")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isInSubnet(address: Address6): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInSubnet")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
