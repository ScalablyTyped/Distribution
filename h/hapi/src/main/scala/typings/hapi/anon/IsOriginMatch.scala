package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOriginMatch extends StObject {
  
  /**
    * true if the request 'Origin' header matches the configured CORS restrictions. Set to false if no 'Origin' header is found or if it does not match. Note that this is only available after
    * the 'onRequest' extension point as CORS is configured per-route and no routing decisions are made at that point in the request lifecycle.
    */
  var isOriginMatch: js.UndefOr[Boolean] = js.undefined
}
object IsOriginMatch {
  
  @scala.inline
  def apply(): IsOriginMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOriginMatch]
  }
  
  @scala.inline
  implicit class IsOriginMatchMutableBuilder[Self <: IsOriginMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOriginMatch(value: Boolean): Self = StObject.set(x, "isOriginMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOriginMatchUndefined: Self = StObject.set(x, "isOriginMatch", js.undefined)
  }
}
