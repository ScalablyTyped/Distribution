package typings.instagramPrivateApi

import typings.instagramPrivateApi.challengeStateResponseMod.ChallengeStateResponse
import typings.instagramPrivateApi.checkpointResponseMod.CheckpointResponse
import typings.request.mod.CookieJar
import typings.toughCookie.mod.Cookie
import typings.toughCookie.mod.CookieJar.Serialized
import typings.toughCookie.mod.MemoryCookieStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/state", JSImport.Namespace)
@js.native
object stateMod extends js.Object {
  @js.native
  class State () extends js.Object {
    var adid: String = js.native
    var adsOptOut: Boolean = js.native
    var authorization: js.UndefOr[String] = js.native
    var build: String = js.native
    var capabilitiesHeader: String = js.native
    var challenge: ChallengeStateResponse | Null = js.native
    var checkpoint: CheckpointResponse | Null = js.native
    var clientSessionIdLifetime: Double = js.native
    var connectionTypeHeader: String = js.native
    var constants: TypeofConstants = js.native
    var cookieJar: CookieJar = js.native
    var cookieStore: MemoryCookieStore = js.native
    var deviceId: String = js.native
    var deviceString: String = js.native
    var euDCEnabled: js.UndefOr[Boolean] = js.native
    var generateTemporaryGuid: js.Any = js.native
    var igWWWClaim: js.UndefOr[String] = js.native
    var isLayoutRTL: Boolean = js.native
    var language: String = js.native
    var passwordEncryptionKeyId: js.UndefOr[String | Double] = js.native
    var passwordEncryptionPubKey: js.UndefOr[String] = js.native
    var phoneId: String = js.native
    var pigeonSessionIdLifetime: Double = js.native
    var proxyUrl: String = js.native
    var radioType: String = js.native
    var supportedCapabilities: js.Array[AnonName | AnonValue] = js.native
    var thumbnailCacheBustingValue: Double = js.native
    var timezoneOffset: String = js.native
    var uuid: String = js.native
    def appUserAgent: String = js.native
    def appVersion: String = js.native
    def appVersionCode: String = js.native
    def batteryLevel: Double = js.native
    def bloksVersionId: String = js.native
    def challengeUrl: String = js.native
    def clientSessionId: String = js.native
    def cookieCsrfToken: String = js.native
    def cookieUserId: String = js.native
    def cookieUsername: String = js.native
    def deserialize(state: String): js.Promise[Unit] = js.native
    def deserialize(state: js.Any): js.Promise[Unit] = js.native
    def deserializeCookieJar(cookies: String): js.Promise[Unit] = js.native
    def deserializeCookieJar(cookies: Serialized): js.Promise[Unit] = js.native
    def devicePayload: AnonAndroidrelease = js.native
    def experiments: String = js.native
    def extractCookie(key: String): Cookie | Null = js.native
    def extractCookieValue(key: String): String = js.native
    def extractUserId(): String = js.native
    def fbAnalyticsApplicationId: String = js.native
    def fbOrcaApplicationId: String = js.native
    def fbOtaFields: String = js.native
    def generateDevice(seed: String): Unit = js.native
    def isCharging: Boolean = js.native
    def isExperimentEnabled(experiment: js.Any): Boolean = js.native
    def loginExperiments: String = js.native
    def pigeonSessionId: String = js.native
    def serialize(): js.Promise[AnonConstants with js.Any] = js.native
    def serializeCookieJar(): js.Promise[Serialized] = js.native
    def signatureKey: String = js.native
    def signatureVersion: String = js.native
    def userBreadcrumbKey: String = js.native
    def webUserAgent: String = js.native
  }
  
  /* static members */
  @js.native
  object State extends js.Object {
    var stateDebug: js.Any = js.native
  }
  
}

