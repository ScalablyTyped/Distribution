package typings.jointjs.mod.shapes.uml

import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.shapes.SVGRectSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassAttributes extends GenericAttributes[SVGRectSelector] {
  var attributes: js.Array[String] = js.native
  var methods: js.Array[String] = js.native
  var name: js.Array[String] = js.native
}

object ClassAttributes {
  @scala.inline
  def apply(attributes: js.Array[String], methods: js.Array[String], name: js.Array[String]): ClassAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAttributes]
  }
  @scala.inline
  implicit class ClassAttributesOps[Self <: ClassAttributes] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: js.Array[String]): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

