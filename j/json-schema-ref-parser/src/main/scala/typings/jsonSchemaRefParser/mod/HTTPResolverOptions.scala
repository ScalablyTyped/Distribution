package typings.jsonSchemaRefParser.mod

import typings.node.Buffer
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<json-schema-ref-parser.json-schema-ref-parser.ResolverOptions> */
trait HTTPResolverOptions extends js.Object {
  var canRead: js.UndefOr[
    Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
  ] = js.undefined
  /**
    * You can specify any HTTP headers that should be sent when downloading files. For example, some servers may require you to set the `Accept` or `Referrer` header.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var read: js.UndefOr[
    js.Function2[
      /* file */ FileInfo, 
      /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]], 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.undefined
  /**
    * The maximum number of HTTP redirects to follow per file. The default is 5. To disable automatic following of redirects, set this to zero.
    */
  var redirects: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time (in milliseconds) to wait for a response from the server when downloading files. The default is 5 seconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Set this to `true` if you're downloading files from a CORS-enabled server that requires authentication
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object HTTPResolverOptions {
  @scala.inline
  def apply(
    canRead: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean]) = null,
    headers: js.Object = null,
    order: Int | Double = null,
    read: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]]) => String | Buffer | (js.Promise[String | Buffer]) = null,
    redirects: Int | Double = null,
    timeout: Int | Double = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): HTTPResolverOptions = {
    val __obj = js.Dynamic.literal()
    if (canRead != null) __obj.updateDynamic("canRead")(canRead.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2(read))
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPResolverOptions]
  }
}

