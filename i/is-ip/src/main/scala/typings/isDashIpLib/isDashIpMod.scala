package typings
package isDashIpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-ip", JSImport.Namespace)
@js.native
object isDashIpMod extends js.Object {
  /**
  	Check if `string` is IPv4 or IPv6.
  	@example
  	```
  	import isIp = require('is-ip');
  	isIp('192.168.0.1');
  	//=> true
  	isIp('1:2:3:4:5:6:7:8');
  	//=> true
  	```
  	*/
  def apply(string: java.lang.String): scala.Boolean = js.native
  /**
  	Check if `string` is IPv4.
  	@example
  	```
  	import isIp = require('is-ip');
  	isIp.v4('192.168.0.1');
  	//=> true
  	```
  	*/
  def v4(string: java.lang.String): scala.Boolean = js.native
  /**
  	Check if `string` is IPv6.
  	@example
  	```
  	import isIp = require('is-ip');
  	isIp.v6('1:2:3:4:5:6:7:8');
  	//=> true
  	```
  	*/
  def v6(string: java.lang.String): scala.Boolean = js.native
}

