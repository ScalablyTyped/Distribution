package typings.isOnline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-online", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isOnline(options?: isOnline.Options): Promise<boolean>;
  // export = isOnline;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isOnline */ js.Any = js.native
  /**
  	Check if the internet connection is up.
  	The following checks are run in parallel:
  	- Retrieve [icanhazip.com](https://github.com/major/icanhaz) via HTTPS
  	- Query `myip.opendns.com` on OpenDNS (Node.js only)
  	- Retrieve Apple's Captive Portal test page (Node.js only)
  	When the first check succeeds, the returned Promise is resolved to `true`.
  	@example
  	```
  	import isOnline = require('is-online');
  	(async () => {
  		console.log(await isOnline());
  		//=> true
  	})();
  	```
  	*/
  def apply(): js.Promise[Boolean] = js.native
  def apply(options: Options): js.Promise[Boolean] = js.native
}

