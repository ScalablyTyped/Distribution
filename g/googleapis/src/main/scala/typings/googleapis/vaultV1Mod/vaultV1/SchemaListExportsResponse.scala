package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListExportsResponse extends StObject {
  
  /**
    * The list of exports.
    */
  var exports: js.UndefOr[js.Array[SchemaExport]] = js.undefined
  
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListExportsResponse {
  
  inline def apply(): SchemaListExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExportsResponse]
  }
  
  extension [Self <: SchemaListExportsResponse](x: Self) {
    
    inline def setExports(value: js.Array[SchemaExport]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: SchemaExport*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
