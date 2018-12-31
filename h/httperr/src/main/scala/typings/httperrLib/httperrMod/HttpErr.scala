package typings
package httperrLib.httperrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpErr extends js.Object {
  // Error builders by statusCode.
  @JSName("400")
  var `400_Original`: ErrorBuilder = js.native
  @JSName("401")
  var `401_Original`: ErrorBuilder = js.native
  @JSName("402")
  var `402_Original`: ErrorBuilder = js.native
  @JSName("403")
  var `403_Original`: ErrorBuilder = js.native
  @JSName("404")
  var `404_Original`: ErrorBuilder = js.native
  @JSName("405")
  var `405_Original`: ErrorBuilder = js.native
  @JSName("406")
  var `406_Original`: ErrorBuilder = js.native
  @JSName("407")
  var `407_Original`: ErrorBuilder = js.native
  @JSName("408")
  var `408_Original`: ErrorBuilder = js.native
  @JSName("409")
  var `409_Original`: ErrorBuilder = js.native
  @JSName("410")
  var `410_Original`: ErrorBuilder = js.native
  @JSName("411")
  var `411_Original`: ErrorBuilder = js.native
  @JSName("412")
  var `412_Original`: ErrorBuilder = js.native
  @JSName("413")
  var `413_Original`: ErrorBuilder = js.native
  @JSName("414")
  var `414_Original`: ErrorBuilder = js.native
  @JSName("415")
  var `415_Original`: ErrorBuilder = js.native
  @JSName("416")
  var `416_Original`: ErrorBuilder = js.native
  @JSName("417")
  var `417_Original`: ErrorBuilder = js.native
  @JSName("418")
  var `418_Original`: ErrorBuilder = js.native
  @JSName("419")
  var `419_Original`: ErrorBuilder = js.native
  @JSName("420")
  var `420_Original`: ErrorBuilder = js.native
  @JSName("422")
  var `422_Original`: ErrorBuilder = js.native
  @JSName("423")
  var `423_Original`: ErrorBuilder = js.native
  @JSName("424")
  var `424_Original`: ErrorBuilder = js.native
  @JSName("425")
  var `425_Original`: ErrorBuilder = js.native
  @JSName("426")
  var `426_Original`: ErrorBuilder = js.native
  @JSName("428")
  var `428_Original`: ErrorBuilder = js.native
  @JSName("429")
  var `429_Original`: ErrorBuilder = js.native
  @JSName("431")
  var `431_Original`: ErrorBuilder = js.native
  @JSName("440")
  var `440_Original`: ErrorBuilder = js.native
  @JSName("444")
  var `444_Original`: ErrorBuilder = js.native
  @JSName("449")
  var `449_Original`: ErrorBuilder = js.native
  @JSName("450")
  var `450_Original`: ErrorBuilder = js.native
  @JSName("451")
  var `451_Original`: ErrorBuilder = js.native
  @JSName("494")
  var `494_Original`: ErrorBuilder = js.native
  @JSName("495")
  var `495_Original`: ErrorBuilder = js.native
  @JSName("496")
  var `496_Original`: ErrorBuilder = js.native
  @JSName("497")
  var `497_Original`: ErrorBuilder = js.native
  @JSName("499")
  var `499_Original`: ErrorBuilder = js.native
  @JSName("500")
  var `500_Original`: ErrorBuilder = js.native
  @JSName("501")
  var `501_Original`: ErrorBuilder = js.native
  @JSName("502")
  var `502_Original`: ErrorBuilder = js.native
  @JSName("503")
  var `503_Original`: ErrorBuilder = js.native
  @JSName("504")
  var `504_Original`: ErrorBuilder = js.native
  @JSName("505")
  var `505_Original`: ErrorBuilder = js.native
  @JSName("506")
  var `506_Original`: ErrorBuilder = js.native
  @JSName("507")
  var `507_Original`: ErrorBuilder = js.native
  @JSName("508")
  var `508_Original`: ErrorBuilder = js.native
  @JSName("509")
  var `509_Original`: ErrorBuilder = js.native
  @JSName("510")
  var `510_Original`: ErrorBuilder = js.native
  @JSName("511")
  var `511_Original`: ErrorBuilder = js.native
  @JSName("520")
  var `520_Original`: ErrorBuilder = js.native
  @JSName("522")
  var `522_Original`: ErrorBuilder = js.native
  @JSName("523")
  var `523_Original`: ErrorBuilder = js.native
  @JSName("524")
  var `524_Original`: ErrorBuilder = js.native
  @JSName("598")
  var `598_Original`: ErrorBuilder = js.native
  @JSName("599")
  var `599_Original`: ErrorBuilder = js.native
  @JSName("ATimeoutOccured")
  var ATimeoutOccured_Original: ErrorBuilder = js.native
  @JSName("AuthenticationTimeout")
  var AuthenticationTimeout_Original: ErrorBuilder = js.native
  @JSName("BadGateway")
  var BadGateway_Original: ErrorBuilder = js.native
  // Error builders by title-cased name.
  @JSName("BadRequest")
  var BadRequest_Original: ErrorBuilder = js.native
  @JSName("BandwidthLimitExceeded")
  var BandwidthLimitExceeded_Original: ErrorBuilder = js.native
  @JSName("BlockedByWindowsParentalControls")
  var BlockedByWindowsParentalControls_Original: ErrorBuilder = js.native
  @JSName("CertError")
  var CertError_Original: ErrorBuilder = js.native
  @JSName("ClientClosedRequest")
  var ClientClosedRequest_Original: ErrorBuilder = js.native
  @JSName("Conflict")
  var Conflict_Original: ErrorBuilder = js.native
  @JSName("ConnectionTimedOut")
  var ConnectionTimedOut_Original: ErrorBuilder = js.native
  @JSName("EnhanceYourCalm")
  var EnhanceYourCalm_Original: ErrorBuilder = js.native
  @JSName("ExpectationFailed")
  var ExpectationFailed_Original: ErrorBuilder = js.native
  @JSName("FailedDependency")
  var FailedDependency_Original: ErrorBuilder = js.native
  @JSName("Forbidden")
  var Forbidden_Original: ErrorBuilder = js.native
  @JSName("GatewayTimeout")
  var GatewayTimeout_Original: ErrorBuilder = js.native
  @JSName("Gone")
  var Gone_Original: ErrorBuilder = js.native
  /** The base type for all httperr error types. You probably don't want to use this directly. */
  var HttpError: HttpErrorStatic = js.native
  @JSName("HttpToHttps")
  var HttpToHttps_Original: ErrorBuilder = js.native
  @JSName("HttpVersionNotSupported")
  var HttpVersionNotSupported_Original: ErrorBuilder = js.native
  @JSName("ImATeapot")
  var ImATeapot_Original: ErrorBuilder = js.native
  @JSName("InsufficientStorage")
  var InsufficientStorage_Original: ErrorBuilder = js.native
  @JSName("InternalServerError")
  var InternalServerError_Original: ErrorBuilder = js.native
  @JSName("LengthRequired")
  var LengthRequired_Original: ErrorBuilder = js.native
  @JSName("Locked")
  var Locked_Original: ErrorBuilder = js.native
  @JSName("LoginTimeout")
  var LoginTimeout_Original: ErrorBuilder = js.native
  @JSName("LoopDetected")
  var LoopDetected_Original: ErrorBuilder = js.native
  @JSName("MethodFailure")
  var MethodFailure_Original: ErrorBuilder = js.native
  @JSName("MethodNotAllowed")
  var MethodNotAllowed_Original: ErrorBuilder = js.native
  @JSName("NetworkAuthenticationRequired")
  var NetworkAuthenticationRequired_Original: ErrorBuilder = js.native
  @JSName("NetworkConnectTimeoutError")
  var NetworkConnectTimeoutError_Original: ErrorBuilder = js.native
  @JSName("NetworkReadTimeoutError")
  var NetworkReadTimeoutError_Original: ErrorBuilder = js.native
  @JSName("NoCert")
  var NoCert_Original: ErrorBuilder = js.native
  @JSName("NoResponse")
  var NoResponse_Original: ErrorBuilder = js.native
  @JSName("NotAcceptable")
  var NotAcceptable_Original: ErrorBuilder = js.native
  @JSName("NotExtended")
  var NotExtended_Original: ErrorBuilder = js.native
  @JSName("NotFound")
  var NotFound_Original: ErrorBuilder = js.native
  @JSName("NotImplemented")
  var NotImplemented_Original: ErrorBuilder = js.native
  @JSName("OriginError")
  var OriginError_Original: ErrorBuilder = js.native
  @JSName("PaymentRequired")
  var PaymentRequired_Original: ErrorBuilder = js.native
  @JSName("PreconditionFailed")
  var PreconditionFailed_Original: ErrorBuilder = js.native
  @JSName("PreconditionRequired")
  var PreconditionRequired_Original: ErrorBuilder = js.native
  @JSName("ProxyAuthenticationRequired")
  var ProxyAuthenticationRequired_Original: ErrorBuilder = js.native
  @JSName("ProxyDeclinedRequest")
  var ProxyDeclinedRequest_Original: ErrorBuilder = js.native
  @JSName("Redirect")
  var Redirect_Original: ErrorBuilder = js.native
  @JSName("RequestEntityTooLarge")
  var RequestEntityTooLarge_Original: ErrorBuilder = js.native
  @JSName("RequestHeaderFieldsTooLarge")
  var RequestHeaderFieldsTooLarge_Original: ErrorBuilder = js.native
  @JSName("RequestHeaderTooLarge")
  var RequestHeaderTooLarge_Original: ErrorBuilder = js.native
  @JSName("RequestTimeout")
  var RequestTimeout_Original: ErrorBuilder = js.native
  @JSName("RequestUriTooLong")
  var RequestUriTooLong_Original: ErrorBuilder = js.native
  @JSName("RequestedRangeNotSatisfiable")
  var RequestedRangeNotSatisfiable_Original: ErrorBuilder = js.native
  @JSName("RetryWith")
  var RetryWith_Original: ErrorBuilder = js.native
  @JSName("ServiceUnavailable")
  var ServiceUnavailable_Original: ErrorBuilder = js.native
  @JSName("TooManyRequests")
  var TooManyRequests_Original: ErrorBuilder = js.native
  @JSName("Unauthorized")
  var Unauthorized_Original: ErrorBuilder = js.native
  @JSName("UnavailableForLegalReasons")
  var UnavailableForLegalReasons_Original: ErrorBuilder = js.native
  @JSName("UnorderedCollection")
  var UnorderedCollection_Original: ErrorBuilder = js.native
  @JSName("UnprocessableEntity")
  var UnprocessableEntity_Original: ErrorBuilder = js.native
  @JSName("UnsupportedMediaType")
  var UnsupportedMediaType_Original: ErrorBuilder = js.native
  @JSName("UpgradeRequired")
  var UpgradeRequired_Original: ErrorBuilder = js.native
  @JSName("VariantAlsoNegotiates")
  var VariantAlsoNegotiates_Original: ErrorBuilder = js.native
  @JSName("aTimeoutOccured")
  var aTimeoutOccured_Original: ErrorBuilder = js.native
  @JSName("authenticationTimeout")
  var authenticationTimeout_Original: ErrorBuilder = js.native
  @JSName("badGateway")
  var badGateway_Original: ErrorBuilder = js.native
  // Error builders by camel-cased name.
  @JSName("badRequest")
  var badRequest_Original: ErrorBuilder = js.native
  @JSName("bandwidthLimitExceeded")
  var bandwidthLimitExceeded_Original: ErrorBuilder = js.native
  @JSName("blockedByWindowsParentalControls")
  var blockedByWindowsParentalControls_Original: ErrorBuilder = js.native
  @JSName("certError")
  var certError_Original: ErrorBuilder = js.native
  @JSName("clientClosedRequest")
  var clientClosedRequest_Original: ErrorBuilder = js.native
  @JSName("conflict")
  var conflict_Original: ErrorBuilder = js.native
  @JSName("connectionTimedOut")
  var connectionTimedOut_Original: ErrorBuilder = js.native
  @JSName("enhanceYourCalm")
  var enhanceYourCalm_Original: ErrorBuilder = js.native
  @JSName("expectationFailed")
  var expectationFailed_Original: ErrorBuilder = js.native
  @JSName("failedDependency")
  var failedDependency_Original: ErrorBuilder = js.native
  @JSName("forbidden")
  var forbidden_Original: ErrorBuilder = js.native
  @JSName("gatewayTimeout")
  var gatewayTimeout_Original: ErrorBuilder = js.native
  @JSName("gone")
  var gone_Original: ErrorBuilder = js.native
  @JSName("httpToHttps")
  var httpToHttps_Original: ErrorBuilder = js.native
  @JSName("httpVersionNotSupported")
  var httpVersionNotSupported_Original: ErrorBuilder = js.native
  @JSName("imATeapot")
  var imATeapot_Original: ErrorBuilder = js.native
  @JSName("insufficientStorage")
  var insufficientStorage_Original: ErrorBuilder = js.native
  @JSName("internalServerError")
  var internalServerError_Original: ErrorBuilder = js.native
  @JSName("lengthRequired")
  var lengthRequired_Original: ErrorBuilder = js.native
  @JSName("locked")
  var locked_Original: ErrorBuilder = js.native
  @JSName("loginTimeout")
  var loginTimeout_Original: ErrorBuilder = js.native
  @JSName("loopDetected")
  var loopDetected_Original: ErrorBuilder = js.native
  @JSName("methodFailure")
  var methodFailure_Original: ErrorBuilder = js.native
  @JSName("methodNotAllowed")
  var methodNotAllowed_Original: ErrorBuilder = js.native
  @JSName("networkAuthenticationRequired")
  var networkAuthenticationRequired_Original: ErrorBuilder = js.native
  @JSName("networkConnectTimeoutError")
  var networkConnectTimeoutError_Original: ErrorBuilder = js.native
  @JSName("networkReadTimeoutError")
  var networkReadTimeoutError_Original: ErrorBuilder = js.native
  @JSName("noCert")
  var noCert_Original: ErrorBuilder = js.native
  @JSName("noResponse")
  var noResponse_Original: ErrorBuilder = js.native
  @JSName("notAcceptable")
  var notAcceptable_Original: ErrorBuilder = js.native
  @JSName("notExtended")
  var notExtended_Original: ErrorBuilder = js.native
  @JSName("notFound")
  var notFound_Original: ErrorBuilder = js.native
  @JSName("notImplemented")
  var notImplemented_Original: ErrorBuilder = js.native
  @JSName("originError")
  var originError_Original: ErrorBuilder = js.native
  @JSName("paymentRequired")
  var paymentRequired_Original: ErrorBuilder = js.native
  @JSName("preconditionFailed")
  var preconditionFailed_Original: ErrorBuilder = js.native
  @JSName("preconditionRequired")
  var preconditionRequired_Original: ErrorBuilder = js.native
  @JSName("proxyAuthenticationRequired")
  var proxyAuthenticationRequired_Original: ErrorBuilder = js.native
  @JSName("proxyDeclinedRequest")
  var proxyDeclinedRequest_Original: ErrorBuilder = js.native
  @JSName("redirect")
  var redirect_Original: ErrorBuilder = js.native
  @JSName("requestEntityTooLarge")
  var requestEntityTooLarge_Original: ErrorBuilder = js.native
  @JSName("requestHeaderFieldsTooLarge")
  var requestHeaderFieldsTooLarge_Original: ErrorBuilder = js.native
  @JSName("requestHeaderTooLarge")
  var requestHeaderTooLarge_Original: ErrorBuilder = js.native
  @JSName("requestTimeout")
  var requestTimeout_Original: ErrorBuilder = js.native
  @JSName("requestUriTooLong")
  var requestUriTooLong_Original: ErrorBuilder = js.native
  @JSName("requestedRangeNotSatisfiable")
  var requestedRangeNotSatisfiable_Original: ErrorBuilder = js.native
  @JSName("retryWith")
  var retryWith_Original: ErrorBuilder = js.native
  @JSName("serviceUnavailable")
  var serviceUnavailable_Original: ErrorBuilder = js.native
  @JSName("tooManyRequests")
  var tooManyRequests_Original: ErrorBuilder = js.native
  @JSName("unauthorized")
  var unauthorized_Original: ErrorBuilder = js.native
  @JSName("unavailableForLegalReasons")
  var unavailableForLegalReasons_Original: ErrorBuilder = js.native
  @JSName("unorderedCollection")
  var unorderedCollection_Original: ErrorBuilder = js.native
  @JSName("unprocessableEntity")
  var unprocessableEntity_Original: ErrorBuilder = js.native
  @JSName("unsupportedMediaType")
  var unsupportedMediaType_Original: ErrorBuilder = js.native
  @JSName("upgradeRequired")
  var upgradeRequired_Original: ErrorBuilder = js.native
  @JSName("variantAlsoNegotiates")
  var variantAlsoNegotiates_Original: ErrorBuilder = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  // Error builders by statusCode.
  def `400`(): HttpError = js.native
  def `400`(config: Config): HttpError = js.native
  def `400`(config: java.lang.String): HttpError = js.native
  def `400`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `401`(): HttpError = js.native
  def `401`(config: Config): HttpError = js.native
  def `401`(config: java.lang.String): HttpError = js.native
  def `401`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `402`(): HttpError = js.native
  def `402`(config: Config): HttpError = js.native
  def `402`(config: java.lang.String): HttpError = js.native
  def `402`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `403`(): HttpError = js.native
  def `403`(config: Config): HttpError = js.native
  def `403`(config: java.lang.String): HttpError = js.native
  def `403`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `404`(): HttpError = js.native
  def `404`(config: Config): HttpError = js.native
  def `404`(config: java.lang.String): HttpError = js.native
  def `404`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `405`(): HttpError = js.native
  def `405`(config: Config): HttpError = js.native
  def `405`(config: java.lang.String): HttpError = js.native
  def `405`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `406`(): HttpError = js.native
  def `406`(config: Config): HttpError = js.native
  def `406`(config: java.lang.String): HttpError = js.native
  def `406`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `407`(): HttpError = js.native
  def `407`(config: Config): HttpError = js.native
  def `407`(config: java.lang.String): HttpError = js.native
  def `407`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `408`(): HttpError = js.native
  def `408`(config: Config): HttpError = js.native
  def `408`(config: java.lang.String): HttpError = js.native
  def `408`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `409`(): HttpError = js.native
  def `409`(config: Config): HttpError = js.native
  def `409`(config: java.lang.String): HttpError = js.native
  def `409`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `410`(): HttpError = js.native
  def `410`(config: Config): HttpError = js.native
  def `410`(config: java.lang.String): HttpError = js.native
  def `410`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `411`(): HttpError = js.native
  def `411`(config: Config): HttpError = js.native
  def `411`(config: java.lang.String): HttpError = js.native
  def `411`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `412`(): HttpError = js.native
  def `412`(config: Config): HttpError = js.native
  def `412`(config: java.lang.String): HttpError = js.native
  def `412`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `413`(): HttpError = js.native
  def `413`(config: Config): HttpError = js.native
  def `413`(config: java.lang.String): HttpError = js.native
  def `413`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `414`(): HttpError = js.native
  def `414`(config: Config): HttpError = js.native
  def `414`(config: java.lang.String): HttpError = js.native
  def `414`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `415`(): HttpError = js.native
  def `415`(config: Config): HttpError = js.native
  def `415`(config: java.lang.String): HttpError = js.native
  def `415`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `416`(): HttpError = js.native
  def `416`(config: Config): HttpError = js.native
  def `416`(config: java.lang.String): HttpError = js.native
  def `416`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `417`(): HttpError = js.native
  def `417`(config: Config): HttpError = js.native
  def `417`(config: java.lang.String): HttpError = js.native
  def `417`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `418`(): HttpError = js.native
  def `418`(config: Config): HttpError = js.native
  def `418`(config: java.lang.String): HttpError = js.native
  def `418`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `419`(): HttpError = js.native
  def `419`(config: Config): HttpError = js.native
  def `419`(config: java.lang.String): HttpError = js.native
  def `419`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `420`(): HttpError = js.native
  def `420`(config: Config): HttpError = js.native
  def `420`(config: java.lang.String): HttpError = js.native
  def `420`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `422`(): HttpError = js.native
  def `422`(config: Config): HttpError = js.native
  def `422`(config: java.lang.String): HttpError = js.native
  def `422`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `423`(): HttpError = js.native
  def `423`(config: Config): HttpError = js.native
  def `423`(config: java.lang.String): HttpError = js.native
  def `423`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `424`(): HttpError = js.native
  def `424`(config: Config): HttpError = js.native
  def `424`(config: java.lang.String): HttpError = js.native
  def `424`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `425`(): HttpError = js.native
  def `425`(config: Config): HttpError = js.native
  def `425`(config: java.lang.String): HttpError = js.native
  def `425`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `426`(): HttpError = js.native
  def `426`(config: Config): HttpError = js.native
  def `426`(config: java.lang.String): HttpError = js.native
  def `426`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `428`(): HttpError = js.native
  def `428`(config: Config): HttpError = js.native
  def `428`(config: java.lang.String): HttpError = js.native
  def `428`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `429`(): HttpError = js.native
  def `429`(config: Config): HttpError = js.native
  def `429`(config: java.lang.String): HttpError = js.native
  def `429`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `431`(): HttpError = js.native
  def `431`(config: Config): HttpError = js.native
  def `431`(config: java.lang.String): HttpError = js.native
  def `431`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `440`(): HttpError = js.native
  def `440`(config: Config): HttpError = js.native
  def `440`(config: java.lang.String): HttpError = js.native
  def `440`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `444`(): HttpError = js.native
  def `444`(config: Config): HttpError = js.native
  def `444`(config: java.lang.String): HttpError = js.native
  def `444`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `449`(): HttpError = js.native
  def `449`(config: Config): HttpError = js.native
  def `449`(config: java.lang.String): HttpError = js.native
  def `449`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `450`(): HttpError = js.native
  def `450`(config: Config): HttpError = js.native
  def `450`(config: java.lang.String): HttpError = js.native
  def `450`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `451`(): HttpError = js.native
  def `451`(config: Config): HttpError = js.native
  def `451`(config: java.lang.String): HttpError = js.native
  def `451`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `494`(): HttpError = js.native
  def `494`(config: Config): HttpError = js.native
  def `494`(config: java.lang.String): HttpError = js.native
  def `494`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `495`(): HttpError = js.native
  def `495`(config: Config): HttpError = js.native
  def `495`(config: java.lang.String): HttpError = js.native
  def `495`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `496`(): HttpError = js.native
  def `496`(config: Config): HttpError = js.native
  def `496`(config: java.lang.String): HttpError = js.native
  def `496`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `497`(): HttpError = js.native
  def `497`(config: Config): HttpError = js.native
  def `497`(config: java.lang.String): HttpError = js.native
  def `497`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `499`(): HttpError = js.native
  def `499`(config: Config): HttpError = js.native
  def `499`(config: java.lang.String): HttpError = js.native
  def `499`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `500`(): HttpError = js.native
  def `500`(config: Config): HttpError = js.native
  def `500`(config: java.lang.String): HttpError = js.native
  def `500`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `501`(): HttpError = js.native
  def `501`(config: Config): HttpError = js.native
  def `501`(config: java.lang.String): HttpError = js.native
  def `501`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `502`(): HttpError = js.native
  def `502`(config: Config): HttpError = js.native
  def `502`(config: java.lang.String): HttpError = js.native
  def `502`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `503`(): HttpError = js.native
  def `503`(config: Config): HttpError = js.native
  def `503`(config: java.lang.String): HttpError = js.native
  def `503`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `504`(): HttpError = js.native
  def `504`(config: Config): HttpError = js.native
  def `504`(config: java.lang.String): HttpError = js.native
  def `504`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `505`(): HttpError = js.native
  def `505`(config: Config): HttpError = js.native
  def `505`(config: java.lang.String): HttpError = js.native
  def `505`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `506`(): HttpError = js.native
  def `506`(config: Config): HttpError = js.native
  def `506`(config: java.lang.String): HttpError = js.native
  def `506`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `507`(): HttpError = js.native
  def `507`(config: Config): HttpError = js.native
  def `507`(config: java.lang.String): HttpError = js.native
  def `507`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `508`(): HttpError = js.native
  def `508`(config: Config): HttpError = js.native
  def `508`(config: java.lang.String): HttpError = js.native
  def `508`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `509`(): HttpError = js.native
  def `509`(config: Config): HttpError = js.native
  def `509`(config: java.lang.String): HttpError = js.native
  def `509`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `510`(): HttpError = js.native
  def `510`(config: Config): HttpError = js.native
  def `510`(config: java.lang.String): HttpError = js.native
  def `510`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `511`(): HttpError = js.native
  def `511`(config: Config): HttpError = js.native
  def `511`(config: java.lang.String): HttpError = js.native
  def `511`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `520`(): HttpError = js.native
  def `520`(config: Config): HttpError = js.native
  def `520`(config: java.lang.String): HttpError = js.native
  def `520`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `522`(): HttpError = js.native
  def `522`(config: Config): HttpError = js.native
  def `522`(config: java.lang.String): HttpError = js.native
  def `522`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `523`(): HttpError = js.native
  def `523`(config: Config): HttpError = js.native
  def `523`(config: java.lang.String): HttpError = js.native
  def `523`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `524`(): HttpError = js.native
  def `524`(config: Config): HttpError = js.native
  def `524`(config: java.lang.String): HttpError = js.native
  def `524`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `598`(): HttpError = js.native
  def `598`(config: Config): HttpError = js.native
  def `598`(config: java.lang.String): HttpError = js.native
  def `598`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def `599`(): HttpError = js.native
  def `599`(config: Config): HttpError = js.native
  def `599`(config: java.lang.String): HttpError = js.native
  def `599`(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ATimeoutOccured(): HttpError = js.native
  def ATimeoutOccured(config: Config): HttpError = js.native
  def ATimeoutOccured(config: java.lang.String): HttpError = js.native
  def ATimeoutOccured(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def AuthenticationTimeout(): HttpError = js.native
  def AuthenticationTimeout(config: Config): HttpError = js.native
  def AuthenticationTimeout(config: java.lang.String): HttpError = js.native
  def AuthenticationTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def BadGateway(): HttpError = js.native
  def BadGateway(config: Config): HttpError = js.native
  def BadGateway(config: java.lang.String): HttpError = js.native
  def BadGateway(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  // Error builders by title-cased name.
  def BadRequest(): HttpError = js.native
  def BadRequest(config: Config): HttpError = js.native
  def BadRequest(config: java.lang.String): HttpError = js.native
  def BadRequest(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def BandwidthLimitExceeded(): HttpError = js.native
  def BandwidthLimitExceeded(config: Config): HttpError = js.native
  def BandwidthLimitExceeded(config: java.lang.String): HttpError = js.native
  def BandwidthLimitExceeded(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def BlockedByWindowsParentalControls(): HttpError = js.native
  def BlockedByWindowsParentalControls(config: Config): HttpError = js.native
  def BlockedByWindowsParentalControls(config: java.lang.String): HttpError = js.native
  def BlockedByWindowsParentalControls(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def CertError(): HttpError = js.native
  def CertError(config: Config): HttpError = js.native
  def CertError(config: java.lang.String): HttpError = js.native
  def CertError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ClientClosedRequest(): HttpError = js.native
  def ClientClosedRequest(config: Config): HttpError = js.native
  def ClientClosedRequest(config: java.lang.String): HttpError = js.native
  def ClientClosedRequest(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def Conflict(): HttpError = js.native
  def Conflict(config: Config): HttpError = js.native
  def Conflict(config: java.lang.String): HttpError = js.native
  def Conflict(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ConnectionTimedOut(): HttpError = js.native
  def ConnectionTimedOut(config: Config): HttpError = js.native
  def ConnectionTimedOut(config: java.lang.String): HttpError = js.native
  def ConnectionTimedOut(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def EnhanceYourCalm(): HttpError = js.native
  def EnhanceYourCalm(config: Config): HttpError = js.native
  def EnhanceYourCalm(config: java.lang.String): HttpError = js.native
  def EnhanceYourCalm(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ExpectationFailed(): HttpError = js.native
  def ExpectationFailed(config: Config): HttpError = js.native
  def ExpectationFailed(config: java.lang.String): HttpError = js.native
  def ExpectationFailed(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def FailedDependency(): HttpError = js.native
  def FailedDependency(config: Config): HttpError = js.native
  def FailedDependency(config: java.lang.String): HttpError = js.native
  def FailedDependency(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def Forbidden(): HttpError = js.native
  def Forbidden(config: Config): HttpError = js.native
  def Forbidden(config: java.lang.String): HttpError = js.native
  def Forbidden(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def GatewayTimeout(): HttpError = js.native
  def GatewayTimeout(config: Config): HttpError = js.native
  def GatewayTimeout(config: java.lang.String): HttpError = js.native
  def GatewayTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def Gone(): HttpError = js.native
  def Gone(config: Config): HttpError = js.native
  def Gone(config: java.lang.String): HttpError = js.native
  def Gone(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def HttpToHttps(): HttpError = js.native
  def HttpToHttps(config: Config): HttpError = js.native
  def HttpToHttps(config: java.lang.String): HttpError = js.native
  def HttpToHttps(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def HttpVersionNotSupported(): HttpError = js.native
  def HttpVersionNotSupported(config: Config): HttpError = js.native
  def HttpVersionNotSupported(config: java.lang.String): HttpError = js.native
  def HttpVersionNotSupported(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ImATeapot(): HttpError = js.native
  def ImATeapot(config: Config): HttpError = js.native
  def ImATeapot(config: java.lang.String): HttpError = js.native
  def ImATeapot(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def InsufficientStorage(): HttpError = js.native
  def InsufficientStorage(config: Config): HttpError = js.native
  def InsufficientStorage(config: java.lang.String): HttpError = js.native
  def InsufficientStorage(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def InternalServerError(): HttpError = js.native
  def InternalServerError(config: Config): HttpError = js.native
  def InternalServerError(config: java.lang.String): HttpError = js.native
  def InternalServerError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def LengthRequired(): HttpError = js.native
  def LengthRequired(config: Config): HttpError = js.native
  def LengthRequired(config: java.lang.String): HttpError = js.native
  def LengthRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def Locked(): HttpError = js.native
  def Locked(config: Config): HttpError = js.native
  def Locked(config: java.lang.String): HttpError = js.native
  def Locked(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def LoginTimeout(): HttpError = js.native
  def LoginTimeout(config: Config): HttpError = js.native
  def LoginTimeout(config: java.lang.String): HttpError = js.native
  def LoginTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def LoopDetected(): HttpError = js.native
  def LoopDetected(config: Config): HttpError = js.native
  def LoopDetected(config: java.lang.String): HttpError = js.native
  def LoopDetected(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def MethodFailure(): HttpError = js.native
  def MethodFailure(config: Config): HttpError = js.native
  def MethodFailure(config: java.lang.String): HttpError = js.native
  def MethodFailure(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def MethodNotAllowed(): HttpError = js.native
  def MethodNotAllowed(config: Config): HttpError = js.native
  def MethodNotAllowed(config: java.lang.String): HttpError = js.native
  def MethodNotAllowed(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NetworkAuthenticationRequired(): HttpError = js.native
  def NetworkAuthenticationRequired(config: Config): HttpError = js.native
  def NetworkAuthenticationRequired(config: java.lang.String): HttpError = js.native
  def NetworkAuthenticationRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NetworkConnectTimeoutError(): HttpError = js.native
  def NetworkConnectTimeoutError(config: Config): HttpError = js.native
  def NetworkConnectTimeoutError(config: java.lang.String): HttpError = js.native
  def NetworkConnectTimeoutError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NetworkReadTimeoutError(): HttpError = js.native
  def NetworkReadTimeoutError(config: Config): HttpError = js.native
  def NetworkReadTimeoutError(config: java.lang.String): HttpError = js.native
  def NetworkReadTimeoutError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NoCert(): HttpError = js.native
  def NoCert(config: Config): HttpError = js.native
  def NoCert(config: java.lang.String): HttpError = js.native
  def NoCert(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NoResponse(): HttpError = js.native
  def NoResponse(config: Config): HttpError = js.native
  def NoResponse(config: java.lang.String): HttpError = js.native
  def NoResponse(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NotAcceptable(): HttpError = js.native
  def NotAcceptable(config: Config): HttpError = js.native
  def NotAcceptable(config: java.lang.String): HttpError = js.native
  def NotAcceptable(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NotExtended(): HttpError = js.native
  def NotExtended(config: Config): HttpError = js.native
  def NotExtended(config: java.lang.String): HttpError = js.native
  def NotExtended(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NotFound(): HttpError = js.native
  def NotFound(config: Config): HttpError = js.native
  def NotFound(config: java.lang.String): HttpError = js.native
  def NotFound(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def NotImplemented(): HttpError = js.native
  def NotImplemented(config: Config): HttpError = js.native
  def NotImplemented(config: java.lang.String): HttpError = js.native
  def NotImplemented(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def OriginError(): HttpError = js.native
  def OriginError(config: Config): HttpError = js.native
  def OriginError(config: java.lang.String): HttpError = js.native
  def OriginError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def PaymentRequired(): HttpError = js.native
  def PaymentRequired(config: Config): HttpError = js.native
  def PaymentRequired(config: java.lang.String): HttpError = js.native
  def PaymentRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def PreconditionFailed(): HttpError = js.native
  def PreconditionFailed(config: Config): HttpError = js.native
  def PreconditionFailed(config: java.lang.String): HttpError = js.native
  def PreconditionFailed(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def PreconditionRequired(): HttpError = js.native
  def PreconditionRequired(config: Config): HttpError = js.native
  def PreconditionRequired(config: java.lang.String): HttpError = js.native
  def PreconditionRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ProxyAuthenticationRequired(): HttpError = js.native
  def ProxyAuthenticationRequired(config: Config): HttpError = js.native
  def ProxyAuthenticationRequired(config: java.lang.String): HttpError = js.native
  def ProxyAuthenticationRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ProxyDeclinedRequest(): HttpError = js.native
  def ProxyDeclinedRequest(config: Config): HttpError = js.native
  def ProxyDeclinedRequest(config: java.lang.String): HttpError = js.native
  def ProxyDeclinedRequest(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def Redirect(): HttpError = js.native
  def Redirect(config: Config): HttpError = js.native
  def Redirect(config: java.lang.String): HttpError = js.native
  def Redirect(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def RequestEntityTooLarge(): HttpError = js.native
  def RequestEntityTooLarge(config: Config): HttpError = js.native
  def RequestEntityTooLarge(config: java.lang.String): HttpError = js.native
  def RequestEntityTooLarge(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def RequestHeaderFieldsTooLarge(): HttpError = js.native
  def RequestHeaderFieldsTooLarge(config: Config): HttpError = js.native
  def RequestHeaderFieldsTooLarge(config: java.lang.String): HttpError = js.native
  def RequestHeaderFieldsTooLarge(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def RequestHeaderTooLarge(): HttpError = js.native
  def RequestHeaderTooLarge(config: Config): HttpError = js.native
  def RequestHeaderTooLarge(config: java.lang.String): HttpError = js.native
  def RequestHeaderTooLarge(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def RequestTimeout(): HttpError = js.native
  def RequestTimeout(config: Config): HttpError = js.native
  def RequestTimeout(config: java.lang.String): HttpError = js.native
  def RequestTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def RequestUriTooLong(): HttpError = js.native
  def RequestUriTooLong(config: Config): HttpError = js.native
  def RequestUriTooLong(config: java.lang.String): HttpError = js.native
  def RequestUriTooLong(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def RequestedRangeNotSatisfiable(): HttpError = js.native
  def RequestedRangeNotSatisfiable(config: Config): HttpError = js.native
  def RequestedRangeNotSatisfiable(config: java.lang.String): HttpError = js.native
  def RequestedRangeNotSatisfiable(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def RetryWith(): HttpError = js.native
  def RetryWith(config: Config): HttpError = js.native
  def RetryWith(config: java.lang.String): HttpError = js.native
  def RetryWith(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def ServiceUnavailable(): HttpError = js.native
  def ServiceUnavailable(config: Config): HttpError = js.native
  def ServiceUnavailable(config: java.lang.String): HttpError = js.native
  def ServiceUnavailable(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def TooManyRequests(): HttpError = js.native
  def TooManyRequests(config: Config): HttpError = js.native
  def TooManyRequests(config: java.lang.String): HttpError = js.native
  def TooManyRequests(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def Unauthorized(): HttpError = js.native
  def Unauthorized(config: Config): HttpError = js.native
  def Unauthorized(config: java.lang.String): HttpError = js.native
  def Unauthorized(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def UnavailableForLegalReasons(): HttpError = js.native
  def UnavailableForLegalReasons(config: Config): HttpError = js.native
  def UnavailableForLegalReasons(config: java.lang.String): HttpError = js.native
  def UnavailableForLegalReasons(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def UnorderedCollection(): HttpError = js.native
  def UnorderedCollection(config: Config): HttpError = js.native
  def UnorderedCollection(config: java.lang.String): HttpError = js.native
  def UnorderedCollection(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def UnprocessableEntity(): HttpError = js.native
  def UnprocessableEntity(config: Config): HttpError = js.native
  def UnprocessableEntity(config: java.lang.String): HttpError = js.native
  def UnprocessableEntity(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def UnsupportedMediaType(): HttpError = js.native
  def UnsupportedMediaType(config: Config): HttpError = js.native
  def UnsupportedMediaType(config: java.lang.String): HttpError = js.native
  def UnsupportedMediaType(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def UpgradeRequired(): HttpError = js.native
  def UpgradeRequired(config: Config): HttpError = js.native
  def UpgradeRequired(config: java.lang.String): HttpError = js.native
  def UpgradeRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def VariantAlsoNegotiates(): HttpError = js.native
  def VariantAlsoNegotiates(config: Config): HttpError = js.native
  def VariantAlsoNegotiates(config: java.lang.String): HttpError = js.native
  def VariantAlsoNegotiates(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def aTimeoutOccured(): HttpError = js.native
  def aTimeoutOccured(config: Config): HttpError = js.native
  def aTimeoutOccured(config: java.lang.String): HttpError = js.native
  def aTimeoutOccured(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def authenticationTimeout(): HttpError = js.native
  def authenticationTimeout(config: Config): HttpError = js.native
  def authenticationTimeout(config: java.lang.String): HttpError = js.native
  def authenticationTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def badGateway(): HttpError = js.native
  def badGateway(config: Config): HttpError = js.native
  def badGateway(config: java.lang.String): HttpError = js.native
  def badGateway(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  // Error builders by camel-cased name.
  def badRequest(): HttpError = js.native
  def badRequest(config: Config): HttpError = js.native
  def badRequest(config: java.lang.String): HttpError = js.native
  def badRequest(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def bandwidthLimitExceeded(): HttpError = js.native
  def bandwidthLimitExceeded(config: Config): HttpError = js.native
  def bandwidthLimitExceeded(config: java.lang.String): HttpError = js.native
  def bandwidthLimitExceeded(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def blockedByWindowsParentalControls(): HttpError = js.native
  def blockedByWindowsParentalControls(config: Config): HttpError = js.native
  def blockedByWindowsParentalControls(config: java.lang.String): HttpError = js.native
  def blockedByWindowsParentalControls(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def certError(): HttpError = js.native
  def certError(config: Config): HttpError = js.native
  def certError(config: java.lang.String): HttpError = js.native
  def certError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def clientClosedRequest(): HttpError = js.native
  def clientClosedRequest(config: Config): HttpError = js.native
  def clientClosedRequest(config: java.lang.String): HttpError = js.native
  def clientClosedRequest(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def conflict(): HttpError = js.native
  def conflict(config: Config): HttpError = js.native
  def conflict(config: java.lang.String): HttpError = js.native
  def conflict(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def connectionTimedOut(): HttpError = js.native
  def connectionTimedOut(config: Config): HttpError = js.native
  def connectionTimedOut(config: java.lang.String): HttpError = js.native
  def connectionTimedOut(config: stdLib.Error): HttpError = js.native
  /**
    * Creates a new error type for the given HTTP error status.
    * @param {number} status - The HTTP response status code for the HTTP error.
    * @param {string} title - A human-readable title for the HTTP error.
    * @param {Function} init - (optional) A function which will be invoked as a method of the
    *                          new error with the config argument immediately after the error
    *                          is created by the factory. Can be used to process additional
    *                          error-specific configuration parameters.
    */
  def createHttpError(status: scala.Double, title: java.lang.String): HttpErrorStatic = js.native
  def createHttpError(status: scala.Double, title: java.lang.String, init: js.Function1[/* config */ Config, scala.Unit]): HttpErrorStatic = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def enhanceYourCalm(): HttpError = js.native
  def enhanceYourCalm(config: Config): HttpError = js.native
  def enhanceYourCalm(config: java.lang.String): HttpError = js.native
  def enhanceYourCalm(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def expectationFailed(): HttpError = js.native
  def expectationFailed(config: Config): HttpError = js.native
  def expectationFailed(config: java.lang.String): HttpError = js.native
  def expectationFailed(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def failedDependency(): HttpError = js.native
  def failedDependency(config: Config): HttpError = js.native
  def failedDependency(config: java.lang.String): HttpError = js.native
  def failedDependency(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def forbidden(): HttpError = js.native
  def forbidden(config: Config): HttpError = js.native
  def forbidden(config: java.lang.String): HttpError = js.native
  def forbidden(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def gatewayTimeout(): HttpError = js.native
  def gatewayTimeout(config: Config): HttpError = js.native
  def gatewayTimeout(config: java.lang.String): HttpError = js.native
  def gatewayTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def gone(): HttpError = js.native
  def gone(config: Config): HttpError = js.native
  def gone(config: java.lang.String): HttpError = js.native
  def gone(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def httpToHttps(): HttpError = js.native
  def httpToHttps(config: Config): HttpError = js.native
  def httpToHttps(config: java.lang.String): HttpError = js.native
  def httpToHttps(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def httpVersionNotSupported(): HttpError = js.native
  def httpVersionNotSupported(config: Config): HttpError = js.native
  def httpVersionNotSupported(config: java.lang.String): HttpError = js.native
  def httpVersionNotSupported(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def imATeapot(): HttpError = js.native
  def imATeapot(config: Config): HttpError = js.native
  def imATeapot(config: java.lang.String): HttpError = js.native
  def imATeapot(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def insufficientStorage(): HttpError = js.native
  def insufficientStorage(config: Config): HttpError = js.native
  def insufficientStorage(config: java.lang.String): HttpError = js.native
  def insufficientStorage(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def internalServerError(): HttpError = js.native
  def internalServerError(config: Config): HttpError = js.native
  def internalServerError(config: java.lang.String): HttpError = js.native
  def internalServerError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def lengthRequired(): HttpError = js.native
  def lengthRequired(config: Config): HttpError = js.native
  def lengthRequired(config: java.lang.String): HttpError = js.native
  def lengthRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def locked(): HttpError = js.native
  def locked(config: Config): HttpError = js.native
  def locked(config: java.lang.String): HttpError = js.native
  def locked(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def loginTimeout(): HttpError = js.native
  def loginTimeout(config: Config): HttpError = js.native
  def loginTimeout(config: java.lang.String): HttpError = js.native
  def loginTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def loopDetected(): HttpError = js.native
  def loopDetected(config: Config): HttpError = js.native
  def loopDetected(config: java.lang.String): HttpError = js.native
  def loopDetected(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def methodFailure(): HttpError = js.native
  def methodFailure(config: Config): HttpError = js.native
  def methodFailure(config: java.lang.String): HttpError = js.native
  def methodFailure(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def methodNotAllowed(): HttpError = js.native
  def methodNotAllowed(config: Config): HttpError = js.native
  def methodNotAllowed(config: java.lang.String): HttpError = js.native
  def methodNotAllowed(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def networkAuthenticationRequired(): HttpError = js.native
  def networkAuthenticationRequired(config: Config): HttpError = js.native
  def networkAuthenticationRequired(config: java.lang.String): HttpError = js.native
  def networkAuthenticationRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def networkConnectTimeoutError(): HttpError = js.native
  def networkConnectTimeoutError(config: Config): HttpError = js.native
  def networkConnectTimeoutError(config: java.lang.String): HttpError = js.native
  def networkConnectTimeoutError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def networkReadTimeoutError(): HttpError = js.native
  def networkReadTimeoutError(config: Config): HttpError = js.native
  def networkReadTimeoutError(config: java.lang.String): HttpError = js.native
  def networkReadTimeoutError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def noCert(): HttpError = js.native
  def noCert(config: Config): HttpError = js.native
  def noCert(config: java.lang.String): HttpError = js.native
  def noCert(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def noResponse(): HttpError = js.native
  def noResponse(config: Config): HttpError = js.native
  def noResponse(config: java.lang.String): HttpError = js.native
  def noResponse(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def notAcceptable(): HttpError = js.native
  def notAcceptable(config: Config): HttpError = js.native
  def notAcceptable(config: java.lang.String): HttpError = js.native
  def notAcceptable(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def notExtended(): HttpError = js.native
  def notExtended(config: Config): HttpError = js.native
  def notExtended(config: java.lang.String): HttpError = js.native
  def notExtended(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def notFound(): HttpError = js.native
  def notFound(config: Config): HttpError = js.native
  def notFound(config: java.lang.String): HttpError = js.native
  def notFound(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def notImplemented(): HttpError = js.native
  def notImplemented(config: Config): HttpError = js.native
  def notImplemented(config: java.lang.String): HttpError = js.native
  def notImplemented(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def originError(): HttpError = js.native
  def originError(config: Config): HttpError = js.native
  def originError(config: java.lang.String): HttpError = js.native
  def originError(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def paymentRequired(): HttpError = js.native
  def paymentRequired(config: Config): HttpError = js.native
  def paymentRequired(config: java.lang.String): HttpError = js.native
  def paymentRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def preconditionFailed(): HttpError = js.native
  def preconditionFailed(config: Config): HttpError = js.native
  def preconditionFailed(config: java.lang.String): HttpError = js.native
  def preconditionFailed(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def preconditionRequired(): HttpError = js.native
  def preconditionRequired(config: Config): HttpError = js.native
  def preconditionRequired(config: java.lang.String): HttpError = js.native
  def preconditionRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def proxyAuthenticationRequired(): HttpError = js.native
  def proxyAuthenticationRequired(config: Config): HttpError = js.native
  def proxyAuthenticationRequired(config: java.lang.String): HttpError = js.native
  def proxyAuthenticationRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def proxyDeclinedRequest(): HttpError = js.native
  def proxyDeclinedRequest(config: Config): HttpError = js.native
  def proxyDeclinedRequest(config: java.lang.String): HttpError = js.native
  def proxyDeclinedRequest(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def redirect(): HttpError = js.native
  def redirect(config: Config): HttpError = js.native
  def redirect(config: java.lang.String): HttpError = js.native
  def redirect(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def requestEntityTooLarge(): HttpError = js.native
  def requestEntityTooLarge(config: Config): HttpError = js.native
  def requestEntityTooLarge(config: java.lang.String): HttpError = js.native
  def requestEntityTooLarge(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def requestHeaderFieldsTooLarge(): HttpError = js.native
  def requestHeaderFieldsTooLarge(config: Config): HttpError = js.native
  def requestHeaderFieldsTooLarge(config: java.lang.String): HttpError = js.native
  def requestHeaderFieldsTooLarge(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def requestHeaderTooLarge(): HttpError = js.native
  def requestHeaderTooLarge(config: Config): HttpError = js.native
  def requestHeaderTooLarge(config: java.lang.String): HttpError = js.native
  def requestHeaderTooLarge(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def requestTimeout(): HttpError = js.native
  def requestTimeout(config: Config): HttpError = js.native
  def requestTimeout(config: java.lang.String): HttpError = js.native
  def requestTimeout(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def requestUriTooLong(): HttpError = js.native
  def requestUriTooLong(config: Config): HttpError = js.native
  def requestUriTooLong(config: java.lang.String): HttpError = js.native
  def requestUriTooLong(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def requestedRangeNotSatisfiable(): HttpError = js.native
  def requestedRangeNotSatisfiable(config: Config): HttpError = js.native
  def requestedRangeNotSatisfiable(config: java.lang.String): HttpError = js.native
  def requestedRangeNotSatisfiable(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def retryWith(): HttpError = js.native
  def retryWith(config: Config): HttpError = js.native
  def retryWith(config: java.lang.String): HttpError = js.native
  def retryWith(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def serviceUnavailable(): HttpError = js.native
  def serviceUnavailable(config: Config): HttpError = js.native
  def serviceUnavailable(config: java.lang.String): HttpError = js.native
  def serviceUnavailable(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def tooManyRequests(): HttpError = js.native
  def tooManyRequests(config: Config): HttpError = js.native
  def tooManyRequests(config: java.lang.String): HttpError = js.native
  def tooManyRequests(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def unauthorized(): HttpError = js.native
  def unauthorized(config: Config): HttpError = js.native
  def unauthorized(config: java.lang.String): HttpError = js.native
  def unauthorized(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def unavailableForLegalReasons(): HttpError = js.native
  def unavailableForLegalReasons(config: Config): HttpError = js.native
  def unavailableForLegalReasons(config: java.lang.String): HttpError = js.native
  def unavailableForLegalReasons(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def unorderedCollection(): HttpError = js.native
  def unorderedCollection(config: Config): HttpError = js.native
  def unorderedCollection(config: java.lang.String): HttpError = js.native
  def unorderedCollection(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def unprocessableEntity(): HttpError = js.native
  def unprocessableEntity(config: Config): HttpError = js.native
  def unprocessableEntity(config: java.lang.String): HttpError = js.native
  def unprocessableEntity(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def unsupportedMediaType(): HttpError = js.native
  def unsupportedMediaType(config: Config): HttpError = js.native
  def unsupportedMediaType(config: java.lang.String): HttpError = js.native
  def unsupportedMediaType(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def upgradeRequired(): HttpError = js.native
  def upgradeRequired(config: Config): HttpError = js.native
  def upgradeRequired(config: java.lang.String): HttpError = js.native
  def upgradeRequired(config: stdLib.Error): HttpError = js.native
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def variantAlsoNegotiates(): HttpError = js.native
  def variantAlsoNegotiates(config: Config): HttpError = js.native
  def variantAlsoNegotiates(config: java.lang.String): HttpError = js.native
  def variantAlsoNegotiates(config: stdLib.Error): HttpError = js.native
}

