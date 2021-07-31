package typings.iterm2Version

import typings.iterm2Version.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the [iTerm2](https://www.iterm2.com) version.
  	@returns iTerm2 version. If you're running this on a different terminal or operating system, it will return `undefined`.
  	@example
  	```
  	import iterm2Version = require('iterm2-version');
  	iterm2Version();
  	//=> '3.0.15'
  	```
  	*/
  @scala.inline
  def apply(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.UndefOr[String]]
  
  @JSImport("iterm2-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Get the [iTerm2](https://www.iterm2.com) version.
  	@returns iTerm2 version. If you're running this on a different terminal or operating system, it will return `undefined`.
  	@example
  	```
  	import iterm2Version = require('iterm2-version');
  	iterm2Version();
  	//=> '3.0.15'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function iterm2Version(): string | undefined;
  // export = iterm2Version;
  @scala.inline
  def default(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[String]]
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function iterm2Version(): string | undefined;
  // export = iterm2Version;
  @JSImport("iterm2-version", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
