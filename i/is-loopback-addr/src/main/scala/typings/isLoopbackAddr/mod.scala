package typings.isLoopbackAddr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-loopback-addr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLoopbackAddr(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoopbackAddr")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
