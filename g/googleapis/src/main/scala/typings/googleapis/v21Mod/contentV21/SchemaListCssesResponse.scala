package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCssesResponse extends StObject {
  
  /**
    * The CSS domains affiliated with the specified CSS group.
    */
  var csses: js.UndefOr[js.Array[SchemaCss]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCssesResponse {
  
  inline def apply(): SchemaListCssesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCssesResponse]
  }
  
  extension [Self <: SchemaListCssesResponse](x: Self) {
    
    inline def setCsses(value: js.Array[SchemaCss]): Self = StObject.set(x, "csses", value.asInstanceOf[js.Any])
    
    inline def setCssesUndefined: Self = StObject.set(x, "csses", js.undefined)
    
    inline def setCssesVarargs(value: SchemaCss*): Self = StObject.set(x, "csses", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
