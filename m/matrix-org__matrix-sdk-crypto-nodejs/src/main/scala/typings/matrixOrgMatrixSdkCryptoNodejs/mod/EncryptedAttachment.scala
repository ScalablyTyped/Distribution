package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "EncryptedAttachment")
@js.native
open class EncryptedAttachment protected () extends StObject {
  /**
    * Create a new encrypted attachment manually.
    *
    * It needs encrypted data, stored in an `Uint8Array`, and a
    * [media encryption
    * information](https://docs.rs/matrix-sdk-crypto/latest/matrix_sdk_crypto/struct.MediaEncryptionInfo.html),
    * as a JSON-encoded string.
    *
    * The media encryption information aren't stored as a string:
    * they are parsed, validated and fully deserialized.
    *
    * See [the specification to learn
    * more](https://spec.matrix.org/unstable/client-server-api/#extensions-to-mroommessage-msgtypes).
    */
  def this(encryptedData: js.typedarray.Uint8Array, mediaEncryptionInfo: String) = this()
  
  /** The actual encrypted data. */
  var encryptedData: js.typedarray.Uint8Array = js.native
  
  /**
    * Check whether the media encryption info has been consumed by
    * `Attachment.decrypt` already.
    */
  def hasMediaEncryptionInfoBeenConsumed: Boolean = js.native
  
  /**
    * Return the media encryption info as a JSON-encoded string. The
    * structure is fully valid.
    *
    * If the media encryption info have been consumed already, it
    * will return `null`.
    */
  def mediaEncryptionInfo: String | Null = js.native
}
