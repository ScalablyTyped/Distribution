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
  
  @scala.inline
  def apply(): SchemaInstanceIosDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceIosDetails]
  }
  
  @scala.inline
  implicit class SchemaInstanceIosDetailsMutableBuilder[Self <: SchemaInstanceIosDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleIdentifier(value: String): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
    
    @scala.inline
    def setItunesAppId(value: String): Self = StObject.set(x, "itunesAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItunesAppIdUndefined: Self = StObject.set(x, "itunesAppId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPreferredForIpad(value: Boolean): Self = StObject.set(x, "preferredForIpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredForIpadUndefined: Self = StObject.set(x, "preferredForIpad", js.undefined)
    
    @scala.inline
    def setPreferredForIphone(value: Boolean): Self = StObject.set(x, "preferredForIphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredForIphoneUndefined: Self = StObject.set(x, "preferredForIphone", js.undefined)
    
    @scala.inline
    def setSupportIpad(value: Boolean): Self = StObject.set(x, "supportIpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportIpadUndefined: Self = StObject.set(x, "supportIpad", js.undefined)
    
    @scala.inline
    def setSupportIphone(value: Boolean): Self = StObject.set(x, "supportIphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportIphoneUndefined: Self = StObject.set(x, "supportIphone", js.undefined)
  }
}
