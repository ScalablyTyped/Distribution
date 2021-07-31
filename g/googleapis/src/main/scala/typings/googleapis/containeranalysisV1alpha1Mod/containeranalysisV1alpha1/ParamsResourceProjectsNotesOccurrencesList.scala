package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotesOccurrencesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The filter expression.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The name field will contain the note name for example:
    * "provider/{provider_id}/notes/{note_id}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Number of notes to return in the list.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsNotesOccurrencesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsNotesOccurrencesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotesOccurrencesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsNotesOccurrencesListMutableBuilder[Self <: ParamsResourceProjectsNotesOccurrencesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
