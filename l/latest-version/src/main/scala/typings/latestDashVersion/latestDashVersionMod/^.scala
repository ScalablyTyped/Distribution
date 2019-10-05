package typings.latestDashVersion.latestDashVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("latest-version", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function latestVersion(
  // 	packageName: string,
  // 	options?: latestVersion.Options
  // ): Promise<string>;
  // export = latestVersion;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof latestVersion */ js.Any = js.native
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
  def apply(packageName: String): js.Promise[String] = js.native
  def apply(packageName: String, options: Options): js.Promise[String] = js.native
}

