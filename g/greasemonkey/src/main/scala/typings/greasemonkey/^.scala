package typings.greasemonkey

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Window object of the content page where the user script is running on.
    * @see {@link http://wiki.greasespot.net/UnsafeWindow}
    */
  var unsafeWindow: Window = js.native
}

