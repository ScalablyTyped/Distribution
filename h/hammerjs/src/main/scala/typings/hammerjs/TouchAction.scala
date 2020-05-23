package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchAction extends js.Object {
  def compute(): String
  def preventDefaults(input: HammerInput): Unit
  def preventSrc(srcEvent: js.Any): Unit
  def set(value: String): Unit
  def update(): Unit
}

object TouchAction {
  @scala.inline
  def apply(
    compute: () => String,
    preventDefaults: HammerInput => Unit,
    preventSrc: js.Any => Unit,
    set: String => Unit,
    update: () => Unit
  ): TouchAction = {
    val __obj = js.Dynamic.literal(compute = js.Any.fromFunction0(compute), preventDefaults = js.Any.fromFunction1(preventDefaults), preventSrc = js.Any.fromFunction1(preventSrc), set = js.Any.fromFunction1(set), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TouchAction]
  }
}

