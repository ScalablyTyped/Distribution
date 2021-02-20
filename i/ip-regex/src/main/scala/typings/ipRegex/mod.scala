package typings.ipRegex

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("ip-regex", JSImport.Namespace)
  @js.native
  def apply(): RegExp = js.native
  @JSImport("ip-regex", JSImport.Namespace)
  @js.native
  def apply(options: Options): RegExp = js.native
  
  /**
  	@returns A regex for matching IPv4.
  	*/
  @JSImport("ip-regex", "v4")
  @js.native
  def v4(): RegExp = js.native
  @JSImport("ip-regex", "v4")
  @js.native
  def v4(options: Options): RegExp = js.native
  
  /**
  	@returns A regex for matching IPv6.
  	@example
  	```
  	import ipRegex = require('ip-regex');
  	ipRegex.v6({exact: true}).test('1:2:3:4:5:6:7:8');
  	//=> true
  	```
  	*/
  @JSImport("ip-regex", "v6")
  @js.native
  def v6(): RegExp = js.native
  @JSImport("ip-regex", "v6")
  @js.native
  def v6(options: Options): RegExp = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Only match an exact string. Useful with `RegExp#test()` to check if a string is an IP address. *(`false` matches any IP address in a string)*
    		@default false
    		*/
    val exact: js.UndefOr[Boolean] = js.native
    
    /**
    		Include boundaries in the regex. When `true`, `192.168.0.2000000000` will report as an invalid IPv4 address. If this option is not set, the mentioned IPv4 address would report as valid (ignoring the trailing zeros).
    		@default false
    		*/
    val includeBoundaries: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setIncludeBoundaries(value: Boolean): Self = StObject.set(x, "includeBoundaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeBoundariesUndefined: Self = StObject.set(x, "includeBoundaries", js.undefined)
    }
  }
}
