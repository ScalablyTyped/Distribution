package typings.hlsJs.mod

import typings.std.MediaKeySession
import typings.std.MediaKeyStatus
import typings.std.MediaKeys
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeySessionContext extends StObject {
  
  var decryptdata: LevelKey
  
  var keyStatus: MediaKeyStatus
  
  var keySystem: KeySystems
  
  var licenseXhr: js.UndefOr[XMLHttpRequest] = js.undefined
  
  var mediaKeys: MediaKeys
  
  var mediaKeysSession: MediaKeySession
}
object MediaKeySessionContext {
  
  inline def apply(
    decryptdata: LevelKey,
    keyStatus: MediaKeyStatus,
    keySystem: KeySystems,
    mediaKeys: MediaKeys,
    mediaKeysSession: MediaKeySession
  ): MediaKeySessionContext = {
    val __obj = js.Dynamic.literal(decryptdata = decryptdata.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], keySystem = keySystem.asInstanceOf[js.Any], mediaKeys = mediaKeys.asInstanceOf[js.Any], mediaKeysSession = mediaKeysSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySessionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaKeySessionContext] (val x: Self) extends AnyVal {
    
    inline def setDecryptdata(value: LevelKey): Self = StObject.set(x, "decryptdata", value.asInstanceOf[js.Any])
    
    inline def setKeyStatus(value: MediaKeyStatus): Self = StObject.set(x, "keyStatus", value.asInstanceOf[js.Any])
    
    inline def setKeySystem(value: KeySystems): Self = StObject.set(x, "keySystem", value.asInstanceOf[js.Any])
    
    inline def setLicenseXhr(value: XMLHttpRequest): Self = StObject.set(x, "licenseXhr", value.asInstanceOf[js.Any])
    
    inline def setLicenseXhrUndefined: Self = StObject.set(x, "licenseXhr", js.undefined)
    
    inline def setMediaKeys(value: MediaKeys): Self = StObject.set(x, "mediaKeys", value.asInstanceOf[js.Any])
    
    inline def setMediaKeysSession(value: MediaKeySession): Self = StObject.set(x, "mediaKeysSession", value.asInstanceOf[js.Any])
  }
}
