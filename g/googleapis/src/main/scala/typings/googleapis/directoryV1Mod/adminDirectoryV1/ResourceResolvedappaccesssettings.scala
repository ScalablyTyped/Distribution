package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resolvedappaccesssettings")
@js.native
class ResourceResolvedappaccesssettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * directory.resolvedAppAccessSettings.GetSettings
    * @desc Retrieves resolved app access settings of the logged in user.
    * @alias directory.resolvedAppAccessSettings.GetSettings
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def GetSettings(): GaxiosPromise[SchemaAppAccessCollections] = js.native
  def GetSettings(callback: BodyResponseCallback[SchemaAppAccessCollections]): Unit = js.native
  def GetSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppAccessCollections] = js.native
  def GetSettings(params: ParamsResourceResolvedappaccesssettingsGetsettings): GaxiosPromise[SchemaAppAccessCollections] = js.native
  def GetSettings(
    params: ParamsResourceResolvedappaccesssettingsGetsettings,
    callback: BodyResponseCallback[SchemaAppAccessCollections]
  ): Unit = js.native
  def GetSettings(
    params: ParamsResourceResolvedappaccesssettingsGetsettings,
    options: BodyResponseCallback[SchemaAppAccessCollections],
    callback: BodyResponseCallback[SchemaAppAccessCollections]
  ): Unit = js.native
  def GetSettings(params: ParamsResourceResolvedappaccesssettingsGetsettings, options: MethodOptions): GaxiosPromise[SchemaAppAccessCollections] = js.native
  def GetSettings(
    params: ParamsResourceResolvedappaccesssettingsGetsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppAccessCollections]
  ): Unit = js.native
  
  /**
    * directory.resolvedAppAccessSettings.ListTrustedApps
    * @desc Retrieves the list of apps trusted by the admin of the logged in
    * user.
    * @alias directory.resolvedAppAccessSettings.ListTrustedApps
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def ListTrustedApps(): GaxiosPromise[SchemaTrustedApps] = js.native
  def ListTrustedApps(callback: BodyResponseCallback[SchemaTrustedApps]): Unit = js.native
  def ListTrustedApps(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrustedApps] = js.native
  def ListTrustedApps(params: ParamsResourceResolvedappaccesssettingsListtrustedapps): GaxiosPromise[SchemaTrustedApps] = js.native
  def ListTrustedApps(
    params: ParamsResourceResolvedappaccesssettingsListtrustedapps,
    callback: BodyResponseCallback[SchemaTrustedApps]
  ): Unit = js.native
  def ListTrustedApps(
    params: ParamsResourceResolvedappaccesssettingsListtrustedapps,
    options: BodyResponseCallback[SchemaTrustedApps],
    callback: BodyResponseCallback[SchemaTrustedApps]
  ): Unit = js.native
  def ListTrustedApps(params: ParamsResourceResolvedappaccesssettingsListtrustedapps, options: MethodOptions): GaxiosPromise[SchemaTrustedApps] = js.native
  def ListTrustedApps(
    params: ParamsResourceResolvedappaccesssettingsListtrustedapps,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrustedApps]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
