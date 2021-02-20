package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFindFullHashesResponse extends StObject {
  
  /**
    * The full hashes that matched the requested prefixes.
    */
  var matches: js.UndefOr[js.Array[SchemaThreatMatch]] = js.native
  
  /**
    * The minimum duration the client must wait before issuing any find hashes
    * request. If this field is not set, clients can issue a request as soon as
    * they want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
  
  /**
    * For requested entities that did not match the threat list, how long to
    * cache the response.
    */
  var negativeCacheDuration: js.UndefOr[String] = js.native
}
object SchemaFindFullHashesResponse {
  
  @scala.inline
  def apply(): SchemaFindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindFullHashesResponse]
  }
  
  @scala.inline
  implicit class SchemaFindFullHashesResponseMutableBuilder[Self <: SchemaFindFullHashesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: js.Array[SchemaThreatMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: SchemaThreatMatch*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
    
    @scala.inline
    def setNegativeCacheDuration(value: String): Self = StObject.set(x, "negativeCacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeCacheDurationUndefined: Self = StObject.set(x, "negativeCacheDuration", js.undefined)
  }
}
