package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupItemResource extends StObject {
  
  /**
    * The channel, video, playlist, or asset ID that YouTube uses to uniquely identify the item that is being added to the group.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the type of resource being added to the group. Valid values for this property are: * `youtube#channel` * `youtube#playlist` * `youtube#video` * `youtubePartner#asset`
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupItemResource {
  
  inline def apply(): SchemaGroupItemResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItemResource]
  }
  
  extension [Self <: SchemaGroupItemResource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
