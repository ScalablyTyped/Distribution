package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateFootnoteResponse extends StObject {
  
  /**
    * The ID of the created footnote.
    */
  var footnoteId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateFootnoteResponse {
  
  inline def apply(): SchemaCreateFootnoteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateFootnoteResponse]
  }
  
  extension [Self <: SchemaCreateFootnoteResponse](x: Self) {
    
    inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIdNull: Self = StObject.set(x, "footnoteId", null)
    
    inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
  }
}
