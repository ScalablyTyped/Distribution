package typings.iterm2DashVersion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iterm2-version", JSImport.Namespace)
@js.native
object iterm2DashVersionMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function iterm2Version(): string | undefined;
  // export = iterm2Version;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(): js.UndefOr[String] = js.native
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
  def default(): js.UndefOr[String] = js.native
}

