package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.InsertId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataInsertAllRequest extends StObject {
  
  /** [Optional] Accept rows that contain values that do not match the schema. The unknown values are ignored. Default is false, which treats unknown values as errors. */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The rows to insert. */
  var rows: js.UndefOr[js.Array[InsertId]] = js.undefined
  
  /** [Optional] Insert all valid rows of a request, even if invalid rows exist. The default value is false, which causes the entire request to fail if any invalid rows exist. */
  var skipInvalidRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If specified, treats the destination table as a base template, and inserts the rows into an instance table named "{destination}{templateSuffix}". BigQuery will manage creation of
    * the instance table, using the schema of the base template table. See https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for considerations when working
    * with templates tables.
    */
  var templateSuffix: js.UndefOr[String] = js.undefined
}
object TableDataInsertAllRequest {
  
  inline def apply(): TableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableDataInsertAllRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRows(value: js.Array[InsertId]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: InsertId*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSkipInvalidRows(value: Boolean): Self = StObject.set(x, "skipInvalidRows", value.asInstanceOf[js.Any])
    
    inline def setSkipInvalidRowsUndefined: Self = StObject.set(x, "skipInvalidRows", js.undefined)
    
    inline def setTemplateSuffix(value: String): Self = StObject.set(x, "templateSuffix", value.asInstanceOf[js.Any])
    
    inline def setTemplateSuffixUndefined: Self = StObject.set(x, "templateSuffix", js.undefined)
  }
}
