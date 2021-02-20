package typings.humanizeString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	Convert a camelized/dasherized/underscored string into a humanized one: `fooBar-Baz_Faz` → `Foo bar baz faz`.
    	@param text - The string to make human readable.
    	@example
    	```
    	import humanizeString = require('humanize-string');
    	humanizeString('fooBar');
    	//=> 'Foo bar'
    	humanizeString('foo-bar');
    	//=> 'Foo bar'
    	humanizeString('foo_bar');
    	//=> 'Foo bar'
    	```
    	*/
    def apply(text: String): String = js.native
  }
}
