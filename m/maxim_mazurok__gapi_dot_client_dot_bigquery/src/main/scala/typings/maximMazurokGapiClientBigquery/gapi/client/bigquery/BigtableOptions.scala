package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigtableOptions extends StObject {
  
  /**
    * [Optional] List of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies
    * their value types. You can use this list to do type conversions - see the 'type' field for more details. If you leave this list empty, all column families are present in the table
    * schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.
    */
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.undefined
  
  /**
    * [Optional] If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type
    * values. The default value is false.
    */
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast
    * them with CAST if necessary. The default value is false.
    */
  var readRowkeyAsString: js.UndefOr[Boolean] = js.undefined
}
object BigtableOptions {
  
  inline def apply(): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableOptions]
  }
  
  extension [Self <: BigtableOptions](x: Self) {
    
    inline def setColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = StObject.set(x, "columnFamilies", value.asInstanceOf[js.Any])
    
    inline def setColumnFamiliesUndefined: Self = StObject.set(x, "columnFamilies", js.undefined)
    
    inline def setColumnFamiliesVarargs(value: BigtableColumnFamily*): Self = StObject.set(x, "columnFamilies", js.Array(value :_*))
    
    inline def setIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnspecifiedColumnFamiliesUndefined: Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", js.undefined)
    
    inline def setReadRowkeyAsString(value: Boolean): Self = StObject.set(x, "readRowkeyAsString", value.asInstanceOf[js.Any])
    
    inline def setReadRowkeyAsStringUndefined: Self = StObject.set(x, "readRowkeyAsString", js.undefined)
  }
}
