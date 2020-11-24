package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The BigQuery table to which the output should be written.
  */
@js.native
trait SchemaBigQueryDestination extends js.Object {
  
  /**
    * Required. The BigQuery dataset to which the DICOM store should be
    * exported. If this dataset does not exist, the export call returns an
    * error.
    */
  var dataset: js.UndefOr[String] = js.native
  
  /**
    * If the destination table already exists and this flag is `TRUE`, the
    * table will be overwritten by the contents of the DICOM store. If the flag
    * is not set and the destination table already exists, the export call
    * returns an error.
    */
  var overwriteTable: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The BigQuery table to which the DICOM store should be written.
    * If this table does not exist, a new table with the given name will be
    * created.
    */
  var table: js.UndefOr[String] = js.native
}
object SchemaBigQueryDestination {
  
  @scala.inline
  def apply(): SchemaBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryDestination]
  }
  
  @scala.inline
  implicit class SchemaBigQueryDestinationOps[Self <: SchemaBigQueryDestination] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setOverwriteTable(value: Boolean): Self = this.set("overwriteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteTable: Self = this.set("overwriteTable", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
