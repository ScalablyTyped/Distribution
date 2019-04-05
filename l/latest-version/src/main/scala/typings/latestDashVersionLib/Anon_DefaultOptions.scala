package typings
package latestDashVersionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultOptions extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function latestVersion(
  // 	packageName: string,
  // 	options?: latestVersion.Options
  // ): Promise<string>;
  // export = latestVersion;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function latestVersion(
  // 	packageName: string,
  // 	options?: latestVersion.Options
  // ): Promise<string>;
  // export = latestVersion;
  def default(packageName: java.lang.String): js.Promise[java.lang.String] = js.native
  def default(
    packageName: java.lang.String,
    options: latestDashVersionLib.latestDashVersionMod.latestVersionNs.Options
  ): js.Promise[java.lang.String] = js.native
}

