package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedOpenLinkAppUri extends StObject {
  
  /** An intent object to be opened in the corresponding android hosting app. */
  var androidIntent: js.UndefOr[AppsDynamiteSharedOpenLinkAppUriIntent] = js.undefined
  
  /** A companion uri string to be opened in the chat companion window. on the web. */
  var companionUri: js.UndefOr[String] = js.undefined
  
  /** A uri string to be opened in the corresponding iOS hosting app. */
  var iosUri: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedOpenLinkAppUri {
  
  inline def apply(): AppsDynamiteSharedOpenLinkAppUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedOpenLinkAppUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedOpenLinkAppUri] (val x: Self) extends AnyVal {
    
    inline def setAndroidIntent(value: AppsDynamiteSharedOpenLinkAppUriIntent): Self = StObject.set(x, "androidIntent", value.asInstanceOf[js.Any])
    
    inline def setAndroidIntentUndefined: Self = StObject.set(x, "androidIntent", js.undefined)
    
    inline def setCompanionUri(value: String): Self = StObject.set(x, "companionUri", value.asInstanceOf[js.Any])
    
    inline def setCompanionUriUndefined: Self = StObject.set(x, "companionUri", js.undefined)
    
    inline def setIosUri(value: String): Self = StObject.set(x, "iosUri", value.asInstanceOf[js.Any])
    
    inline def setIosUriUndefined: Self = StObject.set(x, "iosUri", js.undefined)
  }
}
