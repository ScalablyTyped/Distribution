package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGCoreAttributes extends js.Object {
  var id: js.UndefOr[String] = js.native
  var tabindex: js.UndefOr[Double] = js.native
  @JSName("xml:base")
  var xmlColonbase: js.UndefOr[String] = js.native
  @JSName("xml:lang")
  var xmlColonlang: js.UndefOr[String] = js.native
  @JSName("xml:space")
  var xmlColonspace: js.UndefOr[String] = js.native
}

object SVGCoreAttributes {
  @scala.inline
  def apply(): SVGCoreAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCoreAttributes]
  }
  @scala.inline
  implicit class SVGCoreAttributesOps[Self <: SVGCoreAttributes] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    @scala.inline
    def setXmlColonbase(value: String): Self = this.set("xml:base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlColonbase: Self = this.set("xml:base", js.undefined)
    @scala.inline
    def setXmlColonlang(value: String): Self = this.set("xml:lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlColonlang: Self = this.set("xml:lang", js.undefined)
    @scala.inline
    def setXmlColonspace(value: String): Self = this.set("xml:space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlColonspace: Self = this.set("xml:space", js.undefined)
  }
  
}

