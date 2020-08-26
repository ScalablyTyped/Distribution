package typings.gun.anon

import typings.gun.gunBooleans.`false`
import typings.gun.mod.Gun.ChainReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ify extends js.Object {
  /** Returns a "gun-ified" variant of the json input by injecting a new gun ID into the metadata field. */
  def ify(json: js.Any): js.Any = js.native
  /** Returns true if data is a gun node, otherwise false. */
  def is(anything: js.Any): /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean = js.native
  /**
    * Returns data's gun ID (instead of manually grabbing its metadata i.e. data["_"]["#"], which is faster but could change in the future)
    *
    * Returns undefined if data is not correct gun data.
    */
  @JSName("soul")
  def soul_false(data: ChainReference[_, _, `false`]): String = js.native
}

object Ify {
  @scala.inline
  def apply(
    ify: js.Any => js.Any,
    is: js.Any => /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean,
    soul: ChainReference[_, _, `false`] => String
  ): Ify = {
    val __obj = js.Dynamic.literal(ify = js.Any.fromFunction1(ify), is = js.Any.fromFunction1(is), soul = js.Any.fromFunction1(soul))
    __obj.asInstanceOf[Ify]
  }
  @scala.inline
  implicit class IfyOps[Self <: Ify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIfy(value: js.Any => js.Any): Self = this.set("ify", js.Any.fromFunction1(value))
    @scala.inline
    def setIs(value: js.Any => /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    @scala.inline
    def setSoul(value: ChainReference[_, _, `false`] => String): Self = this.set("soul", js.Any.fromFunction1(value))
  }
  
}

