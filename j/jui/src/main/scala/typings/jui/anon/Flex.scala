package typings.jui.anon

import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flex extends js.Object {
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Boolean} [flex=true]
    * Drop-down menu is varied by changing the width function
    */
  var flex: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Integer} [height=100]
    * Determines an initial selection button with a specified value
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * @cfg {Integer} [index=0]
    * Determines an initial selection button with a specified index
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * @cfg {Boolean} [keydown=false]
    * It is possible to select a node using the keyboard
    */
  var keydown: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {"top"/"bottom"} [position="bottom"]
    * It is possible to determine an initial selection button with a specified value
    */
  var position: js.UndefOr[top | bottom] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {String} [value=0]
    * Determines an initial selection button with a specified value
    */
  var value: js.UndefOr[String] = js.native
  /**
    * @cfg {Integer} [width=0]
    * Determines the horizontal size of a combo box
    */
  var width: js.UndefOr[Double] = js.native
}

object Flex {
  @scala.inline
  def apply(): Flex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flex]
  }
  @scala.inline
  implicit class FlexOps[Self <: Flex] (val x: Self) extends AnyVal {
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
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setFlex(value: Boolean): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setKeydown(value: Boolean): Self = this.set("keydown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    @scala.inline
    def setPosition(value: top | bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

