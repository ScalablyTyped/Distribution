package typings.macosVersion

import typings.macosVersion.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.UndefOr[String]]
  
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
  @scala.inline
  def default(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[String]]
  
  /**
  	Throws an error if the specified [semver range](https://github.com/npm/node-semver#ranges) does not match the macOS version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.assert('>=10.12.5');
  	//=> [Error: Requires macOS >=10.12.5]
  	```
  	*/
  @scala.inline
  def assert(semverRange: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(semverRange.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  @scala.inline
  def assertGreaterThanOrEqualTo(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertGreaterThanOrEqualTo")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  	Throws an error if platform is not macOS.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.assertMacOS();
  	//=> [Error: Requires macOS]
  	```
  	*/
  @scala.inline
  def assertMacOS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMacOS")().asInstanceOf[Unit]
  
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
  @scala.inline
  def is(semverRange: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(semverRange.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
  	@returns Whether the macOS version is greater than or equal to the specified version.
  	@example
  	```
  	import macosVersion = require('macos-version');
  	macosVersion.isGreaterThanOrEqualTo('10.10');
  	//=> true
  	```
  	*/
  @scala.inline
  def isGreaterThanOrEqualTo(version: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGreaterThanOrEqualTo")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
