package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of leaderboard reset resources.
  */
trait SchemaPlayerScoreResetAllResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#playerScoreResetResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The leaderboard reset results.
    */
  var results: js.UndefOr[js.Array[SchemaPlayerScoreResetResponse]] = js.undefined
}
object SchemaPlayerScoreResetAllResponse {
  
  @scala.inline
  def apply(): SchemaPlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreResetAllResponse]
  }
  
  @scala.inline
  implicit class SchemaPlayerScoreResetAllResponseMutableBuilder[Self <: SchemaPlayerScoreResetAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaPlayerScoreResetResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaPlayerScoreResetResponse*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
