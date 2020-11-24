package typings.ineum

import typings.ineum.anon.BackendTraceId
import typings.ineum.anon.ComponentStack
import typings.ineum.ineumStrings.allowedOrigins
import typings.ineum.ineumStrings.apiKey
import typings.ineum.ineumStrings.beaconBatchingTime
import typings.ineum.ineumStrings.getPageLoadId
import typings.ineum.ineumStrings.ignoreErrorMessages
import typings.ineum.ineumStrings.ignorePings
import typings.ineum.ineumStrings.ignoreUrls
import typings.ineum.ineumStrings.ignoreUserTimings
import typings.ineum.ineumStrings.key
import typings.ineum.ineumStrings.maxMaitForPageLoadMetricsMillis
import typings.ineum.ineumStrings.maxWaitForResourceTimingsMillis
import typings.ineum.ineumStrings.meta
import typings.ineum.ineumStrings.page
import typings.ineum.ineumStrings.reportError
import typings.ineum.ineumStrings.reportEvent
import typings.ineum.ineumStrings.reportingUrl
import typings.ineum.ineumStrings.terminateSession
import typings.ineum.ineumStrings.traceId
import typings.ineum.ineumStrings.trackSessions
import typings.ineum.ineumStrings.urlsToCheckForGraphQlInsights
import typings.ineum.ineumStrings.user
import typings.ineum.ineumStrings.whitelistedOrigins
import typings.ineum.ineumStrings.wrapEventHandlers
import typings.ineum.ineumStrings.wrapTimers
import typings.ineum.ineumStrings.xhrTransmissionTimeout
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @JSName("ineum")
  def ineum_allowedOrigins(command: allowedOrigins, values: js.Array[RegExp]): Unit = js.native
  /**
    * Use command: 'key' instead.
    *
    * @deprecated
    */
  // tslint:disable-next-line unified-signatures
  @JSName("ineum")
  def ineum_apiKey(command: apiKey, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_beaconBatchingTime(command: beaconBatchingTime, durationMillis: Double): Unit = js.native
  @JSName("ineum")
  def ineum_getPageLoadId(command: getPageLoadId): js.UndefOr[String] = js.native
  @JSName("ineum")
  def ineum_ignoreErrorMessages(command: ignoreErrorMessages, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_ignorePings(command: ignorePings, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_ignoreUrls(command: ignoreUrls, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_ignoreUserTimings(command: ignoreUserTimings, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_key(command: key, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_maxMaitForPageLoadMetricsMillis(command: maxMaitForPageLoadMetricsMillis, durationMillis: Double): Unit = js.native
  @JSName("ineum")
  def ineum_maxWaitForResourceTimingsMillis(command: maxWaitForResourceTimingsMillis, durationMillis: Double): Unit = js.native
  @JSName("ineum")
  def ineum_meta(command: meta, key: String, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_meta(command: meta, key: String, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_meta(command: meta, key: String, value: Double): Unit = js.native
  @JSName("ineum")
  def ineum_page(command: page, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: String, opts: ComponentStack): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: Error): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: Error, opts: ComponentStack): Unit = js.native
  @JSName("ineum")
  def ineum_reportEvent(command: reportEvent, name: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportEvent(command: reportEvent, name: String, opts: BackendTraceId): Unit = js.native
  @JSName("ineum")
  def ineum_reportingUrl(command: reportingUrl, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_terminateSession(command: terminateSession): Unit = js.native
  @JSName("ineum")
  def ineum_traceId(command: traceId, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(command: trackSessions): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(
    command: trackSessions,
    sessionInactivityTimeout: js.UndefOr[scala.Nothing],
    sessionTerminationTimeout: Double
  ): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double, sessionTerminationTimeout: Double): Unit = js.native
  @JSName("ineum")
  def ineum_urlsToCheckForGraphQlInsights(command: urlsToCheckForGraphQlInsights, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user): Unit = js.native
  @JSName("ineum")
  def ineum_user(
    command: user,
    userId: js.UndefOr[scala.Nothing],
    userName: js.UndefOr[scala.Nothing],
    userEmail: String
  ): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: js.UndefOr[scala.Nothing], userName: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: js.UndefOr[scala.Nothing], userName: String, userEmail: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: js.UndefOr[scala.Nothing], userEmail: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String, userEmail: String): Unit = js.native
  /**
    * Use command: 'allowedOrigins' instead (from release 185).
    *
    * @deprecated
    */
  // tslint:disable-next-line unified-signatures
  @JSName("ineum")
  def ineum_whitelistedOrigins(command: whitelistedOrigins, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_wrapEventHandlers(command: wrapEventHandlers, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_wrapTimers(command: wrapTimers, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_xhrTransmissionTimeout(command: xhrTransmissionTimeout, durationMillis: Double): Unit = js.native
}
