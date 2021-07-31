package typings.googleapis.testingV1Mod.testingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Resource$Projects$Testmatrices")
@js.native
class ResourceProjectsTestmatrices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * testing.projects.testMatrices.cancel
    * @desc Cancels unfinished test executions in a test matrix. This call
    * returns immediately and cancellation proceeds asychronously. If the
    * matrix is already final, this operation will have no effect.  May return
    * any of the following canonical error codes:  - PERMISSION_DENIED - if the
    * user is not authorized to read project - INVALID_ARGUMENT - if the
    * request is malformed - NOT_FOUND - if the Test Matrix does not exist
    * @alias testing.projects.testMatrices.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Cloud project that owns the test.
    * @param {string} params.testMatrixId Test matrix that will be canceled.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(callback: BodyResponseCallback[SchemaCancelTestMatrixResponse]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(params: ParamsResourceProjectsTestmatricesCancel): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(
    params: ParamsResourceProjectsTestmatricesCancel,
    callback: BodyResponseCallback[SchemaCancelTestMatrixResponse]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsTestmatricesCancel,
    options: BodyResponseCallback[SchemaCancelTestMatrixResponse],
    callback: BodyResponseCallback[SchemaCancelTestMatrixResponse]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsTestmatricesCancel, options: MethodOptions): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(
    params: ParamsResourceProjectsTestmatricesCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCancelTestMatrixResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * testing.projects.testMatrices.create
    * @desc Creates and runs a matrix of tests according to the given
    * specifications. Unsupported environments will be returned in the state
    * UNSUPPORTED. Matrices are limited to at most 200 supported executions.
    * May return any of the following canonical error codes:  -
    * PERMISSION_DENIED - if the user is not authorized to write to project -
    * INVALID_ARGUMENT - if the request is malformed or if the matrix expands
    * to more than 200 supported executions
    * @alias testing.projects.testMatrices.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The GCE project under which this job will run.
    * @param {string=} params.requestId A string id used to detect duplicated requests. Ids are automatically scoped to a project, so users should ensure the ID is unique per-project. A UUID is recommended.  Optional, but strongly recommended.
    * @param {().TestMatrix} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(params: ParamsResourceProjectsTestmatricesCreate): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(params: ParamsResourceProjectsTestmatricesCreate, callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTestmatricesCreate,
    options: BodyResponseCallback[SchemaTestMatrix],
    callback: BodyResponseCallback[SchemaTestMatrix]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTestmatricesCreate, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(
    params: ParamsResourceProjectsTestmatricesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestMatrix]
  ): Unit = js.native
  
  /**
    * testing.projects.testMatrices.get
    * @desc Checks the status of a test matrix.  May return any of the
    * following canonical error codes:  - PERMISSION_DENIED - if the user is
    * not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the Test Matrix does not exist
    * @alias testing.projects.testMatrices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Cloud project that owns the test matrix.
    * @param {string} params.testMatrixId Unique test matrix id which was assigned by the service.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(params: ParamsResourceProjectsTestmatricesGet): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(params: ParamsResourceProjectsTestmatricesGet, callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTestmatricesGet,
    options: BodyResponseCallback[SchemaTestMatrix],
    callback: BodyResponseCallback[SchemaTestMatrix]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTestmatricesGet, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(
    params: ParamsResourceProjectsTestmatricesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestMatrix]
  ): Unit = js.native
}
