package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. The ID of the app. Android's Play store app uses bundle ID, for example `com.google.android.gm`. Apple's App store app ID uses 9 digit string, for example `422689480`.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the platform of the targeted app. If this field is not specified, the app platform will be assumed to be mobile (i.e., Android or iOS), and we will derive the appropriate mobile platform from the app ID.
    */
  var appPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The display name of the app.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if this option is being negatively targeted.
    */
  var negative: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAppAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaAppAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAppAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppPlatform(value: String): Self = StObject.set(x, "appPlatform", value.asInstanceOf[js.Any])
    
    inline def setAppPlatformNull: Self = StObject.set(x, "appPlatform", null)
    
    inline def setAppPlatformUndefined: Self = StObject.set(x, "appPlatform", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeNull: Self = StObject.set(x, "negative", null)
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
