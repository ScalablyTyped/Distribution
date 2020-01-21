package typings.hapiAuthJwt2.mod

import typings.hapiAuthJwt2.AnonExtraInfo
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to `hapi.auth.strategy` when this plugin is used
  */
trait Options extends js.Object {
  /**
    * Set to `true` to allow the `payloadFunc` to attempt to extract the token from
    * POST bodies
    * @default false
    */
  var attemptToExtractTokenInPayload: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` to receive the complete token (`decoded.header`,
    * `decoded.payload` and `decoded.signature`) as decoded argument to key
    * lookup and `verifyFunc` callbacks (*not `validateFunc`*)
    * @default false
    */
  var complete: js.UndefOr[Boolean] = js.undefined
  /**
    * If you prefer to set your own cookie key or your project has a cookie
    * called 'token' for another purpose, you can set a custom key for your
    * cookie by setting `options.cookieKey='yourkeyhere'`. To disable cookies
    * set cookieKey to `false` or ''.
    * @default 'token'
    */
  var cookieKey: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Custom token extraction function used to allow consumers to pull tokens from
    * sources not foreseen by the module, for example... YAR
    * @default false
    */
  var customExtractionFunc: js.UndefOr[js.Function1[/* request */ Request, String]] = js.undefined
  /**
    *
    * @param ctx called when an error has been raised.
    * It provides an extension point to allow the host the ability to customise the error messages returned.
    */
  var errorFunc: js.UndefOr[js.Function1[/* ctx */ ErrorContext, ErrorContext]] = js.undefined
  /**
    * If you want to set a custom key for your header token use the
    * `headerKey` option. To disable header token set headerKey to `false` or
    * ''.
    * @default 'authorization'
    */
  var headerKey: js.UndefOr[String | Boolean] = js.undefined
  /**
    * The secret key used to check the signature of the token *or* a *key lookup function*
    */
  var key: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* decodedToken */ js.Any, js.Promise[AnonExtraInfo]])
  ] = js.undefined
  /**
    * If you want to set a custom key for your payload token use the
    * `payloadKey` option. To disable payload token set payloadKey to `false` or
    * ''.
    * @default 'token'
    */
  var payloadKey: js.UndefOr[String | Boolean] = js.undefined
  /**
    * function called to decorate the response with authentication headers
    * before the response headers or payload is written
    *
    * @param request the Request object
    * @param reply is called if an error occurred
    */
  var responseFunc: js.UndefOr[
    js.Function2[
      /* request */ Request, 
      /* reply */ js.Function2[/* err */ js.Any, /* response */ ResponseObject, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Allow custom token type, e.g. `Authorization: <tokenType> 12345678`
    */
  var tokenType: js.UndefOr[String] = js.undefined
  /**
    * If you prefer to pass your token via url, simply add a token url
    * parameter to your request or use a custom parameter by setting `urlKey.
    * To disable the url parameter set urlKey to `false` or ''.
    * @default 'token'
    */
  var urlKey: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Settings to define how tokens are verified by the jsonwebtoken library
    */
  var verifyOptions: js.UndefOr[VerifyOptions] = js.undefined
  /**
    * The function which is run once the Token has been decoded
    *
    * @param decoded the *decoded* and *verified* JWT received from the client in *request.headers.authorization*
    * @param request the original *request* received from the client
    */
  def validate(decoded: js.Object, request: Request, tk: ResponseToolkit): ValidationResult | js.Promise[ValidationResult]
}

object Options {
  @scala.inline
  def apply(
    validate: (js.Object, Request, ResponseToolkit) => ValidationResult | js.Promise[ValidationResult],
    attemptToExtractTokenInPayload: js.UndefOr[Boolean] = js.undefined,
    complete: js.UndefOr[Boolean] = js.undefined,
    cookieKey: String | Boolean = null,
    customExtractionFunc: /* request */ Request => String = null,
    errorFunc: /* ctx */ ErrorContext => ErrorContext = null,
    headerKey: String | Boolean = null,
    key: String | js.Array[String] | (js.Function1[/* decodedToken */ js.Any, js.Promise[AnonExtraInfo]]) = null,
    payloadKey: String | Boolean = null,
    responseFunc: (/* request */ Request, /* reply */ js.Function2[/* err */ js.Any, /* response */ ResponseObject, Unit]) => Unit = null,
    tokenType: String = null,
    urlKey: String | Boolean = null,
    verifyOptions: VerifyOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
    if (!js.isUndefined(attemptToExtractTokenInPayload)) __obj.updateDynamic("attemptToExtractTokenInPayload")(attemptToExtractTokenInPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (cookieKey != null) __obj.updateDynamic("cookieKey")(cookieKey.asInstanceOf[js.Any])
    if (customExtractionFunc != null) __obj.updateDynamic("customExtractionFunc")(js.Any.fromFunction1(customExtractionFunc))
    if (errorFunc != null) __obj.updateDynamic("errorFunc")(js.Any.fromFunction1(errorFunc))
    if (headerKey != null) __obj.updateDynamic("headerKey")(headerKey.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (payloadKey != null) __obj.updateDynamic("payloadKey")(payloadKey.asInstanceOf[js.Any])
    if (responseFunc != null) __obj.updateDynamic("responseFunc")(js.Any.fromFunction2(responseFunc))
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType.asInstanceOf[js.Any])
    if (urlKey != null) __obj.updateDynamic("urlKey")(urlKey.asInstanceOf[js.Any])
    if (verifyOptions != null) __obj.updateDynamic("verifyOptions")(verifyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

