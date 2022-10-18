package typings.libp2pCrypto

import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.Cipher
import typings.node.cryptoMod.CipherCCM
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCM
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.CipherKey
import typings.node.cryptoMod.CipherOCB
import typings.node.cryptoMod.CipherOCBOptions
import typings.node.cryptoMod.CipherOCBTypes
import typings.node.cryptoMod.Decipher
import typings.node.cryptoMod.DecipherCCM
import typings.node.cryptoMod.DecipherGCM
import typings.node.cryptoMod.DecipherOCB
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAesCiphersMod {
  
  @JSImport("@libp2p/crypto/dist/src/aes/ciphers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCipheriv(algorithm: String, key: CipherKey): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  inline def createCipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  inline def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  inline def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  inline def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
  inline def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  inline def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  inline def createCipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): CipherOCB = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherOCB]
  
  inline def createDecipheriv(algorithm: String, key: CipherKey): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Decipher]
  inline def createDecipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Decipher]
  inline def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Decipher]
  inline def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Decipher]
  inline def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
  inline def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  inline def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  inline def createDecipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): DecipherOCB = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherOCB]
}
