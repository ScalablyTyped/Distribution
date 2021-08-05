package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a turn-based match results object.
  */
trait SchemaTurnBasedMatchResults extends StObject {
  
  /**
    * The final match data.
    */
  var data: js.UndefOr[SchemaTurnBasedMatchDataRequest] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchResults.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the match being updated.
    */
  var matchVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * The match results for the participants in the match.
    */
  var results: js.UndefOr[js.Array[SchemaParticipantResult]] = js.undefined
}
object SchemaTurnBasedMatchResults {
  
  inline def apply(): SchemaTurnBasedMatchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchResults]
  }
  
  extension [Self <: SchemaTurnBasedMatchResults](x: Self) {
    
    inline def setData(value: SchemaTurnBasedMatchDataRequest): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatchVersion(value: Double): Self = StObject.set(x, "matchVersion", value.asInstanceOf[js.Any])
    
    inline def setMatchVersionUndefined: Self = StObject.set(x, "matchVersion", js.undefined)
    
    inline def setResults(value: js.Array[SchemaParticipantResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaParticipantResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
