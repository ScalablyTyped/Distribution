package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReactionInfo extends StObject {
  
  /**
    * Unicode string representing a single emoji.
    */
  var emoji: js.UndefOr[String | Null] = js.undefined
}
object SchemaReactionInfo {
  
  inline def apply(): SchemaReactionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReactionInfo]
  }
  
  extension [Self <: SchemaReactionInfo](x: Self) {
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiNull: Self = StObject.set(x, "emoji", null)
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}
