package typings.hlsJs.mod

import typings.std.MediaKeysRequirement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DRMSystemOptions extends StObject {
  
  var audioEncryptionScheme: js.UndefOr[String | Null] = js.undefined
  
  var audioRobustness: js.UndefOr[String] = js.undefined
  
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.undefined
  
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.undefined
  
  var sessionType: js.UndefOr[String] = js.undefined
  
  var sessionTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var videoEncryptionScheme: js.UndefOr[String | Null] = js.undefined
  
  var videoRobustness: js.UndefOr[String] = js.undefined
}
object DRMSystemOptions {
  
  inline def apply(): DRMSystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DRMSystemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DRMSystemOptions] (val x: Self) extends AnyVal {
    
    inline def setAudioEncryptionScheme(value: String): Self = StObject.set(x, "audioEncryptionScheme", value.asInstanceOf[js.Any])
    
    inline def setAudioEncryptionSchemeNull: Self = StObject.set(x, "audioEncryptionScheme", null)
    
    inline def setAudioEncryptionSchemeUndefined: Self = StObject.set(x, "audioEncryptionScheme", js.undefined)
    
    inline def setAudioRobustness(value: String): Self = StObject.set(x, "audioRobustness", value.asInstanceOf[js.Any])
    
    inline def setAudioRobustnessUndefined: Self = StObject.set(x, "audioRobustness", js.undefined)
    
    inline def setDistinctiveIdentifier(value: MediaKeysRequirement): Self = StObject.set(x, "distinctiveIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDistinctiveIdentifierUndefined: Self = StObject.set(x, "distinctiveIdentifier", js.undefined)
    
    inline def setPersistentState(value: MediaKeysRequirement): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
    
    inline def setPersistentStateUndefined: Self = StObject.set(x, "persistentState", js.undefined)
    
    inline def setSessionType(value: String): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
    
    inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
    
    inline def setSessionTypes(value: js.Array[String]): Self = StObject.set(x, "sessionTypes", value.asInstanceOf[js.Any])
    
    inline def setSessionTypesUndefined: Self = StObject.set(x, "sessionTypes", js.undefined)
    
    inline def setSessionTypesVarargs(value: String*): Self = StObject.set(x, "sessionTypes", js.Array(value*))
    
    inline def setVideoEncryptionScheme(value: String): Self = StObject.set(x, "videoEncryptionScheme", value.asInstanceOf[js.Any])
    
    inline def setVideoEncryptionSchemeNull: Self = StObject.set(x, "videoEncryptionScheme", null)
    
    inline def setVideoEncryptionSchemeUndefined: Self = StObject.set(x, "videoEncryptionScheme", js.undefined)
    
    inline def setVideoRobustness(value: String): Self = StObject.set(x, "videoRobustness", value.asInstanceOf[js.Any])
    
    inline def setVideoRobustnessUndefined: Self = StObject.set(x, "videoRobustness", js.undefined)
  }
}
