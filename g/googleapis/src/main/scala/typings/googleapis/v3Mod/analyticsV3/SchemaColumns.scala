package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists columns (dimensions and metrics) for a particular report type.
  */
@js.native
trait SchemaColumns extends js.Object {
  /**
    * List of attributes names returned by columns.
    */
  var attributeNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Etag of collection. This etag can be compared with the last response etag
    * to check if response has changed.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of columns for a report type.
    */
  var items: js.UndefOr[js.Array[SchemaColumn]] = js.native
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Total number of columns returned in the response.
    */
  var totalResults: js.UndefOr[Double] = js.native
}

object SchemaColumns {
  @scala.inline
  def apply(): SchemaColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumns]
  }
  @scala.inline
  implicit class SchemaColumnsOps[Self <: SchemaColumns] (val x: Self) extends AnyVal {
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
    def setAttributeNamesVarargs(value: String*): Self = this.set("attributeNames", js.Array(value :_*))
    @scala.inline
    def setAttributeNames(value: js.Array[String]): Self = this.set("attributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeNames: Self = this.set("attributeNames", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaColumn*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaColumn]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
  
}

