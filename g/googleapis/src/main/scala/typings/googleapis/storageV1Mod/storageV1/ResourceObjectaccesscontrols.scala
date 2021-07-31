package typings.googleapis.storageV1Mod.storageV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Objectaccesscontrols")
@js.native
class ResourceObjectaccesscontrols protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * storage.objectAccessControls.delete
    * @desc Permanently deletes the ACL entry for the specified entity on the
    * specified object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objectAccessControls.delete(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.objectAccessControls.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceObjectaccesscontrolsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceObjectaccesscontrolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.get
    * @desc Returns the ACL entry for the specified entity on the specified
    * object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objectAccessControls.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.objectAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(params: ParamsResourceObjectaccesscontrolsGet): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def get(params: ParamsResourceObjectaccesscontrolsGet, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.insert
    * @desc Creates a new ACL entry on the specified object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objectAccessControls.insert(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.objectAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(params: ParamsResourceObjectaccesscontrolsInsert): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(params: ParamsResourceObjectaccesscontrolsInsert, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.list
    * @desc Retrieves ACL entries on the specified object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objectAccessControls.list(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.objectAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(callback: BodyResponseCallback[SchemaObjectAccessControls]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(params: ParamsResourceObjectaccesscontrolsList): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    options: BodyResponseCallback[SchemaObjectAccessControls],
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  def list(params: ParamsResourceObjectaccesscontrolsList, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.patch
    * @desc Patches an ACL entry on the specified object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objectAccessControls.patch(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.objectAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(params: ParamsResourceObjectaccesscontrolsPatch): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(params: ParamsResourceObjectaccesscontrolsPatch, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.update
    * @desc Updates an ACL entry on the specified object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objectAccessControls.update(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.objectAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(params: ParamsResourceObjectaccesscontrolsUpdate): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def update(params: ParamsResourceObjectaccesscontrolsUpdate, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
}
