package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Signatures")
@js.native
/** Creates a new, empty, signatures collection. */
open class Signatures () extends StObject {
  
  /**
    * Add the given signature from the given signer and the given key ID to
    * the collection.
    */
  def addSignature(signer: UserId, keyId: DeviceKeyId, signature: Ed25519Signature): MaybeSignature | Null = js.native
  
  /** Remove all the signatures we currently hold. */
  def clear(): Unit = js.native
  
  /** How many signatures do we currently hold. */
  def count: js.BigInt = js.native
  
  /** Get the map of signatures that belong to the given user. */
  def get(signer: UserId): (Record[String, MaybeSignature]) | Null = js.native
  
  /**
    * Try to find an Ed25519 signature from the given signer with
    * the given key ID.
    */
  def getSignature(signer: UserId, keyId: DeviceKeyId): Ed25519Signature | Null = js.native
  
  /**
    * Do we hold any signatures or is our collection completely
    * empty.
    */
  def isEmpty: Boolean = js.native
}
