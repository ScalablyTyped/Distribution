package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upload extends StObject {
  
  /** Account Id to which this upload belongs. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Custom data source Id to which this data import belongs. */
  var customDataSourceId: js.UndefOr[String] = js.native
  
  /** Data import errors collection. */
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  /** A unique ID for this upload. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource type for Analytics upload. */
  var kind: js.UndefOr[String] = js.native
  
  /** Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING, DELETED. */
  var status: js.UndefOr[String] = js.native
  
  /** Time this file is uploaded. */
  var uploadTime: js.UndefOr[String] = js.native
}
object Upload {
  
  @scala.inline
  def apply(): Upload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upload]
  }
  
  @scala.inline
  implicit class UploadMutableBuilder[Self <: Upload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataSourceIdUndefined: Self = StObject.set(x, "customDataSourceId", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUploadTime(value: String): Self = StObject.set(x, "uploadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTimeUndefined: Self = StObject.set(x, "uploadTime", js.undefined)
  }
}
