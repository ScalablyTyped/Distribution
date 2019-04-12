package typings
package loadDashJsonDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  def apply[T](
    filePath: java.lang.String,
    options: loadDashJsonDashFileLib.loadDashJsonDashFileMod.loadJsonFileNs.Options
  ): js.Promise[T] = js.native
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
  def sync[T](
    filePath: java.lang.String,
    options: loadDashJsonDashFileLib.loadDashJsonDashFileMod.loadJsonFileNs.Options
  ): T = js.native
}

