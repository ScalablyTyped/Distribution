package typings
package hapiDashAuthDashJwt2Lib.hapiDashAuthDashJwt2Mod.hapiAuthJwt2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to `hapi.auth.strategy` when this plugin is used
  */
trait Options extends js.Object {
  /**
    * Set to `true` to receive the complete token (`decoded.header`,
    * `decoded.payload` and `decoded.signature`) as decoded argument to key
    * lookup and `verifyFunc` callbacks (*not `validateFunc`*)
    * @default false
    */
  var complete: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If you prefer to set your own cookie key or your project has a cookie
    * called 'token' for another purpose, you can set a custom key for your
    * cookie by setting `options.cookieKey='yourkeyhere'`. To disable cookies
    * set cookieKey to `false` or ''.
    * @default 'token'
    */
  var cookieKey: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
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
  var headerKey: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * The secret key used to check the signature of the token *or* a *key lookup function*
    */
  var key: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | js.Promise[hapiDashAuthDashJwt2Lib.Anon_ExtraInfo]
  ] = js.undefined
  /**
    * function called to decorate the response with authentication headers
    * before the response headers or payload is written
    *
    * @param request the Request object
    * @param reply is called if an error occurred
    */
  var responseFunc: js.UndefOr[
    js.Function2[
      /* request */ hapiLib.hapiMod.Request, 
      /* reply */ js.Function2[/* err */ js.Any, /* response */ hapiLib.hapiMod.ResponseObject, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Allow custom token type, e.g. `Authorization: <tokenType> 12345678`
    */
  var tokenType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If you prefer to pass your token via url, simply add a token url
    * parameter to your request or use a custom parameter by setting `urlKey.
    * To disable the url parameter set urlKey to `false` or ''.
    * @default 'token'
    */
  var urlKey: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Settings to define how tokens are verified by the jsonwebtoken library
    */
  var verifyOptions: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.VerifyOptions] = js.undefined
  /**
    * The function which is run once the Token has been decoded
    *
    * @param decoded the *decoded* and *verified* JWT received from the client in *request.headers.authorization*
    * @param request the original *request* received from the client
    */
  def validate(decoded: js.Object, request: hapiLib.hapiMod.Request, tk: hapiLib.hapiMod.ResponseToolkit): ValidationResult | js.Promise[ValidationResult]
}

