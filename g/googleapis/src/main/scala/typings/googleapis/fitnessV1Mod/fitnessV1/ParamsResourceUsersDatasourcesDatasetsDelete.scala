package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersDatasourcesDatasetsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The client's current time in milliseconds since epoch.
    */
  var currentTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The data stream ID of the data source that created the dataset.
    */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Dataset identifier that is a composite of the minimum data point start
    * time and maximum data point end time represented as nanoseconds from the
    * epoch. The ID is formatted like: "startTime-endTime" where startTime and
    * endTime are 64 bit integers.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * When the operation was performed on the client.
    */
  var modifiedTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * Delete a dataset for the person identified. Use me to indicate the
    * authenticated user. Only me is supported at this time.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersDatasourcesDatasetsDelete {
  
  @scala.inline
  def apply(): ParamsResourceUsersDatasourcesDatasetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersDatasourcesDatasetsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersDatasourcesDatasetsDeleteMutableBuilder[Self <: ParamsResourceUsersDatasourcesDatasetsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCurrentTimeMillis(value: String): Self = StObject.set(x, "currentTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeMillisUndefined: Self = StObject.set(x, "currentTimeMillis", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setModifiedTimeMillis(value: String): Self = StObject.set(x, "modifiedTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeMillisUndefined: Self = StObject.set(x, "modifiedTimeMillis", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
