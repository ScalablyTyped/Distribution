package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distResponsesChallengeDotStateDotResponseMod.ChallengeStateResponse
import typings.instagramDashPrivateDashApi.distResponsesCheckpointDotResponseMod.CheckpointResponse
import typings.request.requestMod.CookieJar
import typings.toughDashCookie.toughDashCookieMod.Cookie
import typings.toughDashCookie.toughDashCookieMod.CookieJar.Serialized
import typings.toughDashCookie.toughDashCookieMod.MemoryCookieStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/state", JSImport.Namespace)
@js.native
object distCoreStateMod extends js.Object {
  @js.native
  class State () extends js.Object {
    var adid: String = js.native
    val appUserAgent: String = js.native
    var appVersion: String = js.native
    var appVersionCode: String = js.native
    val batteryLevel: Double = js.native
    var build: String = js.native
    var capabilitiesHeader: String = js.native
    var challenge: ChallengeStateResponse | Null = js.native
    val challengeUrl: String = js.native
    var checkpoint: CheckpointResponse | Null = js.native
    val clientSessionId: String = js.native
    var clientSessionIdLifetime: Double = js.native
    var connectionTypeHeader: String = js.native
    val cookieCsrfToken: String = js.native
    var cookieJar: CookieJar = js.native
    var cookieStore: MemoryCookieStore = js.native
    val cookieUserId: String = js.native
    val cookieUsername: String = js.native
    var deviceId: String = js.native
    val devicePayload: Anon_Androidrelease = js.native
    var deviceString: String = js.native
    var experiments: String = js.native
    var fbAnalyticsApplicationId: String = js.native
    var fbOrcaApplicationId: String = js.native
    var fbOtaFields: String = js.native
    var generateTemporaryGuid: js.Any = js.native
    val isCharging: Boolean = js.native
    var language: String = js.native
    var loginExperiments: String = js.native
    var phoneId: String = js.native
    val pigeonSessionId: String = js.native
    var pigeonSessionIdLifetime: Double = js.native
    var proxyUrl: String = js.native
    var radioType: String = js.native
    var signatureKey: String = js.native
    var signatureVersion: String = js.native
    var supportedCapabilities: js.Array[Anon_Name | Anon_NameValue] = js.native
    var timezoneOffset: String = js.native
    var userBreadcrumbKey: String = js.native
    var uuid: String = js.native
    val webUserAgent: String = js.native
    def deserializeCookieJar(cookies: String): js.Promise[Unit] = js.native
    def extractCookie(key: String): Cookie | Null = js.native
    def extractCookieValue(key: String): String = js.native
    def extractUserId(): String = js.native
    def generateDevice(seed: String): Unit = js.native
    def isExperimentEnabled(experiment: js.Any): Boolean = js.native
    def serializeCookieJar(): js.Promise[Serialized] = js.native
  }
  
}

