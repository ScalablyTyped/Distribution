package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings")
@js.native
class ResourceUsersSettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var delegates: ResourceUsersSettingsDelegates = js.native
  
  var filters: ResourceUsersSettingsFilters = js.native
  
  var forwardingAddresses: ResourceUsersSettingsForwardingaddresses = js.native
  
  /**
    * gmail.users.settings.getAutoForwarding
    * @desc Gets the auto-forwarding setting for the specified account.
    * @alias gmail.users.settings.getAutoForwarding
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAutoForwarding(): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(callback: BodyResponseCallback[SchemaAutoForwarding]): Unit = js.native
  def getAutoForwarding(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(params: ParamsResourceUsersSettingsGetautoforwarding): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(
    params: ParamsResourceUsersSettingsGetautoforwarding,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  def getAutoForwarding(
    params: ParamsResourceUsersSettingsGetautoforwarding,
    options: BodyResponseCallback[SchemaAutoForwarding],
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  def getAutoForwarding(params: ParamsResourceUsersSettingsGetautoforwarding, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(
    params: ParamsResourceUsersSettingsGetautoforwarding,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.getImap
    * @desc Gets IMAP settings.
    * @alias gmail.users.settings.getImap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getImap(): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def getImap(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(params: ParamsResourceUsersSettingsGetimap): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(params: ParamsResourceUsersSettingsGetimap, callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def getImap(
    params: ParamsResourceUsersSettingsGetimap,
    options: BodyResponseCallback[SchemaImapSettings],
    callback: BodyResponseCallback[SchemaImapSettings]
  ): Unit = js.native
  def getImap(params: ParamsResourceUsersSettingsGetimap, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(
    params: ParamsResourceUsersSettingsGetimap,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImapSettings]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.getPop
    * @desc Gets POP settings.
    * @alias gmail.users.settings.getPop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getPop(): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def getPop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(params: ParamsResourceUsersSettingsGetpop): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(params: ParamsResourceUsersSettingsGetpop, callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def getPop(
    params: ParamsResourceUsersSettingsGetpop,
    options: BodyResponseCallback[SchemaPopSettings],
    callback: BodyResponseCallback[SchemaPopSettings]
  ): Unit = js.native
  def getPop(params: ParamsResourceUsersSettingsGetpop, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(
    params: ParamsResourceUsersSettingsGetpop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPopSettings]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.getVacation
    * @desc Gets vacation responder settings.
    * @alias gmail.users.settings.getVacation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getVacation(): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(callback: BodyResponseCallback[SchemaVacationSettings]): Unit = js.native
  def getVacation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(params: ParamsResourceUsersSettingsGetvacation): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(
    params: ParamsResourceUsersSettingsGetvacation,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  def getVacation(
    params: ParamsResourceUsersSettingsGetvacation,
    options: BodyResponseCallback[SchemaVacationSettings],
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  def getVacation(params: ParamsResourceUsersSettingsGetvacation, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(
    params: ParamsResourceUsersSettingsGetvacation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  
  var sendAs: ResourceUsersSettingsSendas = js.native
  
  /**
    * gmail.users.settings.updateAutoForwarding
    * @desc Updates the auto-forwarding setting for the specified account. A
    * verified forwarding address must be specified when auto-forwarding is
    * enabled.  This method is only available to service account clients that
    * have been delegated domain-wide authority.
    * @alias gmail.users.settings.updateAutoForwarding
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().AutoForwarding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateAutoForwarding(): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(callback: BodyResponseCallback[SchemaAutoForwarding]): Unit = js.native
  def updateAutoForwarding(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(params: ParamsResourceUsersSettingsUpdateautoforwarding): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(
    params: ParamsResourceUsersSettingsUpdateautoforwarding,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  def updateAutoForwarding(
    params: ParamsResourceUsersSettingsUpdateautoforwarding,
    options: BodyResponseCallback[SchemaAutoForwarding],
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  def updateAutoForwarding(params: ParamsResourceUsersSettingsUpdateautoforwarding, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(
    params: ParamsResourceUsersSettingsUpdateautoforwarding,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.updateImap
    * @desc Updates IMAP settings.
    * @alias gmail.users.settings.updateImap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().ImapSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateImap(): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def updateImap(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(params: ParamsResourceUsersSettingsUpdateimap): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(params: ParamsResourceUsersSettingsUpdateimap, callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def updateImap(
    params: ParamsResourceUsersSettingsUpdateimap,
    options: BodyResponseCallback[SchemaImapSettings],
    callback: BodyResponseCallback[SchemaImapSettings]
  ): Unit = js.native
  def updateImap(params: ParamsResourceUsersSettingsUpdateimap, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(
    params: ParamsResourceUsersSettingsUpdateimap,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImapSettings]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.updatePop
    * @desc Updates POP settings.
    * @alias gmail.users.settings.updatePop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().PopSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatePop(): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def updatePop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(params: ParamsResourceUsersSettingsUpdatepop): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(params: ParamsResourceUsersSettingsUpdatepop, callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def updatePop(
    params: ParamsResourceUsersSettingsUpdatepop,
    options: BodyResponseCallback[SchemaPopSettings],
    callback: BodyResponseCallback[SchemaPopSettings]
  ): Unit = js.native
  def updatePop(params: ParamsResourceUsersSettingsUpdatepop, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(
    params: ParamsResourceUsersSettingsUpdatepop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPopSettings]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.updateVacation
    * @desc Updates vacation responder settings.
    * @alias gmail.users.settings.updateVacation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().VacationSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateVacation(): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(callback: BodyResponseCallback[SchemaVacationSettings]): Unit = js.native
  def updateVacation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(params: ParamsResourceUsersSettingsUpdatevacation): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(
    params: ParamsResourceUsersSettingsUpdatevacation,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  def updateVacation(
    params: ParamsResourceUsersSettingsUpdatevacation,
    options: BodyResponseCallback[SchemaVacationSettings],
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  def updateVacation(params: ParamsResourceUsersSettingsUpdatevacation, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(
    params: ParamsResourceUsersSettingsUpdatevacation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
}
