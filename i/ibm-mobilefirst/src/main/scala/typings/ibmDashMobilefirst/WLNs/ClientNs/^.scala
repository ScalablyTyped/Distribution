package typings.ibmDashMobilefirst.WLNs.ClientNs

import typings.ibmDashMobilefirst.WLNs.FailureResponse
import typings.ibmDashMobilefirst.WLNs.Options
import typings.ibmDashMobilefirst.WLNs.Response
import typings.ibmDashMobilefirst.WLNs.ResponseHandler
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Client")
@js.native
object ^ extends js.Object {
  def addGlobalHeader(headerName: String, headerValue: String): Unit = js.native
  def checkForDirectUpdate(options: Options): Unit = js.native
  def clearSharedToken(`object`: SharedTokenObject): JQueryDeferred[_] = js.native
  def close(): Unit = js.native
  def connect(): Unit = js.native
  def connect(options: ConnectOptions): Unit = js.native
  def createChallengeHandler(realmName: String): AbstractChallengeHandler = js.native
  def createProvisioningChallengeHandler(realmName: String): AbstractChallengeHandler = js.native
  def createWLChallengeHandler(realName: String): AbstractChallengeHandler = js.native
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
  def invokeProcedure(invocationData: ProcedureInvocationData): JQueryDeferred[Response] = js.native
  def invokeProcedure(invocationData: ProcedureInvocationData, options: ProcedureInvocationOptions): JQueryDeferred[Response] = js.native
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
  def obtainAccessToken(scope: String, onSuccess: ResponseHandler[Response], onFailure: ResponseHandler[FailureResponse]): Unit = js.native
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

