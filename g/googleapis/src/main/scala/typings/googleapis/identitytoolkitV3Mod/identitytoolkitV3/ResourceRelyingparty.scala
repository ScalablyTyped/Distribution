package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/identitytoolkit/v3", "identitytoolkit_v3.Resource$Relyingparty")
@js.native
class ResourceRelyingparty protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * identitytoolkit.relyingparty.createAuthUri
    * @desc Creates the URI used by the IdP to authenticate the user.
    * @alias identitytoolkit.relyingparty.createAuthUri
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyCreateAuthUriRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createAuthUri(): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(callback: BodyResponseCallback[SchemaCreateAuthUriResponse]): Unit = js.native
  def createAuthUri(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(params: ParamsResourceRelyingpartyCreateauthuri): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(
    params: ParamsResourceRelyingpartyCreateauthuri,
    callback: BodyResponseCallback[SchemaCreateAuthUriResponse]
  ): Unit = js.native
  def createAuthUri(
    params: ParamsResourceRelyingpartyCreateauthuri,
    options: BodyResponseCallback[SchemaCreateAuthUriResponse],
    callback: BodyResponseCallback[SchemaCreateAuthUriResponse]
  ): Unit = js.native
  def createAuthUri(params: ParamsResourceRelyingpartyCreateauthuri, options: MethodOptions): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(
    params: ParamsResourceRelyingpartyCreateauthuri,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateAuthUriResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.deleteAccount
    * @desc Delete user account.
    * @alias identitytoolkit.relyingparty.deleteAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyDeleteAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteAccount(): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(callback: BodyResponseCallback[SchemaDeleteAccountResponse]): Unit = js.native
  def deleteAccount(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(params: ParamsResourceRelyingpartyDeleteaccount): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(
    params: ParamsResourceRelyingpartyDeleteaccount,
    callback: BodyResponseCallback[SchemaDeleteAccountResponse]
  ): Unit = js.native
  def deleteAccount(
    params: ParamsResourceRelyingpartyDeleteaccount,
    options: BodyResponseCallback[SchemaDeleteAccountResponse],
    callback: BodyResponseCallback[SchemaDeleteAccountResponse]
  ): Unit = js.native
  def deleteAccount(params: ParamsResourceRelyingpartyDeleteaccount, options: MethodOptions): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(
    params: ParamsResourceRelyingpartyDeleteaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteAccountResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.downloadAccount
    * @desc Batch download user accounts.
    * @alias identitytoolkit.relyingparty.downloadAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyDownloadAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def downloadAccount(): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(callback: BodyResponseCallback[SchemaDownloadAccountResponse]): Unit = js.native
  def downloadAccount(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(params: ParamsResourceRelyingpartyDownloadaccount): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(
    params: ParamsResourceRelyingpartyDownloadaccount,
    callback: BodyResponseCallback[SchemaDownloadAccountResponse]
  ): Unit = js.native
  def downloadAccount(
    params: ParamsResourceRelyingpartyDownloadaccount,
    options: BodyResponseCallback[SchemaDownloadAccountResponse],
    callback: BodyResponseCallback[SchemaDownloadAccountResponse]
  ): Unit = js.native
  def downloadAccount(params: ParamsResourceRelyingpartyDownloadaccount, options: MethodOptions): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(
    params: ParamsResourceRelyingpartyDownloadaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDownloadAccountResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.emailLinkSignin
    * @desc Reset password for a user.
    * @alias identitytoolkit.relyingparty.emailLinkSignin
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyEmailLinkSigninRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def emailLinkSignin(): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(callback: BodyResponseCallback[SchemaEmailLinkSigninResponse]): Unit = js.native
  def emailLinkSignin(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(params: ParamsResourceRelyingpartyEmaillinksignin): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(
    params: ParamsResourceRelyingpartyEmaillinksignin,
    callback: BodyResponseCallback[SchemaEmailLinkSigninResponse]
  ): Unit = js.native
  def emailLinkSignin(
    params: ParamsResourceRelyingpartyEmaillinksignin,
    options: BodyResponseCallback[SchemaEmailLinkSigninResponse],
    callback: BodyResponseCallback[SchemaEmailLinkSigninResponse]
  ): Unit = js.native
  def emailLinkSignin(params: ParamsResourceRelyingpartyEmaillinksignin, options: MethodOptions): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(
    params: ParamsResourceRelyingpartyEmaillinksignin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmailLinkSigninResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getAccountInfo
    * @desc Returns the account info.
    * @alias identitytoolkit.relyingparty.getAccountInfo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyGetAccountInfoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAccountInfo(): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(callback: BodyResponseCallback[SchemaGetAccountInfoResponse]): Unit = js.native
  def getAccountInfo(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(params: ParamsResourceRelyingpartyGetaccountinfo): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(
    params: ParamsResourceRelyingpartyGetaccountinfo,
    callback: BodyResponseCallback[SchemaGetAccountInfoResponse]
  ): Unit = js.native
  def getAccountInfo(
    params: ParamsResourceRelyingpartyGetaccountinfo,
    options: BodyResponseCallback[SchemaGetAccountInfoResponse],
    callback: BodyResponseCallback[SchemaGetAccountInfoResponse]
  ): Unit = js.native
  def getAccountInfo(params: ParamsResourceRelyingpartyGetaccountinfo, options: MethodOptions): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(
    params: ParamsResourceRelyingpartyGetaccountinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetAccountInfoResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getOobConfirmationCode
    * @desc Get a code for user action confirmation.
    * @alias identitytoolkit.relyingparty.getOobConfirmationCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Relyingparty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getOobConfirmationCode(): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(callback: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse]): Unit = js.native
  def getOobConfirmationCode(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(params: ParamsResourceRelyingpartyGetoobconfirmationcode): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(
    params: ParamsResourceRelyingpartyGetoobconfirmationcode,
    callback: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse]
  ): Unit = js.native
  def getOobConfirmationCode(
    params: ParamsResourceRelyingpartyGetoobconfirmationcode,
    options: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse],
    callback: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse]
  ): Unit = js.native
  def getOobConfirmationCode(params: ParamsResourceRelyingpartyGetoobconfirmationcode, options: MethodOptions): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(
    params: ParamsResourceRelyingpartyGetoobconfirmationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getProjectConfig
    * @desc Get project configuration.
    * @alias identitytoolkit.relyingparty.getProjectConfig
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.delegatedProjectNumber Delegated GCP project number of the request.
    * @param {string=} params.projectNumber GCP project number of the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getProjectConfig(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]): Unit = js.native
  def getProjectConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(params: ParamsResourceRelyingpartyGetprojectconfig): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(
    params: ParamsResourceRelyingpartyGetprojectconfig,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  def getProjectConfig(
    params: ParamsResourceRelyingpartyGetprojectconfig,
    options: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse],
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  def getProjectConfig(params: ParamsResourceRelyingpartyGetprojectconfig, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(
    params: ParamsResourceRelyingpartyGetprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getPublicKeys
    * @desc Get token signing public key.
    * @alias identitytoolkit.relyingparty.getPublicKeys
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getPublicKeys(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]): Unit = js.native
  def getPublicKeys(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(params: ParamsResourceRelyingpartyGetpublickeys): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(
    params: ParamsResourceRelyingpartyGetpublickeys,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  def getPublicKeys(
    params: ParamsResourceRelyingpartyGetpublickeys,
    options: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse],
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  def getPublicKeys(params: ParamsResourceRelyingpartyGetpublickeys, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(
    params: ParamsResourceRelyingpartyGetpublickeys,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getRecaptchaParam
    * @desc Get recaptcha secure param.
    * @alias identitytoolkit.relyingparty.getRecaptchaParam
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRecaptchaParam(): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(callback: BodyResponseCallback[SchemaGetRecaptchaParamResponse]): Unit = js.native
  def getRecaptchaParam(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(params: ParamsResourceRelyingpartyGetrecaptchaparam): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(
    params: ParamsResourceRelyingpartyGetrecaptchaparam,
    callback: BodyResponseCallback[SchemaGetRecaptchaParamResponse]
  ): Unit = js.native
  def getRecaptchaParam(
    params: ParamsResourceRelyingpartyGetrecaptchaparam,
    options: BodyResponseCallback[SchemaGetRecaptchaParamResponse],
    callback: BodyResponseCallback[SchemaGetRecaptchaParamResponse]
  ): Unit = js.native
  def getRecaptchaParam(params: ParamsResourceRelyingpartyGetrecaptchaparam, options: MethodOptions): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(
    params: ParamsResourceRelyingpartyGetrecaptchaparam,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetRecaptchaParamResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.resetPassword
    * @desc Reset password for a user.
    * @alias identitytoolkit.relyingparty.resetPassword
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyResetPasswordRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetPassword(): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(callback: BodyResponseCallback[SchemaResetPasswordResponse]): Unit = js.native
  def resetPassword(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(params: ParamsResourceRelyingpartyResetpassword): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(
    params: ParamsResourceRelyingpartyResetpassword,
    callback: BodyResponseCallback[SchemaResetPasswordResponse]
  ): Unit = js.native
  def resetPassword(
    params: ParamsResourceRelyingpartyResetpassword,
    options: BodyResponseCallback[SchemaResetPasswordResponse],
    callback: BodyResponseCallback[SchemaResetPasswordResponse]
  ): Unit = js.native
  def resetPassword(params: ParamsResourceRelyingpartyResetpassword, options: MethodOptions): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(
    params: ParamsResourceRelyingpartyResetpassword,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResetPasswordResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.sendVerificationCode
    * @desc Send SMS verification code.
    * @alias identitytoolkit.relyingparty.sendVerificationCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySendVerificationCodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendVerificationCode(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]): Unit = js.native
  def sendVerificationCode(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(params: ParamsResourceRelyingpartySendverificationcode): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(
    params: ParamsResourceRelyingpartySendverificationcode,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  def sendVerificationCode(
    params: ParamsResourceRelyingpartySendverificationcode,
    options: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse],
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  def sendVerificationCode(params: ParamsResourceRelyingpartySendverificationcode, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(
    params: ParamsResourceRelyingpartySendverificationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.setAccountInfo
    * @desc Set account info for a user.
    * @alias identitytoolkit.relyingparty.setAccountInfo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySetAccountInfoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAccountInfo(): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(callback: BodyResponseCallback[SchemaSetAccountInfoResponse]): Unit = js.native
  def setAccountInfo(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(params: ParamsResourceRelyingpartySetaccountinfo): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(
    params: ParamsResourceRelyingpartySetaccountinfo,
    callback: BodyResponseCallback[SchemaSetAccountInfoResponse]
  ): Unit = js.native
  def setAccountInfo(
    params: ParamsResourceRelyingpartySetaccountinfo,
    options: BodyResponseCallback[SchemaSetAccountInfoResponse],
    callback: BodyResponseCallback[SchemaSetAccountInfoResponse]
  ): Unit = js.native
  def setAccountInfo(params: ParamsResourceRelyingpartySetaccountinfo, options: MethodOptions): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(
    params: ParamsResourceRelyingpartySetaccountinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSetAccountInfoResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.setProjectConfig
    * @desc Set project configuration.
    * @alias identitytoolkit.relyingparty.setProjectConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySetProjectConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setProjectConfig(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]): Unit = js.native
  def setProjectConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(params: ParamsResourceRelyingpartySetprojectconfig): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(
    params: ParamsResourceRelyingpartySetprojectconfig,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  def setProjectConfig(
    params: ParamsResourceRelyingpartySetprojectconfig,
    options: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse],
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  def setProjectConfig(params: ParamsResourceRelyingpartySetprojectconfig, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(
    params: ParamsResourceRelyingpartySetprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.signOutUser
    * @desc Sign out user.
    * @alias identitytoolkit.relyingparty.signOutUser
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySignOutUserRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signOutUser(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]): Unit = js.native
  def signOutUser(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(params: ParamsResourceRelyingpartySignoutuser): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(
    params: ParamsResourceRelyingpartySignoutuser,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  def signOutUser(
    params: ParamsResourceRelyingpartySignoutuser,
    options: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse],
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  def signOutUser(params: ParamsResourceRelyingpartySignoutuser, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(
    params: ParamsResourceRelyingpartySignoutuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.signupNewUser
    * @desc Signup new user.
    * @alias identitytoolkit.relyingparty.signupNewUser
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySignupNewUserRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signupNewUser(): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(callback: BodyResponseCallback[SchemaSignupNewUserResponse]): Unit = js.native
  def signupNewUser(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(params: ParamsResourceRelyingpartySignupnewuser): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(
    params: ParamsResourceRelyingpartySignupnewuser,
    callback: BodyResponseCallback[SchemaSignupNewUserResponse]
  ): Unit = js.native
  def signupNewUser(
    params: ParamsResourceRelyingpartySignupnewuser,
    options: BodyResponseCallback[SchemaSignupNewUserResponse],
    callback: BodyResponseCallback[SchemaSignupNewUserResponse]
  ): Unit = js.native
  def signupNewUser(params: ParamsResourceRelyingpartySignupnewuser, options: MethodOptions): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(
    params: ParamsResourceRelyingpartySignupnewuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignupNewUserResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.uploadAccount
    * @desc Batch upload existing user accounts.
    * @alias identitytoolkit.relyingparty.uploadAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyUploadAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def uploadAccount(): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(callback: BodyResponseCallback[SchemaUploadAccountResponse]): Unit = js.native
  def uploadAccount(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(params: ParamsResourceRelyingpartyUploadaccount): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(
    params: ParamsResourceRelyingpartyUploadaccount,
    callback: BodyResponseCallback[SchemaUploadAccountResponse]
  ): Unit = js.native
  def uploadAccount(
    params: ParamsResourceRelyingpartyUploadaccount,
    options: BodyResponseCallback[SchemaUploadAccountResponse],
    callback: BodyResponseCallback[SchemaUploadAccountResponse]
  ): Unit = js.native
  def uploadAccount(params: ParamsResourceRelyingpartyUploadaccount, options: MethodOptions): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(
    params: ParamsResourceRelyingpartyUploadaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploadAccountResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyAssertion
    * @desc Verifies the assertion returned by the IdP.
    * @alias identitytoolkit.relyingparty.verifyAssertion
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyAssertionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyAssertion(): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(callback: BodyResponseCallback[SchemaVerifyAssertionResponse]): Unit = js.native
  def verifyAssertion(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(params: ParamsResourceRelyingpartyVerifyassertion): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(
    params: ParamsResourceRelyingpartyVerifyassertion,
    callback: BodyResponseCallback[SchemaVerifyAssertionResponse]
  ): Unit = js.native
  def verifyAssertion(
    params: ParamsResourceRelyingpartyVerifyassertion,
    options: BodyResponseCallback[SchemaVerifyAssertionResponse],
    callback: BodyResponseCallback[SchemaVerifyAssertionResponse]
  ): Unit = js.native
  def verifyAssertion(params: ParamsResourceRelyingpartyVerifyassertion, options: MethodOptions): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(
    params: ParamsResourceRelyingpartyVerifyassertion,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyAssertionResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyCustomToken
    * @desc Verifies the developer asserted ID token.
    * @alias identitytoolkit.relyingparty.verifyCustomToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyCustomTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyCustomToken(): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(callback: BodyResponseCallback[SchemaVerifyCustomTokenResponse]): Unit = js.native
  def verifyCustomToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(params: ParamsResourceRelyingpartyVerifycustomtoken): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(
    params: ParamsResourceRelyingpartyVerifycustomtoken,
    callback: BodyResponseCallback[SchemaVerifyCustomTokenResponse]
  ): Unit = js.native
  def verifyCustomToken(
    params: ParamsResourceRelyingpartyVerifycustomtoken,
    options: BodyResponseCallback[SchemaVerifyCustomTokenResponse],
    callback: BodyResponseCallback[SchemaVerifyCustomTokenResponse]
  ): Unit = js.native
  def verifyCustomToken(params: ParamsResourceRelyingpartyVerifycustomtoken, options: MethodOptions): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(
    params: ParamsResourceRelyingpartyVerifycustomtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyCustomTokenResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyPassword
    * @desc Verifies the user entered password.
    * @alias identitytoolkit.relyingparty.verifyPassword
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyPasswordRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyPassword(): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(callback: BodyResponseCallback[SchemaVerifyPasswordResponse]): Unit = js.native
  def verifyPassword(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(params: ParamsResourceRelyingpartyVerifypassword): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(
    params: ParamsResourceRelyingpartyVerifypassword,
    callback: BodyResponseCallback[SchemaVerifyPasswordResponse]
  ): Unit = js.native
  def verifyPassword(
    params: ParamsResourceRelyingpartyVerifypassword,
    options: BodyResponseCallback[SchemaVerifyPasswordResponse],
    callback: BodyResponseCallback[SchemaVerifyPasswordResponse]
  ): Unit = js.native
  def verifyPassword(params: ParamsResourceRelyingpartyVerifypassword, options: MethodOptions): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(
    params: ParamsResourceRelyingpartyVerifypassword,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyPasswordResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyPhoneNumber
    * @desc Verifies ownership of a phone number and creates/updates the user
    * account accordingly.
    * @alias identitytoolkit.relyingparty.verifyPhoneNumber
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyPhoneNumber(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]): Unit = js.native
  def verifyPhoneNumber(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(params: ParamsResourceRelyingpartyVerifyphonenumber): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(
    params: ParamsResourceRelyingpartyVerifyphonenumber,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyPhoneNumber(
    params: ParamsResourceRelyingpartyVerifyphonenumber,
    options: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse],
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyPhoneNumber(params: ParamsResourceRelyingpartyVerifyphonenumber, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(
    params: ParamsResourceRelyingpartyVerifyphonenumber,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
}

