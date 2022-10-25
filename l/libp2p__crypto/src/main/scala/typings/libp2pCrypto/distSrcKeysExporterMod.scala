package typings.libp2pCrypto

import typings.libp2pCrypto.libp2pCryptoStrings.m
import typings.multiformats.distTypesSrcBasesInterfaceMod.Multibase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysExporterMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/exporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exporter(privateKey: js.typedarray.Uint8Array, password: String): js.Promise[Multibase[m]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Multibase[m]]]
}
