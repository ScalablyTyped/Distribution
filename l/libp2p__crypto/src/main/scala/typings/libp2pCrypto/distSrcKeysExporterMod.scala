package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysExporterMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/exporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exporter(privateKey: js.typedarray.Uint8Array, password: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_base.Multibase<'m'> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_base.Multibase<'m'> */ Any
  ]]
}
