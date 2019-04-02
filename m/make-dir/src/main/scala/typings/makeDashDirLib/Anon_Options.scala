package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Options extends js.Object {
  /**
  	Make a directory and its parents if needed - Think `mkdir -p`.
  	@param path - Directory to create.
  	@returns The path to the created directory.
  	@example
  	```
  	import makeDir = require('make-dir');
  	(async () => {
  		const path = await makeDir('unicorn/rainbow/cake');
  		console.log(path);
  		//=> '/Users/sindresorhus/fun/unicorn/rainbow/cake'
  		// Multiple directories:
  		const paths = await Promise.all([
  			makeDir('unicorn/rainbow'),
  			makeDir('foo/bar')
  		]);
  		console.log(paths);
  		// [
  		// 	'/Users/sindresorhus/fun/unicorn/rainbow',
  		// 	'/Users/sindresorhus/fun/foo/bar'
  		// ]
  	})();
  	```
  	*/
  def apply(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def apply(path: java.lang.String, options: makeDashDirLib.makeDashDirMod.makeDirNs.Options): js.Promise[java.lang.String] = js.native
  /**
  	Synchronously make a directory and its parents if needed - Think `mkdir -p`.
  	@param path - Directory to create.
  	@returns The path to the created directory.
  	*/
  def sync(path: java.lang.String): java.lang.String = js.native
  def sync(path: java.lang.String, options: makeDashDirLib.makeDashDirMod.makeDirNs.Options): java.lang.String = js.native
}

