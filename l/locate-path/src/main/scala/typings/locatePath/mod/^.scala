package typings.locatePath.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locate-path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Get the first path that exists on disk of multiple paths.
  	@param paths - Paths to check.
  	@returns The first path that exists or `undefined` if none exists.
  	@example
  	```
  	import locatePath = require('locate-path');
  	const files = [
  		'unicorn.png',
  		'rainbow.png', // Only this one actually exists on disk
  		'pony.png'
  	];
  	(async () => {
  		console(await locatePath(files));
  		//=> 'rainbow'
  	})();
  	```
  	*/
  def apply(paths: Iterable[String]): js.Promise[js.UndefOr[String]] = js.native
  def apply(paths: Iterable[String], options: AsyncOptions): js.Promise[js.UndefOr[String]] = js.native
  /**
  	Synchronously get the first path that exists on disk of multiple paths.
  	@param paths - Paths to check.
  	@returns The first path that exists or `undefined` if none exists.
  	*/
  def sync(paths: Iterable[String]): js.UndefOr[String] = js.native
  def sync(paths: Iterable[String], options: Options): js.UndefOr[String] = js.native
}

