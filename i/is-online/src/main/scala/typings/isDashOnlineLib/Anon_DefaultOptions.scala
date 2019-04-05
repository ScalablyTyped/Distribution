package typings
package isDashOnlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultOptions extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isOnline(options?: isOnline.Options): Promise<boolean>;
  // export = isOnline;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(): js.Promise[scala.Boolean] = js.native
  def apply(options: isDashOnlineLib.isDashOnlineMod.isOnlineNs.Options): js.Promise[scala.Boolean] = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isOnline(options?: isOnline.Options): Promise<boolean>;
  // export = isOnline;
  def default(): js.Promise[scala.Boolean] = js.native
  def default(options: isDashOnlineLib.isDashOnlineMod.isOnlineNs.Options): js.Promise[scala.Boolean] = js.native
}

