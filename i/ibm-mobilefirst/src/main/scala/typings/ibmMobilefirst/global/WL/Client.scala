package typings.ibmMobilefirst.global.WL

import typings.ibmMobilefirst.WL.Client.ChallengeHandlerAuthenticationOptions
import typings.ibmMobilefirst.WL.Client.ChallengeHandlerSubmitLoginFormOptions
import typings.ibmMobilefirst.WL.Client.ChallengehandlerInvocationData
import typings.ibmMobilefirst.WL.Client.ConnectOptions
import typings.ibmMobilefirst.WL.Client.EventTransmissionPolicy
import typings.ibmMobilefirst.WL.Client.InitOptions
import typings.ibmMobilefirst.WL.Client.ProcedureInvocationData
import typings.ibmMobilefirst.WL.Client.ProcedureInvocationOptions
import typings.ibmMobilefirst.WL.Client.SharedTokenObject
import typings.ibmMobilefirst.WL.Client.UserPreferences
import typings.ibmMobilefirst.WL.Options
import typings.ibmMobilefirst.WL.ResponseHandler
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Client")
@js.native
object Client extends js.Object {
  @js.native
  class AbstractChallengeHandler ()
    extends typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler {
    /* CompleteClass */
    override def handleChallenge(challenge: js.Any): Boolean = js.native
    /* CompleteClass */
    override def isCustomResponse(transport: js.Any): Boolean = js.native
    /* CompleteClass */
    override def submitAdapterAuthentication(invocationData: ChallengehandlerInvocationData, options: ChallengeHandlerAuthenticationOptions): Unit = js.native
    /* CompleteClass */
    override def submitFailure(error: String): Unit = js.native
    /* CompleteClass */
    override def submitLoginForm(
      reqURL: String,
      options: ChallengeHandlerSubmitLoginFormOptions,
      submitLoginFormCallback: js.Function1[/* transport */ js.Any, Unit]
    ): Unit = js.native
    /* CompleteClass */
    override def submitSuccess(): Unit = js.native
  }
  
  def addGlobalHeader(headerName: String, headerValue: String): Unit = js.native
  def checkForDirectUpdate(options: Options): Unit = js.native
  def clearSharedToken(`object`: SharedTokenObject): JQueryDeferred[_] = js.native
  def close(): Unit = js.native
  def connect(): Unit = js.native
  def connect(options: ConnectOptions): Unit = js.native
  def createChallengeHandler(realmName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = js.native
  def createProvisioningChallengeHandler(realmName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = js.native
  def createWLChallengeHandler(realName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = js.native
  def deleteUserPref(key: String): Unit = js.native
  def deleteUserPref(key: String, options: Options): Unit = js.native
  /**
    * See WL.AppProperty for possible results
    */
  def getAppProperty(property: js.Any): js.Any = js.native
  /**
    * See WL.Environment for possible results
    */
  def getEnvironment(): String = js.native
  def getLanguage(): String = js.native
  def getLastAccessToken(): String = js.native
  def getLastAccessToken(scope: String): String = js.native
  def getLoginName(realmName: String): String = js.native
  /**
    * @deprecated since version 7.0
    */
  def getRequiredAccessTokenScope(status: Double, header: String): String = js.native
  def getSharedToken(`object`: SharedTokenObject): JQueryDeferred[_] = js.native
  def getUserInfo(realm: String, key: String): js.Any = js.native
  def getUserName(realm: js.Any): String = js.native
  def getUserPref(key: js.Any): js.Any = js.native
  def hasUserPref(key: js.Any): Boolean = js.native
  def init(options: InitOptions): Unit = js.native
  def invokeProcedure(invocationData: ProcedureInvocationData): JQueryDeferred[typings.ibmMobilefirst.WL.Response] = js.native
  def invokeProcedure(invocationData: ProcedureInvocationData, options: ProcedureInvocationOptions): JQueryDeferred[typings.ibmMobilefirst.WL.Response] = js.native
  /**
    * @deprecated since version 4.1.3. Use WL.Device.getNetworkInfo instead.
    */
  def isConnected(): Unit = js.native
  def isUserAuthenticated(realm: String): Boolean = js.native
  /**
    * @deprecated since version 7.0. Use WL.Logger instead.
    */
  def logActivity(activityType: String): Unit = js.native
  def login(realm: String): Unit = js.native
  def login(realm: String, options: Options): Unit = js.native
  def logout(realm: String): Unit = js.native
  def logout(realm: String, options: Options): Unit = js.native
  def minimize(): Unit = js.native
  /**
    * @deprecated since version 7.0
    */
  def obtainAccessToken(
    scope: String,
    onSuccess: ResponseHandler[typings.ibmMobilefirst.WL.Response],
    onFailure: ResponseHandler[typings.ibmMobilefirst.WL.FailureResponse]
  ): Unit = js.native
  def purgeEventTransmissionBuffer(): Unit = js.native
  def reloadApp(): Unit = js.native
  def removeGlobalHeader(headerName: String): Unit = js.native
  def setEventTransmissionPolicy(policy: EventTransmissionPolicy): Unit = js.native
  def setHeartBeatInterval(interval: Double): Unit = js.native
  def setSharedToken(token: SharedTokenObject): Unit = js.native
  def setUserPref(key: String, value: String): Unit = js.native
  def setUserPref(key: String, value: String, options: Options): Unit = js.native
  def setUserPrefs(userPrefsHash: UserPreferences): Unit = js.native
  def setUserPrefs(userPrefsHash: UserPreferences, options: Options): Unit = js.native
  def transmitEvent(event: js.Any): Unit = js.native
  def transmitEvent(event: js.Any, immediate: Boolean): Unit = js.native
  def updateUserInfo(options: Options): Unit = js.native
}

