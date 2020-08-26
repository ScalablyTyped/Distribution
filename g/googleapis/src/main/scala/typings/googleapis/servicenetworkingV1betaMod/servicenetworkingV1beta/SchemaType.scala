package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A protocol buffer message type.
  */
@js.native
trait SchemaType extends js.Object {
  /**
    * The list of fields.
    */
  var fields: js.UndefOr[js.Array[SchemaField]] = js.native
  /**
    * The fully qualified message name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of types appearing in `oneof` definitions in this type.
    */
  var oneofs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The protocol buffer options.
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

object SchemaType {
  @scala.inline
  def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  @scala.inline
  implicit class SchemaTypeOps[Self <: SchemaType] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SchemaField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SchemaField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOneofsVarargs(value: String*): Self = this.set("oneofs", js.Array(value :_*))
    @scala.inline
    def setOneofs(value: js.Array[String]): Self = this.set("oneofs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneofs: Self = this.set("oneofs", js.undefined)
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

