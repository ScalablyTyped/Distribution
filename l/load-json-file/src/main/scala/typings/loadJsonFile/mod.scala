package typings.loadJsonFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply[T](filePath: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def apply[T](filePath: String, options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("load-json-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def sync[T](filePath: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sync[T](filePath: String, options: Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type BeforeParse = js.Function1[/* data */ String, String]
  
  trait Options extends StObject {
    
    /**
    		Applies a function to the JSON string before parsing.
    		*/
    val beforeParse: js.UndefOr[BeforeParse] = js.undefined
    
    /**
    		Prescribes how the value originally produced by parsing is transformed, before being returned.
    		See the [`JSON.parse` docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#Using_the_reviver_parameter) for more.
    		*/
    val reviver: js.UndefOr[Reviver] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBeforeParse(value: /* data */ String => String): Self = StObject.set(x, "beforeParse", js.Any.fromFunction1(value))
      
      inline def setBeforeParseUndefined: Self = StObject.set(x, "beforeParse", js.undefined)
      
      inline def setReviver(value: Reviver): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  type Reviver = js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
}
