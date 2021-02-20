package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigtableColumnFamily extends StObject {
  
  /**
    * [Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this
    * list can be accessed as .. Other columns can be accessed as a list through .Column field.
    */
  var columns: js.UndefOr[js.Array[BigtableColumn]] = js.native
  
  /**
    * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values
    * are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing that column in 'columns' and specifying an encoding for it.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /** Identifier of the column family. */
  var familyId: js.UndefOr[String] = js.native
  
  /**
    * [Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific column by listing that column in
    * 'columns' and specifying a different setting for that column.
    */
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding
    * value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This can be overridden for a specific column by listing that
    * column in 'columns' and specifying a type for it.
    */
  var `type`: js.UndefOr[String] = js.native
}
object BigtableColumnFamily {
  
  @scala.inline
  def apply(): BigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumnFamily]
  }
  
  @scala.inline
  implicit class BigtableColumnFamilyMutableBuilder[Self <: BigtableColumnFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[BigtableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: BigtableColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFamilyId(value: String): Self = StObject.set(x, "familyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyIdUndefined: Self = StObject.set(x, "familyId", js.undefined)
    
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
