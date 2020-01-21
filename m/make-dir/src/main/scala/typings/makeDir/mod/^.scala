package typings.makeDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("make-dir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, options: Options): js.Promise[String] = js.native
  /**
  	Synchronously make a directory and its parents if needed - Think `mkdir -p`.
  	@param path - Directory to create.
  	@returns The path to the created directory.
  	*/
  def sync(path: String): String = js.native
  def sync(path: String, options: Options): String = js.native
}

