package typings.importFrom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Import a module like with [`require()`](https://nodejs.org/api/modules.html#modules_require_id) but from a given path.
  	@param fromDirectory - Directory to import from.
  	@param moduleId - What you would use in `require()`.
  	@throws Like `require()`, throws when the module can't be found.
  	@example
  	```
  	import importFrom = require('import-from');
  	try {
  		const bar = importFrom('foo', './bar');
  		// Do something with `bar`
  	} catch (error) {
  		// `error` is thrown when `./bar` can't be found
  	}
  	```
  	*/
  @JSImport("import-from", JSImport.Namespace)
  @js.native
  def apply(fromDirectory: String, moduleId: String): js.Any = js.native
  
  /**
  	Import a module like with [`require()`](https://nodejs.org/api/modules.html#modules_require_id) but from a given path.
  	@param fromDirectory - Directory to import from.
  	@param moduleId - What you would use in `require()`.
  	@returns `undefined` instead of throwing when the module can't be found.
  	@example
  	```
  	import importFrom = require('import-from');
  	const bar = importFrom.silent('foo', './bar');
  	// Do something with `bar`, may be `undefined` when `./bar` can't be found
  	```
  	*/
  @JSImport("import-from", "silent")
  @js.native
  def silent(fromDirectory: String, moduleId: String): js.Any = js.native
}
