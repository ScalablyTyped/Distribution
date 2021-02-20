package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListRepos.  The size is not set in the returned repositories.
  */
@js.native
trait SchemaListReposResponse extends StObject {
  
  /**
    * If non-empty, additional repositories exist within the project. These can
    * be retrieved by including this value in the next ListReposRequest&#39;s
    * page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The listed repos.
    */
  var repos: js.UndefOr[js.Array[SchemaRepo]] = js.native
}
object SchemaListReposResponse {
  
  @scala.inline
  def apply(): SchemaListReposResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReposResponse]
  }
  
  @scala.inline
  implicit class SchemaListReposResponseMutableBuilder[Self <: SchemaListReposResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRepos(value: js.Array[SchemaRepo]): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReposUndefined: Self = StObject.set(x, "repos", js.undefined)
    
    @scala.inline
    def setReposVarargs(value: SchemaRepo*): Self = StObject.set(x, "repos", js.Array(value :_*))
  }
}
