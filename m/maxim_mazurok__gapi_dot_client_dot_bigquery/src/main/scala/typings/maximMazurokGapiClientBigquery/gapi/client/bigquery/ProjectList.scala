package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.FriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectList extends js.Object {
  
  /** A hash of the page of results */
  var etag: js.UndefOr[String] = js.native
  
  /** The type of list. */
  var kind: js.UndefOr[String] = js.native
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Projects to which you have at least READ access. */
  var projects: js.UndefOr[js.Array[FriendlyName]] = js.native
  
  /** The total number of projects in the list. */
  var totalItems: js.UndefOr[Double] = js.native
}
object ProjectList {
  
  @scala.inline
  def apply(): ProjectList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectList]
  }
  
  @scala.inline
  implicit class ProjectListOps[Self <: ProjectList] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: FriendlyName*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[FriendlyName]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}
