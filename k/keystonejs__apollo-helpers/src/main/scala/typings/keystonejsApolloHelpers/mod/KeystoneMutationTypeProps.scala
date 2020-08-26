package typings.keystonejsApolloHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeystoneMutationTypeProps extends js.Object {
  var invalidatesTypes: js.UndefOr[Boolean] = js.native
  var mutation: String = js.native
}

object KeystoneMutationTypeProps {
  @scala.inline
  def apply(mutation: String): KeystoneMutationTypeProps = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystoneMutationTypeProps]
  }
  @scala.inline
  implicit class KeystoneMutationTypePropsOps[Self <: KeystoneMutationTypeProps] (val x: Self) extends AnyVal {
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
    def setMutation(value: String): Self = this.set("mutation", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidatesTypes(value: Boolean): Self = this.set("invalidatesTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidatesTypes: Self = this.set("invalidatesTypes", js.undefined)
  }
  
}

