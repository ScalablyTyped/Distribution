package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a third party application verification response
  * resource.
  */
trait SchemaApplicationVerifyResponse extends StObject {
  
  /**
    * An alternate ID that was once used for the player that was issued the
    * auth token used in this request. (This field is not normally populated.)
    */
  var alternate_player_id: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#applicationVerifyResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the player that was issued the auth token used in this request.
    */
  var player_id: js.UndefOr[String] = js.undefined
}
object SchemaApplicationVerifyResponse {
  
  @scala.inline
  def apply(): SchemaApplicationVerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationVerifyResponse]
  }
  
  @scala.inline
  implicit class SchemaApplicationVerifyResponseMutableBuilder[Self <: SchemaApplicationVerifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate_player_id(value: String): Self = StObject.set(x, "alternate_player_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate_player_idUndefined: Self = StObject.set(x, "alternate_player_id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayer_id(value: String): Self = StObject.set(x, "player_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer_idUndefined: Self = StObject.set(x, "player_id", js.undefined)
  }
}
