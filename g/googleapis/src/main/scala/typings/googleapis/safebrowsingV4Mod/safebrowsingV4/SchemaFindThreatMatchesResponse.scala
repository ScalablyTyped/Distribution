package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFindThreatMatchesResponse extends StObject {
  
  /**
    * The threat list matches.
    */
  var matches: js.UndefOr[js.Array[SchemaThreatMatch]] = js.native
}
object SchemaFindThreatMatchesResponse {
  
  @scala.inline
  def apply(): SchemaFindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindThreatMatchesResponse]
  }
  
  @scala.inline
  implicit class SchemaFindThreatMatchesResponseMutableBuilder[Self <: SchemaFindThreatMatchesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: js.Array[SchemaThreatMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: SchemaThreatMatch*): Self = StObject.set(x, "matches", js.Array(value :_*))
  }
}
