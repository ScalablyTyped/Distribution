package typings.isIp

import typings.isIp.isIpNumbers.`4`
import typings.isIp.isIpNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ipVersion(string: String): js.UndefOr[`6` | `4`] = ^.asInstanceOf[js.Dynamic].applyDynamic("ipVersion")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`6` | `4`]]
  
  inline def isIP(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIPv4(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIPv6(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
