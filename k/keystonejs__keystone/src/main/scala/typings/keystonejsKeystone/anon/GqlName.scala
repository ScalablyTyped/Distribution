package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GqlName extends js.Object {
   // TODO: types
  var gqlName: String = js.native
  var item: Email = js.native
  var itemId: js.UndefOr[js.Any] = js.native
   // TODO: types
  var itemIds: js.UndefOr[js.Any] = js.native
  var listKey: String = js.native
  var operation: String = js.native
  var originalInput: js.UndefOr[js.Any] = js.native
}

object GqlName {
  @scala.inline
  def apply(gqlName: String, item: Email, listKey: String, operation: String): GqlName = {
    val __obj = js.Dynamic.literal(gqlName = gqlName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], listKey = listKey.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GqlName]
  }
  @scala.inline
  implicit class GqlNameOps[Self <: GqlName] (val x: Self) extends AnyVal {
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
    def setGqlName(value: String): Self = this.set("gqlName", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Email): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setListKey(value: String): Self = this.set("listKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemId(value: js.Any): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setItemIds(value: js.Any): Self = this.set("itemIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemIds: Self = this.set("itemIds", js.undefined)
    @scala.inline
    def setOriginalInput(value: js.Any): Self = this.set("originalInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalInput: Self = this.set("originalInput", js.undefined)
  }
  
}

