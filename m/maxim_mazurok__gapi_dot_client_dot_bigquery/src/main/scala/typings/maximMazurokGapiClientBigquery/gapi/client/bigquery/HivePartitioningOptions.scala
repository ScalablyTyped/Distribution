package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HivePartitioningOptions extends js.Object {
  
  /**
    * [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2)
    * STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage
    * formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true
    * when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
    */
  var requirePartitionFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding
    * begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro
    * gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of
    * gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
    */
  var sourceUriPrefix: js.UndefOr[String] = js.native
}
object HivePartitioningOptions {
  
  @scala.inline
  def apply(): HivePartitioningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HivePartitioningOptions]
  }
  
  @scala.inline
  implicit class HivePartitioningOptionsOps[Self <: HivePartitioningOptions] (val x: Self) extends AnyVal {
    
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = this.set("requirePartitionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequirePartitionFilter: Self = this.set("requirePartitionFilter", js.undefined)
    
    @scala.inline
    def setSourceUriPrefix(value: String): Self = this.set("sourceUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUriPrefix: Self = this.set("sourceUriPrefix", js.undefined)
  }
}
