package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGXLinkAttributes extends js.Object {
  @JSName("xlink:actuate")
  var xlinkColonactuate: js.UndefOr[String] = js.native
  @JSName("xlink:arcrole")
  var xlinkColonarcrole: js.UndefOr[String] = js.native
  @JSName("xlink:href")
  var xlinkColonhref: js.UndefOr[String] = js.native
  @JSName("xlink:role")
  var xlinkColonrole: js.UndefOr[String] = js.native
  @JSName("xlink:show")
  var xlinkColonshow: js.UndefOr[String] = js.native
  @JSName("xlink:title")
  var xlinkColontitle: js.UndefOr[String] = js.native
  @JSName("xlink:type")
  var xlinkColontype: js.UndefOr[String] = js.native
}

object SVGXLinkAttributes {
  @scala.inline
  def apply(): SVGXLinkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGXLinkAttributes]
  }
  @scala.inline
  implicit class SVGXLinkAttributesOps[Self <: SVGXLinkAttributes] (val x: Self) extends AnyVal {
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
    def setXlinkColonactuate(value: String): Self = this.set("xlink:actuate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonactuate: Self = this.set("xlink:actuate", js.undefined)
    @scala.inline
    def setXlinkColonarcrole(value: String): Self = this.set("xlink:arcrole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonarcrole: Self = this.set("xlink:arcrole", js.undefined)
    @scala.inline
    def setXlinkColonhref(value: String): Self = this.set("xlink:href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonhref: Self = this.set("xlink:href", js.undefined)
    @scala.inline
    def setXlinkColonrole(value: String): Self = this.set("xlink:role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonrole: Self = this.set("xlink:role", js.undefined)
    @scala.inline
    def setXlinkColonshow(value: String): Self = this.set("xlink:show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonshow: Self = this.set("xlink:show", js.undefined)
    @scala.inline
    def setXlinkColontitle(value: String): Self = this.set("xlink:title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColontitle: Self = this.set("xlink:title", js.undefined)
    @scala.inline
    def setXlinkColontype(value: String): Self = this.set("xlink:type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColontype: Self = this.set("xlink:type", js.undefined)
  }
  
}

