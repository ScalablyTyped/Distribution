package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHiddenPlayer extends StObject {
  
  /**
    * Output only. The time this player was hidden.
    */
  var hiddenTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#hiddenPlayer`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The player information.
    */
  var player: js.UndefOr[SchemaPlayer] = js.undefined
}
object SchemaHiddenPlayer {
  
  inline def apply(): SchemaHiddenPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiddenPlayer]
  }
  
  extension [Self <: SchemaHiddenPlayer](x: Self) {
    
    inline def setHiddenTimeMillis(value: String): Self = StObject.set(x, "hiddenTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setHiddenTimeMillisNull: Self = StObject.set(x, "hiddenTimeMillis", null)
    
    inline def setHiddenTimeMillisUndefined: Self = StObject.set(x, "hiddenTimeMillis", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlayer(value: SchemaPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
