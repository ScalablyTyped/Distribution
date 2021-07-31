package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Properties")
@js.native
class ResourceProperties protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.properties.delete
    * @desc Deletes a property.
    * @alias drive.properties.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePropertiesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePropertiesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePropertiesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * drive.properties.get
    * @desc Gets a property by its key.
    * @alias drive.properties.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProperty] = js.native
  def get(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def get(params: ParamsResourcePropertiesGet): GaxiosPromise[SchemaProperty] = js.native
  def get(params: ParamsResourcePropertiesGet, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: BodyResponseCallback[SchemaProperty],
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesGet, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  
  /**
    * drive.properties.insert
    * @desc Adds a property to a file, or updates it if it already exists.
    * @alias drive.properties.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {().Property} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaProperty] = js.native
  def insert(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def insert(params: ParamsResourcePropertiesInsert): GaxiosPromise[SchemaProperty] = js.native
  def insert(params: ParamsResourcePropertiesInsert, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def insert(
    params: ParamsResourcePropertiesInsert,
    options: BodyResponseCallback[SchemaProperty],
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  def insert(params: ParamsResourcePropertiesInsert, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def insert(
    params: ParamsResourcePropertiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  
  /**
    * drive.properties.list
    * @desc Lists a file's properties.
    * @alias drive.properties.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPropertyList] = js.native
  def list(callback: BodyResponseCallback[SchemaPropertyList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPropertyList] = js.native
  def list(params: ParamsResourcePropertiesList): GaxiosPromise[SchemaPropertyList] = js.native
  def list(params: ParamsResourcePropertiesList, callback: BodyResponseCallback[SchemaPropertyList]): Unit = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: BodyResponseCallback[SchemaPropertyList],
    callback: BodyResponseCallback[SchemaPropertyList]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesList, options: MethodOptions): GaxiosPromise[SchemaPropertyList] = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPropertyList]
  ): Unit = js.native
  
  /**
    * drive.properties.patch
    * @desc Updates a property.
    * @alias drive.properties.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property. Allowed values are PRIVATE and PUBLIC. (Default: PRIVATE)
    * @param {().Property} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaProperty] = js.native
  def patch(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def patch(params: ParamsResourcePropertiesPatch): GaxiosPromise[SchemaProperty] = js.native
  def patch(params: ParamsResourcePropertiesPatch, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: BodyResponseCallback[SchemaProperty],
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesPatch, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  
  /**
    * drive.properties.update
    * @desc Updates a property.
    * @alias drive.properties.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property. Allowed values are PRIVATE and PUBLIC. (Default: PRIVATE)
    * @param {().Property} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaProperty] = js.native
  def update(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def update(params: ParamsResourcePropertiesUpdate): GaxiosPromise[SchemaProperty] = js.native
  def update(params: ParamsResourcePropertiesUpdate, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def update(
    params: ParamsResourcePropertiesUpdate,
    options: BodyResponseCallback[SchemaProperty],
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  def update(params: ParamsResourcePropertiesUpdate, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def update(
    params: ParamsResourcePropertiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
}
