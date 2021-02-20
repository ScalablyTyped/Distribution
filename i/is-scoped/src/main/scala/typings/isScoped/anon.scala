package typings.isScoped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	Check if a string is a [scoped npm package name](https://docs.npmjs.com/misc/scope).
    	@example
    	```
    	import isScoped = require('is-scoped');
    	isScoped('@sindresorhus/df');
    	//=> true
    	isScoped('cat-names');
    	//=> false
    	```
    	*/
    def apply(input: String): Boolean = js.native
  }
}
