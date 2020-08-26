package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Created[T] extends js.Object {
  var created: Boolean = js.native
  var instance: T = js.native
}

object Created {
  @scala.inline
  def apply[T](created: Boolean, instance: T): Created[T] = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created[T]]
  }
  @scala.inline
  implicit class CreatedOps[Self <: Created[_], T] (val x: Self with Created[T]) extends AnyVal {
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
    def setCreated(value: Boolean): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: T): Self = this.set("instance", value.asInstanceOf[js.Any])
  }
  
}

