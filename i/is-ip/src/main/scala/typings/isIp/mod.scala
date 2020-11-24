package typings.isIp

import typings.isIp.isIpNumbers.`4`
import typings.isIp.isIpNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-ip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  def apply(string: String): Boolean = js.native
  
  /**
  	Check if `string` is IPv4.
  	@example
  	```
  	import isIp = require('is-ip');
  	isIp.v4('192.168.0.1');
  	//=> true
  	```
  	*/
  def v4(string: String): Boolean = js.native
  
  /**
  	Check if `string` is IPv6.
  	@example
  	```
  	import isIp = require('is-ip');
  	isIp.v6('1:2:3:4:5:6:7:8');
  	//=> true
  	```
  	*/
  def v6(string: String): Boolean = js.native
  
  /**
  	@returns `6` if `string` is IPv6, `4` if `string` is IPv4, or `undefined` if `string` is neither.
  	@example
  	```
  	import isIp = require('is-ip');
  	isIp.version('192.168.0.1');
  	//=> 4
  	isIp.version('1:2:3:4:5:6:7:8');
  	//=> 6
  	isIp.version('abc');
  	//=> undefined
  	```
  	*/
  def version(string: String): js.UndefOr[`4` | `6`] = js.native
}
