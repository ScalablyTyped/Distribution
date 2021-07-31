package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datastore/v1beta1", "datastore_v1beta1.Resource$Projects")
@js.native
class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * datastore.projects.export
    * @desc Exports a copy of all or a subset of entities from Google Cloud
    * Datastore to another storage system, such as Google Cloud Storage. Recent
    * updates to entities may not be reflected in the export. The export occurs
    * in the background and its progress can be monitored and managed via the
    * Operation resource that is created. The output of an export may only be
    * used once the associated operation is done. If an export operation is
    * cancelled before completion it may leave partial data behind in Google
    * Cloud Storage.
    * @alias datastore.projects.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1beta1ExportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `export`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(params: ParamsResourceProjectsExport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsExport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsExport,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsExport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * datastore.projects.import
    * @desc Imports entities into Google Cloud Datastore. Existing entities with
    * the same key are overwritten. The import occurs in the background and its
    * progress can be monitored and managed via the Operation resource that is
    * created. If an ImportEntities operation is cancelled, it is possible that a
    * subset of the data has already been imported to Cloud Datastore.
    * @alias datastore.projects.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1beta1ImportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}
