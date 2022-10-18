package typings.ipfsHttpClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibHttpRpcWireFormatMod {
  
  @JSImport("ipfs-http-client/dist/src/lib/http-rpc-wire-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rpcArrayToTextArray(strings: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcArrayToTextArray")(strings.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def rpcToBigInt(mb: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcToBigInt")(mb.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def rpcToBytes(mb: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcToBytes")(mb.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def rpcToText(mb: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcToText")(mb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def textToUrlSafeRpc(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textToUrlSafeRpc")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
