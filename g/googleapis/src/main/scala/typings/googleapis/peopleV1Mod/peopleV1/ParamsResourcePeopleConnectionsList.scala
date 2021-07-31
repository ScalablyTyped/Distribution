package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleConnectionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The number of connections to include in the response. Valid values are
    * between 1 and 2000, inclusive. Defaults to 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token of the page to be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * **Required.** A field mask to restrict which fields on each person are
    * returned. Multiple fields can be specified by separating them with
    * commas. Valid values are:  * addresses * ageRanges * biographies *
    * birthdays * braggingRights * coverPhotos * emailAddresses * events *
    * genders * imClients * interests * locales * memberships * metadata *
    * names * nicknames * occupations * organizations * phoneNumbers * photos *
    * relations * relationshipInterests * relationshipStatuses * residences *
    * sipAddresses * skills * taglines * urls * userDefined
    */
  var personFields: js.UndefOr[String] = js.undefined
  
  /**
    * **Required.** Comma-separated list of person fields to be included in the
    * response. Each path should start with `person.`: for example,
    * `person.names` or `person.photos`.
    */
  @JSName("requestMask.includeField")
  var requestMaskDotincludeField: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the response should include a sync token, which can be used to
    * get all changes since the last request. For subsequent sync requests use
    * the `sync_token` param instead. Initial sync requests that specify
    * `request_sync_token` have an additional rate limit.
    */
  var requestSyncToken: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource name to return connections for. Only `people/me` is valid.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The order in which the connections should be sorted. Defaults to
    * `LAST_MODIFIED_ASCENDING`.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
  
  /**
    * A sync token returned by a previous call to `people.connections.list`.
    * Only resources changed since the sync token was created will be returned.
    * Sync requests that specify `sync_token` have an additional rate limit.
    */
  var syncToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleConnectionsList {
  
  @scala.inline
  def apply(): ParamsResourcePeopleConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleConnectionsList]
  }
  
  @scala.inline
  implicit class ParamsResourcePeopleConnectionsListMutableBuilder[Self <: ParamsResourcePeopleConnectionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonFieldsUndefined: Self = StObject.set(x, "personFields", js.undefined)
    
    @scala.inline
    def setRequestMaskDotincludeField(value: String): Self = StObject.set(x, "requestMask.includeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMaskDotincludeFieldUndefined: Self = StObject.set(x, "requestMask.includeField", js.undefined)
    
    @scala.inline
    def setRequestSyncToken(value: Boolean): Self = StObject.set(x, "requestSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSyncTokenUndefined: Self = StObject.set(x, "requestSyncToken", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
  }
}
