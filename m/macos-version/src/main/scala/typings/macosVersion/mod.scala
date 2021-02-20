package typings.macosVersion

import typings.macosVersion.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	@returns The macOS version or `undefined` if the platform is not macOS.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion();
  	//=> '10.12.3'
  	```
  	*/
  @JSImport("macos-version", JSImport.Namespace)
  @js.native
  def apply(): js.UndefOr[String] = js.native
  
  @JSImport("macos-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	@returns The macOS version or `undefined` if the platform is not macOS.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion();
  	//=> '10.12.3'
  	```
  	*/
  // TODO: remove this in the next major version
  @JSImport("macos-version", "default")
  @js.native
  def default(): js.UndefOr[String] = js.native
  
  /**
  	Throws an error if the specified [semver range](https://github.com/npm/node-semver#ranges) does not match the macOS version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.assert('>=10.12.5');
  	//=> [Error: Requires macOS >=10.12.5]
  	```
  	*/
  @JSImport("macos-version", "assert")
  @js.native
  def assert(semverRange: String): Unit = js.native
  
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
  @JSImport("macos-version", "assertGreaterThanOrEqualTo")
  @js.native
  def assertGreaterThanOrEqualTo(version: String): Unit = js.native
  
  /**
  	Throws an error if platform is not macOS.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.assertMacOS();
  	//=> [Error: Requires macOS]
  	```
  	*/
  @JSImport("macos-version", "assertMacOS")
  @js.native
  def assertMacOS(): Unit = js.native
  
  // TODO: remove this in the next major version
  @JSImport("macos-version", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	@returns Whether the specified [semver range](https://github.com/npm/node-semver#ranges) matches the macOS version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.is('>10.10');
  	//=> true
  	```
  	*/
  @JSImport("macos-version", "is")
  @js.native
  def is(semverRange: String): Boolean = js.native
  
  /**
  	@returns Whether the macOS version is greater than or equal to the specified version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.isGreaterThanOrEqualTo('10.10');
  	//=> true
  	```
  	*/
  @JSImport("macos-version", "isGreaterThanOrEqualTo")
  @js.native
  def isGreaterThanOrEqualTo(version: String): Boolean = js.native
  
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
  @JSImport("macos-version", "isMacOS")
  @js.native
  val isMacOS: Boolean = js.native
}
