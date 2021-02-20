package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The BigQuery table to which the output should be written.
  */
@js.native
trait SchemaBigQueryDestination extends StObject {
  
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
  implicit class SchemaBigQueryDestinationMutableBuilder[Self <: SchemaBigQueryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setOverwriteTable(value: Boolean): Self = StObject.set(x, "overwriteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteTableUndefined: Self = StObject.set(x, "overwriteTable", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
