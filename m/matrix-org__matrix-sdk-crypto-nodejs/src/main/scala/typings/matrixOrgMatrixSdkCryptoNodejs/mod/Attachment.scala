package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Attachment")
@js.native
open class Attachment () extends StObject
/* static members */
object Attachment {
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Attachment")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decrypt an `EncryptedAttachment`.
    *
    * The encrypted attachment can be created manually, or from the
    * `encrypt` method.
    *
    * **Warning**: The encrypted attachment can be used only
    * **once**! The encrypted data will still be present, but the
    * media encryption info (which contain secrets) will be
    * destroyed. It is still possible to get a JSON-encoded backup
    * by calling `EncryptedAttachment.mediaEncryptionInfo`.
    */
  inline def decrypt(attachment: EncryptedAttachment): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(attachment.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Encrypt the content of the `Uint8Array`.
    *
    * It produces an `EncryptedAttachment`, which can be used to
    * retrieve the media encryption information, or the encrypted
    * data.
    */
  inline def encrypt(array: js.typedarray.Uint8Array): EncryptedAttachment = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(array.asInstanceOf[js.Any]).asInstanceOf[EncryptedAttachment]
}
