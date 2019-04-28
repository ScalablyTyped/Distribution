package typings
package loadDashJsonDashFileLib.loadDashJsonDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("load-json-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: loadDashJsonDashFileLib.Anon_Default = js.native
  /**
  	Read and parse a JSON file.
  	Strips UTF-8 BOM, uses graceful-fs, and throws more helpful JSON errors.
  	@example
  	```
  	import loadJsonFile = require('load-json-file');
  	(async () => {
  		const json = await loadJsonFile('foo.json');
  		//=> {foo: true}
  	})();
  	```
  	*/
  def apply[T](filePath: java.lang.String): js.Promise[T] = js.native
  def apply[T](filePath: java.lang.String, options: Options): js.Promise[T] = js.native
  /**
  	Read and parse a JSON file.
  	Strips UTF-8 BOM, uses graceful-fs, and throws more helpful JSON errors.
  	@example
  	```
  	import loadJsonFile = require('load-json-file');
  	(async () => {
  		const json = await loadJsonFile('foo.json');
  		//=> {foo: true}
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release
  def default[T](filePath: java.lang.String): js.Promise[T] = js.native
  def default[T](filePath: java.lang.String, options: Options): js.Promise[T] = js.native
  /**
  	Read and parse a JSON file.
  	Strips UTF-8 BOM, uses graceful-fs, and throws more helpful JSON errors.
  	@example
  	```
  	import loadJsonFile = require('load-json-file');
  	const json = loadJsonFile.sync('foo.json');
  	//=> {foo: true}
  	```
  	*/
  def sync[T](filePath: java.lang.String): T = js.native
  def sync[T](filePath: java.lang.String, options: Options): T = js.native
}

