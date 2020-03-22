package typings.iterm2Version

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
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
}

