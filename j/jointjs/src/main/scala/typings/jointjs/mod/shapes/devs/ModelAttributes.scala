package typings.jointjs.mod.shapes.devs

import typings.jointjs.mod.dia.Element.GenericAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelAttributes extends GenericAttributes[ModelSelectors] {
  var inPorts: js.UndefOr[js.Array[String]] = js.native
  var outPorts: js.UndefOr[js.Array[String]] = js.native
}

object ModelAttributes {
  @scala.inline
  def apply(): ModelAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelAttributes]
  }
  @scala.inline
  implicit class ModelAttributesOps[Self <: ModelAttributes] (val x: Self) extends AnyVal {
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
    def setInPortsVarargs(value: String*): Self = this.set("inPorts", js.Array(value :_*))
    @scala.inline
    def setInPorts(value: js.Array[String]): Self = this.set("inPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInPorts: Self = this.set("inPorts", js.undefined)
    @scala.inline
    def setOutPortsVarargs(value: String*): Self = this.set("outPorts", js.Array(value :_*))
    @scala.inline
    def setOutPorts(value: js.Array[String]): Self = this.set("outPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutPorts: Self = this.set("outPorts", js.undefined)
  }
  
}

