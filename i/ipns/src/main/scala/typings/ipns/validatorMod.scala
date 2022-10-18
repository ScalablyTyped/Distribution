package typings.ipns

import typings.ipns.mod.IPNSEntry
import typings.libp2pInterfaceDht.mod.ValidateFn
import typings.libp2pInterfaceKeys.mod.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object validatorMod {
  
  @JSImport("ipns/validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipns/validator", "ipnsValidator")
  @js.native
  val ipnsValidator: ValidateFn = js.native
  
  inline def validate(publicKey: PublicKey, entry: IPNSEntry): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(publicKey.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
