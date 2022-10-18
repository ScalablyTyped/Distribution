package typings.lesgo

import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCryptoMod {
  
  @JSImport("lesgo/utils/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encrypt(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hash(data: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashMD5(data: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMD5")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
