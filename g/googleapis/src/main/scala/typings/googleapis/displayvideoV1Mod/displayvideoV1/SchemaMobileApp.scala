package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileApp extends StObject {
  
  /**
    * Required. The ID of the app provided by the platform store. Android apps are identified by the bundle ID used by Android's Play store, such as `com.google.android.gm`. iOS apps are identified by a nine-digit app ID used by Apple's App store, such as `422689480`.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The app name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The app platform.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The app publisher.
    */
  var publisher: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileApp {
  
  inline def apply(): SchemaMobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApp]
  }
  
  extension [Self <: SchemaMobileApp](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
  }
}
