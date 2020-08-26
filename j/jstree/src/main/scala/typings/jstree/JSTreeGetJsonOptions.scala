package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeGetJsonOptions extends js.Object {
  /**
    * return flat JSON instead of nested
    */
  var flat: js.UndefOr[Boolean] = js.native
  /**
    * do not include A attributes
    */
  var no_a_attr: js.UndefOr[Boolean] = js.native
  /**
    * do not include children
    */
  var no_children: js.UndefOr[Boolean] = js.native
  /**
    * do not include node data
    */
  var no_data: js.UndefOr[Boolean] = js.native
  /**
    * do not return ID
    */
  var no_id: js.UndefOr[Boolean] = js.native
  /**
    * do not include LI attributes
    */
  var no_li_attr: js.UndefOr[Boolean] = js.native
  /**
    * do not return state information
    */
  var no_state: js.UndefOr[Boolean] = js.native
}

object JSTreeGetJsonOptions {
  @scala.inline
  def apply(): JSTreeGetJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeGetJsonOptions]
  }
  @scala.inline
  implicit class JSTreeGetJsonOptionsOps[Self <: JSTreeGetJsonOptions] (val x: Self) extends AnyVal {
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
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setNo_a_attr(value: Boolean): Self = this.set("no_a_attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_a_attr: Self = this.set("no_a_attr", js.undefined)
    @scala.inline
    def setNo_children(value: Boolean): Self = this.set("no_children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_children: Self = this.set("no_children", js.undefined)
    @scala.inline
    def setNo_data(value: Boolean): Self = this.set("no_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_data: Self = this.set("no_data", js.undefined)
    @scala.inline
    def setNo_id(value: Boolean): Self = this.set("no_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_id: Self = this.set("no_id", js.undefined)
    @scala.inline
    def setNo_li_attr(value: Boolean): Self = this.set("no_li_attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_li_attr: Self = this.set("no_li_attr", js.undefined)
    @scala.inline
    def setNo_state(value: Boolean): Self = this.set("no_state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_state: Self = this.set("no_state", js.undefined)
  }
  
}

