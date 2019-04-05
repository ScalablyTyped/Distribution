package typings
package latestDashVersionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Get the latest version of an npm package.
  	@example
  	```
  	import latestVersion = require('latest-version');
  	(async () => {
  		console.log(await latestVersion('ava'));
  		//=> '0.18.0'
  		console.log(await latestVersion('@sindresorhus/df'));
  		//=> '1.0.1'
  		// Also works with semver ranges and dist-tags
  		console.log(await latestVersion('npm', {version: 'latest-5'}));
  		//=> '5.5.1'
  	})();
  	```
  	*/
  def apply(packageName: java.lang.String): js.Promise[java.lang.String] = js.native
  def apply(
    packageName: java.lang.String,
    options: latestDashVersionLib.latestDashVersionMod.latestVersionNs.Options
  ): js.Promise[java.lang.String] = js.native
}

