package typings.hlsJs.mod

import typings.hlsJs.mod.Events.MANIFEST_PARSED
import typings.hlsJs.mod.Events.MEDIA_ATTACHED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controller to deal with encrypted media extensions (EME)
  * @see https://developer.mozilla.org/en-US/docs/Web/API/Encrypted_Media_Extensions_API
  *
  * @class
  * @constructor
  */
@js.native
trait EMEController
  extends StObject
     with ComponentAPI {
  
  /**
    * Requests access object and adds it to our list upon success
    * @private
    * @param {string} keySystem System ID (see `KeySystems`)
    * @param {Array<string>} audioCodecs List of required audio codecs to support
    * @param {Array<string>} videoCodecs List of required video codecs to support
    * @throws When a unsupported KeySystem is passed
    */
  /* private */ var _attemptKeySystemAccess: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _attemptSetMediaKeys: Any = js.native
  
  /* private */ var _config: Any = js.native
  
  /**
    * @private
    * @param {string} url License server URL
    * @param {ArrayBuffer} keyMessage Message data issued by key-system
    * @param {function} callback Called when XHR has succeeded
    * @returns {XMLHttpRequest} Unsent (but opened state) XHR object
    * @throws if XMLHttpRequest construction failed
    */
  /* private */ var _createLicenseXhr: Any = js.native
  
  /* private */ var _drmSystemOptions: Any = js.native
  
  /* private */ var _emeEnabled: Any = js.native
  
  /**
    * @private
    * @param {MediaKeysListItem} keysListItem
    * @param {ArrayBuffer} keyMessage
    * @returns {ArrayBuffer} Challenge data posted to license server
    * @throws if KeySystem is unsupported
    */
  /* private */ var _generateLicenseRequestChallenge: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _generateRequestWithPreferredKeySession: Any = js.native
  
  /* private */ var _hasSetMediaKeys: Any = js.native
  
  /* private */ var _licenseResponseCallback: Any = js.native
  
  /* private */ var _licenseXhrSetup: Any = js.native
  
  /* private */ var _media: Any = js.native
  
  /* private */ var _mediaKeysList: Any = js.native
  
  /**
    * @private
    * @param {MediaKeySession} keySession
    * @param {ArrayBuffer} message
    */
  /* private */ var _onKeySessionMessage: Any = js.native
  
  /**
    * @private
    * @param {XMLHttpRequest} xhr
    * @param {string} url License server URL
    * @param {ArrayBuffer} keyMessage Message data issued by key-system
    * @param {function} callback Called when XHR has succeeded
    */
  /* private */ var _onLicenseRequestReadyStageChange: Any = js.native
  
  /* private */ var _onMediaEncrypted: Any = js.native
  
  /**
    * Handles obtaining access to a key-system
    * @private
    * @param {string} keySystem
    * @param {MediaKeySystemAccess} mediaKeySystemAccess https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemAccess
    */
  /* private */ var _onMediaKeySystemAccessObtained: Any = js.native
  
  /**
    * Handles key-creation (represents access to CDM). We are going to create key-sessions upon this
    * for all existing keys where no session exists yet.
    *
    * @private
    */
  /* private */ var _onMediaKeysCreated: Any = js.native
  
  /**
    * @private
    * @param {*} keySession
    */
  /* private */ var _onNewMediaKeySession: Any = js.native
  
  /* private */ var _registerListeners: Any = js.native
  
  /**
    * @private
    * @param keyMessage
    * @param callback
    */
  /* private */ var _requestLicense: Any = js.native
  
  /* private */ var _requestLicenseFailureCount: Any = js.native
  
  /* private */ var _requestMediaKeySystemAccess: Any = js.native
  
  /* private */ var _unregisterListeners: Any = js.native
  
  /* private */ var _widevineLicenseUrl: Any = js.native
  
  /**
    * @param {string} keySystem Identifier for the key-system, see `KeySystems` enum
    * @returns {string} License server URL for key-system (if any configured, otherwise causes error)
    * @throws if a unsupported keysystem is passed
    */
  def getLicenseServerUrl(keySystem: KeySystems): String = js.native
  
  /* private */ var hls: Any = js.native
  
  /* private */ var mediaKeysPromise: Any = js.native
  
  def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit = js.native
  
  def onMediaAttached(event: MEDIA_ATTACHED, data: MediaAttachedData): Unit = js.native
  
  def onMediaDetached(): Unit = js.native
  
  /**
    * @private
    * @param e {MediaEncryptedEvent}
    */
  /* private */ var onMediaEncrypted: Any = js.native
  
  def requestMediaKeySystemAccess: MediaKeyFunc = js.native
}
