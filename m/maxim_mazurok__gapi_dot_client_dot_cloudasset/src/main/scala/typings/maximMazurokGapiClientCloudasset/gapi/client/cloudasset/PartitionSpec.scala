package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionSpec extends StObject {
  
  /** The partition key for BigQuery partitioned table. */
  var partitionKey: js.UndefOr[String] = js.undefined
}
object PartitionSpec {
  
  inline def apply(): PartitionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionSpec] (val x: Self) extends AnyVal {
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
  }
}
