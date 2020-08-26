package typings.hapiAuthJwt2.mod

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to `hapi.auth.strategy` when this plugin is used
  */
@js.native
trait Options extends js.Object {
  /**
    * Set to `true` to allow the `payloadFunc` to attempt to extract the token from
    * POST bodies
    * @default false
    */
  var attemptToExtractTokenInPayload: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to receive the complete token (`decoded.header`,
    * `decoded.payload` and `decoded.signature`) as decoded argument to key
    * lookup and `verifyFunc` callbacks (*not `validateFunc`*)
    * @default false
    */
  var complete: js.UndefOr[Boolean] = js.native
  /**
    * If you prefer to set your own cookie key or your project has a cookie
    * called 'token' for another purpose, you can set a custom key for your
    * cookie by setting `options.cookieKey='yourkeyhere'`. To disable cookies
    * set cookieKey to `false` or ''.
    * @default 'token'
    */
  var cookieKey: js.UndefOr[String | Boolean] = js.native
  /**
    * Custom token extraction function used to allow consumers to pull tokens from
    * sources not foreseen by the module, for example... YAR
    * @default false
    */
  var customExtractionFunc: js.UndefOr[js.Function1[/* request */ Request, String]] = js.native
  /**
    *
    * @param ctx called when an error has been raised.
    * @param request the Request object.
    * @param h the ResponseToolkit object.
    * It provides an extension point to allow the host the ability to customise the error messages returned.
    */
  var errorFunc: js.UndefOr[
    js.Function3[/* ctx */ ErrorContext, /* request */ Request, /* h */ ResponseToolkit, ErrorContext]
  ] = js.native
  /**
    * If you want to set a custom key for your header token use the
    * `headerKey` option. To disable header token set headerKey to `false` or
    * ''.
    * @default 'authorization'
    */
  var headerKey: js.UndefOr[String | Boolean] = js.native
  /**
    * The secret key used to check the signature of the token *or* a *key lookup function*
    */
  var key: js.UndefOr[
    String | js.Array[String] | Buffer | (js.Function1[/* decodedToken */ js.Any, js.Promise[typings.hapiAuthJwt2.anon.ExtraInfo]])
  ] = js.native
  /**
    * If you want to set a custom key for your payload token use the
    * `payloadKey` option. To disable payload token set payloadKey to `false` or
    * ''.
    * @default 'token'
    */
  var payloadKey: js.UndefOr[String | Boolean] = js.native
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
  ] = js.native
  /**
    * Allow custom token type, e.g. `Authorization: <tokenType> 12345678`
    */
  var tokenType: js.UndefOr[String] = js.native
  /**
    * If you prefer to pass your token via url, simply add a token url
    * parameter to your request or use a custom parameter by setting `urlKey.
    * To disable the url parameter set urlKey to `false` or ''.
    * @default 'token'
    */
  var urlKey: js.UndefOr[String | Boolean] = js.native
  /**
    * Settings to define how tokens are verified by the jsonwebtoken library
    */
  var verifyOptions: js.UndefOr[VerifyOptions] = js.native
  /**
    * The function which is run once the Token has been decoded
    *
    * @param decoded the *decoded* and *verified* JWT received from the client in *request.headers.authorization*
    * @param request the original *request* received from the client
    */
  def validate(decoded: js.Object, request: Request, tk: ResponseToolkit): ValidationResult | js.Promise[ValidationResult] = js.native
}

object Options {
  @scala.inline
  def apply(validate: (js.Object, Request, ResponseToolkit) => ValidationResult | js.Promise[ValidationResult]): Options = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValidate(value: (js.Object, Request, ResponseToolkit) => ValidationResult | js.Promise[ValidationResult]): Self = this.set("validate", js.Any.fromFunction3(value))
    @scala.inline
    def setAttemptToExtractTokenInPayload(value: Boolean): Self = this.set("attemptToExtractTokenInPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptToExtractTokenInPayload: Self = this.set("attemptToExtractTokenInPayload", js.undefined)
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCookieKey(value: String | Boolean): Self = this.set("cookieKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieKey: Self = this.set("cookieKey", js.undefined)
    @scala.inline
    def setCustomExtractionFunc(value: /* request */ Request => String): Self = this.set("customExtractionFunc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomExtractionFunc: Self = this.set("customExtractionFunc", js.undefined)
    @scala.inline
    def setErrorFunc(value: (/* ctx */ ErrorContext, /* request */ Request, /* h */ ResponseToolkit) => ErrorContext): Self = this.set("errorFunc", js.Any.fromFunction3(value))
    @scala.inline
    def deleteErrorFunc: Self = this.set("errorFunc", js.undefined)
    @scala.inline
    def setHeaderKey(value: String | Boolean): Self = this.set("headerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderKey: Self = this.set("headerKey", js.undefined)
    @scala.inline
    def setKeyVarargs(value: String*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKeyFunction1(value: /* decodedToken */ js.Any => js.Promise[typings.hapiAuthJwt2.anon.ExtraInfo]): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def setKey(
      value: String | js.Array[String] | Buffer | (js.Function1[/* decodedToken */ js.Any, js.Promise[typings.hapiAuthJwt2.anon.ExtraInfo]])
    ): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPayloadKey(value: String | Boolean): Self = this.set("payloadKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadKey: Self = this.set("payloadKey", js.undefined)
    @scala.inline
    def setResponseFunc(
      value: (/* request */ Request, /* reply */ js.Function2[/* err */ js.Any, /* response */ ResponseObject, Unit]) => Unit
    ): Self = this.set("responseFunc", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponseFunc: Self = this.set("responseFunc", js.undefined)
    @scala.inline
    def setTokenType(value: String): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenType: Self = this.set("tokenType", js.undefined)
    @scala.inline
    def setUrlKey(value: String | Boolean): Self = this.set("urlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlKey: Self = this.set("urlKey", js.undefined)
    @scala.inline
    def setVerifyOptions(value: VerifyOptions): Self = this.set("verifyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyOptions: Self = this.set("verifyOptions", js.undefined)
  }
  
}

