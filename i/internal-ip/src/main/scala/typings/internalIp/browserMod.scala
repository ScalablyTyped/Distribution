package typings.internalIp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("internal-ip/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def internalIpV4(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIpV4")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def internalIpV4Sync(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIpV4Sync")().asInstanceOf[js.UndefOr[String]]
  
  inline def internalIpV6(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIpV6")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def internalIpV6Sync(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIpV6Sync")().asInstanceOf[js.UndefOr[String]]
}
