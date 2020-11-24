package typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1

import typings.googleapis.anon.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a single result table. The table is returned as an array of rows
  * that contain the values for the cells of the table. Depending on the metric
  * or dimension, the cell can contain a string (video ID, country code) or a
  * number (number of views or number of likes).
  */
@js.native
trait SchemaResultTable extends js.Object {
  
  /**
    * This value specifies information about the data returned in the rows
    * fields. Each item in the columnHeaders list identifies a field returned
    * in the rows value, which contains a list of comma-delimited data. The
    * columnHeaders list will begin with the dimensions specified in the API
    * request, which will be followed by the metrics specified in the API
    * request. The order of both dimensions and metrics will match the ordering
    * in the API request. For example, if the API request contains the
    * parameters dimensions=ageGroup,gender&amp;metrics=viewerPercentage, the
    * API response will return columns in this order:
    * ageGroup,gender,viewerPercentage.
    */
  var columnHeaders: js.UndefOr[js.Array[ColumnType]] = js.native
  
  /**
    * This value specifies the type of data included in the API response. For
    * the query method, the kind property value will be
    * youtubeAnalytics#resultTable.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The list contains all rows of the result table. Each item in the list is
    * an array that contains comma-delimited data corresponding to a single row
    * of data. The order of the comma-delimited data fields will match the
    * order of the columns listed in the columnHeaders field. If no data is
    * available for the given query, the rows element will be omitted from the
    * response. The response for a query with the day dimension will not
    * contain rows for the most recent days.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
}
object SchemaResultTable {
  
  @scala.inline
  def apply(): SchemaResultTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultTable]
  }
  
  @scala.inline
  implicit class SchemaResultTableOps[Self <: SchemaResultTable] (val x: Self) extends AnyVal {
    
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
    def setColumnHeadersVarargs(value: ColumnType*): Self = this.set("columnHeaders", js.Array(value :_*))
    
    @scala.inline
    def setColumnHeaders(value: js.Array[ColumnType]): Self = this.set("columnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaders: Self = this.set("columnHeaders", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
