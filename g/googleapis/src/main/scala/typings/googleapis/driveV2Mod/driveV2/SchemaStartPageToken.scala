package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartPageToken extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting page token for listing changes.
    */
  var startPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaStartPageToken {
  
  inline def apply(): SchemaStartPageToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartPageToken]
  }
  
  extension [Self <: SchemaStartPageToken](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartPageToken(value: String): Self = StObject.set(x, "startPageToken", value.asInstanceOf[js.Any])
    
    inline def setStartPageTokenNull: Self = StObject.set(x, "startPageToken", null)
    
    inline def setStartPageTokenUndefined: Self = StObject.set(x, "startPageToken", js.undefined)
  }
}
