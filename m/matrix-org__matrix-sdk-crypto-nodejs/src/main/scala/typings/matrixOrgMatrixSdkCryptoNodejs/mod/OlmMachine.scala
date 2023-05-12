package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "OlmMachine")
@js.native
/**
  * It's not possible to construct an `OlmMachine` with its
  * constructor because building an `OlmMachine` is
  * asynchronous. Please use the `finalize` method.
  */
open class OlmMachine () extends StObject {
  
  /**
    * Shut down the `OlmMachine`.
    *
    * The `OlmMachine` cannot be used after this method has been called,
    * otherwise it will panic.
    *
    * All associated resources will be closed too, like the crypto storage
    * connections.
    *
    * # Safety
    *
    * The caller is responsible to **not** use any objects that came from this
    * `OlmMachine` after this `close` method has been called.
    */
  def close(): Unit = js.native
  
  /**
    * Get the status of the private cross signing keys.
    *
    * This can be used to check which private cross signing keys we
    * have stored locally.
    */
  def crossSigningStatus(): js.Promise[CrossSigningStatus] = js.native
  
  /**
    * Decrypt an event from a room timeline.
    *
    * # Arguments
    *
    * * `event`, the event that should be decrypted.
    * * `room_id`, the ID of the room where the event was sent to.
    */
  def decryptRoomEvent(event: String, roomId: RoomId): js.Promise[DecryptedRoomEvent] = js.native
  
  /** The unique device ID that identifies this `OlmMachine`. */
  def deviceId: DeviceId = js.native
  
  /**
    * Encrypt a JSON-encoded content for the given room.
    *
    * # Arguments
    *
    * * `room_id`, the ID of the room for which the message should be
    *   encrypted.
    * * `event_type`, the plaintext type of the event.
    * * `content`, the JSON-encoded content of the message that should be
    *   encrypted.
    */
  def encryptRoomEvent(roomId: RoomId, eventType: String, content: String): js.Promise[String] = js.native
  
  /**
    * Get the a key claiming request for the user/device pairs that
    * we are missing Olm sessions for.
    *
    * Returns `null` if no key claiming request needs to be sent
    * out.
    *
    * Sessions need to be established between devices so group
    * sessions for a room can be shared with them.
    *
    * This should be called every time a group session needs to be
    * shared as well as between sync calls. After a sync some
    * devices may request room keys without us having a valid Olm
    * session with them, making it impossible to server the room key
    * request, thus it’s necessary to check for missing sessions
    * between sync as well.
    *
    * Note: Care should be taken that only one such request at a
    * time is in flight, e.g. using a lock.
    *
    * The response of a successful key claiming requests needs to be
    * passed to the `OlmMachine` with the `mark_request_as_sent`.
    *
    * # Arguments
    *
    * * `users`, the list of users that we should check if we lack a session
    *   with one of their devices. This can be an empty array or `null` when
    *   calling this method between sync requests.
    */
  def getMissingSessions(): js.Promise[KeysClaimRequest | Null] = js.native
  def getMissingSessions(users: js.Array[UserId]): js.Promise[KeysClaimRequest | Null] = js.native
  
  /** Get the public parts of our Olm identity keys. */
  def identityKeys: IdentityKeys = js.native
  
  /**
    * Mark the request with the given request ID as sent.
    *
    * # Arguments
    *
    * * `request_id`, the unique ID of the request that was sent out. This is
    *   needed to couple the response with the now sent out request.
    * * `request_type`, the request type associated to the request ID.
    * * `response`, the response that was received from the server after the
    *   outgoing request was sent out.
    */
  def markRequestAsSent(requestId: String, requestType: RequestType, response: String): js.Promise[Boolean] = js.native
  
  /**
    * Get the outgoing requests that need to be sent out.
    *
    * This returns a list of `KeysUploadRequest`, or
    * `KeysQueryRequest`, or `KeysClaimRequest`, or
    * `ToDeviceRequest`, or `SignatureUploadRequest`, or
    * `RoomMessageRequest`, or `KeysBackupRequest`. Those requests
    * need to be sent out to the server and the responses need to be
    * passed back to the state machine using `mark_request_as_sent`.
    */
  def outgoingRequests(): js.Promise[
    js.Array[
      KeysUploadRequest | KeysQueryRequest | KeysClaimRequest | ToDeviceRequest | SignatureUploadRequest | RoomMessageRequest | KeysBackupRequest
    ]
  ] = js.native
  
  /**
    * Handle a to-device and one-time key counts from a sync response.
    *
    * This will decrypt and handle to-device events returning the
    * decrypted versions of them, as a JSON-encoded string.
    *
    * To decrypt an event from the room timeline, please use
    * `decrypt_room_event`.
    *
    * # Arguments
    *
    * * `to_device_events`, the to-device events of the current sync response.
    * * `changed_devices`, the list of devices that changed in this sync
    *   response.
    * * `one_time_keys_count`, the current one-time keys counts that the sync
    *   response returned.
    */
  def receiveSyncChanges(
    toDeviceEvents: String,
    changedDevices: DeviceLists,
    oneTimeKeyCounts: Record[String, Double],
    unusedFallbackKeys: js.Array[String]
  ): js.Promise[String] = js.native
  
  /**
    * Get to-device requests to share a room key with users in a room.
    *
    * # Arguments
    *
    * * `room_id`, the room ID of the room where the room key will be used.
    * * `users`, the list of users that should receive the room key.
    * * `encryption_settings`, the encryption settings.
    */
  def shareRoomKey(roomId: RoomId, users: js.Array[UserId], encryptionSettings: EncryptionSettings): js.Promise[String] = js.native
  
  /**
    * Sign the given message using our device key and if available
    * cross-signing master key.
    */
  def sign(message: String): js.Promise[Signatures] = js.native
  
  /**
    * Update the tracked users.
    *
    * This will mark users that weren’t seen before for a key query
    * and tracking.
    *
    * If the user is already known to the Olm machine it will not be
    * considered for a key query.
    *
    * # Arguments
    *
    * * `users`, an array over user IDs that should be marked for tracking.
    */
  def updateTrackedUsers(users: js.Array[UserId]): js.Promise[Unit] = js.native
  
  /** The unique user ID that owns this `OlmMachine` instance. */
  def userId: UserId = js.native
}
/* static members */
object OlmMachine {
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "OlmMachine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new `OlmMachine` asynchronously.
    *
    * The persistence of the encryption keys and all the inner
    * objects are controlled by the `store_path` argument.
    *
    * # Arguments
    *
    * * `user_id`, the unique ID of the user that owns this machine.
    * * `device_id`, the unique id of the device that owns this machine.
    * * `store_path`, the path to a directory where the state of the machine
    *   should be persisted; if not set, the created machine will keep the
    *   encryption keys only in memory, and once the object is dropped, the
    *   keys will be lost.
    * * `store_passphrase`, the passphrase that should be used to encrypt the
    *   data at rest in the store. **Warning**, if no passphrase is given, the
    *   store and all its data will remain unencrypted. This argument is
    *   ignored if `store_path` is not set.
    */
  inline def initialize(userId: UserId, deviceId: DeviceId): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: String): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: String, storePassphrase: String): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(
    userId: UserId,
    deviceId: DeviceId,
    storePath: String,
    storePassphrase: String,
    storeType: StoreType
  ): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: String, storePassphrase: Null, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: String, storePassphrase: Unit, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Null, storePassphrase: String): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Null, storePassphrase: String, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Null, storePassphrase: Null, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Null, storePassphrase: Unit, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Unit, storePassphrase: String): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Unit, storePassphrase: String, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Unit, storePassphrase: Null, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Unit, storePassphrase: Unit, storeType: StoreType): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any], storeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
}
