package typings.libp2p

import typings.libp2pInterfaceConnectionEncrypter.mod.ConnectionEncrypter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object insecureMod {
  
  @JSImport("libp2p/insecure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def plaintext(): js.Function0[ConnectionEncrypter[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("plaintext")().asInstanceOf[js.Function0[ConnectionEncrypter[Any]]]
}
