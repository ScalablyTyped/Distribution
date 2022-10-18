package typings.matrixBotSdk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "UnpaddedBase64")
@js.native
/* private */ open class UnpaddedBase64 ()
  extends typings.matrixBotSdk.libHelpersUnpaddedBase64Mod.UnpaddedBase64
/* static members */
object UnpaddedBase64 {
  
  @JSImport("matrix-bot-sdk", "UnpaddedBase64")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Encodes a buffer to Unpadded Base64
    * @param {Buffer} buf The buffer to encode.
    * @returns {string} The Unpadded Base64 string
    */
  inline def encodeBuffer(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Encodes a buffer to Unpadded Base64 (URL Safe Edition)
    * @param {Buffer} buf The buffer to encode.
    * @returns {string} The Unpadded Base64 string
    */
  inline def encodeBufferUrlSafe(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBufferUrlSafe")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Encodes a string to Unpadded Base64
    * @param {string} str The string to encode.
    * @returns {string} The Unpadded Base64 string
    */
  inline def encodeString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Encodes a string to Unpadded Base64 (URL Safe Edition)
    * @param {string} str The string to encode.
    * @returns {string} The Unpadded Base64 string
    */
  inline def encodeStringUrlSafe(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStringUrlSafe")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
