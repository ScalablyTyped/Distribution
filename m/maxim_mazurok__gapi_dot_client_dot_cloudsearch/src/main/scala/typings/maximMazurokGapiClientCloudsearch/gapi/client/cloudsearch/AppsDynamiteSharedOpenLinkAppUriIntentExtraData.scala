package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedOpenLinkAppUriIntentExtraData extends StObject {
  
  /** A key for the intent extra data. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Value for the given extra data key. */
  var value: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedOpenLinkAppUriIntentExtraData {
  
  inline def apply(): AppsDynamiteSharedOpenLinkAppUriIntentExtraData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedOpenLinkAppUriIntentExtraData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedOpenLinkAppUriIntentExtraData] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
