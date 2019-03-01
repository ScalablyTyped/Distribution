package typings
package holderjsLib.holderjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var images: stdLib.HTMLElement | scala.Null
}

object Options {
  @scala.inline
  def apply(images: stdLib.HTMLElement = null): Options = {
    val __obj = js.Dynamic.literal()
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[Options]
  }
}

