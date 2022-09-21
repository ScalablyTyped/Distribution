package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInsertInlineImageResponse extends StObject {
  
  /**
    * The ID of the created InlineObject.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaInsertInlineImageResponse {
  
  inline def apply(): SchemaInsertInlineImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertInlineImageResponse]
  }
  
  extension [Self <: SchemaInsertInlineImageResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
