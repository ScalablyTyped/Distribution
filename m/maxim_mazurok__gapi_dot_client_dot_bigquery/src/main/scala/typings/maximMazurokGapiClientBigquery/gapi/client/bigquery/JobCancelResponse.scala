package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobCancelResponse extends StObject {
  
  /** The final state of the job. */
  var job: js.UndefOr[Job] = js.native
  
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.native
}
object JobCancelResponse {
  
  @scala.inline
  def apply(): JobCancelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobCancelResponse]
  }
  
  @scala.inline
  implicit class JobCancelResponseMutableBuilder[Self <: JobCancelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
