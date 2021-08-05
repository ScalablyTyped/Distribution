package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HivePartitioningOptions extends StObject {
  
  /**
    * [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2)
    * STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage
    * formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true
    * when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
    */
  var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding
    * begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro
    * gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of
    * gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
    */
  var sourceUriPrefix: js.UndefOr[String] = js.undefined
}
object HivePartitioningOptions {
  
  inline def apply(): HivePartitioningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HivePartitioningOptions]
  }
  
  extension [Self <: HivePartitioningOptions](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    inline def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    inline def setSourceUriPrefix(value: String): Self = StObject.set(x, "sourceUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setSourceUriPrefixUndefined: Self = StObject.set(x, "sourceUriPrefix", js.undefined)
  }
}
