package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * toolresults.projects.getSettings
    * @desc Gets the Tool Results settings for a project.  May return any of
    * the following canonical error codes:  - PERMISSION_DENIED - if the user
    * is not authorized to read from project
    * @alias toolresults.projects.getSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getSettings(): GaxiosPromise[SchemaProjectSettings] = js.native
  def getSettings(callback: BodyResponseCallback[SchemaProjectSettings]): Unit = js.native
  def getSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def getSettings(params: ParamsResourceProjectsGetsettings): GaxiosPromise[SchemaProjectSettings] = js.native
  def getSettings(params: ParamsResourceProjectsGetsettings, callback: BodyResponseCallback[SchemaProjectSettings]): Unit = js.native
  def getSettings(
    params: ParamsResourceProjectsGetsettings,
    options: BodyResponseCallback[SchemaProjectSettings],
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  def getSettings(params: ParamsResourceProjectsGetsettings, options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def getSettings(
    params: ParamsResourceProjectsGetsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  
  var histories: ResourceProjectsHistories = js.native
  
  /**
    * toolresults.projects.initializeSettings
    * @desc Creates resources for settings which have not yet been set.
    * Currently, this creates a single resource: a Google Cloud Storage bucket,
    * to be used as the default bucket for this project. The bucket is created
    * in an FTL-own storage project. Except for in rare cases, calling this
    * method in parallel from multiple clients will only create a single
    * bucket. In order to avoid unnecessary storage charges, the bucket is
    * configured to automatically delete objects older than 90 days.  The
    * bucket is created with the following permissions: - Owner access for
    * owners of central storage project (FTL-owned) - Writer access for
    * owners/editors of customer project - Reader access for viewers of
    * customer project The default ACL on objects created in the bucket is: -
    * Owner access for owners of central storage project - Reader access for
    * owners/editors/viewers of customer project See Google Cloud Storage
    * documentation for more details.  If there is already a default bucket set
    * and the project can access the bucket, this call does nothing. However,
    * if the project doesn't have the permission to access the bucket or the
    * bucket is deleted, a new bucket will be created.  May return any
    * canonical error codes, including the following:  - PERMISSION_DENIED - if
    * the user is not authorized to write to project - Any error code raised by
    * Google Cloud Storage
    * @alias toolresults.projects.initializeSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def initializeSettings(): GaxiosPromise[SchemaProjectSettings] = js.native
  def initializeSettings(callback: BodyResponseCallback[SchemaProjectSettings]): Unit = js.native
  def initializeSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def initializeSettings(params: ParamsResourceProjectsInitializesettings): GaxiosPromise[SchemaProjectSettings] = js.native
  def initializeSettings(
    params: ParamsResourceProjectsInitializesettings,
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  def initializeSettings(
    params: ParamsResourceProjectsInitializesettings,
    options: BodyResponseCallback[SchemaProjectSettings],
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  def initializeSettings(params: ParamsResourceProjectsInitializesettings, options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def initializeSettings(
    params: ParamsResourceProjectsInitializesettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
}
