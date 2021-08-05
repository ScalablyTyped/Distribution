package typings.ipRegex

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Regular expression for matching IP addresses.
  	@returns A regex for matching both IPv4 and IPv6.
  	@example
  	```
  	import ipRegex = require('ip-regex');
  	// Contains an IP address?
  	ipRegex().test('unicorn 192.168.0.1');
  	//=> true
  	// Is an IP address?
  	ipRegex({exact: true}).test('unicorn 192.168.0.1');
  	//=> false
  	'unicorn 192.168.0.1 cake 1:2:3:4:5:6:7:8 rainbow'.match(ipRegex());
  	//=> ['192.168.0.1', '1:2:3:4:5:6:7:8']
  	// Contains an IP address?
  	ipRegex({includeBoundaries: true}).test('192.168.0.2000000000');
  	//=> false
  	// Matches an IP address?
  	'192.168.0.2000000000'.match(ipRegex({includeBoundaries: true}));
  	//=> null
  	```
  	*/
  inline def apply(): RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RegExp]
  inline def apply(options: Options): RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  @JSImport("ip-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	@returns A regex for matching IPv4.
  	*/
  inline def v4(): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[RegExp]
  inline def v4(options: Options): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  /**
  	@returns A regex for matching IPv6.
  	@example
  	```
  	import ipRegex = require('ip-regex');
  	ipRegex.v6({exact: true}).test('1:2:3:4:5:6:7:8');
  	//=> true
  	```
  	*/
  inline def v6(): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v6")().asInstanceOf[RegExp]
  inline def v6(options: Options): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v6")(options.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  trait Options extends StObject {
    
    /**
    		Only match an exact string. Useful with `RegExp#test()` to check if a string is an IP address. *(`false` matches any IP address in a string)*
    		@default false
    		*/
    val exact: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Include boundaries in the regex. When `true`, `192.168.0.2000000000` will report as an invalid IPv4 address. If this option is not set, the mentioned IPv4 address would report as valid (ignoring the trailing zeros).
    		@default false
    		*/
    val includeBoundaries: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setIncludeBoundaries(value: Boolean): Self = StObject.set(x, "includeBoundaries", value.asInstanceOf[js.Any])
      
      inline def setIncludeBoundariesUndefined: Self = StObject.set(x, "includeBoundaries", js.undefined)
    }
  }
}
