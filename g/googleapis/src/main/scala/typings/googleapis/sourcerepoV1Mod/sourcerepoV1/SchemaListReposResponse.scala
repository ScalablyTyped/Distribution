package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListRepos.  The size is not set in the returned repositories.
  */
@js.native
trait SchemaListReposResponse extends js.Object {
  
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
  implicit class SchemaListReposResponseOps[Self <: SchemaListReposResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setReposVarargs(value: SchemaRepo*): Self = this.set("repos", js.Array(value :_*))
    
    @scala.inline
    def setRepos(value: js.Array[SchemaRepo]): Self = this.set("repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepos: Self = this.set("repos", js.undefined)
  }
}
