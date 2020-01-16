package typings.atKoaCors.atKoaCorsMod

import typings.koa.koaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Middleware configration options.
  */
trait Options extends js.Object {
  /**
    * `Access-Control-Allow-Headers`
    */
  var allowHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * `Access-Control-Allow-Methods`, default is
    * 'GET,HEAD,PUT,POST,DELETE,PATCH'
    */
  var allowMethods: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * `Access-Control-Allow-Credentials`
    */
  var credentials: js.UndefOr[Boolean] = js.undefined
  /**
    * `Access-Control-Expose-Headers`
    */
  var exposeHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * Add set headers to `err.header` if an error is thrown
    */
  var keepHeadersOnError: js.UndefOr[Boolean] = js.undefined
  /**
    * `Access-Control-Max-Age` in seconds
    */
  var maxAge: js.UndefOr[Double | String] = js.undefined
  /**
    * `Access-Control-Allow-Origin`, default is request Origin header.
    *
    * @remarks
    * If a function is provided, it will be called for each request with
    * the koa context object. It may return a string or a promise that
    * will resolve with a string.
    */
  var origin: js.UndefOr[(js.Function1[/* ctx */ Context, String | js.Thenable[String]]) | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[String] | String = null,
    allowMethods: js.Array[String] | String = null,
    credentials: js.UndefOr[Boolean] = js.undefined,
    exposeHeaders: js.Array[String] | String = null,
    keepHeadersOnError: js.UndefOr[Boolean] = js.undefined,
    maxAge: Double | String = null,
    origin: (js.Function1[/* ctx */ Context, String | js.Thenable[String]]) | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders.asInstanceOf[js.Any])
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(keepHeadersOnError)) __obj.updateDynamic("keepHeadersOnError")(keepHeadersOnError.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

