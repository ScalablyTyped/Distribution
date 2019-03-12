package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Client")
@js.native
object ^ extends js.Object {
  def addGlobalHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit = js.native
  def checkForDirectUpdate(options: ibmDashMobilefirstLib.WLNs.Options): scala.Unit = js.native
  def clearSharedToken(`object`: SharedTokenObject): jqueryLib.JQueryDeferred[_] = js.native
  def close(): scala.Unit = js.native
  def connect(): scala.Unit = js.native
  def connect(options: ConnectOptions): scala.Unit = js.native
  def createChallengeHandler(realmName: java.lang.String): AbstractChallengeHandler = js.native
  def createProvisioningChallengeHandler(realmName: java.lang.String): AbstractChallengeHandler = js.native
  def createWLChallengeHandler(realName: java.lang.String): AbstractChallengeHandler = js.native
  def deleteUserPref(key: java.lang.String): scala.Unit = js.native
  def deleteUserPref(key: java.lang.String, options: ibmDashMobilefirstLib.WLNs.Options): scala.Unit = js.native
  /**
    * See WL.AppProperty for possible results
    */
  def getAppProperty(property: js.Any): js.Any = js.native
  /**
    * See WL.Environment for possible results
    */
  def getEnvironment(): java.lang.String = js.native
  def getLanguage(): java.lang.String = js.native
  def getLastAccessToken(): java.lang.String = js.native
  def getLastAccessToken(scope: java.lang.String): java.lang.String = js.native
  def getLoginName(realmName: java.lang.String): java.lang.String = js.native
  /**
    * @deprecated since version 7.0
    */
  def getRequiredAccessTokenScope(status: scala.Double, header: java.lang.String): java.lang.String = js.native
  def getSharedToken(`object`: SharedTokenObject): jqueryLib.JQueryDeferred[_] = js.native
  def getUserInfo(realm: java.lang.String, key: java.lang.String): js.Any = js.native
  def getUserName(realm: js.Any): java.lang.String = js.native
  def getUserPref(key: js.Any): js.Any = js.native
  def hasUserPref(key: js.Any): scala.Boolean = js.native
  def init(options: InitOptions): scala.Unit = js.native
  def invokeProcedure(invocationData: ProcedureInvocationData): jqueryLib.JQueryDeferred[ibmDashMobilefirstLib.WLNs.Response] = js.native
  def invokeProcedure(invocationData: ProcedureInvocationData, options: ProcedureInvocationOptions): jqueryLib.JQueryDeferred[ibmDashMobilefirstLib.WLNs.Response] = js.native
  /**
    * @deprecated since version 4.1.3. Use WL.Device.getNetworkInfo instead.
    */
  def isConnected(): scala.Unit = js.native
  def isUserAuthenticated(realm: java.lang.String): scala.Boolean = js.native
  /**
    * @deprecated since version 7.0. Use WL.Logger instead.
    */
  def logActivity(activityType: java.lang.String): scala.Unit = js.native
  def login(realm: java.lang.String): scala.Unit = js.native
  def login(realm: java.lang.String, options: ibmDashMobilefirstLib.WLNs.Options): scala.Unit = js.native
  def logout(realm: java.lang.String): scala.Unit = js.native
  def logout(realm: java.lang.String, options: ibmDashMobilefirstLib.WLNs.Options): scala.Unit = js.native
  def minimize(): scala.Unit = js.native
  /**
    * @deprecated since version 7.0
    */
  def obtainAccessToken(
    scope: java.lang.String,
    onSuccess: ibmDashMobilefirstLib.WLNs.ResponseHandler[ibmDashMobilefirstLib.WLNs.Response],
    onFailure: ibmDashMobilefirstLib.WLNs.ResponseHandler[ibmDashMobilefirstLib.WLNs.FailureResponse]
  ): scala.Unit = js.native
  def purgeEventTransmissionBuffer(): scala.Unit = js.native
  def reloadApp(): scala.Unit = js.native
  def removeGlobalHeader(headerName: java.lang.String): scala.Unit = js.native
  def setEventTransmissionPolicy(policy: EventTransmissionPolicy): scala.Unit = js.native
  def setHeartBeatInterval(interval: scala.Double): scala.Unit = js.native
  def setSharedToken(token: SharedTokenObject): scala.Unit = js.native
  def setUserPref(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setUserPref(key: java.lang.String, value: java.lang.String, options: ibmDashMobilefirstLib.WLNs.Options): scala.Unit = js.native
  def setUserPrefs(userPrefsHash: UserPreferences): scala.Unit = js.native
  def setUserPrefs(userPrefsHash: UserPreferences, options: ibmDashMobilefirstLib.WLNs.Options): scala.Unit = js.native
  def transmitEvent(event: js.Any): scala.Unit = js.native
  def transmitEvent(event: js.Any, immediate: scala.Boolean): scala.Unit = js.native
  def updateUserInfo(options: ibmDashMobilefirstLib.WLNs.Options): scala.Unit = js.native
}

