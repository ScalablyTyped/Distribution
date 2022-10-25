package typings.libp2p

import typings.libp2pInterfaceConnectionEncrypter.mod.ConnectionEncrypter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInsecureMod {
  
  @JSImport("libp2p/dist/src/insecure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def plaintext(): js.Function0[ConnectionEncrypter[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("plaintext")().asInstanceOf[js.Function0[ConnectionEncrypter[Any]]]
}
