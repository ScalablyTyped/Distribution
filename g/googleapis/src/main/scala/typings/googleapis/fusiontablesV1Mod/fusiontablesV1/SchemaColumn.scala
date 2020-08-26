package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleapis.anon.ColumnId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the id, name and type of a column in a table.
  */
@js.native
trait SchemaColumn extends js.Object {
  /**
    * Optional identifier of the base column. If present, this column is
    * derived from the specified base column.
    */
  var baseColumn: js.UndefOr[ColumnId] = js.native
  /**
    * Identifier for the column.
    */
  var columnId: js.UndefOr[Double] = js.native
  /**
    * Optional column description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional column predicate. Used to map table to graph data model
    * (subject,predicate,object) See
    * http://www.w3.org/TR/2014/REC-rdf11-concepts-20140225/#data-model
    */
  var graph_predicate: js.UndefOr[String] = js.native
  /**
    * Type name: a template for an individual column.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Required name of the column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required type of the column.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaColumn {
  @scala.inline
  def apply(): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumn]
  }
  @scala.inline
  implicit class SchemaColumnOps[Self <: SchemaColumn] (val x: Self) extends AnyVal {
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
    def setBaseColumn(value: ColumnId): Self = this.set("baseColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseColumn: Self = this.set("baseColumn", js.undefined)
    @scala.inline
    def setColumnId(value: Double): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnId: Self = this.set("columnId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGraph_predicate(value: String): Self = this.set("graph_predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph_predicate: Self = this.set("graph_predicate", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

