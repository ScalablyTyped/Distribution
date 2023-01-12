package typings.matcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMatch(inputs: String, patterns: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(inputs: String, patterns: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(inputs: String, patterns: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(inputs: String, patterns: js.Array[String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(inputs: js.Array[String], patterns: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(inputs: js.Array[String], patterns: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(inputs: js.Array[String], patterns: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(inputs: js.Array[String], patterns: js.Array[String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matcher(inputs: String, patterns: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def matcher(inputs: String, patterns: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def matcher(inputs: String, patterns: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def matcher(inputs: String, patterns: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def matcher(inputs: js.Array[String], patterns: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def matcher(inputs: js.Array[String], patterns: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def matcher(inputs: js.Array[String], patterns: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def matcher(inputs: js.Array[String], patterns: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(inputs.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    /**
    	Require all negated patterns to not match and any normal patterns to match at least once. Otherwise, it will be a no-match condition.
    	@default false
    	@example
    	```
    	import {matcher} from 'matcher';
    	// Find text strings containing both "edge" and "tiger" in arbitrary order, but not "stunt".
    	const demo = (strings) => matcher(strings, ['*edge*', '*tiger*', '!*stunt*'], {allPatterns: true});
    	demo(['Hey, tiger!', 'tiger has edge over hyenas', 'pushing a tiger over the edge is a stunt']);
    	//=> ['tiger has edge over hyenas']
    	```
    	@example
    	```
    	import {matcher} from 'matcher';
    	matcher(['foo', 'for', 'bar'], ['f*', 'b*', '!x*'], {allPatterns: true});
    	//=> ['foo', 'for', 'bar']
    	matcher(['foo', 'for', 'bar'], ['f*'], {allPatterns: true});
    	//=> []
    	```
    	*/
    val allPatterns: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Treat uppercase and lowercase characters as being the same.
    	Ensure you use this correctly. For example, files and directories should be matched case-insensitively, while most often, object keys should be matched case-sensitively.
    	@default false
    	@example
    	```
    	import {isMatch} from 'matcher';
    	isMatch('UNICORN', 'UNI*', {caseSensitive: true});
    	//=> true
    	isMatch('UNICORN', 'unicorn', {caseSensitive: true});
    	//=> false
    	isMatch('unicorn', ['tri*', 'UNI*'], {caseSensitive: true});
    	//=> false
    	```
    	*/
    val caseSensitive: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllPatterns(value: Boolean): Self = StObject.set(x, "allPatterns", value.asInstanceOf[js.Any])
      
      inline def setAllPatternsUndefined: Self = StObject.set(x, "allPatterns", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    }
  }
}
