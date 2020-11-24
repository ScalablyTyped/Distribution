package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site List Response
  */
@js.native
trait SchemaDirectorySitesListResponse extends js.Object {
  
  /**
    * Directory site collection.
    */
  var directorySites: js.UndefOr[js.Array[SchemaDirectorySite]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDirectorySitesListResponse {
  
  @scala.inline
  def apply(): SchemaDirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySitesListResponse]
  }
  
  @scala.inline
  implicit class SchemaDirectorySitesListResponseOps[Self <: SchemaDirectorySitesListResponse] (val x: Self) extends AnyVal {
    
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
    def setDirectorySitesVarargs(value: SchemaDirectorySite*): Self = this.set("directorySites", js.Array(value :_*))
    
    @scala.inline
    def setDirectorySites(value: js.Array[SchemaDirectorySite]): Self = this.set("directorySites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySites: Self = this.set("directorySites", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
