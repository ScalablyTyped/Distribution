package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FactoryOptions extends js.Object {
  var factories: js.Any = js.native
}

object FactoryOptions {
  @scala.inline
  def apply(factories: js.Any): FactoryOptions = {
    val __obj = js.Dynamic.literal(factories = factories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryOptions]
  }
  @scala.inline
  implicit class FactoryOptionsOps[Self <: FactoryOptions] (val x: Self) extends AnyVal {
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
    def setFactories(value: js.Any): Self = this.set("factories", value.asInstanceOf[js.Any])
  }
  
}

