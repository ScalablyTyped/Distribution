package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum type definition.
  */
@js.native
trait SchemaEnum extends js.Object {
  /**
    * Enum value definitions.
    */
  var enumvalue: js.UndefOr[js.Array[SchemaEnumValue]] = js.native
  /**
    * Enum type name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.native
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String] = js.native
}

object SchemaEnum {
  @scala.inline
  def apply(): SchemaEnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnum]
  }
  @scala.inline
  implicit class SchemaEnumOps[Self <: SchemaEnum] (val x: Self) extends AnyVal {
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
    def setEnumvalueVarargs(value: SchemaEnumValue*): Self = this.set("enumvalue", js.Array(value :_*))
    @scala.inline
    def setEnumvalue(value: js.Array[SchemaEnumValue]): Self = this.set("enumvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumvalue: Self = this.set("enumvalue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: SchemaOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[SchemaOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSourceContext(value: SchemaSourceContext): Self = this.set("sourceContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceContext: Self = this.set("sourceContext", js.undefined)
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
  
}

