package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstance extends StObject {
  
  /**
    * URI which shows where a user can acquire this instance.
    */
  var acquisitionUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Platform dependent details for Android.
    */
  var androidInstance: js.UndefOr[SchemaInstanceAndroidDetails] = js.undefined
  
  /**
    * Platform dependent details for iOS.
    */
  var iosInstance: js.UndefOr[SchemaInstanceIosDetails] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#instance`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localized display name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The platform type.
    */
  var platformType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag to show if this game instance supports realtime play.
    */
  var realtimePlay: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Flag to show if this game instance supports turn based play.
    */
  var turnBasedPlay: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Platform dependent details for Web.
    */
  var webInstance: js.UndefOr[SchemaInstanceWebDetails] = js.undefined
}
object SchemaInstance {
  
  inline def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  extension [Self <: SchemaInstance](x: Self) {
    
    inline def setAcquisitionUri(value: String): Self = StObject.set(x, "acquisitionUri", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionUriNull: Self = StObject.set(x, "acquisitionUri", null)
    
    inline def setAcquisitionUriUndefined: Self = StObject.set(x, "acquisitionUri", js.undefined)
    
    inline def setAndroidInstance(value: SchemaInstanceAndroidDetails): Self = StObject.set(x, "androidInstance", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstanceUndefined: Self = StObject.set(x, "androidInstance", js.undefined)
    
    inline def setIosInstance(value: SchemaInstanceIosDetails): Self = StObject.set(x, "iosInstance", value.asInstanceOf[js.Any])
    
    inline def setIosInstanceUndefined: Self = StObject.set(x, "iosInstance", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeNull: Self = StObject.set(x, "platformType", null)
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setRealtimePlay(value: Boolean): Self = StObject.set(x, "realtimePlay", value.asInstanceOf[js.Any])
    
    inline def setRealtimePlayNull: Self = StObject.set(x, "realtimePlay", null)
    
    inline def setRealtimePlayUndefined: Self = StObject.set(x, "realtimePlay", js.undefined)
    
    inline def setTurnBasedPlay(value: Boolean): Self = StObject.set(x, "turnBasedPlay", value.asInstanceOf[js.Any])
    
    inline def setTurnBasedPlayNull: Self = StObject.set(x, "turnBasedPlay", null)
    
    inline def setTurnBasedPlayUndefined: Self = StObject.set(x, "turnBasedPlay", js.undefined)
    
    inline def setWebInstance(value: SchemaInstanceWebDetails): Self = StObject.set(x, "webInstance", value.asInstanceOf[js.Any])
    
    inline def setWebInstanceUndefined: Self = StObject.set(x, "webInstance", js.undefined)
  }
}
