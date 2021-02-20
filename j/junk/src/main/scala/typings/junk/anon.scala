package typings.junk

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Default extends StObject {
    
    /**
    	Returns `true` if `filename` matches a junk file.
    	*/
    def is(filename: String): Boolean = js.native
    
    /**
    	Returns `true` if `filename` doesn't match a junk file.
    	@example
    	```
    	import {promisify} from 'util';
    	import * as fs from 'fs';
    	import junk = require('junk');
    	const pReaddir = promisify(fs.readdir);
    	(async () => {
    		const files = await pReaddir('some/path');
    		console.log(files);
    		//=> ['.DS_Store', 'test.jpg']
    		console.log(files.filter(junk.not));
    		//=> ['test.jpg']
    	})();
    	```
    	*/
    def not(filename: String): Boolean = js.native
    
    /**
    	Regex used for matching junk files.
    	*/
    val regex: RegExp = js.native
  }
  object Default {
    
    @scala.inline
    def apply(is: String => Boolean, not: String => Boolean, regex: RegExp): Default = {
      val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is), not = js.Any.fromFunction1(not), regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIs(value: String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNot(value: String => Boolean): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
}
