package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the iOS details resource.
  */
trait SchemaInstanceIosDetails extends StObject {
  
  /**
    * Bundle identifier.
    */
  var bundleIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * iTunes App ID.
    */
  var itunesAppId: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceIosDetails.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that this instance is the default for new installations on iPad
    * devices.
    */
  var preferredForIpad: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that this instance is the default for new installations on
    * iPhone devices.
    */
  var preferredForIphone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag to indicate if this instance supports iPad.
    */
  var supportIpad: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag to indicate if this instance supports iPhone.
    */
  var supportIphone: js.UndefOr[Boolean] = js.undefined
}
object SchemaInstanceIosDetails {
  
  inline def apply(): SchemaInstanceIosDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceIosDetails]
  }
  
  extension [Self <: SchemaInstanceIosDetails](x: Self) {
    
    inline def setBundleIdentifier(value: String): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
    
    inline def setItunesAppId(value: String): Self = StObject.set(x, "itunesAppId", value.asInstanceOf[js.Any])
    
    inline def setItunesAppIdUndefined: Self = StObject.set(x, "itunesAppId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPreferredForIpad(value: Boolean): Self = StObject.set(x, "preferredForIpad", value.asInstanceOf[js.Any])
    
    inline def setPreferredForIpadUndefined: Self = StObject.set(x, "preferredForIpad", js.undefined)
    
    inline def setPreferredForIphone(value: Boolean): Self = StObject.set(x, "preferredForIphone", value.asInstanceOf[js.Any])
    
    inline def setPreferredForIphoneUndefined: Self = StObject.set(x, "preferredForIphone", js.undefined)
    
    inline def setSupportIpad(value: Boolean): Self = StObject.set(x, "supportIpad", value.asInstanceOf[js.Any])
    
    inline def setSupportIpadUndefined: Self = StObject.set(x, "supportIpad", js.undefined)
    
    inline def setSupportIphone(value: Boolean): Self = StObject.set(x, "supportIphone", value.asInstanceOf[js.Any])
    
    inline def setSupportIphoneUndefined: Self = StObject.set(x, "supportIphone", js.undefined)
  }
}
