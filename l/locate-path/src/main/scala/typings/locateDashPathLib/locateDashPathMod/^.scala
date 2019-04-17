package typings
package locateDashPathLib.locateDashPathMod

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
  def apply(paths: stdLib.Iterable[java.lang.String]): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def apply(paths: stdLib.Iterable[java.lang.String], options: AsyncOptions): js.Promise[js.UndefOr[java.lang.String]] = js.native
  /**
  	Synchronously get the first path that exists on disk of multiple paths.
  	@param paths - Paths to check.
  	@returns The first path that exists or `undefined` if none exists.
  	*/
  def sync(paths: stdLib.Iterable[java.lang.String]): js.UndefOr[java.lang.String] = js.native
  def sync(paths: stdLib.Iterable[java.lang.String], options: Options): js.UndefOr[java.lang.String] = js.native
}

