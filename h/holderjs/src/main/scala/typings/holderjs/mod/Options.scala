package typings.holderjs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var images: HTMLElement | Null
}

object Options {
  @scala.inline
  def apply(images: HTMLElement = null): Options = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

