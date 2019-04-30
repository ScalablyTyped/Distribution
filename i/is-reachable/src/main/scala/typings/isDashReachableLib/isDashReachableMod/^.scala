package typings
package isDashReachableLib.isDashReachableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-reachable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Check if servers are reachable.
  The Node.js version will do a TCP handshake with the target's port. It attempts to detect cases where a router redirects the request to itself.
  The browser version is limited by the fact that browsers cannot connect to arbitrary ports. It only supports HTTP and HTTPS and the check relies on the `/favicon.ico` path being present.
  @param targets - One or more targets to check. Can either be a full [URL](https://nodejs.org/api/url.html) like `https://hostname`, `hostname:port` or just `hostname`. When the protocol is missing from a target `http` is assumed. [Well-known protocols](http://www.iana.org/assignments/service-names-port-numbers/service-names-port-numbers.xhtml) are supported (e.g. `ftp://`, `mysql://`, `redis://` and more).
  @returns Whether any of the `targets` are reachable.
  @example
  ```
  import isReachable = require('is-reachable');
  (async () => {
  	console.log(await isReachable('sindresorhus.com'));
  	//=> true
  	console.log(await isReachable('google.com:80'));
  	//=> true
  })();
  ```
  */
  def apply(
    targets: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify readonly */ js.Any),
    string: js.Any,
    has: js.Any
  ): js.Promise[scala.Boolean] = js.native
  def apply(
    targets: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify readonly */ js.Any),
    string: js.Any,
    has: js.Any,
    options: Options
  ): js.Promise[scala.Boolean] = js.native
}

