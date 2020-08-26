package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchDefault extends js.Object {
  /**
    * the alternative schema type if no cases matched.
    * Only one otherwise statement is allowed in switch as the last array item.
    */
  var otherwise: SchemaLike = js.native
}

object SwitchDefault {
  @scala.inline
  def apply(): SwitchDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchDefault]
  }
  @scala.inline
  implicit class SwitchDefaultOps[Self <: SwitchDefault] (val x: Self) extends AnyVal {
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
    def setOtherwise(value: SchemaLike): Self = this.set("otherwise", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherwiseNull: Self = this.set("otherwise", null)
  }
  
}

