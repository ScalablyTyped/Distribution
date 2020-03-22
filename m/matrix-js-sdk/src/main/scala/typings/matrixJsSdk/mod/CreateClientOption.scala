package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.matrixJsSdk.AnonGetAccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientOption extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var cryptoCallbacks: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.undefined
  var cryptoStore: js.UndefOr[js.Any] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var deviceToImport: js.UndefOr[js.Any] = js.undefined
  var fallbackICEServerAllowed: js.UndefOr[Boolean] = js.undefined
  var forceTURN: js.UndefOr[Boolean] = js.undefined
  var idBaseUrl: js.UndefOr[String] = js.undefined
  var identityServer: js.UndefOr[AnonGetAccessToken] = js.undefined
  var localTimeoutMs: js.UndefOr[Double] = js.undefined
  var queryParams: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[js.Any] = js.undefined
  var scheduler: js.UndefOr[MatrixScheduler] = js.undefined
  var store: js.UndefOr[MatrixStore] = js.undefined
  var timelineSupport: js.UndefOr[Boolean] = js.undefined
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
  var useAuthorizationHeader: js.UndefOr[Boolean] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
  var verificationMethods: js.UndefOr[js.Array[String]] = js.undefined
}

object CreateClientOption {
  @scala.inline
  def apply(
    accessToken: String = null,
    baseUrl: String = null,
    cryptoCallbacks: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null,
    cryptoStore: js.Any = null,
    deviceId: String = null,
    deviceToImport: js.Any = null,
    fallbackICEServerAllowed: js.UndefOr[Boolean] = js.undefined,
    forceTURN: js.UndefOr[Boolean] = js.undefined,
    idBaseUrl: String = null,
    identityServer: AnonGetAccessToken = null,
    localTimeoutMs: Int | Double = null,
    queryParams: js.Any = null,
    request: js.Any = null,
    scheduler: MatrixScheduler = null,
    store: MatrixStore = null,
    timelineSupport: js.UndefOr[Boolean] = js.undefined,
    unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined,
    useAuthorizationHeader: js.UndefOr[Boolean] = js.undefined,
    userId: String = null,
    verificationMethods: js.Array[String] = null
  ): CreateClientOption = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (cryptoCallbacks != null) __obj.updateDynamic("cryptoCallbacks")(cryptoCallbacks.asInstanceOf[js.Any])
    if (cryptoStore != null) __obj.updateDynamic("cryptoStore")(cryptoStore.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceToImport != null) __obj.updateDynamic("deviceToImport")(deviceToImport.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackICEServerAllowed)) __obj.updateDynamic("fallbackICEServerAllowed")(fallbackICEServerAllowed.asInstanceOf[js.Any])
    if (!js.isUndefined(forceTURN)) __obj.updateDynamic("forceTURN")(forceTURN.asInstanceOf[js.Any])
    if (idBaseUrl != null) __obj.updateDynamic("idBaseUrl")(idBaseUrl.asInstanceOf[js.Any])
    if (identityServer != null) __obj.updateDynamic("identityServer")(identityServer.asInstanceOf[js.Any])
    if (localTimeoutMs != null) __obj.updateDynamic("localTimeoutMs")(localTimeoutMs.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (scheduler != null) __obj.updateDynamic("scheduler")(scheduler.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(timelineSupport)) __obj.updateDynamic("timelineSupport")(timelineSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(unstableClientRelationAggregation)) __obj.updateDynamic("unstableClientRelationAggregation")(unstableClientRelationAggregation.asInstanceOf[js.Any])
    if (!js.isUndefined(useAuthorizationHeader)) __obj.updateDynamic("useAuthorizationHeader")(useAuthorizationHeader.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (verificationMethods != null) __obj.updateDynamic("verificationMethods")(verificationMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOption]
  }
}

