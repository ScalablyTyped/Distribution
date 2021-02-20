package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobList extends StObject {
  
  /** A hash of this page of results. */
  var etag: js.UndefOr[String] = js.native
  
  /** List of jobs that were requested. */
  var jobs: js.UndefOr[js.Array[Configuration]] = js.native
  
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.native
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object JobList {
  
  @scala.inline
  def apply(): JobList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobList]
  }
  
  @scala.inline
  implicit class JobListMutableBuilder[Self <: JobList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setJobs(value: js.Array[Configuration]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Configuration*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
