package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a turn-based match creation request.
  */
trait SchemaTurnBasedMatchCreateRequest extends StObject {
  
  /**
    * Criteria for auto-matching players into this match.
    */
  var autoMatchingCriteria: js.UndefOr[SchemaTurnBasedAutoMatchingCriteria] = js.undefined
  
  /**
    * The player ids to invite to the match.
    */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchCreateRequest.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A randomly generated numeric ID. This number is used at the server to
    * ensure that the request is handled correctly across retries.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * The variant / mode of the application to be played. This can be any
    * integer value, or left blank. You should use a small number of variants
    * to keep the auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.undefined
}
object SchemaTurnBasedMatchCreateRequest {
  
  inline def apply(): SchemaTurnBasedMatchCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchCreateRequest]
  }
  
  extension [Self <: SchemaTurnBasedMatchCreateRequest](x: Self) {
    
    inline def setAutoMatchingCriteria(value: SchemaTurnBasedAutoMatchingCriteria): Self = StObject.set(x, "autoMatchingCriteria", value.asInstanceOf[js.Any])
    
    inline def setAutoMatchingCriteriaUndefined: Self = StObject.set(x, "autoMatchingCriteria", js.undefined)
    
    inline def setInvitedPlayerIds(value: js.Array[String]): Self = StObject.set(x, "invitedPlayerIds", value.asInstanceOf[js.Any])
    
    inline def setInvitedPlayerIdsUndefined: Self = StObject.set(x, "invitedPlayerIds", js.undefined)
    
    inline def setInvitedPlayerIdsVarargs(value: String*): Self = StObject.set(x, "invitedPlayerIds", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
