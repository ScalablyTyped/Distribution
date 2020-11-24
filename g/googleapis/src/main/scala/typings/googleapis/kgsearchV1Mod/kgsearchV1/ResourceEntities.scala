package typings.googleapis.kgsearchV1Mod.kgsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/kgsearch/v1", "kgsearch_v1.Resource$Entities")
@js.native
class ResourceEntities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * kgsearch.entities.search
    * @desc Searches Knowledge Graph for entities that match the constraints. A
    * list of matched entities will be returned in response, which will be in
    * JSON-LD format and compatible with http://schema.org
    * @alias kgsearch.entities.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids The list of entity id to be used for search instead of query string. To specify multiple ids in the HTTP request, repeat the parameter in the URL as in ...?ids=A&ids=B
    * @param {boolean=} params.indent Enables indenting of json results.
    * @param {string=} params.languages The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
    * @param {integer=} params.limit Limits the number of entities to be returned.
    * @param {boolean=} params.prefix Enables prefix match against names and aliases of entities
    * @param {string=} params.query The literal query string for search.
    * @param {string=} params.types Restricts returned entities with these types, e.g. Person (as defined in http://schema.org/Person). If multiple types are specified, returned entities will contain one or more of these types.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceEntitiesSearch): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceEntitiesSearch, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(
    params: ParamsResourceEntitiesSearch,
    options: BodyResponseCallback[SchemaSearchResponse],
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceEntitiesSearch, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(
    params: ParamsResourceEntitiesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
}
