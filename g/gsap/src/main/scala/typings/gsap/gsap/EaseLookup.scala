package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseLookup extends js.Object {
  def find(name: String): Ease
}

object EaseLookup {
  @scala.inline
  def apply(find: String => Ease): EaseLookup = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[EaseLookup]
  }
}

