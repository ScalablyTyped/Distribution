package typings
package macosDashVersionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Assert extends js.Object {
  /**
  	Whether the platform is macOS.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	if (macosVersion.isMacOS) {
  		console.log('macOS');
  	}
  	```
  	*/
  val isMacOS: scala.Boolean = js.native
  /**
  	@returns The macOS version or `undefined` if the platform is not macOS.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion();
  	//=> '10.12.3'
  	```
  	*/
  def apply(): js.UndefOr[java.lang.String] = js.native
  /**
  	Throws an error if the specified [semver range](https://github.com/npm/node-semver#ranges) does not match the macOS version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.assert('>=10.12.5');
  	//=> [Error: Requires macOS >=10.12.5]
  	```
  	*/
  def assert(semverRange: java.lang.String): scala.Unit = js.native
  /**
  	Throws an error if the macOS version is not greater than or equal to the specified version.
  	_Prefer this over `.assert()` whenever possible as it outputs a more user-friendly error message._
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.assertGreaterThanOrEqualTo('10.12.5');
  	//=> [Error: Requires macOS 10.12.5 or later]
  	```
  	*/
  def assertGreaterThanOrEqualTo(version: java.lang.String): scala.Unit = js.native
  /**
  	Throws an error if platform is not macOS.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.assertMacOS();
  	//=> [Error: Requires macOS]
  	```
  	*/
  def assertMacOS(): scala.Unit = js.native
  /**
  	@returns Whether the specified [semver range](https://github.com/npm/node-semver#ranges) matches the macOS version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.is('>10.10');
  	//=> true
  	```
  	*/
  def is(semverRange: java.lang.String): scala.Boolean = js.native
  /**
  	@returns Whether the macOS version is greater than or equal to the specified version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.isGreaterThanOrEqualTo('10.10');
  	//=> true
  	```
  	*/
  def isGreaterThanOrEqualTo(version: java.lang.String): scala.Boolean = js.native
}

