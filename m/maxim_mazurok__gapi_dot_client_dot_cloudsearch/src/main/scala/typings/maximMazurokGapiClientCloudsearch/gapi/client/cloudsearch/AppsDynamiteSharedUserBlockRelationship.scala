package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedUserBlockRelationship extends StObject {
  
  var hasBlockedRequester: js.UndefOr[Boolean] = js.undefined
  
  var isBlockedByRequester: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteSharedUserBlockRelationship {
  
  inline def apply(): AppsDynamiteSharedUserBlockRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedUserBlockRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedUserBlockRelationship] (val x: Self) extends AnyVal {
    
    inline def setHasBlockedRequester(value: Boolean): Self = StObject.set(x, "hasBlockedRequester", value.asInstanceOf[js.Any])
    
    inline def setHasBlockedRequesterUndefined: Self = StObject.set(x, "hasBlockedRequester", js.undefined)
    
    inline def setIsBlockedByRequester(value: Boolean): Self = StObject.set(x, "isBlockedByRequester", value.asInstanceOf[js.Any])
    
    inline def setIsBlockedByRequesterUndefined: Self = StObject.set(x, "isBlockedByRequester", js.undefined)
  }
}
