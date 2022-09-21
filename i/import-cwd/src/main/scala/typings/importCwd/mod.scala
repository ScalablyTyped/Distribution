package typings.importCwd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Import a module like with [`require()`](https://nodejs.org/api/globals.html#globals_require) but from the current working directory.
  	@param moduleId - What you would use in `require()`.
  	@throws Like `require()`, throws when the module can't be found.
  	@example
  	```
  	import importCwd = require('import-cwd');
  	// Target module is at '/Users/sindresorhus/unicorn/foo.js'
  	console.log(__dirname);
  	//=> '/Users/sindresorhus/rainbow'
  	console.log(process.cwd());
  	//=> '/Users/sindresorhus/unicorn'
  	const foo = importCwd('./foo');
  	```
  	*/
  inline def apply(moduleId: String): Any = ^.asInstanceOf[js.Dynamic].apply(moduleId.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("import-cwd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Import a module like with [`require()`](https://nodejs.org/api/globals.html#globals_require) but from the current working directory.
  	@param moduleId - What you would use in `require()`.
  	@returns `undefined` instead of throwing when the module can't be found.
  	@example
  	```
  	import importCwd = require('import-cwd');
  	// '/Users/sindresorhus/empty/' is empty
  	console.log(__dirname);
  	//=> '/Users/sindresorhus/rainbow'
  	console.log(process.cwd());
  	//=> '/Users/sindresorhus/empty'
  	const foo = importCwd.silent('./nonexistent');
  	//=> undefined
  	```
  	*/
  inline def silent(moduleId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("silent")(moduleId.asInstanceOf[js.Any]).asInstanceOf[Any]
}
