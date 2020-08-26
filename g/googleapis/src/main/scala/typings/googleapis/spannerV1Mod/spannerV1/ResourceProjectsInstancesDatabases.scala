package typings.googleapis.spannerV1Mod.spannerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instances$Databases")
@js.native
class ResourceProjectsInstancesDatabases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceProjectsInstancesDatabasesOperations = js.native
  var sessions: ResourceProjectsInstancesDatabasesSessions = js.native
  /**
    * spanner.projects.instances.databases.create
    * @desc Creates a new Cloud Spanner database and starts to prepare it for
    * serving. The returned long-running operation will have a name of the
    * format `<database_name>/operations/<operation_id>` and can be used to
    * track preparation of the database. The metadata field type is
    * CreateDatabaseMetadata. The response field type is Database, if
    * successful.
    * @alias spanner.projects.instances.databases.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the instance that will serve the new database. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {().CreateDatabaseRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsInstancesDatabasesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesDatabasesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.dropDatabase
    * @desc Drops (aka deletes) a Cloud Spanner database.
    * @alias spanner.projects.instances.databases.dropDatabase
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database to be dropped.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dropDatabase(): GaxiosPromise[SchemaEmpty] = js.native
  def dropDatabase(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def dropDatabase(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dropDatabase(params: ParamsResourceProjectsInstancesDatabasesDropdatabase): GaxiosPromise[SchemaEmpty] = js.native
  def dropDatabase(
    params: ParamsResourceProjectsInstancesDatabasesDropdatabase,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def dropDatabase(
    params: ParamsResourceProjectsInstancesDatabasesDropdatabase,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def dropDatabase(params: ParamsResourceProjectsInstancesDatabasesDropdatabase, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dropDatabase(
    params: ParamsResourceProjectsInstancesDatabasesDropdatabase,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.get
    * @desc Gets the state of a Cloud Spanner database.
    * @alias spanner.projects.instances.databases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the requested database. Values are of the form `projects/<project>/instances/<instance>/databases/<database>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDatabase] = js.native
  def get(callback: BodyResponseCallback[SchemaDatabase]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDatabase] = js.native
  def get(params: ParamsResourceProjectsInstancesDatabasesGet): GaxiosPromise[SchemaDatabase] = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesGet,
    callback: BodyResponseCallback[SchemaDatabase]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesGet,
    options: BodyResponseCallback[SchemaDatabase],
    callback: BodyResponseCallback[SchemaDatabase]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesDatabasesGet, options: MethodOptions): GaxiosPromise[SchemaDatabase] = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatabase]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.getDdl
    * @desc Returns the schema of a Cloud Spanner database as a list of
    * formatted DDL statements. This method does not show pending schema
    * updates, those may be queried using the Operations API.
    * @alias spanner.projects.instances.databases.getDdl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database whose schema we wish to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getDdl(): GaxiosPromise[SchemaGetDatabaseDdlResponse] = js.native
  def getDdl(callback: BodyResponseCallback[SchemaGetDatabaseDdlResponse]): Unit = js.native
  def getDdl(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetDatabaseDdlResponse] = js.native
  def getDdl(params: ParamsResourceProjectsInstancesDatabasesGetddl): GaxiosPromise[SchemaGetDatabaseDdlResponse] = js.native
  def getDdl(
    params: ParamsResourceProjectsInstancesDatabasesGetddl,
    callback: BodyResponseCallback[SchemaGetDatabaseDdlResponse]
  ): Unit = js.native
  def getDdl(
    params: ParamsResourceProjectsInstancesDatabasesGetddl,
    options: BodyResponseCallback[SchemaGetDatabaseDdlResponse],
    callback: BodyResponseCallback[SchemaGetDatabaseDdlResponse]
  ): Unit = js.native
  def getDdl(params: ParamsResourceProjectsInstancesDatabasesGetddl, options: MethodOptions): GaxiosPromise[SchemaGetDatabaseDdlResponse] = js.native
  def getDdl(
    params: ParamsResourceProjectsInstancesDatabasesGetddl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetDatabaseDdlResponse]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.getIamPolicy
    * @desc Gets the access control policy for a database resource. Returns an
    * empty policy if a database exists but does not have a policy set.
    * Authorization requires `spanner.databases.getIamPolicy` permission on
    * resource.
    * @alias spanner.projects.instances.databases.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being retrieved. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesDatabasesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesDatabasesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesDatabasesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesDatabasesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesDatabasesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.list
    * @desc Lists Cloud Spanner databases.
    * @alias spanner.projects.instances.databases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of databases to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    * @param {string=} params.pageToken If non-empty, `page_token` should contain a next_page_token from a previous ListDatabasesResponse.
    * @param {string} params.parent Required. The instance whose databases should be listed. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDatabasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDatabasesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDatabasesResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesDatabasesList): GaxiosPromise[SchemaListDatabasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesList,
    callback: BodyResponseCallback[SchemaListDatabasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesList,
    options: BodyResponseCallback[SchemaListDatabasesResponse],
    callback: BodyResponseCallback[SchemaListDatabasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesDatabasesList, options: MethodOptions): GaxiosPromise[SchemaListDatabasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDatabasesResponse]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.setIamPolicy
    * @desc Sets the access control policy on a database resource. Replaces any
    * existing policy.  Authorization requires `spanner.databases.setIamPolicy`
    * permission on resource.
    * @alias spanner.projects.instances.databases.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being set. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for databases resources.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesDatabasesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesDatabasesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesDatabasesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesDatabasesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesDatabasesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.testIamPermissions
    * @desc Returns permissions that the caller has on the specified database
    * resource.  Attempting this RPC on a non-existent Cloud Spanner database
    * will result in a NOT_FOUND error if the user has `spanner.databases.list`
    * permission on the containing Cloud Spanner instance. Otherwise returns an
    * empty set of permissions.
    * @alias spanner.projects.instances.databases.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which permissions are being tested. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesDatabasesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesDatabasesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesDatabasesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesDatabasesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesDatabasesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.updateDdl
    * @desc Updates the schema of a Cloud Spanner database by
    * creating/altering/dropping tables, columns, indexes, etc. The returned
    * long-running operation will have a name of the format
    * `<database_name>/operations/<operation_id>` and can be used to track
    * execution of the schema change(s). The metadata field type is
    * UpdateDatabaseDdlMetadata.  The operation has no response.
    * @alias spanner.projects.instances.databases.updateDdl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database to update.
    * @param {().UpdateDatabaseDdlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateDdl(): GaxiosPromise[SchemaOperation] = js.native
  def updateDdl(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateDdl(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateDdl(params: ParamsResourceProjectsInstancesDatabasesUpdateddl): GaxiosPromise[SchemaOperation] = js.native
  def updateDdl(
    params: ParamsResourceProjectsInstancesDatabasesUpdateddl,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateDdl(
    params: ParamsResourceProjectsInstancesDatabasesUpdateddl,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateDdl(params: ParamsResourceProjectsInstancesDatabasesUpdateddl, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateDdl(
    params: ParamsResourceProjectsInstancesDatabasesUpdateddl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

