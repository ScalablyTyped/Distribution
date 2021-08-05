package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobList extends StObject {
  
  /** A hash of this page of results. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** List of jobs that were requested. */
  var jobs: js.UndefOr[js.Array[Configuration]] = js.undefined
  
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object JobList {
  
  inline def apply(): JobList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobList]
  }
  
  extension [Self <: JobList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setJobs(value: js.Array[Configuration]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Configuration*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
