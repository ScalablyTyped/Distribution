package typings.macosRelease

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	Get the name and version of a macOS release from the Darwin version.
    	@param release - By default, the current operating system is used, but you can supply a custom [Darwin kernel version](https://en.wikipedia.org/wiki/Darwin_%28operating_system%29#Release_history), which is the output of [`os.release()`](https://nodejs.org/api/os.html#os_os_release).
    	@example
    	```
    	import * as os from 'os';
    	import macosRelease = require('macos-release');
    	// On a macOS Sierra system
    	macosRelease();
    	//=> {name: 'Sierra', version: '10.12'}
    	os.release();
    	//=> 13.2.0
    	// This is the Darwin kernel version
    	macosRelease(os.release());
    	//=> {name: 'Sierra', version: '10.12'}
    	macosRelease('14.0.0');
    	//=> {name: 'Yosemite', version: '10.10'}
    	macosRelease('20.0.0');
    	//=> {name: 'Big Sur', version: '11'}
    	```
    	*/
    def apply(): Name = js.native
    def apply(release: String): Name = js.native
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
