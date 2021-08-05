package typings.makeDir

import typings.makeDir.anon.Typeoffs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(path: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("make-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously make a directory and its parents if needed - Think `mkdir -p`.
  	@param path - Directory to create.
  	@returns The path to the created directory.
  	*/
  inline def sync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sync(path: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    		Use a custom `fs` implementation. For example [`graceful-fs`](https://github.com/isaacs/node-graceful-fs).
    		Using a custom `fs` implementation will block the use of the native `recursive` option if `fs.mkdir` or `fs.mkdirSync` is not the native function.
    		@default require('fs')
    		*/
    val fs: js.UndefOr[Typeoffs] = js.undefined
    
    /**
    		Directory [permissions](https://x-team.com/blog/file-system-permissions-umask-node-js/).
    		@default 0o777
    		*/
    val mode: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFs(value: Typeoffs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
