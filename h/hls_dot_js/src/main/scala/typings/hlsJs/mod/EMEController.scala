package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "EMEController")
@js.native
open class EMEController protected ()
  extends StObject
     with ComponentAPI {
  def this(hls: Hls) = this()
  
  /* private */ var _onMediaEncrypted: Any = js.native
  
  /* private */ var _onWaitingForKey: Any = js.native
  
  /* private */ var _requestLicenseFailureCount: Any = js.native
  
  /* private */ var attemptKeySystemAccess: Any = js.native
  
  /* private */ var attemptSetMediaKeys: Any = js.native
  
  /* private */ val config: Any = js.native
  
  /* private */ var createMediaKeySessionContext: Any = js.native
  
  /* private */ var debug: Any = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var error: Any = js.native
  
  /* private */ var fetchServerCertificate: Any = js.native
  
  /* private */ var generateRequestWithPreferredKeySession: Any = js.native
  
  /* private */ var getKeyFormatPromise: Any = js.native
  
  /* private */ var getKeyIdString: Any = js.native
  
  /* private */ var getKeySystemForKeyPromise: Any = js.native
  
  /* private */ var getKeySystemSelectionPromise: Any = js.native
  
  /* private */ var getLicenseServerUrl: Any = js.native
  
  /* private */ var getMediaKeysPromise: Any = js.native
  
  /* private */ var getServerCertificateUrl: Any = js.native
  
  /* private */ var handleError: Any = js.native
  
  /* private */ val hls: Any = js.native
  
  /* private */ var keyFormatPromise: Any = js.native
  
  /* private */ var keyIdToKeySessionPromise: Any = js.native
  
  /* private */ var keySystemAccessPromises: Any = js.native
  
  def loadKey(data: KeyLoadedData): js.Promise[MediaKeySessionContext] = js.native
  
  /* private */ var log: Any = js.native
  
  /* private */ var media: Any = js.native
  
  /* private */ var mediaKeySessions: Any = js.native
  
  /* private */ var onKeyStatusChange: Any = js.native
  
  /* private */ var onManifestLoaded: Any = js.native
  
  /* private */ var onManifestLoading: Any = js.native
  
  /* private */ var onMediaAttached: Any = js.native
  
  /* private */ var onMediaDetached: Any = js.native
  
  /* private */ var onMediaEncrypted: Any = js.native
  
  /* private */ var onWaitingForKey: Any = js.native
  
  /* private */ var registerListeners: Any = js.native
  
  /* private */ var removeSession: Any = js.native
  
  /* private */ var renewKeySession: Any = js.native
  
  /* private */ var renewLicense: Any = js.native
  
  /* private */ var requestLicense: Any = js.native
  
  /* private */ var requestMediaKeySystemAccess: Any = js.native
  
  def selectKeySystemFormat(frag: Fragment): js.Promise[KeySystemFormats] = js.native
  
  /* private */ var setMediaKeysQueue: Any = js.native
  
  /* private */ var setMediaKeysServerCertificate: Any = js.native
  
  /* private */ var setupLicenseXHR: Any = js.native
  
  /* private */ var throwIfDestroyed: Any = js.native
  
  /* private */ var unregisterListeners: Any = js.native
  
  /* private */ var updateKeySession: Any = js.native
  
  /* private */ var warn: Any = js.native
}
/* static members */
object EMEController {
  
  @JSImport("hls.js", "EMEController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hls.js", "EMEController.CDMCleanupPromise")
  @js.native
  def CDMCleanupPromise: js.Promise[Unit] | Unit = js.native
  inline def CDMCleanupPromise_=(x: js.Promise[Unit] | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CDMCleanupPromise")(x.asInstanceOf[js.Any])
}
