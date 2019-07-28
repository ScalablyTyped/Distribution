package typings.ipDashRegex.ipDashRegexMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip-regex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(): RegExp = js.native
  def apply(options: Options): RegExp = js.native
  /**
  	@returns A regex for matching IPv4.
  	*/
  def v4(): RegExp = js.native
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
  def v6(): RegExp = js.native
  def v6(options: Options): RegExp = js.native
}

