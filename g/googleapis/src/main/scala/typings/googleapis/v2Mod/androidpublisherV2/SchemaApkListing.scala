package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApkListing extends StObject {
  
  /**
    * The language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Describe what&#39;s new in your APK.
    */
  var recentChanges: js.UndefOr[String] = js.undefined
}
object SchemaApkListing {
  
  inline def apply(): SchemaApkListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkListing]
  }
  
  extension [Self <: SchemaApkListing](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRecentChanges(value: String): Self = StObject.set(x, "recentChanges", value.asInstanceOf[js.Any])
    
    inline def setRecentChangesUndefined: Self = StObject.set(x, "recentChanges", js.undefined)
  }
}
