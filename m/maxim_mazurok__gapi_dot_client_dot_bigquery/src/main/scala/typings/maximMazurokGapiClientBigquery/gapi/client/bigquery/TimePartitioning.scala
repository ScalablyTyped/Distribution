package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePartitioning extends StObject {
  
  /**
    * [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this
    * value.
    */
  var expirationMs: js.UndefOr[String] = js.undefined
  
  /**
    * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is
    * specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[String] = js.undefined
  
  var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the
    * default behavior is DAY.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object TimePartitioning {
  
  @scala.inline
  def apply(): TimePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePartitioning]
  }
  
  @scala.inline
  implicit class TimePartitioningMutableBuilder[Self <: TimePartitioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationMs(value: String): Self = StObject.set(x, "expirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMsUndefined: Self = StObject.set(x, "expirationMs", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
