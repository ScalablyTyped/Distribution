package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the contents of InfoWindow templates.
  */
@js.native
trait SchemaTemplate extends js.Object {
  /**
    * List of columns from which the template is to be automatically
    * constructed. Only one of body or automaticColumns can be specified.
    */
  var automaticColumnNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Body of the template. It contains HTML with {column_name} to insert
    * values from a particular column. The body is sanitized to remove certain
    * tags, e.g., script. Only one of body or automaticColumns can be
    * specified.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For a template, this is always
    * fusiontables#template.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Optional name assigned to a template.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Identifier for the table for which the template is defined.
    */
  var tableId: js.UndefOr[String] = js.native
  /**
    * Identifier for the template, unique within the context of a particular
    * table.
    */
  var templateId: js.UndefOr[Double] = js.native
}

object SchemaTemplate {
  @scala.inline
  def apply(): SchemaTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplate]
  }
  @scala.inline
  implicit class SchemaTemplateOps[Self <: SchemaTemplate] (val x: Self) extends AnyVal {
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
    def setAutomaticColumnNamesVarargs(value: String*): Self = this.set("automaticColumnNames", js.Array(value :_*))
    @scala.inline
    def setAutomaticColumnNames(value: js.Array[String]): Self = this.set("automaticColumnNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticColumnNames: Self = this.set("automaticColumnNames", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
    @scala.inline
    def setTemplateId(value: Double): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
  
}

