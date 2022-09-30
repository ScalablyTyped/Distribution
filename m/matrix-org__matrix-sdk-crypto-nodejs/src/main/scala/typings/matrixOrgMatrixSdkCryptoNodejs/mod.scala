package typings.matrixOrgMatrixSdkCryptoNodejs

import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`4`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`5`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`6`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
      * It produces an `EncryptedAttachment`, we can be used to
      * retrieve the media encryption information, or the encrypted
      * data.
      */
    inline def encrypt(array: js.typedarray.Uint8Array): EncryptedAttachment = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(array.asInstanceOf[js.Any]).asInstanceOf[EncryptedAttachment]
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "CrossSigningStatus")
  @js.native
  open class CrossSigningStatus () extends StObject {
    
    /** Do we have the master key. */
    def hasMaster: Boolean = js.native
    
    /**
      * Do we have the self signing key, this one is necessary to sign
      * our own devices.
      */
    def hasSelfSigning: Boolean = js.native
    
    /**
      * Do we have the user signing key, this one is necessary to sign
      * other users.
      */
    def hasUserSigning: Boolean = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Curve25519PublicKey")
  @js.native
  open class Curve25519PublicKey () extends StObject {
    
    /** The number of bytes a Curve25519 public key has. */
    def length: Double = js.native
    
    /**
      * Serialize an Curve25519 public key to an unpadded base64
      * representation.
      */
    def toBase64(): String = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DecryptedRoomEvent")
  @js.native
  open class DecryptedRoomEvent () extends StObject {
    
    /** The JSON-encoded decrypted event. */
    val event: String = js.native
    
    /**
      * Chain of Curve25519 keys through which this session was
      * forwarded, via `m.forwarded_room_key` events.
      */
    def forwardingCurve25519KeyChain: js.Array[String] | Null = js.native
    
    /**
      * The user ID of the event sender, note this is untrusted data
      * unless the `verification_state` is as well trusted.
      */
    def sender: UserId | Null = js.native
    
    /**
      * The signing Ed25519 key that have created the megolm key that
      * was used to decrypt this session.
      */
    def senderClaimedEd25519Key: String | Null = js.native
    
    /**
      * The Curve25519 key of the device that created the megolm
      * decryption key originally.
      */
    def senderCurve25519Key: String | Null = js.native
    
    /**
      * The device ID of the device that sent us the event, note this
      * is untrusted data unless `verification_state` is as well
      * trusted.
      */
    def senderDevice: DeviceId | Null = js.native
    
    /**
      * The verification state of the device that sent us the event,
      * note this is the state of the device at the time of
      * decryption. It may change in the future if a device gets
      * verified or deleted.
      */
    def verificationState: VerificationState | Null = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DeviceId")
  @js.native
  open class DeviceId protected () extends StObject {
    /** Create a new `DeviceId`. */
    def this(id: String) = this()
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DeviceKeyAlgorithm")
  @js.native
  open class DeviceKeyAlgorithm () extends StObject {
    
    /**
      * Read the device key algorithm's name. If the name is
      * `Unknown`, one may be interested by the `to_string` method to
      * read the original name.
      */
    def name: DeviceKeyAlgorithmName = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DeviceKeyId")
  @js.native
  open class DeviceKeyId protected () extends StObject {
    /** Parse/validate and create a new `DeviceKeyId`. */
    def this(id: String) = this()
    
    /** Returns key algorithm of the device key ID. */
    def algorithm: DeviceKeyAlgorithm = js.native
    
    /** Returns device ID of the device key ID. */
    def deviceId: DeviceId = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DeviceLists")
  @js.native
  /** Create an empty `DeviceLists`. */
  open class DeviceLists () extends StObject {
    def this(changed: js.Array[UserId]) = this()
    def this(changed: js.Array[UserId], left: js.Array[UserId]) = this()
    def this(changed: Null, left: js.Array[UserId]) = this()
    def this(changed: Unit, left: js.Array[UserId]) = this()
    
    /**
      * List of users who have updated their device identity keys or
      * who now share an encrypted room with the client since the
      * previous sync.
      */
    def changed: js.Array[UserId] = js.native
    
    /** Returns true if there are no device list updates. */
    def isEmpty(): Boolean = js.native
    
    /**
      * List of users who no longer share encrypted rooms since the
      * previous sync response.
      */
    def left: js.Array[UserId] = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Ed25519PublicKey")
  @js.native
  open class Ed25519PublicKey () extends StObject {
    
    /** The number of bytes an Ed25519 public key has. */
    def length: Double = js.native
    
    /**
      * Serialize an Ed25519 public key to an unpadded base64
      * representation.
      */
    def toBase64(): String = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Ed25519Signature")
  @js.native
  open class Ed25519Signature protected () extends StObject {
    /**
      * Try to create an Ed25519 signature from an unpadded base64
      * representation.
      */
    def this(signature: String) = this()
    
    /**
      * Serialize a Ed25519 signature to an unpadded base64
      * representation.
      */
    def toBase64(): String = js.native
  }
  
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
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "EncryptionSettings")
  @js.native
  /** Create a new `EncryptionSettings` with default values. */
  open class EncryptionSettings () extends StObject {
    
    /** The encryption algorithm that should be used in the room. */
    var algorithm: EncryptionAlgorithm = js.native
    
    /**
      * The history visibility of the room when the session was
      * created.
      */
    var historyVisibility: HistoryVisibility = js.native
    
    /**
      * How long the session should be used before changing it,
      * expressed in microseconds.
      */
    var rotationPeriod: js.BigInt = js.native
    
    /** How many messages should be sent before changing the session. */
    var rotationPeriodMessages: js.BigInt = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "IdentityKeys")
  @js.native
  open class IdentityKeys () extends StObject {
    
    /** The Curve25519 public key, used for establish shared secrets. */
    def curve25519: Curve25519PublicKey = js.native
    
    /** The Ed25519 public key, used for signing. */
    def ed25519: Ed25519PublicKey = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "KeysBackupRequest")
  @js.native
  open class KeysBackupRequest () extends StObject {
    
    /**
      * A JSON-encoded object of form:
      *
      * ```json
      * {"rooms": …}
      * ```
      */
    val body: String = js.native
    
    /** The request ID. */
    val id: String = js.native
    
    /** Get its request type. */
    def `type`: RequestType = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "KeysClaimRequest")
  @js.native
  open class KeysClaimRequest () extends StObject {
    
    /**
      * A JSON-encoded object of form:
      *
      * ```json
      * {"timeout": …, "one_time_keys": …}
      * ```
      */
    val body: String = js.native
    
    /** The request ID. */
    val id: String = js.native
    
    /** Get its request type. */
    def `type`: RequestType = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "KeysQueryRequest")
  @js.native
  open class KeysQueryRequest () extends StObject {
    
    /**
      * A JSON-encoded object of form:
      *
      * ```json
      * {"timeout": …, "device_keys": …, "token": …}
      * ```
      */
    val body: String = js.native
    
    /** The request ID. */
    val id: String = js.native
    
    /** Get its request type. */
    def `type`: RequestType = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "KeysUploadRequest")
  @js.native
  open class KeysUploadRequest () extends StObject {
    
    /**
      * A JSON-encoded object of form:
      *
      * ```json
      * {"device_keys": …, "one_time_keys": …, "fallback_keys": …}
      * ```
      */
    val body: String = js.native
    
    /** The request ID. */
    val id: String = js.native
    
    /** Get its request type. */
    def `type`: RequestType = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "MaybeSignature")
  @js.native
  open class MaybeSignature () extends StObject {
    
    /**
      * The base64 encoded string that is claimed to contain a
      * signature but could not be decoded, if any.
      */
    def invalidSignatureSource: String | Null = js.native
    
    /** Check whether the signature could not be successfully decoded. */
    def isInvalid: Boolean = js.native
    
    /** Check whether the signature has been successfully decoded. */
    def isValid: Boolean = js.native
    
    /** The signature, if successfully decoded. */
    def signature: Signature | Null = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "OlmMachine")
  @js.native
  /**
    * It's not possible to construct an `OlmMachine` with its
    * constructor because building an `OlmMachine` is
    * asynchronous. Please use the `finalize` method.
    */
  open class OlmMachine () extends StObject {
    
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
      * * `to_device_events`, thhe to-device events of the current sync
      *   response.
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
      * Create a new memory-based `OlmMachine` asynchronously.
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
    inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Null, storePassphrase: String): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
    inline def initialize(userId: UserId, deviceId: DeviceId, storePath: Unit, storePassphrase: String): js.Promise[OlmMachine] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], storePath.asInstanceOf[js.Any], storePassphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OlmMachine]]
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "RoomId")
  @js.native
  open class RoomId protected () extends StObject {
    /** Parse/validate and create a new `RoomId`. */
    def this(id: String) = this()
    
    /** Returns the user's localpart. */
    def localpart: String = js.native
    
    /** Returns the server name of the room ID. */
    def serverName: ServerName = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "RoomMessageRequest")
  @js.native
  open class RoomMessageRequest () extends StObject {
    
    /**
      * A JSON-encoded object of form:
      *
      * ```json
      * {"room_id": …, "txn_id": …, "content": …}
      * ```
      */
    val body: String = js.native
    
    /** The request ID. */
    val id: String = js.native
    
    /** Get its request type. */
    def `type`: RequestType = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "ServerName")
  @js.native
  open class ServerName protected () extends StObject {
    /** Parse/validate and create a new `ServerName`. */
    def this(name: String) = this()
    
    /**
      * Returns the host of the server name.
      *
      * That is: Return the part of the server before `:<port>` or the
      * full server name if there is no port.
      */
    def host: String = js.native
    
    /**
      * Returns true if and only if the server name is an IPv4 or IPv6
      * address.
      */
    def isIpLiteral(): Boolean = js.native
    
    /** Returns the port of the server name if any. */
    def port: Double | Null = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Signature")
  @js.native
  open class Signature () extends StObject {
    
    /** Get the Ed25519 signature, if this is one. */
    def ed25519: Ed25519Signature | Null = js.native
    
    /** Convert the signature to a base64 encoded string. */
    def toBase64(): String = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "SignatureUploadRequest")
  @js.native
  open class SignatureUploadRequest () extends StObject {
    
    /**
      * A JSON-encoded object of form:
      *
      * ```json
      * {"signed_keys": …, "txn_id": …, "messages": …}
      * ```
      */
    val body: String = js.native
    
    /** The request ID. */
    val id: String = js.native
    
    /** Get its request type. */
    def `type`: RequestType = js.native
  }
  
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
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "ToDeviceRequest")
  @js.native
  open class ToDeviceRequest () extends StObject {
    
    /**
      * A JSON-encoded object of form:
      *
      * ```json
      * {"event_type": …, "txn_id": …, "messages": …}
      * ```
      */
    val body: String = js.native
    
    /** The request ID. */
    val id: String = js.native
    
    /** Get its request type. */
    def `type`: RequestType = js.native
  }
  
  @JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "UserId")
  @js.native
  open class UserId protected () extends StObject {
    /** Parse/validate and create a new `UserId`. */
    def this(id: String) = this()
    
    /**
      * Whether this user ID is a historical one.
      *
      * A historical user ID is one that doesn't conform to the latest
      * specification of the user ID grammar but is still accepted
      * because it was previously allowed.
      */
    def isHistorical(): Boolean = js.native
    
    /** Returns the user's localpart. */
    def localpart: String = js.native
    
    /** Returns the server name of the user ID. */
    def serverName: ServerName = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
  */
  trait DeviceKeyAlgorithmName extends StObject
  object DeviceKeyAlgorithmName {
    
    /** The Curve25519 ECDH algorithm. */
    inline def Curve25519: `1` = 1.asInstanceOf[`1`]
    
    /** The Ed25519 signature algorithm. */
    inline def Ed25519: `0` = 0.asInstanceOf[`0`]
    
    /**
      * The Curve25519 ECDH algorithm, but the key also contains
      * signatures.
      */
    inline def SignedCurve25519: `2` = 2.asInstanceOf[`2`]
    
    /** An unknown device key algorithm. */
    inline def Unknown: `3` = 3.asInstanceOf[`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
  */
  trait EncryptionAlgorithm extends StObject
  object EncryptionAlgorithm {
    
    /** Megolm version 1 using AES-256 and SHA-256. */
    inline def MegolmV1AesSha2: `1` = 1.asInstanceOf[`1`]
    
    /** Olm version 1 using Curve25519, AES-256, and SHA-256. */
    inline def OlmV1Curve25519AesSha2: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
  */
  trait HistoryVisibility extends StObject
  object HistoryVisibility {
    
    /**
      * Previous events are accessible to newly joined members from
      * the point they were invited onwards.
      *
      * Events stop being accessible when the member's state changes
      * to something other than *invite* or *join*.
      */
    inline def Invited: `0` = 0.asInstanceOf[`0`]
    
    /**
      * Previous events are accessible to newly joined members from
      * the point they joined the room onwards.
      *
      * Events stop being accessible when the member's state changes
      * to something other than *join*.
      */
    inline def Joined: `1` = 1.asInstanceOf[`1`]
    
    /**
      * Previous events are always accessible to newly joined members.
      *
      * All events in the room are accessible, even those sent when
      * the member was not a part of the room.
      */
    inline def Shared: `2` = 2.asInstanceOf[`2`]
    
    /**
      * All events while this is the `HistoryVisibility` value may be
      * shared by any participating homeserver with anyone, regardless
      * of whether they have ever joined the room.
      */
    inline def WorldReadable: `3` = 3.asInstanceOf[`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`4`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`5`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`6`
  */
  trait RequestType extends StObject
  object RequestType {
    
    /** Represents a `KeysBackupRequest`. */
    inline def KeysBackup: `6` = 6.asInstanceOf[`6`]
    
    /** Represents a `KeysClaimRequest`. */
    inline def KeysClaim: `2` = 2.asInstanceOf[`2`]
    
    /** Represents a `KeysQueryRequest`. */
    inline def KeysQuery: `1` = 1.asInstanceOf[`1`]
    
    /** Represents a `KeysUploadRequest`. */
    inline def KeysUpload: `0` = 0.asInstanceOf[`0`]
    
    /** Represents a `RoomMessageRequest`. */
    inline def RoomMessage: `5` = 5.asInstanceOf[`5`]
    
    /** Represents a `SignatureUploadRequest`. */
    inline def SignatureUpload: `4` = 4.asInstanceOf[`4`]
    
    /** Represents a `ToDeviceRequest`. */
    inline def ToDevice: `3` = 3.asInstanceOf[`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
    - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
  */
  trait VerificationState extends StObject
  object VerificationState {
    
    /** The device is trusted. */
    inline def Trusted: `0` = 0.asInstanceOf[`0`]
    
    /** The device is not known to us. */
    inline def UnknownDevice: `2` = 2.asInstanceOf[`2`]
    
    /** The device is not trusted. */
    inline def Untrusted: `1` = 1.asInstanceOf[`1`]
  }
}
