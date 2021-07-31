package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fusiontables/v1", "fusiontables_v1.Resource$Template")
@js.native
class ResourceTemplate protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * fusiontables.template.delete
    * @desc Deletes a template
    * @alias fusiontables.template.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table from which the template is being deleted
    * @param {integer} params.templateId Identifier for the template which is being deleted
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTemplateDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTemplateDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTemplateDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTemplateDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTemplateDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * fusiontables.template.get
    * @desc Retrieves a specific template by its id
    * @alias fusiontables.template.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the template belongs
    * @param {integer} params.templateId Identifier for the template that is being requested
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def get(params: ParamsResourceTemplateGet): GaxiosPromise[SchemaTemplate] = js.native
  def get(params: ParamsResourceTemplateGet, callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def get(
    params: ParamsResourceTemplateGet,
    options: BodyResponseCallback[SchemaTemplate],
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceTemplateGet, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def get(
    params: ParamsResourceTemplateGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
  
  /**
    * fusiontables.template.insert
    * @desc Creates a new template for the table.
    * @alias fusiontables.template.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table for which a new template is being created
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaTemplate] = js.native
  def insert(callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def insert(params: ParamsResourceTemplateInsert): GaxiosPromise[SchemaTemplate] = js.native
  def insert(params: ParamsResourceTemplateInsert, callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def insert(
    params: ParamsResourceTemplateInsert,
    options: BodyResponseCallback[SchemaTemplate],
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
  def insert(params: ParamsResourceTemplateInsert, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def insert(
    params: ParamsResourceTemplateInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
  
  /**
    * fusiontables.template.list
    * @desc Retrieves a list of templates.
    * @alias fusiontables.template.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of templates to return. Optional. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which results page to return. Optional.
    * @param {string} params.tableId Identifier for the table whose templates are being requested
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTemplateList] = js.native
  def list(callback: BodyResponseCallback[SchemaTemplateList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTemplateList] = js.native
  def list(params: ParamsResourceTemplateList): GaxiosPromise[SchemaTemplateList] = js.native
  def list(params: ParamsResourceTemplateList, callback: BodyResponseCallback[SchemaTemplateList]): Unit = js.native
  def list(
    params: ParamsResourceTemplateList,
    options: BodyResponseCallback[SchemaTemplateList],
    callback: BodyResponseCallback[SchemaTemplateList]
  ): Unit = js.native
  def list(params: ParamsResourceTemplateList, options: MethodOptions): GaxiosPromise[SchemaTemplateList] = js.native
  def list(
    params: ParamsResourceTemplateList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTemplateList]
  ): Unit = js.native
  
  /**
    * fusiontables.template.patch
    * @desc Updates an existing template. This method supports patch semantics.
    * @alias fusiontables.template.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the updated template belongs
    * @param {integer} params.templateId Identifier for the template that is being updated
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTemplate] = js.native
  def patch(callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def patch(params: ParamsResourceTemplatePatch): GaxiosPromise[SchemaTemplate] = js.native
  def patch(params: ParamsResourceTemplatePatch, callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def patch(
    params: ParamsResourceTemplatePatch,
    options: BodyResponseCallback[SchemaTemplate],
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
  def patch(params: ParamsResourceTemplatePatch, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def patch(
    params: ParamsResourceTemplatePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
  
  /**
    * fusiontables.template.update
    * @desc Updates an existing template
    * @alias fusiontables.template.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the updated template belongs
    * @param {integer} params.templateId Identifier for the template that is being updated
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTemplate] = js.native
  def update(callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def update(params: ParamsResourceTemplateUpdate): GaxiosPromise[SchemaTemplate] = js.native
  def update(params: ParamsResourceTemplateUpdate, callback: BodyResponseCallback[SchemaTemplate]): Unit = js.native
  def update(
    params: ParamsResourceTemplateUpdate,
    options: BodyResponseCallback[SchemaTemplate],
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
  def update(params: ParamsResourceTemplateUpdate, options: MethodOptions): GaxiosPromise[SchemaTemplate] = js.native
  def update(
    params: ParamsResourceTemplateUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTemplate]
  ): Unit = js.native
}
