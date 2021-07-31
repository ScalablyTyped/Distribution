package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Managedzones")
@js.native
class ResourceManagedzones protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.managedZones.create
    * @alias dns.managedZones.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaManagedZone] = js.native
  def create(callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def create(params: ParamsResourceManagedzonesCreate): GaxiosPromise[SchemaManagedZone] = js.native
  def create(params: ParamsResourceManagedzonesCreate, callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def create(
    params: ParamsResourceManagedzonesCreate,
    options: BodyResponseCallback[SchemaManagedZone],
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  def create(params: ParamsResourceManagedzonesCreate, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def create(
    params: ParamsResourceManagedzonesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  
  /**
    * dns.managedZones.delete
    * @alias dns.managedZones.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedzonesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedzonesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagedzonesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagedzonesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagedzonesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * dns.managedZones.get
    * @alias dns.managedZones.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaManagedZone] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def get(params: ParamsResourceManagedzonesGet): GaxiosPromise[SchemaManagedZone] = js.native
  def get(params: ParamsResourceManagedzonesGet, callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def get(
    params: ParamsResourceManagedzonesGet,
    options: BodyResponseCallback[SchemaManagedZone],
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  def get(params: ParamsResourceManagedzonesGet, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def get(
    params: ParamsResourceManagedzonesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  
  /**
    * dns.managedZones.list
    * @alias dns.managedZones.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dnsName
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedZonesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(params: ParamsResourceManagedzonesList): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    options: BodyResponseCallback[SchemaManagedZonesListResponse],
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedzonesList, options: MethodOptions): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  
  /**
    * dns.managedZones.patch
    * @alias dns.managedZones.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceManagedzonesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceManagedzonesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceManagedzonesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceManagedzonesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceManagedzonesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * dns.managedZones.update
    * @alias dns.managedZones.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceManagedzonesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceManagedzonesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceManagedzonesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceManagedzonesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceManagedzonesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
