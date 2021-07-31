package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Calendars")
@js.native
class ResourceResourcesCalendars protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.resources.calendars.delete
    * @desc Deletes a calendar resource.
    * @alias directory.resources.calendars.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to delete.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesCalendarsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesCalendarsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResourcesCalendarsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResourcesCalendarsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResourcesCalendarsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.resources.calendars.get
    * @desc Retrieves a calendar resource.
    * @alias directory.resources.calendars.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to retrieve.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(params: ParamsResourceResourcesCalendarsGet): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(
    params: ParamsResourceResourcesCalendarsGet,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def get(
    params: ParamsResourceResourcesCalendarsGet,
    options: BodyResponseCallback[SchemaCalendarResource],
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def get(params: ParamsResourceResourcesCalendarsGet, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(
    params: ParamsResourceResourcesCalendarsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  
  /**
    * directory.resources.calendars.insert
    * @desc Inserts a calendar resource.
    * @alias directory.resources.calendars.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().CalendarResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(params: ParamsResourceResourcesCalendarsInsert): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(
    params: ParamsResourceResourcesCalendarsInsert,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def insert(
    params: ParamsResourceResourcesCalendarsInsert,
    options: BodyResponseCallback[SchemaCalendarResource],
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def insert(params: ParamsResourceResourcesCalendarsInsert, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(
    params: ParamsResourceResourcesCalendarsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  
  /**
    * directory.resources.calendars.list
    * @desc Retrieves a list of calendar resources for an account.
    * @alias directory.resources.calendars.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.orderBy Field(s) to sort results by in either ascending or descending order. Supported fields include resourceId, resourceName, capacity, buildingId, and floorName. If no order is specified, defaults to ascending. Should be of the form "field [asc|desc], field [asc|desc], ...". For example buildingId, capacity desc would return results sorted first by buildingId in ascending order then by capacity in descending order.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {string=} params.query String query used to filter results. Should be of the form "field operator value" where field can be any of supported fields and operators can be any of supported operations. Operators include '=' for exact match and ':' for prefix match or HAS match where applicable. For prefix match, the value should always be followed by a *. Supported fields include generatedResourceName, name, buildingId, featureInstances.feature.name. For example buildingId=US-NYC-9TH AND featureInstances.feature.name:Phone.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(callback: BodyResponseCallback[SchemaCalendarResources]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(params: ParamsResourceResourcesCalendarsList): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(
    params: ParamsResourceResourcesCalendarsList,
    callback: BodyResponseCallback[SchemaCalendarResources]
  ): Unit = js.native
  def list(
    params: ParamsResourceResourcesCalendarsList,
    options: BodyResponseCallback[SchemaCalendarResources],
    callback: BodyResponseCallback[SchemaCalendarResources]
  ): Unit = js.native
  def list(params: ParamsResourceResourcesCalendarsList, options: MethodOptions): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(
    params: ParamsResourceResourcesCalendarsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResources]
  ): Unit = js.native
  
  /**
    * directory.resources.calendars.patch
    * @desc Updates a calendar resource.  This method supports patch semantics,
    * meaning you only need to include the fields you wish to update. Fields
    * that are not present in the request will be preserved. This method
    * supports patch semantics.
    * @alias directory.resources.calendars.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to update.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().CalendarResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(params: ParamsResourceResourcesCalendarsPatch): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(
    params: ParamsResourceResourcesCalendarsPatch,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def patch(
    params: ParamsResourceResourcesCalendarsPatch,
    options: BodyResponseCallback[SchemaCalendarResource],
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def patch(params: ParamsResourceResourcesCalendarsPatch, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(
    params: ParamsResourceResourcesCalendarsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  
  /**
    * directory.resources.calendars.update
    * @desc Updates a calendar resource.  This method supports patch semantics,
    * meaning you only need to include the fields you wish to update. Fields
    * that are not present in the request will be preserved.
    * @alias directory.resources.calendars.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to update.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().CalendarResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(params: ParamsResourceResourcesCalendarsUpdate): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(
    params: ParamsResourceResourcesCalendarsUpdate,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def update(
    params: ParamsResourceResourcesCalendarsUpdate,
    options: BodyResponseCallback[SchemaCalendarResource],
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def update(params: ParamsResourceResourcesCalendarsUpdate, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(
    params: ParamsResourceResourcesCalendarsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
}
