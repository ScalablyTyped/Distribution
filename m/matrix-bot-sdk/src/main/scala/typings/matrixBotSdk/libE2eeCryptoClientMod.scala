package typings.matrixBotSdk

import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import typings.matrixBotSdk.libModelsCryptoMod.IMegolmEncrypted
import typings.matrixBotSdk.libModelsCryptoMod.IOlmEncrypted
import typings.matrixBotSdk.libModelsCryptoMod.IToDeviceMessage
import typings.matrixBotSdk.libModelsCryptoMod.OTKAlgorithm
import typings.matrixBotSdk.libModelsCryptoMod.OTKCounts
import typings.matrixBotSdk.libModelsCryptoMod.Signatures
import typings.matrixBotSdk.libModelsEventsEncryptedRoomEventMod.EncryptedRoomEvent
import typings.matrixBotSdk.libModelsEventsMessageEventMod.EncryptedFile
import typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEvent
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libE2eeCryptoClientMod {
  
  @JSImport("matrix-bot-sdk/lib/e2ee/CryptoClient", "CryptoClient")
  @js.native
  open class CryptoClient protected () extends StObject {
    def this(client: MatrixClient) = this()
    
    /* private */ var client: Any = js.native
    
    /**
      * The device ID for the MatrixClient.
      */
    def clientDeviceId: String = js.native
    
    /**
      * Decrypts a previously-uploaded encrypted file, validating the fields along the way.
      * @param {EncryptedFile} file The file to decrypt.
      * @returns {Promise<Buffer>} Resolves to the decrypted file contents.
      */
    def decryptMedia(file: EncryptedFile): js.Promise[Buffer] = js.native
    
    /**
      * Decrypts a room event. Currently only supports Megolm-encrypted events (default for this SDK).
      * @param {EncryptedRoomEvent} event The encrypted event.
      * @param {string} roomId The room ID where the event was sent.
      * @returns {Promise<RoomEvent<unknown>>} Resolves to a decrypted room event, or rejects/throws with
      * an error if the event is undecryptable.
      */
    def decryptRoomEvent(event: EncryptedRoomEvent, roomId: String): js.Promise[RoomEvent[Any]] = js.native
    
    /* private */ var deviceCurve25519: Any = js.native
    
    /* private */ var deviceEd25519: Any = js.native
    
    /* private */ var deviceId: Any = js.native
    
    /**
      * Encrypts a file for uploading in a room, returning the encrypted data and information
      * to include in a message event (except media URL) for sending.
      * @param {Buffer} file The file to encrypt.
      * @returns {{buffer: Buffer, file: Omit<EncryptedFile, "url">}} Resolves to the encrypted
      * contents and file information.
      */
    def encryptMedia(file: Buffer): js.Promise[typings.matrixBotSdk.anon.Buffer] = js.native
    
    /**
      * Encrypts the details of a room event, returning an encrypted payload to be sent in an
      * `m.room.encrypted` event to the room. If needed, this function will send decryption keys
      * to the appropriate devices in the room (this happens when the Megolm session rotates or
      * gets created).
      * @param {string} roomId The room ID to encrypt within. If the room is not encrypted, an
      * error is thrown.
      * @param {string} eventType The event type being encrypted.
      * @param {any} content The event content being encrypted.
      * @returns {Promise<IMegolmEncrypted>} Resolves to the encrypted content for an `m.room.encrypted` event.
      */
    def encryptRoomEvent(roomId: String, eventType: String, content: Any): js.Promise[IMegolmEncrypted] = js.native
    
    /* private */ var engine: Any = js.native
    
    /**
      * Whether or not the crypto client is ready to be used. If not ready, prepare() should be called.
      * @see prepare
      */
    def isReady: Boolean = js.native
    
    /**
      * Checks if a room is encrypted.
      * @param {string} roomId The room ID to check.
      * @returns {Promise<boolean>} Resolves to true if encrypted, false otherwise.
      */
    def isRoomEncrypted(roomId: String): js.Promise[Boolean] = js.native
    
    /**
      * Handles a room event.
      * @internal
      * @param roomId The room ID.
      * @param event The event.
      */
    def onRoomEvent(roomId: String, event: Any): js.Promise[Unit] = js.native
    
    /**
      * Handles a room join.
      * @internal
      * @param roomId The room ID.
      */
    def onRoomJoin(roomId: String): js.Promise[Unit] = js.native
    
    /**
      * Prepares the crypto client for usage.
      * @param {string[]} roomIds The room IDs the MatrixClient is joined to.
      */
    def prepare(roomIds: js.Array[String]): js.Promise[Unit] = js.native
    
    /* private */ var ready: Any = js.native
    
    /* private */ var roomTracker: Any = js.native
    
    /**
      * Signs an object using the device keys.
      * @param {object} obj The object to sign.
      * @returns {Promise<Signatures>} The signatures for the object.
      */
    def sign(obj: js.Object): js.Promise[Signatures] = js.native
    
    /* private */ def storage: Any = js.native
    
    /**
      * Updates the client's sync-related data.
      * @param {IToDeviceMessage<IOlmEncrypted>} toDeviceMessages The to-device messages received.
      * @param {OTKCounts} otkCounts The current OTK counts.
      * @param {OTKAlgorithm[]} unusedFallbackKeyAlgs The unused fallback key algorithms.
      * @param {string[]} changedDeviceLists The user IDs which had device list changes.
      * @param {string[]} leftDeviceLists The user IDs which the server believes we no longer need to track.
      * @returns {Promise<void>} Resolves when complete.
      */
    def updateSyncData(
      toDeviceMessages: js.Array[IToDeviceMessage[IOlmEncrypted]],
      otkCounts: OTKCounts,
      unusedFallbackKeyAlgs: js.Array[OTKAlgorithm],
      changedDeviceLists: js.Array[String],
      leftDeviceLists: js.Array[String]
    ): js.Promise[Unit] = js.native
  }
}
