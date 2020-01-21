package typings.googleapis.testingV1Mod.testingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Resource$Testenvironmentcatalog")
@js.native
class ResourceTestenvironmentcatalog protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * testing.testEnvironmentCatalog.get
    * @desc Gets the catalog of supported test environments.  May return any of
    * the following canonical error codes:  - INVALID_ARGUMENT - if the request
    * is malformed - NOT_FOUND - if the environment type does not exist -
    * INTERNAL - if an internal error occurred
    * @alias testing.testEnvironmentCatalog.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.environmentType Required. The type of environment that should be listed.
    * @param {string=} params.projectId For authorization, the cloud project requesting the TestEnvironmentCatalog.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTestEnvironmentCatalog] = js.native
  def get(callback: BodyResponseCallback[SchemaTestEnvironmentCatalog]): Unit = js.native
  def get(params: ParamsResourceTestenvironmentcatalogGet): GaxiosPromise[SchemaTestEnvironmentCatalog] = js.native
  def get(
    params: ParamsResourceTestenvironmentcatalogGet,
    callback: BodyResponseCallback[SchemaTestEnvironmentCatalog]
  ): Unit = js.native
  def get(
    params: ParamsResourceTestenvironmentcatalogGet,
    options: BodyResponseCallback[SchemaTestEnvironmentCatalog],
    callback: BodyResponseCallback[SchemaTestEnvironmentCatalog]
  ): Unit = js.native
  def get(params: ParamsResourceTestenvironmentcatalogGet, options: MethodOptions): GaxiosPromise[SchemaTestEnvironmentCatalog] = js.native
  def get(
    params: ParamsResourceTestenvironmentcatalogGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestEnvironmentCatalog]
  ): Unit = js.native
}

