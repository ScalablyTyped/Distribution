package typings
package jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPResolverOptions extends ResolverOptions {
  /**
       * You can specify any HTTP headers that should be sent when downloading files. For example, some servers may require you to set the `Accept` or `Referrer` header.
       */
  var headers: js.UndefOr[js.Object] = js.native
  /**
       * The maximum number of HTTP redirects to follow per file. The default is 5. To disable automatic following of redirects, set this to zero.
       */
  var redirects: js.UndefOr[scala.Double] = js.native
  /**
       * The amount of time (in milliseconds) to wait for a response from the server when downloading files. The default is 5 seconds.
       */
  var timeout: js.UndefOr[scala.Double] = js.native
  /**
       * Set this to `true` if you're downloading files from a CORS-enabled server that requires authentication
       */
  var withCredentials: js.UndefOr[scala.Boolean] = js.native
}

