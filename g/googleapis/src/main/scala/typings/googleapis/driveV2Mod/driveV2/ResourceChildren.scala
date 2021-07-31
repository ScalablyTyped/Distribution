package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Children")
@js.native
class ResourceChildren protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.children.delete
    * @desc Removes a child from a folder.
    * @alias drive.children.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.childId The ID of the child.
    * @param {string} params.folderId The ID of the folder.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChildrenDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChildrenDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceChildrenDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceChildrenDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChildrenDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * drive.children.get
    * @desc Gets a specific child reference.
    * @alias drive.children.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.childId The ID of the child.
    * @param {string} params.folderId The ID of the folder.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaChildReference] = js.native
  def get(callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def get(params: ParamsResourceChildrenGet): GaxiosPromise[SchemaChildReference] = js.native
  def get(params: ParamsResourceChildrenGet, callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def get(
    params: ParamsResourceChildrenGet,
    options: BodyResponseCallback[SchemaChildReference],
    callback: BodyResponseCallback[SchemaChildReference]
  ): Unit = js.native
  def get(params: ParamsResourceChildrenGet, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def get(
    params: ParamsResourceChildrenGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChildReference]
  ): Unit = js.native
  
  /**
    * drive.children.insert
    * @desc Inserts a file into a folder.
    * @alias drive.children.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.folderId The ID of the folder.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {().ChildReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaChildReference] = js.native
  def insert(callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def insert(params: ParamsResourceChildrenInsert): GaxiosPromise[SchemaChildReference] = js.native
  def insert(params: ParamsResourceChildrenInsert, callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def insert(
    params: ParamsResourceChildrenInsert,
    options: BodyResponseCallback[SchemaChildReference],
    callback: BodyResponseCallback[SchemaChildReference]
  ): Unit = js.native
  def insert(params: ParamsResourceChildrenInsert, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def insert(
    params: ParamsResourceChildrenInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChildReference]
  ): Unit = js.native
  
  /**
    * drive.children.list
    * @desc Lists a folder's children.
    * @alias drive.children.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.folderId The ID of the folder.
    * @param {integer=} params.maxResults Maximum number of children to return.
    * @param {string=} params.orderBy A comma-separated list of sort keys. Valid keys are 'createdDate', 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate', 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', and 'title'. Each key sorts ascending by default, but may be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedDate desc,title. Please note that there is a current limitation for users with approximately one million files in which the requested sort order is ignored.
    * @param {string=} params.pageToken Page token for children.
    * @param {string=} params.q Query string for searching children.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaChildList] = js.native
  def list(callback: BodyResponseCallback[SchemaChildList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChildList] = js.native
  def list(params: ParamsResourceChildrenList): GaxiosPromise[SchemaChildList] = js.native
  def list(params: ParamsResourceChildrenList, callback: BodyResponseCallback[SchemaChildList]): Unit = js.native
  def list(
    params: ParamsResourceChildrenList,
    options: BodyResponseCallback[SchemaChildList],
    callback: BodyResponseCallback[SchemaChildList]
  ): Unit = js.native
  def list(params: ParamsResourceChildrenList, options: MethodOptions): GaxiosPromise[SchemaChildList] = js.native
  def list(
    params: ParamsResourceChildrenList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChildList]
  ): Unit = js.native
}
