package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListReposResponse extends StObject {
  
  /**
    * If non-empty, additional repositories exist within the project. These can be retrieved by including this value in the next ListReposRequest's page_token field.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The listed repos.
    */
  var repos: js.UndefOr[js.Array[SchemaRepo]] = js.undefined
}
object SchemaListReposResponse {
  
  inline def apply(): SchemaListReposResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReposResponse]
  }
  
  extension [Self <: SchemaListReposResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepos(value: js.Array[SchemaRepo]): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setReposUndefined: Self = StObject.set(x, "repos", js.undefined)
    
    inline def setReposVarargs(value: SchemaRepo*): Self = StObject.set(x, "repos", js.Array(value*))
  }
}
