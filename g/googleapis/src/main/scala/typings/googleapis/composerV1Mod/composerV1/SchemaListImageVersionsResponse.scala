package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListImageVersionsResponse extends StObject {
  
  /**
    * The list of supported ImageVersions in a location.
    */
  var imageVersions: js.UndefOr[js.Array[SchemaImageVersion]] = js.undefined
  
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListImageVersionsResponse {
  
  inline def apply(): SchemaListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListImageVersionsResponse]
  }
  
  extension [Self <: SchemaListImageVersionsResponse](x: Self) {
    
    inline def setImageVersions(value: js.Array[SchemaImageVersion]): Self = StObject.set(x, "imageVersions", value.asInstanceOf[js.Any])
    
    inline def setImageVersionsUndefined: Self = StObject.set(x, "imageVersions", js.undefined)
    
    inline def setImageVersionsVarargs(value: SchemaImageVersion*): Self = StObject.set(x, "imageVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
