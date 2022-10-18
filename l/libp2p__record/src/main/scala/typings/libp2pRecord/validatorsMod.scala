package typings.libp2pRecord

import typings.libp2pInterfaceDht.mod.Validators
import typings.libp2pRecord.mod.Libp2pRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object validatorsMod {
  
  @JSImport("@libp2p/record/validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/record/validators", "validators")
  @js.native
  val validators: Validators = js.native
  
  inline def verifyRecord(validators: Validators, record: Libp2pRecord): js.UndefOr[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRecord")(validators.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[Unit]]]
}
