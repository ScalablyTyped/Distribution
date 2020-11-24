package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionSpec extends js.Object {
  
  /** The partition key for BigQuery partitioned table. */
  var partitionKey: js.UndefOr[String] = js.native
}
object PartitionSpec {
  
  @scala.inline
  def apply(): PartitionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionSpec]
  }
  
  @scala.inline
  implicit class PartitionSpecOps[Self <: PartitionSpec] (val x: Self) extends AnyVal {
    
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
    def setPartitionKey(value: String): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKey: Self = this.set("partitionKey", js.undefined)
  }
}
