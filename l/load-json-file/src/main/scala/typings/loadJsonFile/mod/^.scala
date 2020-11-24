package typings.loadJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("load-json-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply[T](filePath: String): js.Promise[T] = js.native
  def apply[T](filePath: String, options: Options): js.Promise[T] = js.native
  
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
  def sync[T](filePath: String): T = js.native
  def sync[T](filePath: String, options: Options): T = js.native
}
