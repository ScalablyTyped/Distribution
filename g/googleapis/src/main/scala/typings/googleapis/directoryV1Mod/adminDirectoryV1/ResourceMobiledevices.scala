package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Mobiledevices")
@js.native
class ResourceMobiledevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * directory.mobiledevices.action
    * @desc Take action on Mobile Device
    * @alias directory.mobiledevices.action
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.resourceId Immutable ID of Mobile Device
    * @param {().MobileDeviceAction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def action(): GaxiosPromise[Unit] = js.native
  def action(callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceMobiledevicesAction): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceMobiledevicesAction, callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(
    params: ParamsResourceMobiledevicesAction,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def action(params: ParamsResourceMobiledevicesAction, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(
    params: ParamsResourceMobiledevicesAction,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.mobiledevices.delete
    * @desc Delete Mobile Device
    * @alias directory.mobiledevices.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.resourceId Immutable ID of Mobile Device
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMobiledevicesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMobiledevicesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceMobiledevicesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceMobiledevicesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceMobiledevicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.mobiledevices.get
    * @desc Retrieve Mobile Device
    * @alias directory.mobiledevices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string} params.resourceId Immutable ID of Mobile Device
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaMobileDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(params: ParamsResourceMobiledevicesGet): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(params: ParamsResourceMobiledevicesGet, callback: BodyResponseCallback[SchemaMobileDevice]): Unit = js.native
  def get(
    params: ParamsResourceMobiledevicesGet,
    options: BodyResponseCallback[SchemaMobileDevice],
    callback: BodyResponseCallback[SchemaMobileDevice]
  ): Unit = js.native
  def get(params: ParamsResourceMobiledevicesGet, options: MethodOptions): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(
    params: ParamsResourceMobiledevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileDevice]
  ): Unit = js.native
  
  /**
    * directory.mobiledevices.list
    * @desc Retrieve all Mobile Devices of a customer (paginated)
    * @alias directory.mobiledevices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string=} params.query Search string in the format given at http://support.google.com/a/bin/answer.py?answer=1408863#search
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order. Only of use when orderBy is also used
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(callback: BodyResponseCallback[SchemaMobileDevices]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(params: ParamsResourceMobiledevicesList): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(params: ParamsResourceMobiledevicesList, callback: BodyResponseCallback[SchemaMobileDevices]): Unit = js.native
  def list(
    params: ParamsResourceMobiledevicesList,
    options: BodyResponseCallback[SchemaMobileDevices],
    callback: BodyResponseCallback[SchemaMobileDevices]
  ): Unit = js.native
  def list(params: ParamsResourceMobiledevicesList, options: MethodOptions): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(
    params: ParamsResourceMobiledevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileDevices]
  ): Unit = js.native
}
